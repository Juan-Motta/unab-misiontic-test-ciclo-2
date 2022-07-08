package controllers;

import views.MainWindow;

public class MainWindowController {
    
    private MainWindow mainWindow = null;
    private PartidosController partidosController = null;
    private BienvenidaController bienvenidaController = null;
    private EquiposController equiposController = null;
    private ResultadosController resultadosController = null;

    public MainWindowController() {
        this.mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }

    public PartidosController getPartidosController() {
        return partidosController;
    }
    
    public EquiposController getEquiposController() {
        return equiposController;
    }

    public void initBienvenidaController() {
        this.bienvenidaController = new BienvenidaController(this);
        this.bienvenidaController.initView();
    }
    
    public void initPartidosController() {
        this.partidosController = new PartidosController(this);
        this.partidosController.initView();
    }
    
    public void initEquiposController() {
        this.equiposController = new EquiposController(this);
        this.equiposController.initView();
    }
    
    public void initResultadosController() {
        this.resultadosController = new ResultadosController(this);
        this.resultadosController.initView();
    }
    
    public MainWindow getMainWindow() {
        return mainWindow;
    }
}
