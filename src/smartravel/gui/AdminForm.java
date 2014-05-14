
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartravel.gui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import smartravel.dao.RespDao;
import smartravel.dao.clientDao;
import smartravel.util.EmailUtility;
import smartravel.entities.ConfigUtility;
import smartravel.entities.Responsable;
import smartravel.entities.Voyageur;

/**
 *
 * @author Belgacem
 */
public class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    DefaultListModel modele = new DefaultListModel();
    DefaultListModel modele2 = new DefaultListModel();
    DefaultListModel modele3 = new DefaultListModel();
    DefaultListModel modele4 = new DefaultListModel();

    public AdminForm() {
        super("Espace de l'Admin");
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane7 = new javax.swing.JScrollPane();
        descripArea = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        listRsp = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDisactive = new javax.swing.JList();
        jScrollPane10 = new javax.swing.JScrollPane();
        decrire = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        listActive = new javax.swing.JList();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListClient = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane9 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(255, 153, 153));
        jTabbedPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane2.setForeground(new java.awt.Color(153, 0, 0));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTabbedPane2.setInheritsPopupMenu(true);

        jPanel1.setBackground(new java.awt.Color(153, 240, 240));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Liste des nouveaux inscriptions");

        descripArea.setColumns(20);
        descripArea.setRows(5);
        jScrollPane7.setViewportView(descripArea);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Refuser et Supprimer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Confirmer l'inscription et envoyer un Mail ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Print", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("SmarTravel");

        listRsp.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(listRsp);

        jButton1.setText("refrech");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Discrep");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane7)
                                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(496, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(jButton1)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(401, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Inscriptions", jPanel1);

        jPanel3.setBackground(new java.awt.Color(153, 240, 240));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Bloquer >>");
        jButton4.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("<< Activer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        listDisactive.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listDisactive.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listDisactive);

        decrire.setColumns(20);
        decrire.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        decrire.setRows(5);
        jScrollPane10.setViewportView(decrire);

        listActive.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listActive.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listActive);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Supprimer");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("Send Mail");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Description :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Liste des agences inscrits ");

        jButton8.setText("refresh");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton11.setText("discrep");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton8)
                                            .addComponent(jButton11))))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11))
                        .addGap(1, 1, 1)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 75, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(587, 587, 587))))
        );

        jTabbedPane2.addTab("Gestion des Agences ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 240, 240));

        ListClient.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ListClient.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ListClient);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("liste des clients inscrits");

        desc.setColumns(20);
        desc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        desc.setRows(5);
        jScrollPane9.setViewportView(desc);

        jButton12.setText("Description");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Refresh");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Supprimer ");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(298, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButton13)
                                .addGap(18, 18, 18)
                                .addComponent(jButton12)))
                        .addGap(34, 34, 34)
                        .addComponent(jButton14)
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(398, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("   Gestion des voyageurs  ", jPanel4);

        jPanel2.setBackground(new java.awt.Color(153, 240, 240));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1344, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1048, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab(" Statistiques", jPanel2);

        jScrollPane6.setViewportView(jTabbedPane2);

        jMenu1.setText("File");
        jMenu1.setPreferredSize(new java.awt.Dimension(35, 22));

        jMenu3.setText("Acceuil de l'application");
        jMenu3.setPreferredSize(new java.awt.Dimension(161, 22));
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

        Responsable rsp = new Responsable();
        RespDao rspDao = new RespDao();
        rsp = rspDao.selectByName(listRsp.getSelectedValue().toString());
        try {
            rspDao.changeState(listRsp.getSelectedValue().toString());
            JOptionPane.showMessageDialog(this, "le compte agence  a été correctement ajouté");
        } catch (Exception ex) {
            System.out.println("erreur" + ex);
        }
        String toAdress = rsp.getEmail();
        String subject = "Confirmation de l'inscription au Smartravel application";
        String message = " Bonojour " + rsp.getNom() + " " + rsp.getPrenom() + "\n";
        message += "vous venez de s'inscrire dans notre Application votre compte a été activé avec succés \n";
        message += "Bienvenue dans notre platforme , Votre agence va se bénificier des services que nous offrons à notre projet\n";
        message += "votre login est : " + rsp.getEmail() + "\n";
        message += "votre password  : " + rsp.getPassword() + "\n";
        message += "Cordialement";

        File[] attachFiles = null;

//        if (!filePicker.getSelectedFilePath().equals("")) {
//            File selectedFile = new File(filePicker.getSelectedFilePath());
//            attachFiles = new File[] {selectedFile};
//        }
        try {
            Properties smtpProperties;
            smtpProperties = new ConfigUtility().loadProperties();
            EmailUtility.sendEmail(smtpProperties, toAdress, subject, message, attachFiles);

            JOptionPane.showMessageDialog(this, "The e-mail has been sent successfully!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error while sending the e-mail: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Responsable rsp = new Responsable();
        RespDao rspdao = new RespDao();
        List<Responsable> list1 = new ArrayList<Responsable>();

        list1 = rspdao.DisplayNewRespo();
        ListIterator listI = list1.listIterator();
        System.out.println("zzzzzz");
        modele.clear();
        int i = 0;
        for (Responsable r : list1) {
            modele.addElement(r.getNom_agence());
            System.out.println(r.getNom_agence() + i);
        }
        listRsp.setModel(modele);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String nv = listRsp.getSelectedValue().toString();

        Responsable rsp = new Responsable();
        RespDao rspDao = new RespDao();
        rsp = rspDao.selectByName(nv);
        String message = rsp.getNom() + rsp.getPrenom() + "\n";
        message += rsp.getEmail() + "\n";
        message += rsp.getCin().toString() + "\n";
        message += rsp.getCommentaire() + "\n";
        message += "le cempte agence est non activé";

        descripArea.setText(message);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String nv = listRsp.getSelectedValue().toString();
        Responsable rsp = new Responsable();
        RespDao rspDao = new RespDao();
        rsp = rspDao.selectByName(nv);
        rspDao.deleteAgence(rsp);
        JOptionPane.showMessageDialog(null, "agence supprimé avec succé");


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
  Responsable rsp = new Responsable();
        RespDao rspDao = new RespDao();
        rsp = rspDao.selectByName(listActive.getSelectedValue().toString());
       
            rspDao.changeState(listActive.getSelectedValue().toString());
           JOptionPane.showMessageDialog(this, "le compte agence  a été correctement ajouté");
       
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Responsable rsp = new Responsable();
        RespDao rspdao = new RespDao();
        List<Responsable> list1 = new ArrayList<Responsable>();

        list1 = rspdao.DisplayAllRespo();
        System.out.println("zzzzzz");
        modele2.clear();
        for (Responsable r : list1) {
            modele2.addElement(r.getNom_agence());
            System.out.println(r.getNom_agence());
        }
        listActive.setModel(modele2);
        

        List<Responsable> list3 = new ArrayList<Responsable>();
        list3 = rspdao.DisplayNewRespo();
        System.out.println("zzzzzz");
        modele3.clear();
        int i = 0;
        for (Responsable r : list3) {
            modele3.addElement(r.getNom_agence());
            System.out.println(r.getNom_agence() + i);
        }
        listDisactive.setModel(modele3);
        
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Responsable rsp = new Responsable();
        RespDao rspDao = new RespDao();
        rsp = rspDao.selectByName(listDisactive.getSelectedValue().toString());
       
            rspDao.changeState(listDisactive.getSelectedValue().toString());
           JOptionPane.showMessageDialog(this, "le compte agence  a été correctement ajouté");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
         String nv = listDisactive.getSelectedValue().toString();
        Responsable rsp = new Responsable();
        RespDao rspDao = new RespDao();
        rsp = rspDao.selectByName(nv);
        rspDao.deleteAgence(rsp);
        JOptionPane.showMessageDialog(null, "agence supprimé avec succé");

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String nv = listActive.getSelectedValue().toString();
        Responsable rsp2 = new Responsable();

        RespDao rspDao = new RespDao();
        rsp2 = rspDao.selectByName(nv);
        String message = rsp2.getNom() + rsp2.getPrenom() + "\n";
        message += rsp2.getEmail() + "\n";
        message += rsp2.getCin().toString() + "\n";
        message += rsp2.getCommentaire() + "\n";
        message += "le cempte agence est activé";

        decrire.setText(message);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        new accueilForm().setVisible(true);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
       Voyageur voy = new Voyageur();
       clientDao voyDao = new clientDao();
       
        List<Voyageur> list1 = new ArrayList<Voyageur>();

        list1 = voyDao.DisplayAllVoy();
       
       
        modele4.clear();
        int i = 0;
        for (Voyageur v : list1) {
            modele.addElement(v.getNom());
         
        }
        ListClient.setModel(modele);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String nv = ListClient.getSelectedValue().toString();
        Voyageur voy2 = new Voyageur();

        clientDao cltDao = new clientDao();
        voy2 = cltDao.selectByName(nv);
       
        String message = voy2.getNom() + voy2.getPrenom() + "\n";
        message += voy2.getEmail() + "\n";
      
           
        desc.setText(message);

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        String nv = ListClient.getSelectedValue().toString();
        Voyageur voy = new Voyageur();
        clientDao cltdao = new clientDao();
        voy = cltdao.selectByName(nv);
        cltdao.deleteClient(voy.getNom());
        JOptionPane.showMessageDialog(null, "client supprimé avec succé");

    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                AdminForm adf = new AdminForm();
                adf.setSize(1120, 720);
                adf.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListClient;
    private javax.swing.JTextArea decrire;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextArea descripArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JList listActive;
    private javax.swing.JList listDisactive;
    protected javax.swing.JList listRsp;
    // End of variables declaration//GEN-END:variables
}
