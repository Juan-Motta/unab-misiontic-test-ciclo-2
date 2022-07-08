package access;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.EquiposModel;
import utils.ConnectionDB;

public class EquiposDAO {
    
    private Connection connection = null;
    
    public List<EquiposModel> obtenerEquipo(int id) {
        List<EquiposModel> equipos = new ArrayList<>();
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "SELECT * FROM equipos WHERE id = ?";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                EquiposModel equipo = new EquiposModel(result.getInt(1), result.getString(2), result.getString(3));
                equipos.add(equipo);
            }
            return equipos;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public List<EquiposModel> obtenerEquipo() {
        List<EquiposModel> equipos = new ArrayList<>();
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "SELECT * FROM equipos;";
            Statement statement = this.connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                EquiposModel equipo = new EquiposModel(result.getInt(1), result.getString(2), result.getString(3));
                equipos.add(equipo);
            }
            return equipos;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public void agregarEquipo(EquiposModel equipo) {
        try {
            if(this.connection == null) {
                this.connection = ConnectionDB.getConnection();
            }
            String query = "INSERT INTO equipos (name, trainer)"
                       + "VALUES(?, ?);";
            PreparedStatement statement = this.connection.prepareStatement(query);
            statement.setString(1, equipo.getName());
            statement.setString(2, equipo.getTrainer());
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
