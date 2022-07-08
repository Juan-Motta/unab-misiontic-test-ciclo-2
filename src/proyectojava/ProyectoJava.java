package proyectojava;

import controllers.MainWindowController;

public class ProyectoJava {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public  void run() {
                
                MainWindowController mainWindowController = new MainWindowController();
                mainWindowController.initBienvenidaController();
            }
        });
        
    }
    
}
