package controllers;

import access.EquiposDAO;
import java.util.ArrayList;
import java.util.List;
import models.EquiposModel;
import views.Equipos;

public class EquiposController {
    
    private List<EquiposModel> listaEquipos = new ArrayList<>();
    
    private String equipoSeleccionado;
    private int id;
    private String name;
    private String trainer;
    
    private MainWindowController mainWindowController = null;
    private Equipos equiposView = null;
    
    public EquiposController(MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
    }
    
    public void initView() {
        this.obtenerListaEquipos();
        this.equiposView = new Equipos(this);
        this.mainWindowController.getMainWindow().setView(this.equiposView);
        this.setTable();
    }
    
    public void obtenerListaEquipos() {
        EquiposDAO access = new EquiposDAO();
        this.listaEquipos = access.obtenerEquipo();
    }
    
    public void setTable() {
        List<EquiposModel> equipos = new ArrayList<>();
        EquiposDAO access = new EquiposDAO();
        
        equipos = access.obtenerEquipo();
        
        equiposView.initTable(equipos);
    }
    
    
    public void agregarButtonClicked() {
        EquiposDAO access = new EquiposDAO();
        EquiposModel equipo = new EquiposModel(this.id, this.name, this.trainer);
        access.agregarEquipo(equipo);
        this.setTable();
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public void setEquipoSeleccionado(String equipoSeleccionado) {
        this.equipoSeleccionado = equipoSeleccionado;
    }

    public List<EquiposModel> getListaEquipos() {
        return listaEquipos;
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
