package views;

import controllers.PartidosController;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.PartidosModel;
import models.EquiposModel;
import access.EquiposDAO;

public class Partidos extends javax.swing.JPanel {
    
    private PartidosController controller = null; 
    private DefaultTableModel modeloTabla;

    public Partidos(PartidosController controller) {
        initComponents();
        this.controller = controller;
        this.initEquipoComboBox();
        
    }
    
    public void initTable(List<PartidosModel> partidos) {
        JTableHeader header = this.table.getTableHeader();
        header.setBackground(new Color(0,93,139));
        header.setForeground(Color.white);
        header.setFont(new Font("Roboto", Font.PLAIN, 14));
        header.setBorder(null);
        
        this.modeloTabla = new DefaultTableModel();
        this.modeloTabla.addColumn("ID");
        this.modeloTabla.addColumn("FECHA");
        this.modeloTabla.addColumn("EQUIPO LOCAL");
        this.modeloTabla.addColumn("EQUIPO VISITANTE");
        this.modeloTabla.addColumn("GOLES VISITANTE");
        this.modeloTabla.addColumn("GOLES LOCAL");
        this.table.setModel(modeloTabla);
        for(PartidosModel partido: partidos) {
            String [] row = new String[6];
            row[0] = String.valueOf(partido.getId());
            row[1] = partido.getDate();
            row[2] = partido.getLocalTeam().getName();
            row[3] = partido.getVisitingTeam().getName();
            row[4] = String.valueOf(partido.getLocalGoals());
            row[5] = String.valueOf(partido.getVisitingGoals());
            this.modeloTabla.addRow(row);
        }
    }
    
    public void initEquipoComboBox() {
        this.controller.obtenerListaEquipos();
        List<EquiposModel> equipos = this.controller.getListaEquipos();
        
        for(EquiposModel equipo: equipos){
            this.equipoLocalComboBox.addItem(equipo.toString());
            this.equipoVisitanteComboBox.addItem(equipo.toString());
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titleMain = new javax.swing.JLabel();
        titleMainSeparator = new javax.swing.JSeparator();
        tablePanel = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tableSeparator = new javax.swing.JSeparator();
        agregarVendedorLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        dayTextField = new javax.swing.JTextField();
        idSeparator = new javax.swing.JSeparator();
        agregarButton = new javax.swing.JPanel();
        agregarButtonLabel = new javax.swing.JLabel();
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
        equipoLocalLabel = new javax.swing.JLabel();
        golesLocalLabel = new javax.swing.JLabel();
        golesLocalTextField = new javax.swing.JTextField();
        golesLocalSeparator = new javax.swing.JSeparator();
        equipoLocalComboBox = new javax.swing.JComboBox<>();
        equipoVisitanteLabel = new javax.swing.JLabel();
        equipoVisitanteComboBox = new javax.swing.JComboBox<>();
        golesVisitanteLabel = new javax.swing.JLabel();
        golesVisitanteTextField = new javax.swing.JTextField();
        golesVisitanteSeparator = new javax.swing.JSeparator();
        monthTextField = new javax.swing.JTextField();
        yearTextField = new javax.swing.JTextField();
        idSeparator1 = new javax.swing.JSeparator();
        idSeparator2 = new javax.swing.JSeparator();
        idLabel1 = new javax.swing.JLabel();
        idLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));

        titleMain.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        titleMain.setForeground(new java.awt.Color(0, 93, 139));
        titleMain.setText("Administrador/Partidos");

        tablePanel.setBackground(new java.awt.Color(255, 255, 255));
        tablePanel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tablePanel.setForeground(new java.awt.Color(255, 255, 255));

        table.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FECHA", "EQUIPO LOCAL", "EQUIPO VISITANTE", "GOLES VISITANTE", "GOLES LOCAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(40);
        table.setShowHorizontalLines(true);
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        tablePanel.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
        }

        agregarVendedorLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        agregarVendedorLabel.setText("AGREGAR PARTIDOS");

        idLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        idLabel.setText("DIA");

        dayTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dayTextField.setBorder(null);
        dayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayTextFieldActionPerformed(evt);
            }
        });

        agregarButton.setBackground(new java.awt.Color(0, 93, 139));
        agregarButton.setForeground(new java.awt.Color(255, 255, 255));
        agregarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarButtonMouseClicked(evt);
            }
        });

        agregarButtonLabel.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        agregarButtonLabel.setForeground(new java.awt.Color(255, 255, 255));
        agregarButtonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarButtonLabel.setText("+");

        javax.swing.GroupLayout agregarButtonLayout = new javax.swing.GroupLayout(agregarButton);
        agregarButton.setLayout(agregarButtonLayout);
        agregarButtonLayout.setHorizontalGroup(
            agregarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(agregarButtonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        agregarButtonLayout.setVerticalGroup(
            agregarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarButtonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        equipoLocalLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        equipoLocalLabel.setText("EQUIPO LOCAL");

        golesLocalLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        golesLocalLabel.setText("GOLES EQUIPO LOCAL");

        golesLocalTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        golesLocalTextField.setBorder(null);
        golesLocalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golesLocalTextFieldActionPerformed(evt);
            }
        });

        equipoLocalComboBox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        equipoLocalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione id" }));
        equipoLocalComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                equipoLocalComboBoxItemStateChanged(evt);
            }
        });

        equipoVisitanteLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        equipoVisitanteLabel.setText("EQUIPO VISITANTE");

        equipoVisitanteComboBox.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        equipoVisitanteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione id" }));
        equipoVisitanteComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                equipoVisitanteComboBoxItemStateChanged(evt);
            }
        });

        golesVisitanteLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        golesVisitanteLabel.setText("GOLES EQUIPO VISITANTE");

        golesVisitanteTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        golesVisitanteTextField.setBorder(null);
        golesVisitanteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                golesVisitanteTextFieldActionPerformed(evt);
            }
        });

        monthTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        monthTextField.setBorder(null);
        monthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthTextFieldActionPerformed(evt);
            }
        });

        yearTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        yearTextField.setBorder(null);
        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });

        idLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        idLabel1.setText("AÑO");

        idLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        idLabel2.setText("MES");

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
                            .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(equipoLocalLabel)
                                    .addComponent(equipoLocalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(golesLocalLabel)
                                    .addComponent(golesLocalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(golesLocalSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(golesVisitanteLabel)
                                    .addComponent(golesVisitanteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(golesVisitanteSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idLabel)
                                    .addComponent(agregarVendedorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tablePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                            .addComponent(tableSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(equipoVisitanteLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(equipoVisitanteComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(backgroundLayout.createSequentialGroup()
                                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(idSeparator, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(dayTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                                .addGap(48, 48, 48)
                                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(monthTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                                    .addComponent(idSeparator2))
                                                .addGap(47, 47, 47))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                                .addComponent(idLabel2)
                                                .addGap(95, 95, 95)))
                                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idLabel1))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleMainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tableSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(agregarVendedorLabel)
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(idLabel1)
                            .addComponent(idLabel2)))
                    .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(equipoLocalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(equipoLocalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(golesLocalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesLocalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesLocalSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(equipoVisitanteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(equipoVisitanteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(golesVisitanteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(golesVisitanteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golesVisitanteSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void equipoLocalComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_equipoLocalComboBoxItemStateChanged
        this.controller.setLocalTeam((String)equipoLocalComboBox.getSelectedItem());
    }//GEN-LAST:event_equipoLocalComboBoxItemStateChanged

    private void golesLocalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golesLocalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_golesLocalTextFieldActionPerformed

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

    private void agregarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarButtonMouseClicked
        int local_goals = Integer.parseInt(golesLocalTextField.getText());
        int visiting_goals = Integer.parseInt(golesVisitanteTextField.getText());
        int year = Integer.parseInt(yearTextField.getText());
        int month = Integer.parseInt(monthTextField.getText());
        int day = Integer.parseInt(dayTextField.getText());
        String date = String.format("%d-%d-%d", year, month, day);
        this.controller.setLocalGoals(local_goals);
        this.controller.setVisitingGoals(visiting_goals);
        this.controller.setDate(date);
        controller.agregarButtonClicked();
        golesLocalTextField.setText("");
        golesVisitanteTextField.setText("");
        yearTextField.setText("");
        monthTextField.setText("");
        dayTextField.setText("");
    }//GEN-LAST:event_agregarButtonMouseClicked

    private void dayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayTextFieldActionPerformed

    private void equipoVisitanteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_equipoVisitanteComboBoxItemStateChanged
        this.controller.setVisitingTeam((String)equipoVisitanteComboBox.getSelectedItem());
    }//GEN-LAST:event_equipoVisitanteComboBoxItemStateChanged

    private void golesVisitanteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_golesVisitanteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_golesVisitanteTextFieldActionPerformed

    private void monthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthTextFieldActionPerformed

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarButton;
    private javax.swing.JLabel agregarButtonLabel;
    private javax.swing.JLabel agregarVendedorLabel;
    private javax.swing.JPanel background;
    private javax.swing.JTextField dayTextField;
    private javax.swing.JComboBox<String> equipoLocalComboBox;
    private javax.swing.JLabel equipoLocalLabel;
    private javax.swing.JComboBox<String> equipoVisitanteComboBox;
    private javax.swing.JLabel equipoVisitanteLabel;
    private javax.swing.JPanel equiposButton;
    private javax.swing.JLabel equiposLabel;
    private javax.swing.JSeparator equiposSeparator;
    private javax.swing.JLabel golesLocalLabel;
    private javax.swing.JSeparator golesLocalSeparator;
    private javax.swing.JTextField golesLocalTextField;
    private javax.swing.JLabel golesVisitanteLabel;
    private javax.swing.JSeparator golesVisitanteSeparator;
    private javax.swing.JTextField golesVisitanteTextField;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JSeparator homeSeparator;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel idLabel2;
    private javax.swing.JSeparator idSeparator;
    private javax.swing.JSeparator idSeparator1;
    private javax.swing.JSeparator idSeparator2;
    private javax.swing.JTextField monthTextField;
    private javax.swing.JPanel partidosButton;
    private javax.swing.JLabel partidosLabel;
    private javax.swing.JSeparator partidosSeparator;
    private javax.swing.JPanel resultadosButton;
    private javax.swing.JLabel resultadosLabel;
    private javax.swing.JSeparator resultadosSeparator;
    private javax.swing.JPanel sideBar;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tablePanel;
    private javax.swing.JSeparator tableSeparator;
    private javax.swing.JLabel titleMain;
    private javax.swing.JSeparator titleMainSeparator;
    private javax.swing.JLabel titleSideBar;
    private javax.swing.JSeparator titleSideBarSeparator;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables

    
}
