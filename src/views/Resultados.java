package views;

import java.awt.Color;
import java.util.List;
import controllers.ResultadosController;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.PartidosModel;

public class Resultados extends javax.swing.JPanel {
    
    private ResultadosController controller = null;
    private DefaultTableModel modeloTabla;

    public Resultados(ResultadosController controller) {
        initComponents();
        this.controller = controller;
    }
    
    public void initTable(List<PartidosModel> partidos) {
        JTableHeader header = this.resultsTable.getTableHeader();
        header.setBackground(new Color(0,93,139));
        header.setForeground(Color.white);
        header.setFont(new Font("Roboto", Font.PLAIN, 14));
        header.setBorder(null);
        
        this.modeloTabla = new DefaultTableModel();
        this.modeloTabla.addColumn("PARTIDOS");
        this.resultsTable.setModel(modeloTabla);
        for(PartidosModel partido: partidos) {
            String [] row = new String[1];
            row[0] = partido.toString();
            this.modeloTabla.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titleMain = new javax.swing.JLabel();
        titleMainSeparator = new javax.swing.JSeparator();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));

        titleMain.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        titleMain.setForeground(new java.awt.Color(0, 93, 139));
        titleMain.setText("Administrador/Resultados");

        sideBar.setBackground(new java.awt.Color(0, 93, 139));
        sideBar.setPreferredSize(new java.awt.Dimension(337, 700));

        titleSideBar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        titleSideBar.setForeground(new java.awt.Color(255, 255, 255));
        titleSideBar.setText("Match App");

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
                .addComponent(equiposLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
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
                .addComponent(partidosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultadosButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultadosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
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
                    .addComponent(titleSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(titleSideBarSeparator)
                    .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equiposButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(partidosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultadosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sideBarLayout.createSequentialGroup()
                        .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sideBarLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(equiposSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(partidosSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultadosSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addContainerGap(327, Short.MAX_VALUE))
        );

        resultsTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "RESULTADO"
            }
        ));
        resultsTable.setRowHeight(30);
        jScrollPane1.setViewportView(resultsTable);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void resultadosLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadosLabelMousePressed
        this.controller.resultadosClicked();
    }//GEN-LAST:event_resultadosLabelMousePressed

    private void resultadosLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadosLabelMouseExited
        resultadosSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_resultadosLabelMouseExited

    private void resultadosLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultadosLabelMouseEntered
        resultadosSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_resultadosLabelMouseEntered

    private void partidosLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partidosLabelMousePressed
        this.controller.partidosClicked();
    }//GEN-LAST:event_partidosLabelMousePressed

    private void partidosLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partidosLabelMouseExited
        partidosSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_partidosLabelMouseExited

    private void partidosLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partidosLabelMouseEntered
        partidosSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_partidosLabelMouseEntered

    private void equiposLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equiposLabelMousePressed
        this.controller.equiposClicked();
    }//GEN-LAST:event_equiposLabelMousePressed

    private void equiposLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equiposLabelMouseExited
        equiposSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_equiposLabelMouseExited

    private void equiposLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equiposLabelMouseEntered
        equiposSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_equiposLabelMouseEntered

    private void homeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMousePressed
        this.controller.homeClicked();
    }//GEN-LAST:event_homeLabelMousePressed

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        homeSeparator.setForeground(new Color(0,93,139));
    }//GEN-LAST:event_homeLabelMouseExited

    private void homeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseEntered
        homeSeparator.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_homeLabelMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel equiposButton;
    private javax.swing.JLabel equiposLabel;
    private javax.swing.JSeparator equiposSeparator;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JSeparator homeSeparator;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel partidosButton;
    private javax.swing.JLabel partidosLabel;
    private javax.swing.JSeparator partidosSeparator;
    private javax.swing.JPanel resultadosButton;
    private javax.swing.JLabel resultadosLabel;
    private javax.swing.JSeparator resultadosSeparator;
    private javax.swing.JTable resultsTable;
    private javax.swing.JPanel sideBar;
    private javax.swing.JLabel titleMain;
    private javax.swing.JSeparator titleMainSeparator;
    private javax.swing.JLabel titleSideBar;
    private javax.swing.JSeparator titleSideBarSeparator;
    // End of variables declaration//GEN-END:variables
}
