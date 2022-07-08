
package controllers;

import access.PartidosDAO;
import access.EquiposDAO;
import java.util.ArrayList;
import java.util.List;
import models.PartidosModel;
import models.EquiposModel;
import views.Partidos;

public class PartidosController {
    
    private List<PartidosModel> listaPartidos = new ArrayList<>();
    private List<EquiposModel> listaEquipos = new ArrayList<>();
    private EquiposModel equipo;
    
    private int id;
    private String date;
    private EquiposModel local_team;
    private EquiposModel visiting_team;
    private int local_goals;
    private int visiting_goals;
    
    private MainWindowController mainWindowController = null;
    private Partidos partidosView = null;
    
    public PartidosController(MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
    }
    
    public void initView() {
        this.obtenerListaPartidos();
        this.partidosView = new Partidos(this);
        this.mainWindowController.getMainWindow().setView(this.partidosView);
        this.setTable();
    }
    
    public void obtenerListaPartidos() {
        PartidosDAO access = new PartidosDAO();
        this.listaPartidos = access.obtenerPartido();
    }
    
    public void obtenerListaEquipos() {
        EquiposDAO access = new EquiposDAO();
        this.listaEquipos = access.obtenerEquipo();
    }
    
    public void obtenerEquipo(int id) {
        EquiposDAO access = new EquiposDAO();
        this.equipo = access.obtenerEquipo(id).get(0);
    }
    
    public void setTable() {
        List<PartidosModel> partidos = new ArrayList<>();
        PartidosDAO access = new PartidosDAO();
        partidos = access.obtenerPartido();
        partidosView.initTable(partidos);
    }
    
    public void agregarButtonClicked() {
        PartidosDAO access = new PartidosDAO();
        PartidosModel partido = new PartidosModel(this.date, this.local_team, this.visiting_team, this.local_goals, this.visiting_goals);
        
        access.agregarPartido(partido);
        this.setTable();
    }
    
    public List<PartidosModel> getListaPartidos() {
        return listaPartidos;
    }
    
    public List<EquiposModel> getListaEquipos() {
        return listaEquipos;
    }
    
    public EquiposModel getEquipo() {
        return equipo;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public void setLocalTeam(String local_team) {
        EquiposDAO access = new EquiposDAO();
        String[] data = local_team.split(" - ");
        int data_id = Integer.parseInt(data[0]);
        EquiposModel model = access.obtenerEquipo(data_id).get(0);
        this.local_team = model;
    }
    
    public void setVisitingTeam(String visiting_team) {
        EquiposDAO access = new EquiposDAO();
        String[] data = visiting_team.split(" - ");
        int data_id = Integer.parseInt(data[0]);
        EquiposModel model = access.obtenerEquipo(data_id).get(0);
        this.visiting_team = model;
    }
    public void setLocalGoals(int local_goals) {
        this.local_goals = local_goals;
    }
    
    public void setVisitingGoals(int visiting_goals) {
        this.visiting_goals = visiting_goals;
    }
    
    public void homeClicked() {
        this.mainWindowController.initBienvenidaController();
    }
    
    public void partidosClicked() {
        this.mainWindowController.initPartidosController();
    }
    
    public void equiposClicked() {
        this.mainWindowController.initEquiposController();
    }
    
    public void resultadosClicked() {
        this.mainWindowController.initResultadosController();
    }
    
}
