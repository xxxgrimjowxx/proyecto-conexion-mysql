
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class PersonaFrm extends javax.swing.JFrame {

    /**
     * Creates new form PersonaFrm
     */
    public PersonaFrm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNOMBRE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAPELLIDO = new javax.swing.JTextField();
        txtTELEFONO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDIRECCION = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIDENTIFICACION = new javax.swing.JTextField();
        btnINSERTAR = new javax.swing.JButton();
        BTNLISTAR = new javax.swing.JButton();
        BTNCONSULTAR = new javax.swing.JButton();
        BTNACTUALIZAR = new javax.swing.JButton();
        BTNBORRAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PERSONA");

        jLabel2.setText("ID");

        jLabel3.setText("NOMBRE");

        txtNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMBREActionPerformed(evt);
            }
        });

        jLabel4.setText("APELLIDO");

        txtAPELLIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPELLIDOActionPerformed(evt);
            }
        });

        txtTELEFONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTELEFONOActionPerformed(evt);
            }
        });

        jLabel5.setText("TELEFONO");

        txtDIRECCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDIRECCIONActionPerformed(evt);
            }
        });

        jLabel6.setText("DIRECCION");

        jLabel7.setText("IDENTIFICACION");

        txtIDENTIFICACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDENTIFICACIONActionPerformed(evt);
            }
        });

        btnINSERTAR.setText("INSERTAR");
        btnINSERTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINSERTARActionPerformed(evt);
            }
        });

        BTNLISTAR.setText("LISTAR");
        BTNLISTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLISTARActionPerformed(evt);
            }
        });

        BTNCONSULTAR.setText("CONSULTAR");
        BTNCONSULTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCONSULTARActionPerformed(evt);
            }
        });

        BTNACTUALIZAR.setText("ACTUALIZAR");
        BTNACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNACTUALIZARActionPerformed(evt);
            }
        });

        BTNBORRAR.setText("BORRAR");
        BTNBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBORRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(BTNBORRAR))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDENTIFICACION, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNOMBRE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAPELLIDO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTELEFONO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTNCONSULTAR)
                                    .addComponent(BTNLISTAR)
                                    .addComponent(btnINSERTAR)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(BTNACTUALIZAR)))))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnINSERTAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtIDENTIFICACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNLISTAR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTNCONSULTAR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAPELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(BTNACTUALIZAR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNBORRAR))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMBREActionPerformed

    private void txtAPELLIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAPELLIDOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAPELLIDOActionPerformed

    private void txtTELEFONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTELEFONOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTELEFONOActionPerformed

    private void txtDIRECCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDIRECCIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDIRECCIONActionPerformed

    private void txtIDENTIFICACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDENTIFICACIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDENTIFICACIONActionPerformed

    private void btnINSERTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINSERTARActionPerformed
        Persona per = new Persona();
        per.insertarPersona(Integer.parseInt(txtID.getText()), txtNOMBRE.getText(), txtAPELLIDO.getText(), txtTELEFONO.getText(), txtDIRECCION.getText(),Integer.parseInt (txtIDENTIFICACION.getText()));
    }//GEN-LAST:event_btnINSERTARActionPerformed

    private void BTNLISTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLISTARActionPerformed
        Persona per= new Persona();
        String lista= per.listarPersonas();
        JOptionPane.showMessageDialog(null,lista);
    }//GEN-LAST:event_BTNLISTARActionPerformed

    private void BTNCONSULTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCONSULTARActionPerformed
        Persona per= new Persona();
        int id =Integer.parseInt(txtID.getText());
         String lista= per.consultarPersona(id);
         JOptionPane.showMessageDialog(null,lista);
    }//GEN-LAST:event_BTNCONSULTARActionPerformed

    private void BTNACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNACTUALIZARActionPerformed
       Persona per= new Persona();
       per.actualizarPersona( Integer.parseInt(txtID.getText()), txtNOMBRE.getText(), txtAPELLIDO.getText(), txtTELEFONO.getText(), txtDIRECCION.getText(), Integer.parseInt(txtIDENTIFICACION.getText()));
    }//GEN-LAST:event_BTNACTUALIZARActionPerformed

    private void BTNBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBORRARActionPerformed
       Persona per= new Persona();
       per.eliminarPersona(Integer.parseInt(txtID.getText()));
    }//GEN-LAST:event_BTNBORRARActionPerformed

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
            java.util.logging.Logger.getLogger(PersonaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonaFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonaFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNACTUALIZAR;
    private javax.swing.JButton BTNBORRAR;
    private javax.swing.JButton BTNCONSULTAR;
    private javax.swing.JButton BTNLISTAR;
    private javax.swing.JButton btnINSERTAR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAPELLIDO;
    private javax.swing.JTextField txtDIRECCION;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDENTIFICACION;
    private javax.swing.JTextField txtNOMBRE;
    private javax.swing.JTextField txtTELEFONO;
    // End of variables declaration//GEN-END:variables
}
