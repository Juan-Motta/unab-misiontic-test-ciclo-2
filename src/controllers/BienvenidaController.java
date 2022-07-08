package controllers;

import views.Bienvenida;

public class BienvenidaController {
    
    private MainWindowController mainWindowController = null;
    private Bienvenida bienvenida = null;
    
    public BienvenidaController(MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
    }
    
    public void initView() {
        this.bienvenida = new Bienvenida(this);
        this.mainWindowController.getMainWindow().setView(this.bienvenida);
        this.bienvenida.setTitleLabel("Bienvenido");
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
