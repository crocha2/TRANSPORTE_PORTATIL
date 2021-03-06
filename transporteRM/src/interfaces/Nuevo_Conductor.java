/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import metodos.conductoresMysql;
import metodos.propietariosMysql;
import principales.conductores;
import principales.propietarios;

/**
 *
 * @author user
 */
public class Nuevo_Conductor extends javax.swing.JFrame {

    ArrayList<conductores> conductor;
    conductoresMysql dbconductor = new conductoresMysql();

    /**
     * Creates new form Nuevo_Propietario
     */
    public Nuevo_Conductor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("TRANSPORTES RM DEL CARIBE S.A.S - NUEVO CONDUCTOR");
    }
    

    public void limpiar() {
        txtCedula.setText("");
        txtNombreConductor.setText("");
        txtDepartamento.setText("");
        txtMunicipio.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtCedula.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtCedula = new javax.swing.JTextField();
        lblNit = new javax.swing.JLabel();
        lblNit1 = new javax.swing.JLabel();
        txtNombreConductor = new javax.swing.JTextField();
        lblNit2 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        lblNit3 = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        lblNit4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblNit5 = new javax.swing.JLabel();
        txtFechaIngreso = new com.toedter.calendar.JDateChooser();
        lblNit6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblNit7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNumeroLicencia = new javax.swing.JTextField();
        cmbCategorias = new javax.swing.JComboBox<>();
        lblNit8 = new javax.swing.JLabel();
        lblNit9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("CONDUCTORES");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel2.add(txtCedula);
        txtCedula.setBounds(20, 40, 230, 30);

        lblNit.setBackground(new java.awt.Color(204, 204, 204));
        lblNit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit.setText("CEDULA");
        jPanel2.add(lblNit);
        lblNit.setBounds(20, 20, 110, 14);

        lblNit1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit1.setText("NOMBRE COMPLETO");
        jPanel2.add(lblNit1);
        lblNit1.setBounds(270, 20, 130, 14);

        txtNombreConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreConductorActionPerformed(evt);
            }
        });
        txtNombreConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreConductorKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombreConductor);
        txtNombreConductor.setBounds(270, 40, 230, 30);

        lblNit2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit2.setText("DEPARTAMENTO");
        jPanel2.add(lblNit2);
        lblNit2.setBounds(20, 80, 110, 14);

        txtDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDepartamentoKeyTyped(evt);
            }
        });
        jPanel2.add(txtDepartamento);
        txtDepartamento.setBounds(20, 100, 230, 30);

        lblNit3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit3.setText("MUNICIPIO");
        jPanel2.add(lblNit3);
        lblNit3.setBounds(270, 80, 110, 14);

        txtMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMunicipioKeyTyped(evt);
            }
        });
        jPanel2.add(txtMunicipio);
        txtMunicipio.setBounds(270, 100, 230, 30);

        lblNit4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit4.setText("DIRECCION");
        jPanel2.add(lblNit4);
        lblNit4.setBounds(20, 140, 110, 14);
        jPanel2.add(txtDireccion);
        txtDireccion.setBounds(20, 160, 230, 30);

        lblNit5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit5.setText("FECHA DE INGRESO");
        jPanel2.add(lblNit5);
        lblNit5.setBounds(270, 140, 130, 14);

        txtFechaIngreso.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(txtFechaIngreso);
        txtFechaIngreso.setBounds(270, 160, 230, 30);

        lblNit6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit6.setText("CATEGORIA");
        jPanel2.add(lblNit6);
        lblNit6.setBounds(270, 260, 110, 14);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(20, 220, 230, 30);

        lblNit7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit7.setText("TELEFONO");
        jPanel2.add(lblNit7);
        lblNit7.setBounds(270, 200, 110, 14);
        jPanel2.add(txtTelefono);
        txtTelefono.setBounds(270, 220, 230, 30);
        jPanel2.add(txtNumeroLicencia);
        txtNumeroLicencia.setBounds(20, 280, 230, 30);

        cmbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A1", "A2", "B1", "B2", "B3", "C1", "C2", "C3" }));
        jPanel2.add(cmbCategorias);
        cmbCategorias.setBounds(270, 280, 150, 30);

        lblNit8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit8.setText("EMAIL");
        jPanel2.add(lblNit8);
        lblNit8.setBounds(20, 200, 110, 14);

        lblNit9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit9.setText("No. LICENCIA");
        jPanel2.add(lblNit9);
        lblNit9.setBounds(20, 260, 110, 14);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtCedula.getText().isEmpty() || txtNombreConductor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe gestionar el formulario");
        } else {
            try {
                conductores con = new conductores();
                con.setCedula(txtCedula.getText().toUpperCase());
                con.setNombre_conductor(txtNombreConductor.getText().toUpperCase());
                con.setDepartamento(txtDepartamento.getText().toUpperCase());
                con.setMunicipio(txtMunicipio.getText().toUpperCase());
                con.setDireccion(txtDireccion.getText().toUpperCase());

                String formato = txtFechaIngreso.getDateFormatString();
                Date date = txtFechaIngreso.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                String dato = String.valueOf(sdf.format(date));
                con.setFecha_ingreso(dato);

                con.setEmail(txtEmail.getText().toUpperCase());
                con.setTelefono(txtTelefono.getText().toUpperCase());
                con.setNumero_licencia(txtNumeroLicencia.getText().toUpperCase());
                con.setClase_categoria(cmbCategorias.getSelectedItem().toString());
                con.setEstado("ACTIVO");

                dbconductor.insertarConductor(con);

                Tabla_Conductores obj = new Tabla_Conductores();
                obj.setVisible(true);
                dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped

        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreConductorKeyTyped

   
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreConductorKeyTyped

    private void txtNombreConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreConductorActionPerformed

    private void txtDepartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartamentoKeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartamentoKeyTyped

    private void txtMunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMunicipioKeyTyped


        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMunicipioKeyTyped

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
            java.util.logging.Logger.getLogger(Nuevo_Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nuevo_Conductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNit1;
    private javax.swing.JLabel lblNit2;
    private javax.swing.JLabel lblNit3;
    private javax.swing.JLabel lblNit4;
    private javax.swing.JLabel lblNit5;
    private javax.swing.JLabel lblNit6;
    private javax.swing.JLabel lblNit7;
    private javax.swing.JLabel lblNit8;
    private javax.swing.JLabel lblNit9;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private com.toedter.calendar.JDateChooser txtFechaIngreso;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombreConductor;
    private javax.swing.JTextField txtNumeroLicencia;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
