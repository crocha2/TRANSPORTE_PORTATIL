/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.conductoresMysql;
import metodos.propietariosMysql;
import metodos.vehiculosMysql;
import principales.conductores;
import principales.propietarios;
import principales.vehiculos;

/**
 *
 * @author user
 */
public final class Nuevo_Vehiculo extends javax.swing.JFrame {

    ArrayList<vehiculos> vehiculo;
    vehiculosMysql dbvehiculo = new vehiculosMysql();
    
    /**
     * Creates new form Nuevo_Propietario
     */
    public Nuevo_Vehiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("TRANSPORTES RM DEL CARIBE S.A.S - NUEVO VEHICULO");
        txtIdConductor.setEnabled(false);
        txtIdPropietario.setEnabled(false);
        autoCompleteConductor();
        autoCompletePropietario();
    }
    
    public void limpiar(){
        txtPlaca.setText("");
        cmbAñoModelo.setSelectedIndex(0);
        cmbPropio.setSelectedIndex(0);
        txtClase.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        txtMetroCubico.setText("");
        txtConductor.setText("");
        txtPropietario.setText("");
        txtIdConductor.setText("");
        txtIdPropietario.setText("");
        txtPlaca.requestFocus();
    }
    
    public void autoCompleteConductor(){
        TextAutoCompleter TextAutoCompleter = new TextAutoCompleter(txtConductor);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/transporterm", "root", "Colombia_16");
            Statement st = (Statement)cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM conductores");
            while (rs.next()) {
                TextAutoCompleter.addItem(rs.getString("nombre"));
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error: "+e);
        }
    }
    
    public void autoCompletePropietario(){
        TextAutoCompleter TextAutoCompleter = new TextAutoCompleter(txtPropietario);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/transporterm", "root", "Colombia_16");
            Statement st = (Statement)cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre_propietario FROM propietarios");
            while (rs.next()) {
                TextAutoCompleter.addItem(rs.getString("nombre_propietario"));
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error: "+e);
        }
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
        jPanel2 = new javax.swing.JPanel();
        txtPlaca = new javax.swing.JTextField();
        lblNit = new javax.swing.JLabel();
        lblNit1 = new javax.swing.JLabel();
        lblNit5 = new javax.swing.JLabel();
        txtFechaIngreso = new com.toedter.calendar.JDateChooser();
        cmbAñoModelo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        txtClase = new javax.swing.JTextField();
        lblNit3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblNit4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        lblNit7 = new javax.swing.JLabel();
        lblNit8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtIdConductor = new javax.swing.JTextField();
        lblNit10 = new javax.swing.JLabel();
        lblNit11 = new javax.swing.JLabel();
        cmbPropio = new javax.swing.JComboBox<>();
        txtMetroCubico = new javax.swing.JTextField();
        txtConductor = new javax.swing.JTextField();
        txtPropietario = new javax.swing.JTextField();
        lblNit6 = new javax.swing.JLabel();
        lblNit9 = new javax.swing.JLabel();
        txtIdPropietario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblNit12 = new javax.swing.JLabel();
        lblNit13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("VEHICULOS");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Tecnicos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setLayout(null);
        jPanel2.add(txtPlaca);
        txtPlaca.setBounds(20, 40, 150, 30);

        lblNit.setBackground(new java.awt.Color(204, 204, 204));
        lblNit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit.setText("PLACA");
        jPanel2.add(lblNit);
        lblNit.setBounds(20, 20, 110, 14);

        lblNit1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit1.setText("AÑO MODELO");
        jPanel2.add(lblNit1);
        lblNit1.setBounds(190, 20, 90, 14);

        lblNit5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit5.setText("FECHA DE INGRESO");
        jPanel2.add(lblNit5);
        lblNit5.setBounds(390, 20, 130, 14);

        txtFechaIngreso.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(txtFechaIngreso);
        txtFechaIngreso.setBounds(390, 40, 170, 30);

        cmbAñoModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        jPanel2.add(cmbAñoModelo);
        cmbAñoModelo.setBounds(190, 40, 180, 30);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Generales", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel4.setLayout(null);
        jPanel4.add(txtClase);
        txtClase.setBounds(20, 40, 250, 30);

        lblNit3.setBackground(new java.awt.Color(204, 204, 204));
        lblNit3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit3.setText("CLASE");
        jPanel4.add(lblNit3);
        lblNit3.setBounds(20, 20, 110, 14);
        jPanel4.add(txtMarca);
        txtMarca.setBounds(310, 40, 250, 30);

        lblNit4.setBackground(new java.awt.Color(204, 204, 204));
        lblNit4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit4.setText("MARCA");
        jPanel4.add(lblNit4);
        lblNit4.setBounds(310, 20, 110, 14);
        jPanel4.add(txtModelo);
        txtModelo.setBounds(20, 100, 250, 30);

        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        jPanel4.add(txtColor);
        txtColor.setBounds(310, 100, 150, 30);

        lblNit7.setBackground(new java.awt.Color(204, 204, 204));
        lblNit7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit7.setText("COLOR");
        jPanel4.add(lblNit7);
        lblNit7.setBounds(310, 80, 110, 14);

        lblNit8.setBackground(new java.awt.Color(204, 204, 204));
        lblNit8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit8.setText("MODELO");
        jPanel4.add(lblNit8);
        lblNit8.setBounds(20, 80, 110, 14);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos De Soporte", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel5.setLayout(null);
        jPanel5.add(txtIdConductor);
        txtIdConductor.setBounds(20, 130, 70, 30);

        lblNit10.setBackground(new java.awt.Color(204, 204, 204));
        lblNit10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit10.setText("METROS CUBICOS (m3)");
        jPanel5.add(lblNit10);
        lblNit10.setBounds(20, 20, 160, 14);

        lblNit11.setBackground(new java.awt.Color(204, 204, 204));
        lblNit11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit11.setText("PROPIO");
        jPanel5.add(lblNit11);
        lblNit11.setBounds(310, 20, 110, 14);

        cmbPropio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel5.add(cmbPropio);
        cmbPropio.setBounds(310, 40, 80, 30);

        txtMetroCubico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMetroCubicoKeyTyped(evt);
            }
        });
        jPanel5.add(txtMetroCubico);
        txtMetroCubico.setBounds(20, 40, 250, 30);
        jPanel5.add(txtConductor);
        txtConductor.setBounds(20, 100, 250, 30);
        jPanel5.add(txtPropietario);
        txtPropietario.setBounds(310, 100, 250, 30);

        lblNit6.setBackground(new java.awt.Color(204, 204, 204));
        lblNit6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit6.setText("PROPIETARIO");
        jPanel5.add(lblNit6);
        lblNit6.setBounds(310, 80, 110, 14);

        lblNit9.setBackground(new java.awt.Color(204, 204, 204));
        lblNit9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit9.setText("ID");
        jPanel5.add(lblNit9);
        lblNit9.setBounds(390, 140, 30, 30);
        jPanel5.add(txtIdPropietario);
        txtIdPropietario.setBounds(310, 130, 70, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(490, 80, 70, 20);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(200, 80, 70, 20);

        lblNit12.setBackground(new java.awt.Color(204, 204, 204));
        lblNit12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit12.setText("CONDUCTOR");
        jPanel5.add(lblNit12);
        lblNit12.setBounds(20, 80, 110, 14);

        lblNit13.setBackground(new java.awt.Color(204, 204, 204));
        lblNit13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit13.setText("ID");
        jPanel5.add(lblNit13);
        lblNit13.setBounds(100, 144, 30, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(txtPlaca.getText().isEmpty() || txtIdConductor.getText().isEmpty()|| txtIdPropietario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe gestionar el formulario");
        }else{
           try {
            vehiculos ve = new vehiculos();
            ve.setPlaca(txtPlaca.getText().toUpperCase());
            ve.setAño_modelo(cmbAñoModelo.getSelectedItem().toString());
            
            String formato = txtFechaIngreso.getDateFormatString();
            Date date = txtFechaIngreso.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String dato = String.valueOf(sdf.format(date));
            ve.setFecha_ingreso(dato);
            
            ve.setMetros_cubicos(txtMetroCubico.getText().toUpperCase());
            ve.setClase(txtClase.getText().toUpperCase());
            ve.setMarca(txtMarca.getText().toUpperCase());
            ve.setModelo(txtModelo.getText().toUpperCase());
            ve.setColor(txtColor.getText().toUpperCase());
            ve.setPropio(cmbPropio.getSelectedItem().toString());
            ve.setId_conductor(Integer.parseInt(txtIdConductor.getText()));
            ve.setId_propietario(Integer.parseInt(txtIdPropietario.getText()));
            ve.setEstado("ACTIVO");

            dbvehiculo.insertarVehiculo(ve);
            
            Tabla_Vehiculos obj = new Tabla_Vehiculos();
            obj.setVisible(true);
            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            String guardar = txtConductor.getText();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/transporterm", "root", "Colombia_16");
            Statement st = cn.createStatement();
            PreparedStatement pst = cn.prepareStatement("Select id_conductor from conductores where nombre = ?");
            pst.setString(1, guardar);
            //pst.setString(1, CMBID.getName());
            ResultSet rs = pst.executeQuery();
            //txtConductor.setText("");
            if (rs.next()) {
                
                conductores con = new conductores();
                con.setId_conductor(rs.getInt("id_conductor"));
                //txtIdConductor.setText(""+con);
                txtIdConductor.setText(rs.getString("id_conductor").trim());
                //autoCompleteConductor();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario");
            }
            cn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error\n"+ex.getMessage());
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            String guardar = txtPropietario.getText();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/transporterm", "root", "Colombia_16");
            Statement st = cn.createStatement();
            PreparedStatement pst = cn.prepareStatement("Select id_propietario from propietarios where nombre_propietario = ?");
            pst.setString(1, guardar);
            //pst.setString(1, CMBID.getName());
            ResultSet rs = pst.executeQuery();
            //txtPropietario.setText("");
            if (rs.next()) {
                
                propietarios pro = new propietarios();
                txtIdPropietario.setText(rs.getString("id_propietario").trim());
                //autoCompletePropietario();
          
            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario");
            }
            cn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error\n"+ex.getMessage());
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped

        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtMetroCubicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMetroCubicoKeyTyped

        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetroCubicoKeyTyped

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
            java.util.logging.Logger.getLogger(Nuevo_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nuevo_Vehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbAñoModelo;
    private javax.swing.JComboBox<String> cmbPropio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNit1;
    private javax.swing.JLabel lblNit10;
    private javax.swing.JLabel lblNit11;
    private javax.swing.JLabel lblNit12;
    private javax.swing.JLabel lblNit13;
    private javax.swing.JLabel lblNit3;
    private javax.swing.JLabel lblNit4;
    private javax.swing.JLabel lblNit5;
    private javax.swing.JLabel lblNit6;
    private javax.swing.JLabel lblNit7;
    private javax.swing.JLabel lblNit8;
    private javax.swing.JLabel lblNit9;
    private javax.swing.JTextField txtClase;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtConductor;
    private com.toedter.calendar.JDateChooser txtFechaIngreso;
    private javax.swing.JTextField txtIdConductor;
    private javax.swing.JTextField txtIdPropietario;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMetroCubico;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPropietario;
    // End of variables declaration//GEN-END:variables
}
