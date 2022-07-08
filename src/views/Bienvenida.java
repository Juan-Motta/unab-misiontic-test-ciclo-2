package views;

import controllers.BienvenidaController;
import java.awt.Color;

public class Bienvenida extends javax.swing.JPanel {

    private BienvenidaController controller = null;
    
    public Bienvenida(BienvenidaController controller) {
        initComponents();
        this.controller = controller;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sideBar = new javax.swing.JPanel();
        titleSideBar = new javax.swing.JLabel();
        titleSideBarSeparator = new javax.swing.JSeparator();
        homeButton = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        homeSeparator = new javax.swing.JSeparator();
        equiposButton = new javax.swing.JPanel();
        equiposLabel = new javax.swing.JLabel();
        equiposSeparator = new javax.swing.JSeparator();
        partidosButton = new javax.swing.JPanel();
        partidosLabel = new javax.swing.JLabel();
        partidosSeparator = new javax.swing.JSeparator();
        resultadosButton = new javax.swing.JPanel();
        resultadosLabel = new javax.swing.JLabel();
        resultadosSeparator = new javax.swing.JSeparator();
        titleLabel = new javax.swing.JLabel();
        descriptionLabel1 = new javax.swing.JLabel();
        descriptionLabel2 = new javax.swing.JLabel();
        descriptionLabel3 = new javax.swing.JLabel();
        descriptionLabel4 = new javax.swing.JLabel();
        descriptionLabel5 = new javax.swing.JLabel();
        descriptionLabel6 = new javax.swing.JLabel();
        descriptionLabel7 = new javax.swing.JLabel();
        descriptionLabel8 = new javax.swing.JLabel();
        titleMain = new javax.swing.JLabel();
        titleMainSeparator = new javax.swing.JSeparator();

        setMinimumSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));

        sideBar.setBackground(new java.awt.Color(0, 93, 139));
        sideBar.setPreferredSize(new java.awt.Dimension(337, 700));

        titleSideBar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        titleSideBar.setForeground(new java.awt.Color(255, 255, 255));
        titleSideBar.setText("Matches App");

        titleSideBarSeparator.setForeground(new java.awt.Color(255, 255, 255));

        homeButton.setBackground(new java.awt.Color(0, 93, 139));
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        homeLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        homeLabel.setText("Home");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout homeButtonLayout = new javax.swing.GroupLayout(homeButton);
        homeButton.setLayout(homeButtonLayout);
        homeButtonLayout.setHorizontalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeButtonLayout.setVerticalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        homeSeparator.setBackground(new java.awt.Color(0, 93, 139));
        homeSeparator.setForeground(new java.awt.Color(0, 93, 139));

        equiposButton.setBackground(new java.awt.Color(0, 93, 139));
        equiposButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        equiposLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        equiposLabel.setForeground(new java.awt.Color(255, 255, 255));
        equiposLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        equiposLabel.setText("Equipos");
        equiposLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                equiposLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                equiposLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                equiposLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout equiposButtonLayout = new javax.swing.GroupLayout(equiposButton);
        equiposButton.setLayout(equiposButtonLayout);
        equiposButtonLayout.setHorizontalGroup(
            equiposButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equiposButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(equiposLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        equiposButtonLayout.setVerticalGroup(
            equiposButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equiposLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        equiposSeparator.setBackground(new java.awt.Color(0, 93, 139));
        equiposSeparator.setForeground(new java.awt.Color(0, 93, 139));

        partidosButton.setBackground(new java.awt.Color(0, 93, 139));
        partidosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        partidosLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        partidosLabel.setForeground(new java.awt.Color(255, 255, 255));
        partidosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone.png"))); // NOI18N
        partidosLabel.setText("Partidos");
        partidosLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                partidosLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                partidosLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                partidosLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout partidosButtonLayout = new javax.swing.GroupLayout(partidosButton);
        partidosButton.setLayout(partidosButtonLayout);
        partidosButtonLayout.setHorizontalGroup(
            partidosButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, partidosButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(partidosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        partidosButtonLayout.setVerticalGroup(
            partidosButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(partidosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        partidosSeparator.setBackground(new java.awt.Color(0, 93, 139));
        partidosSeparator.setForeground(new java.awt.Color(0, 93, 139));

        resultadosButton.setBackground(new java.awt.Color(0, 93, 139));
        resultadosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        resultadosLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        resultadosLabel.setForeground(new java.awt.Color(255, 255, 255));
        resultadosLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peso.png"))); // NOI18N
        resultadosLabel.setText("Resultados");
        resultadosLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resultadosLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resultadosLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resultadosLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout resultadosButtonLayout = new javax.swing.GroupLayout(resultadosButton);
        resultadosButton.setLayout(resultadosButtonLayout);
        resultadosButtonLayout.setHorizontalGroup(
            resultadosButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadosButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultadosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        resultadosButtonLayout.setVerticalGroup(
            resultadosButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultadosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        resultadosSeparator.setBackground(new java.awt.Color(0, 93, 139));
        resultadosSeparator.setForeground(new java.awt.Color(0, 93, 139));

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleSideBarSeparator)
                    .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equiposButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(partidosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultadosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addComponent(homeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equiposSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partidosSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultadosSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleSideBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleSideBarSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(equiposButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(equiposSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(partidosButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(partidosSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultadosButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadosSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titleLabel.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        titleLabel.setText("Bienvenido Juan");

        descriptionLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descriptionLabel1.setText("Bienvenido a la aplicacion de partidos, para continuar por favor seleccione el menu ");

        descriptionLabel2.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descriptionLabel2.setText("correspondiente en la barra lateral.");

        descriptionLabel3.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        descriptionLabel3.setText("Gestionar equipos");

        descriptionLabel4.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descriptionLabel4.setText("Menu para ver y registrar equipos.");

        descriptionLabel5.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        descriptionLabel5.setText("Registrar partidos");

        descriptionLabel6.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descriptionLabel6.setText("Menu para ver y editar partidos");

        descriptionLabel7.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        descriptionLabel7.setText("Ver resultados");

        descriptionLabel8.setBackground(new java.awt.Color(255, 255, 255));
        descriptionLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descriptionLabel8.setText("Menu para ver resultados.");

        titleMain.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        titleMain.setForeground(new java.awt.Color(0, 93, 139));
        titleMain.setText("Administrador/Home");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(descriptionLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel2)
                .addGap(59, 59, 59)
                .addComponent(descriptionLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel4)
                .addGap(27, 27, 27)
                .addComponent(descriptionLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel6)
                .addGap(27, 27, 27)
                .addComponent(descriptionLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel8)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void resultadosLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadosLabelMouseEntered
        resultadosSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_resultadosLabelMouseEntered

    private void resultadosLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadosLabelMouseExited
        resultadosSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_resultadosLabelMouseExited

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseEntered
        homeSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_homeLabelMouseEntered

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        homeSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_homeLabelMouseExited

    private void equiposLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equiposLabelMouseEntered
        equiposSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_equiposLabelMouseEntered

    private void equiposLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equiposLabelMouseExited
        equiposSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_equiposLabelMouseExited

    private void partidosLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partidosLabelMouseEntered
        partidosSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_partidosLabelMouseEntered

    private void partidosLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partidosLabelMouseExited
        partidosSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_partidosLabelMouseExited

    private void homeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMousePressed
        this.controller.homeClicked();
    }//GEN-LAST:event_homeLabelMousePressed

    private void equiposLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equiposLabelMousePressed
        this.controller.equiposClicked();
    }//GEN-LAST:event_equiposLabelMousePressed

    private void partidosLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partidosLabelMousePressed
        this.controller.partidosClicked();
    }//GEN-LAST:event_partidosLabelMousePressed

    private void resultadosLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadosLabelMousePressed
        this.controller.resultadosClicked();
    }//GEN-LAST:event_resultadosLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel descriptionLabel1;
    private javax.swing.JLabel descriptionLabel2;
    private javax.swing.JLabel descriptionLabel3;
    private javax.swing.JLabel descriptionLabel4;
    private javax.swing.JLabel descriptionLabel5;
    private javax.swing.JLabel descriptionLabel6;
    private javax.swing.JLabel descriptionLabel7;
    private javax.swing.JLabel descriptionLabel8;
    private javax.swing.JPanel equiposButton;
    private javax.swing.JLabel equiposLabel;
    private javax.swing.JSeparator equiposSeparator;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JSeparator homeSeparator;
    private javax.swing.JPanel partidosButton;
    private javax.swing.JLabel partidosLabel;
    private javax.swing.JSeparator partidosSeparator;
    private javax.swing.JPanel resultadosButton;
    private javax.swing.JLabel resultadosLabel;
    private javax.swing.JSeparator resultadosSeparator;
    private javax.swing.JPanel sideBar;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleMain;
    private javax.swing.JSeparator titleMainSeparator;
    private javax.swing.JLabel titleSideBar;
    private javax.swing.JSeparator titleSideBarSeparator;
    // End of variables declaration//GEN-END:variables

    public void setTitleLabel(String text) {
        titleLabel.setText(text);
    }
}
