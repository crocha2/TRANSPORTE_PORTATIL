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
import metodos.descuentosMysql;
import principales.descuentos;
import principales.viajes;

/**
 *
 * @author user
 */
public final class Nuevo_Descuento extends javax.swing.JFrame {

    ArrayList<descuentos> descuento;
    descuentosMysql dbDescuentos = new descuentosMysql();

    /**
     * Creates new form Nuevo_Propietario
     */
    public Nuevo_Descuento() {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        this.setTitle("TRANSPORTES RM DEL CARIBE S.A.S - DESCUENTOS");
        listarDescuentos();
        autoCompletePlaca();
        
        txtPrecio.setText("1");
        txtUnidad.setText("1");
        
        txtIdDescuento.setEnabled(false);
        txtIdVehiculo.setEnabled(false);
    }

    public void limpiar(){
        txtFecha2.setText("");
        txtPrecio.setText("1");
        txtUnidad.setText("1");
        txtTotal.setText("");
        areaDescripcion.setText("");
        txtFecha.setVisible(true);
        txtFecha2.setVisible(false);
        txtUnidad.requestFocus();
        cmbUnidad.setSelectedIndex(0);
        
    }
    
    public void listarDescuentos() {
        descuento = dbDescuentos.ListDescuentos();
        DefaultTableModel tb = (DefaultTableModel) tbDescuentos.getModel();
        for (descuentos des : descuento) {
            tb.addRow(new Object[]{des.getId_descuento(), des.getPlaca(), des.getFecha(), des.getDescripcion(), des.getUnidad(), des.getPrecio(), des.getTotal(), des.getId_vehiculo()});
        }
    }

    public void LimpiarDescuentos() {
        DefaultTableModel tb = (DefaultTableModel) tbDescuentos.getModel();
        for (int i = tb.getRowCount() - 1; i >= 0; i--) {
            tb.removeRow(i);
        }
    }
    
    public void autoCompletePlaca() {
        TextAutoCompleter TextAutoCompleter = new TextAutoCompleter(auto);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/transporterm", "root", "Colombia_16");
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT placa FROM vehiculos");
            while (rs.next()) {
                TextAutoCompleter.addItem(rs.getString("placa"));
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error: " + e);
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
        lblNit = new javax.swing.JLabel();
        lblNit1 = new javax.swing.JLabel();
        lblUnidad = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        lblNit3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        lblNit7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDescripcion = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtFecha2 = new javax.swing.JTextField();
        cmbUnidad = new javax.swing.JComboBox<>();
        auto = new javax.swing.JTextField();
        lblNit2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtIdVehiculo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDescuentos = new javax.swing.JTable();
        txtIdDescuento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DESCUENTOS");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(null);

        lblNit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNit.setForeground(new java.awt.Color(0, 0, 204));
        lblNit.setText("PLACA");
        jPanel2.add(lblNit);
        lblNit.setBounds(20, 20, 60, 30);

        lblNit1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit1.setText("DESCRIPCION");
        jPanel2.add(lblNit1);
        lblNit1.setBounds(20, 140, 100, 14);

        lblUnidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUnidad.setText("UNIDAD");
        jPanel2.add(lblUnidad);
        lblUnidad.setBounds(200, 70, 80, 14);

        txtUnidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUnidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadKeyTyped(evt);
            }
        });
        jPanel2.add(txtUnidad);
        txtUnidad.setBounds(200, 90, 140, 30);

        lblNit3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit3.setText("PRECIO");
        jPanel2.add(lblNit3);
        lblNit3.setBounds(370, 70, 70, 14);

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrecio);
        txtPrecio.setBounds(370, 90, 130, 30);

        txtFecha.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(txtFecha);
        txtFecha.setBounds(20, 90, 150, 30);

        lblNit7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit7.setText("TOTAL");
        jPanel2.add(lblNit7);
        lblNit7.setBounds(350, 160, 60, 14);

        areaDescripcion.setColumns(20);
        areaDescripcion.setRows(5);
        jScrollPane1.setViewportView(areaDescripcion);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 160, 320, 70);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalKeyTyped(evt);
            }
        });
        jPanel1.add(txtTotal);
        txtTotal.setBounds(10, 10, 130, 30);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(350, 180, 150, 50);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(20, 130, 480, 10);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(400, 10, 70, 32);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("EDITAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(130, 10, 110, 32);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("REGISTRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(10, 10, 110, 32);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("ELIMINAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(250, 10, 110, 32);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(20, 250, 480, 50);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(20, 240, 480, 10);
        jPanel2.add(txtFecha2);
        txtFecha2.setBounds(20, 90, 150, 30);

        cmbUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNIDAD", "VALOR" }));
        cmbUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUnidadActionPerformed(evt);
            }
        });
        jPanel2.add(cmbUnidad);
        cmbUnidad.setBounds(400, 140, 100, 20);
        jPanel2.add(auto);
        auto.setBounds(80, 20, 110, 30);

        lblNit2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNit2.setText("FECHA");
        jPanel2.add(lblNit2);
        lblNit2.setBounds(20, 70, 110, 14);

        jButton5.setText(">>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(200, 20, 50, 30);
        jPanel2.add(txtIdVehiculo);
        txtIdVehiculo.setBounds(260, 20, 60, 30);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(20, 60, 480, 10);

        tbDescuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PLACA", "FECHA", "DESCRIPCION", "UNIDAD", "PRECIO", "TOTAL", "ID_VEHICULO"
            }
        ));
        tbDescuentos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbDescuentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDescuentosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDescuentos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(txtIdDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        limpiar();
        LimpiarDescuentos();
        listarDescuentos();
        cmbUnidad.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed

        // total();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtTotalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyPressed

        //total();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyPressed

    private void txtTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyReleased

        //total();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyReleased

    private void txtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyTyped

        //total();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(txtIdDescuento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
        }else{
            try {
                descuentos des = new descuentos();
                
                des.setFecha(txtFecha2.getText());
                
                des.setPlaca(auto.getText().toUpperCase());
                des.setId_vehiculo(Integer.parseInt(txtIdVehiculo.getText()));
                des.setDescripcion(areaDescripcion.getText().toUpperCase());
                des.setUnidad(Integer.parseInt(txtUnidad.getText()));
                des.setPrecio(Integer.parseInt(txtPrecio.getText()));
                des.setTotal(Integer.parseInt(txtTotal.getText()));
                des.setId_descuento(Integer.parseInt(txtIdDescuento.getText()));

                dbDescuentos.EditarDescuento(des);

                limpiar();
                LimpiarDescuentos();
                listarDescuentos();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (txtTotal.getText().isEmpty() || areaDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe gestionar el formulario");
        } else {
            if(cmbUnidad.getSelectedItem().toString().equals("VALOR")){
                lblUnidad.setVisible(false);
                txtUnidad.setVisible(false);
                try {
                descuentos des = new descuentos();
                
                String formato = txtFecha.getDateFormatString();
                Date date = txtFecha.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                String dato = String.valueOf(sdf.format(date));
                des.setFecha(dato);
                
                des.setPlaca(auto.getText().toUpperCase());
                des.setId_vehiculo(Integer.parseInt(txtIdVehiculo.getText()));
                
                des.setDescripcion(areaDescripcion.getText().toUpperCase());
                des.setUnidad(1);
                des.setPrecio(Integer.parseInt(txtPrecio.getText()));
                des.setTotal(Integer.parseInt(txtTotal.getText()));
                

                dbDescuentos.insertarDescuento(des);

                limpiar();
                LimpiarDescuentos();
                listarDescuentos();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            }else{
                try {
                descuentos des = new descuentos();
                
                String formato = txtFecha.getDateFormatString();
                Date date = txtFecha.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat(formato);
                String dato = String.valueOf(sdf.format(date));
                des.setFecha(dato);
                
                des.setPlaca(auto.getText().toUpperCase());
                des.setId_vehiculo(Integer.parseInt(txtIdVehiculo.getText()));
                
                des.setDescripcion(areaDescripcion.getText().toUpperCase());
                des.setUnidad(Integer.parseInt(txtUnidad.getText()));
                des.setPrecio(Integer.parseInt(txtPrecio.getText()));
                des.setTotal(Integer.parseInt(txtTotal.getText()));

                dbDescuentos.insertarDescuento(des);

                limpiar();
                LimpiarDescuentos();
                listarDescuentos();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            }
            
            
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if(txtIdDescuento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
        }else{
            try {
                descuentos des = new descuentos();
                
                des.setId_descuento(Integer.parseInt(txtIdDescuento.getText()));

                dbDescuentos.EliminarDescuento(des);

                limpiar();
                LimpiarDescuentos();
                listarDescuentos();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmbUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUnidadActionPerformed

        String dato = cmbUnidad.getSelectedItem().toString();
        
        if(dato.equals("VALOR")){
            lblUnidad.setVisible(false);
            txtUnidad.setVisible(false);
        }else{
            lblUnidad.setVisible(true);
            txtUnidad.setVisible(true);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUnidadActionPerformed

    private void txtUnidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadKeyReleased

        String dato = txtUnidad.getText();

        if (dato.equals("") == false && dato.matches("[0-9]*")) {
            int unidad = Integer.parseInt(dato);

            //int unidad = Integer.parseInt(txtUnidad.getText());
            int precio = Integer.parseInt(txtPrecio.getText());
       
            int total = unidad * precio;
            txtTotal.setDisabledTextColor(java.awt.Color.BLUE);
            txtTotal.setText("" + total);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased

        String dato = txtPrecio.getText();

        if (dato.equals("") == false && dato.matches("[0-9]*")) {
            
            int precio = Integer.parseInt(dato);
            int unidad = Integer.parseInt(txtUnidad.getText());
       
            int total = unidad * precio;
            txtTotal.setDisabledTextColor(java.awt.Color.BLUE);
            txtTotal.setText("" + total);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void tbDescuentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDescuentosMouseClicked

        txtFecha.setVisible(false);
        txtFecha2.setVisible(true);
        lblUnidad.setVisible(true);
        txtUnidad.setVisible(true);
        cmbUnidad.setVisible(false);
        
        int seleccion = tbDescuentos.getSelectedRow();

        txtIdDescuento.setText(String.valueOf(tbDescuentos.getValueAt(seleccion, 0)));
        auto.setText(String.valueOf(tbDescuentos.getValueAt(seleccion, 1)));
        txtFecha2.setText(String.valueOf(tbDescuentos.getValueAt(seleccion, 2)));
        areaDescripcion.setText(String.valueOf(tbDescuentos.getValueAt(seleccion, 3)));
        txtUnidad.setText(String.valueOf(tbDescuentos.getValueAt(seleccion, 4)));
        txtPrecio.setText(String.valueOf(tbDescuentos.getValueAt(seleccion, 5)));
        txtTotal.setText(String.valueOf(tbDescuentos.getValueAt(seleccion, 6)));
        txtIdVehiculo.setText(String.valueOf(tbDescuentos.getValueAt(seleccion, 7)));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDescuentosMouseClicked

    private void txtUnidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadKeyTyped

        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped

        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            String guardar = auto.getText();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/transporterm", "root", "Colombia_16");
            Statement st = cn.createStatement();
            PreparedStatement pst = cn.prepareStatement("Select id_vehiculo from vehiculos where placa = ?");
            pst.setString(1, guardar);
            //pst.setString(1, CMBID.getName());
            ResultSet rs = pst.executeQuery();
            //txtConductor.setText("");
            if (rs.next()) {

                viajes vi = new viajes();
                vi.setId_vehiculo(rs.getInt("id_vehiculo"));
                //txtIdConductor.setText(""+con);
                txtIdVehiculo.setText(rs.getString("id_vehiculo").trim());
                //autoCompleteConductor();
            } else {
                JOptionPane.showMessageDialog(null, "No existe el vehiculo");
            }
            cn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error\n" + ex.getMessage());
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Nuevo_Descuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Descuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Descuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevo_Descuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nuevo_Descuento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDescripcion;
    private javax.swing.JTextField auto;
    private javax.swing.JComboBox<String> cmbUnidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNit1;
    private javax.swing.JLabel lblNit2;
    private javax.swing.JLabel lblNit3;
    private javax.swing.JLabel lblNit7;
    private javax.swing.JLabel lblUnidad;
    private javax.swing.JTable tbDescuentos;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtFecha2;
    private javax.swing.JTextField txtIdDescuento;
    private javax.swing.JTextField txtIdVehiculo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
}
