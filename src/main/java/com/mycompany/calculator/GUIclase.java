package com.mycompany.calculator;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.ArrayList;
public class GUIclase extends javax.swing.JFrame {
  private ArrayList<Calculator> calculators = new ArrayList<>();
    private ArrayList<Desktop> desktops = new ArrayList<>();
    private ArrayList<Server> servers = new ArrayList<>();
    public GUIclase() {
        initComponents();
      String[] columnNames = {
    "Tip", "Marca", "Model", "RAM", "Stocare", 
    "Format Carcasă", "Placa de Bază", 
    "Placa Video Dedicate", "Număr Procesoare", 
    "Tip Procesor", "Frecvență Procesor", "Memorie RAM"
};

DefaultTableModel model = new DefaultTableModel(null, columnNames);
jTable1.setModel(model);
    }
private void importData() {
    JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
            String line;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); 

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals("Calculator")) {
                    Calculator calc = new Calculator(data[1], data[2]);
                    calculators.add(calc);
                    model.addRow(new Object[]{
                        calc.getClass().getSimpleName(), 
                        calc.getMarca(), 
                        calc.getModel(), 
                        "", 
                        "", 
                        "", 
                        "", 
                        "", 
                        "", 
                        "", 
                        "", 
                        ""  
                    });
                } else if (data[0].equals("Desktop")) {
                    Desktop desktop = new Desktop(data[1], data[2], Byte.parseByte(data[3]), Short.parseShort(data[4]), 
                            data[5], data[6], Boolean.parseBoolean(data[7]));
                    desktops.add(desktop);
                    model.addRow(new Object[]{
                        desktop.getClass().getSimpleName(), 
                        desktop.getMarca(),
                        desktop.getModel(), 
                        desktop.getRam(), 
                        desktop.getStocare(), 
                        desktop.getFormatCarcasa(), 
                        desktop.getPlacaDeBaza(),
                        desktop.isPlacaVideoDedicate(), 
                        "", 
                        "", 
                        "", 
                        ""  
                    });
                } else if (data[0].equals("Server")) {
                    Server server = new Server(data[1], data[2], Integer.parseInt(data[3]), data[4], 
                            Float.parseFloat(data[5]), Short.parseShort(data[6]));
                    servers.add(server);
                    model.addRow(new Object[]{
                        server.getClass().getSimpleName(),
                        server.getMarca(), 
                        server.getModel(), 
                        "", 
                        "", 
                        "",
                        "", 
                        "", 
                        server.getNumarProcesoare(), 
                        server.getTipProcesor(), 
                        server.getFrecventaProcesor(), 
                        server.getMemorieRAM() 
                    });
                }
            }
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Eroare la citirea fișierului!");
        }
    }
}

private void exportData() {
    try {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));

            for (Calculator calc : calculators) {
                writer.write("Calculator," + calc.getMarca() + "," + calc.getModel() + "\n");
            }
            for (Desktop desktop : desktops) {
                writer.write("Desktop," + desktop.getMarca() + "," + desktop.getModel() + "," + desktop.getRam() + "," +
                        desktop.getStocare() + "," + desktop.getFormatCarcasa() + "," + desktop.getPlacaDeBaza() + "," +
                        desktop.isPlacaVideoDedicate() + "\n");
            }
            for (Server server : servers) {
                writer.write("Server," + server.getMarca() + "," + server.getModel() + "," + server.getNumarProcesoare() + "," +
                        server.getTipProcesor() + "," + server.getFrecventaProcesor() + "," + server.getMemorieRAM() + "\n");
            }

            writer.close();
            JOptionPane.showMessageDialog(this, "Instanțele au fost salvate cu succes!");
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Eroare la salvarea fișierului!");
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 204, 153));
        jButton1.setText("import");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("export");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(468, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         importData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        exportData();
    }//GEN-LAST:event_jButton2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(GUIclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIclase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
