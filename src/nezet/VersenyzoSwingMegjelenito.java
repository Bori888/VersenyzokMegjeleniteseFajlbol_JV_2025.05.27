package nezet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Versenyzo;

public class VersenyzoSwingMegjelenito extends javax.swing.JFrame {

    private List<Versenyzo> versenyzok;
    
    public VersenyzoSwingMegjelenito() {
        initComponents();
        versenyzok = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtVersenyzoNev = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtVersenyzoEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtVersenyzoAtlag = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numVersenyzoElsoDb = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        cmbNevek = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuPrg = new javax.swing.JMenu();
        mnuPrgBeFajlbol = new javax.swing.JMenuItem();
        mnuPrgFix = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OOP fájlkezelés");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kiválasztott versenyző adatai"));

        jLabel1.setText("név:");

        txtVersenyzoNev.setEditable(false);

        jLabel2.setText("e-mail:");

        txtVersenyzoEmail.setEditable(false);

        jLabel3.setText("átlag:");

        txtVersenyzoAtlag.setEditable(false);

        jLabel4.setText("első helyek:");

        numVersenyzoElsoDb.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        numVersenyzoElsoDb.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVersenyzoNev)
                    .addComponent(txtVersenyzoEmail)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtVersenyzoAtlag, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numVersenyzoElsoDb, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVersenyzoNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVersenyzoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVersenyzoAtlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(numVersenyzoElsoDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nevezett versenyzők"));

        cmbNevek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNevekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbNevek, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbNevek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuPrg.setText("Program");

        mnuPrgBeFajlbol.setText("Betöltés fájlból");
        mnuPrgBeFajlbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrgBeFajlbolActionPerformed(evt);
            }
        });
        mnuPrg.add(mnuPrgBeFajlbol);

        mnuPrgFix.setText("Fix versenyző megjelenítése");
        mnuPrgFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrgFixActionPerformed(evt);
            }
        });
        mnuPrg.add(mnuPrgFix);

        jMenuBar1.add(mnuPrg);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPrgBeFajlbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrgBeFajlbolActionPerformed
        try {
            List<String> sorok = Files.readAllLines(Path.of("versenyzok"));

            for (int i = 1; i < sorok.size(); i++) {
                String sor = sorok.get(i);
                Versenyzo versenyzo = new Versenyzo(sor);
                versenyzok.add(versenyzo);
                cmbNevek.addItem(versenyzo.getNev());
            }
            megjelenites(versenyzok.get(0));
        } catch (IOException ex) {
            Logger.getLogger(VersenyzoSwingMegjelenito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuPrgBeFajlbolActionPerformed

    private void mnuPrgFixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrgFixActionPerformed
        Versenyzo versenyzo = new Versenyzo("RókaRudi", "rr@r.hu", Math.E, 21);
        megjelenites(versenyzo);
    }//GEN-LAST:event_mnuPrgFixActionPerformed

    private void cmbNevekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNevekActionPerformed
        //hányadik sorra katintunk a konbobokszban
        int i = cmbNevek.getSelectedIndex();
        //hányadik versenyzo
        Versenyzo versenyzo = versenyzok.get(i);
         //irjuk ki
        megjelenites(versenyzo);
        
       
    }//GEN-LAST:event_cmbNevekActionPerformed

    private void megjelenites(Versenyzo versenyzo) {
        txtVersenyzoNev.setText(versenyzo.getNev());
        txtVersenyzoEmail.setText(versenyzo.getEmail());
        //txtVersenyzoAtlag.setText(atlagTizedessel(versenyzo.getAtlag(), 2));
        txtVersenyzoAtlag.setText(atlagTizedessel(versenyzo.getAtlag()));
        numVersenyzoElsoDb.setValue(versenyzo.getElsoDb());
    }

    private String atlagTizedessel(double atlag) {
        return atlagTizedessel(atlag, 2);
    }
    
    private String atlagTizedessel(double atlag, int pontossag) {
        String formazo = "%."+pontossag+"f";//%.2f
        return formazo.formatted(atlag);
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
            java.util.logging.Logger.getLogger(VersenyzoSwingMegjelenito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VersenyzoSwingMegjelenito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VersenyzoSwingMegjelenito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VersenyzoSwingMegjelenito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VersenyzoSwingMegjelenito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbNevek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu mnuPrg;
    private javax.swing.JMenuItem mnuPrgBeFajlbol;
    private javax.swing.JMenuItem mnuPrgFix;
    private javax.swing.JSpinner numVersenyzoElsoDb;
    private javax.swing.JTextField txtVersenyzoAtlag;
    private javax.swing.JTextField txtVersenyzoEmail;
    private javax.swing.JTextField txtVersenyzoNev;
    // End of variables declaration//GEN-END:variables
}
