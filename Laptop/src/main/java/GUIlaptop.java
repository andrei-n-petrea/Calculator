/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.mycompany.calculator.Laptop;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class GUIlaptop extends javax.swing.JFrame {
private List<Laptop> laptopuri;

public GUIlaptop() {
    initComponents();
    laptopuri = new ArrayList<>(); // Inițializează lista
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][]{},
        new String[]{
            "Diagonala", "Durata Bateriei", "Touchscreen", "Rezolutie", "Sistem de Operare"
        }
    ));
}


private void actualizeazaTabel() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Resetăm rândurile existente

    for (Laptop laptop : laptopuri) {
        Object[] row = {
            laptop.getDiagonalaEcran(),
            laptop.getDurataBaterie(),
            laptop.isTouchScreen() ? "Da" : "Nu",
            laptop.getRezolutieEcran(),
            laptop.getSistemOperare()
        };
        model.addRow(row);
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDiagonala = new javax.swing.JTextField();
        txtDurata = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        comboTouchScreen = new javax.swing.JComboBox<>();
        btnVerifica = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));

        txtDiagonala.setBackground(new java.awt.Color(102, 204, 0));

        txtDurata.setBackground(new java.awt.Color(51, 204, 0));

        jLabel1.setText("Diagonala Ecran");

        jLabel2.setText("Durata Baterie");

        jLabel3.setText("Touchscreen");

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setText("Adauga laptop");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setText("Sterge laptop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        comboTouchScreen.setBackground(new java.awt.Color(102, 204, 0));
        comboTouchScreen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "da", "nu" }));

        btnVerifica.setBackground(new java.awt.Color(0, 102, 204));
        btnVerifica.setText("Verifica");
        btnVerifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificaActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(102, 0, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Diagonala", "Durata Bateriei", "Touchscreen]"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(533, 533, 533)
                .addComponent(btnVerifica)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel1)
                                .addGap(159, 159, 159)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDiagonala, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(comboTouchScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtDurata, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(172, 172, 172))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiagonala, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDurata, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTouchScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerifica)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(399, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                       
    try {
        float diagonala = Float.parseFloat(txtDiagonala.getText());
        int durata = Integer.parseInt(txtDurata.getText());
        boolean touchScreen = comboTouchScreen.getSelectedItem().toString().equalsIgnoreCase("da");

        Laptop laptopNou = new Laptop("Brand Implicit", "Model Implicit", diagonala, durata, touchScreen, "1920x1080", "Windows 10");
        laptopuri.add(laptopNou);
        actualizeazaTabel();
        javax.swing.JOptionPane.showMessageDialog(this, "Laptop adăugat cu succes!");
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Introduceți valori valide!", "Eroare", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   try {
        float diagonala = Float.parseFloat(txtDiagonala.getText());
        int durata = Integer.parseInt(txtDurata.getText());
        boolean touchScreen = comboTouchScreen.getSelectedItem().toString().equalsIgnoreCase("da");

        boolean sters = laptopuri.removeIf(laptop -> 
            laptop.getDiagonalaEcran() == diagonala &&
            laptop.getDurataBaterie() == durata &&
            laptop.isTouchScreen() == touchScreen
        );

        if (sters) {
            actualizeazaTabel();
            javax.swing.JOptionPane.showMessageDialog(this, "Laptop șters cu succes!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Laptopul nu a fost găsit!", "Eroare", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Introduceți valori valide!", "Eroare", javax.swing.JOptionPane.ERROR_MESSAGE);
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVerificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificaActionPerformed
                                          
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Resetăm rândurile existente

    for (Laptop laptop : laptopuri) {
        if (laptop.isTouchScreen()) { // Afișează doar laptopurile cu touchscreen
            Object[] row = {
                laptop.getDiagonalaEcran(),
                laptop.getDurataBaterie(),
                "Da",
                laptop.getRezolutieEcran(),
                laptop.getSistemOperare()
            };
            model.addRow(row);
        }
    }
    
      // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificaActionPerformed

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIlaptop().setVisible(true);
            }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerifica;
    private javax.swing.JComboBox<String> comboTouchScreen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDiagonala;
    private javax.swing.JTextField txtDurata;
    // End of variables declaration//GEN-END:variables
}