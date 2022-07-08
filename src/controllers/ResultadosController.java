
package controllers;

import access.PartidosDAO;
import java.util.ArrayList;
import java.util.List;
import models.PartidosModel;
import views.Resultados;

public class ResultadosController {
    
    private List<PartidosModel> listaPartidos = new ArrayList<>();
    
    private MainWindowController mainWindowController = null;
    private Resultados resultadosView = null;
    
    public ResultadosController(MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
    }
    
    public void initView() {
        this.obtenerListaPartidos();
        this.resultadosView = new Resultados(this);
        this.mainWindowController.getMainWindow().setView(this.resultadosView);
        this.setTable();
    }
    
    public void setTable() {
        List<PartidosModel> partidos = new ArrayList<>();
        PartidosDAO access = new PartidosDAO();
        partidos = access.obtenerPartido();
        resultadosView.initTable(partidos);
    }
    
    public void obtenerListaPartidos() {
        PartidosDAO access = new PartidosDAO();
        this.listaPartidos = access.obtenerPartido();
    }
    
    public List<PartidosModel> getListaPartidos() {
        return listaPartidos;
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
