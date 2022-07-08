package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.PartidosModel;
import models.EquiposModel;
import utils.ConnectionDB;

public class PartidosDAO {
    private Connection connection = null;
    
    public List<PartidosModel> obtenerPartido(int id) {
        List<PartidosModel> partidos = new ArrayList<>();
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "SELECT p.id, p.date, eone.id, eone.name, eone.trainer, p.local_goals, etwo.id, etwo.name, etwo.trainer, p.visiting_goals FROM partidos p INNER JOIN equipos eone ON p.local_team = eone.id INNER JOIN equipos etwo ON p.visiting_team = etwo.id WHERE p.id = ?;";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                EquiposModel equipo_local = new EquiposModel(result.getString(3));
                EquiposModel equipo_visitante = new EquiposModel(result.getString(5));
                PartidosModel partido = new PartidosModel(result.getInt(1),result.getString(2), equipo_local, equipo_visitante, result.getInt(4), result.getInt(6));
                partidos.add(partido);
            }
            return partidos;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public List<PartidosModel> obtenerPartido() {
        List<PartidosModel> partidos = new ArrayList<>();
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "SELECT p.id, p.date, eone.id as local_team_id, eone.name as local_team_name, eone.trainer as local_team_trainer, p.local_goals, etwo.id as visiting_team_id, etwo.name as visiting_team_name, etwo.trainer as visiting_team_trainer, p.visiting_goals FROM partidos p INNER JOIN equipos eone ON p.local_team = eone.id INNER JOIN equipos etwo ON p.visiting_team = etwo.id ORDER BY CAST(p.date AS date) DESC;";
            Statement statement = this.connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                EquiposModel equipo_local = new EquiposModel(result.getInt(3), result.getString(4), result.getString(5));
                EquiposModel equipo_visitante = new EquiposModel(result.getInt(7), result.getString(8), result.getString(9));
                PartidosModel partido = new PartidosModel(result.getInt(1),result.getString(2), equipo_local, equipo_visitante, result.getInt(6), result.getInt(10));
                partidos.add(partido);
            }
            return partidos;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public void agregarPartido(PartidosModel partido) {
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "INSERT INTO partidos (date, local_team, visiting_team, local_goals, visiting_goals)"
                       + "VALUES(?, ?, ?, ?, ?);";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, partido.getDate());
            statement.setInt(2, partido.getLocalTeam().getId());
            statement.setInt(3, partido.getVisitingTeam().getId());
            statement.setInt(4, partido.getVisitingGoals());
            statement.setInt(5, partido.getVisitingGoals());
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println("Se inserto");
            } else {
                System.out.println("No funciono");
            }
                         
        } catch (SQLException e) {
            
        }
        
    }
}
