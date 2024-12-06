package com.mycompany.calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class DesktopGUI extends javax.swing.JFrame {
  private List<Desktop> desktopuri = new ArrayList<>();
    public DesktopGUI() {
        initComponents();
        initializeDesktopuri();
    }
  private void initializeDesktopuri() {
    desktopuri.add(new Desktop("Dell", "OptiPlex 3080", (byte) 8, (short) 256, "Tower", "Intel B560", true));
    desktopuri.add(new Desktop("HP", "EliteDesk 800", (byte) 16, (short) 512, "Mini", "AMD A520", false));
    desktopuri.add(new Desktop("Lenovo", "ThinkCentre M75q", (byte) 4, (short) 128, "Desktop", "Intel H410", false));
    updateTable(); 
}
   private void updateTable() {
    DefaultTableModel model = (DefaultTableModel) tableDesktopuri.getModel();
    model.setRowCount(0); 
    for (Desktop desktop : desktopuri) {
        model.addRow(new Object[] {
            desktop.getRam(),
            desktop.getStocare(),
            desktop.getFormatCarcasa() != null ? desktop.getFormatCarcasa() : "Inexistent"
        });
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRam = new javax.swing.JLabel();
        labelStocare = new javax.swing.JLabel();
        labelCarcasa = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        buttonFiltrare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDesktopuri = new javax.swing.JTable();
        buttonInchidere = new javax.swing.JButton();
        buttonSalvare = new javax.swing.JButton();
        ButonStergere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelRam.setText("RAM minim (GB):");

        labelStocare.setText("Stocare minimă (GB):");

        labelCarcasa.setText("Tip carcasă:");

        jTextField1.setText("32");

        jTextField2.setText("1024");

        jTextField3.setText("Tower");

        buttonFiltrare.setBackground(new java.awt.Color(102, 102, 255));
        buttonFiltrare.setText("Filtreaza");
        buttonFiltrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiltrareActionPerformed(evt);
            }
        });

        tableDesktopuri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ram", "Stocare", "Carcasa"
            }
        ));
        jScrollPane1.setViewportView(tableDesktopuri);

        buttonInchidere.setBackground(new java.awt.Color(204, 204, 255));
        buttonInchidere.setText("Inchidere");
        buttonInchidere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInchidereActionPerformed(evt);
            }
        });

        buttonSalvare.setBackground(new java.awt.Color(153, 102, 255));
        buttonSalvare.setText("Salvare");
        buttonSalvare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvareActionPerformed(evt);
            }
        });

        ButonStergere.setBackground(new java.awt.Color(0, 204, 204));
        ButonStergere.setText("Sterge");
        ButonStergere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonStergereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelCarcasa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButonStergere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonFiltrare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonInchidere, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(buttonSalvare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelStocare, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelRam, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(580, 580, 580))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStocare))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCarcasa)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInchidere))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonFiltrare)
                        .addGap(18, 18, 18)
                        .addComponent(ButonStergere)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSalvare))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFiltrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiltrareActionPerformed
    String ramText = jTextField1.getText().trim(); 
    String stocareText = jTextField2.getText().trim(); 
    String carcasaText = jTextField3.getText().trim(); 
    if (!ramText.isEmpty() && !ramText.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Introduceți o valoare validă pentru RAM (număr pozitiv) sau lăsați câmpul gol.", "Eroare", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!stocareText.isEmpty() && !stocareText.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Introduceți o valoare validă pentru Stocare (număr pozitiv) sau lăsați câmpul gol.", "Eroare", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!carcasaText.isEmpty() && !carcasaText.matches("[a-zA-Z]+")) {
        JOptionPane.showMessageDialog(this, "Introduceți un tip de carcasă valid (doar litere) sau lăsați câmpul gol.", "Eroare", JOptionPane.ERROR_MESSAGE);
        return;
    }
    Byte ramMinim = ramText.isEmpty() ? null : Byte.parseByte(ramText);
    Short stocareMinima = stocareText.isEmpty() ? null : Short.parseShort(stocareText);
    List<Desktop> desktopuriFiltrate = desktopuri.stream()
            .filter(d -> ramMinim == null || d.getRam() >= ramMinim) 
            .filter(d -> stocareMinima == null || d.getStocare() >= stocareMinima) 
            .filter(d -> carcasaText.isEmpty() || d.getFormatCarcasa().equalsIgnoreCase(carcasaText)) 
            .collect(Collectors.toList());
    StringBuilder mesaj = new StringBuilder("Număr de desktopuri găsite: " + desktopuriFiltrate.size() + "\n");
    for (Desktop d : desktopuriFiltrate) {
        mesaj.append(d.toString()).append("\n");
    }
    JOptionPane.showMessageDialog(this, mesaj.toString(), "Rezultate filtrare", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonFiltrareActionPerformed
    
    private void buttonInchidereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInchidereActionPerformed
    int confirm = JOptionPane.showConfirmDialog(this, "Sigur doriți să închideți aplicația?","Confirmare închidere", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        System.exit(0);
    } 
    }//GEN-LAST:event_buttonInchidereActionPerformed

    private void buttonSalvareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvareActionPerformed
   String ramText = jTextField1.getText();
    String stocareText = jTextField2.getText();
    String carcasaText = jTextField3.getText();
    if (ramText.isEmpty() || stocareText.isEmpty() || carcasaText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Completați toate câmpurile!", "Eroare", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!ramText.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Introduceți o valoare numerică validă pentru RAM!", "Eroare", JOptionPane.ERROR_MESSAGE);
        return;
    }
   if (!stocareText.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Introduceți o valoare numerică validă pentru Stocare!", "Eroare", JOptionPane.ERROR_MESSAGE);
        return;
    }
   if (!carcasaText.matches("[a-zA-Z]+")) {
        JOptionPane.showMessageDialog(this, "Introduceți un tip de carcasă valid (doar litere)!", "Eroare", JOptionPane.ERROR_MESSAGE);
        return;
    }
 byte ram = Byte.parseByte(ramText);
    short stocare = Short.parseShort(stocareText);
    String formatCarcasa = carcasaText;

    Desktop desktopNou = new Desktop("Custom", "Model", ram, stocare, formatCarcasa, "Placa de bază generică", false);
    desktopuri.add(desktopNou);
    updateTable();
   JOptionPane.showMessageDialog(this, "Desktop adăugat cu succes!", "Succes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonSalvareActionPerformed

    private void ButonStergereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonStergereActionPerformed
    int selectedRow = tableDesktopuri.getSelectedRow(); // Indexul rândului selectat
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Selectați un rând din tabel pentru a-l șterge!", "Eroare", JOptionPane.ERROR_MESSAGE);
        return;
    }
  int confirm = JOptionPane.showConfirmDialog(this, "Sigur doriți să ștergeți desktopul selectat?", "Confirmare ștergere", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        Desktop desktopSters = desktopuri.get(selectedRow); 
        desktopuri.remove(selectedRow); 
        updateTable();     
        JOptionPane.showMessageDialog(this, "Desktop șters cu succes: \n" + desktopSters.toString(), "Succes", JOptionPane.INFORMATION_MESSAGE);
   String ramText = jTextField1.getText().trim();
        String stocareText = jTextField2.getText().trim();
        String carcasaText = jTextField3.getText().trim();
       Byte ramMinim = ramText.isEmpty() ? null : Byte.parseByte(ramText);
        Short stocareMinima = stocareText.isEmpty() ? null : Short.parseShort(stocareText);
      List<Desktop> desktopuriFiltrate = desktopuri.stream()
                .filter(d -> ramMinim == null || d.getRam() >= ramMinim)
                .filter(d -> stocareMinima == null || d.getStocare() >= stocareMinima)
                .filter(d -> carcasaText.isEmpty() || d.getFormatCarcasa().equalsIgnoreCase(carcasaText))
                .collect(Collectors.toList());     
    }//GEN-LAST:event_ButonStergereActionPerformed
}
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
            java.util.logging.Logger.getLogger(DesktopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesktopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesktopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesktopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesktopGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButonStergere;
    private javax.swing.JButton buttonFiltrare;
    private javax.swing.JButton buttonInchidere;
    private javax.swing.JButton buttonSalvare;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelCarcasa;
    private javax.swing.JLabel labelRam;
    private javax.swing.JLabel labelStocare;
    private javax.swing.JTable tableDesktopuri;
    // End of variables declaration//GEN-END:variables
}
