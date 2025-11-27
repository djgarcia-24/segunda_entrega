/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.productoctl;

/**
 *
 * @author j
 */
public class IngresoProducto extends javax.swing.JPanel {
    private productoctl productoControl;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(IngresoProducto.class.getName());

    /**
     * Creates new form IngresoProducto
     */
    public IngresoProducto(modelo.basededatos bd) {
        initComponents();
        checkbox1.setSelected(false);
        vencimiento_txt.setEditable(false);
        vencimiento_txt.setText("");
        
        this.productoControl = new productoctl(bd);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cantidad_label = new javax.swing.JLabel();
        nombre_label = new javax.swing.JLabel();
        categoria_label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        proveedor_label = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        vencimiento_label = new javax.swing.JLabel();
        ingreso_label = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        categoria_txt = new javax.swing.JTextField();
        cantidad_txt = new javax.swing.JTextField();
        ingreso_txt = new javax.swing.JTextField();
        vencimiento_txt = new javax.swing.JTextField();
        proveedor_txt = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        checkbox1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        cantidad_label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cantidad_label.setForeground(new java.awt.Color(96, 96, 96));
        cantidad_label.setText("Cantidad:");
        cantidad_label.setPreferredSize(new java.awt.Dimension(120, 20));

        nombre_label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        nombre_label.setForeground(new java.awt.Color(96, 96, 96));
        nombre_label.setText("Nombre:");
        nombre_label.setPreferredSize(new java.awt.Dimension(120, 20));

        categoria_label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        categoria_label.setForeground(new java.awt.Color(96, 96, 96));
        categoria_label.setText("Categoría:");
        categoria_label.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel8.setForeground(new java.awt.Color(127, 140, 143));
        jLabel8.setText("AAAA-MM-DD");

        id_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id_txt.setForeground(new java.awt.Color(44, 62, 80));
        id_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        id_txt.setPreferredSize(new java.awt.Dimension(0, 36));
        id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtActionPerformed(evt);
            }
        });

        proveedor_label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        proveedor_label.setForeground(new java.awt.Color(96, 96, 96));
        proveedor_label.setText("Proveedor:");
        proveedor_label.setPreferredSize(new java.awt.Dimension(120, 20));

        id_label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        id_label.setForeground(new java.awt.Color(96, 96, 96));
        id_label.setText("ID:");
        id_label.setPreferredSize(new java.awt.Dimension(120, 20));

        vencimiento_label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        vencimiento_label.setForeground(new java.awt.Color(96, 96, 96));
        vencimiento_label.setText("Fecha vencimiento:");
        vencimiento_label.setPreferredSize(new java.awt.Dimension(120, 20));

        ingreso_label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ingreso_label.setForeground(new java.awt.Color(96, 96, 96));
        ingreso_label.setText("Fecha ingreso:");
        ingreso_label.setPreferredSize(new java.awt.Dimension(120, 20));

        nombre_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre_txt.setForeground(new java.awt.Color(44, 62, 80));
        nombre_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        nombre_txt.setPreferredSize(new java.awt.Dimension(0, 36));

        categoria_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoria_txt.setForeground(new java.awt.Color(44, 62, 80));
        categoria_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        categoria_txt.setPreferredSize(new java.awt.Dimension(0, 36));
        categoria_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoria_txtActionPerformed(evt);
            }
        });

        cantidad_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cantidad_txt.setForeground(new java.awt.Color(44, 62, 80));
        cantidad_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        cantidad_txt.setPreferredSize(new java.awt.Dimension(0, 36));
        cantidad_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_txtActionPerformed(evt);
            }
        });

        ingreso_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingreso_txt.setForeground(new java.awt.Color(44, 62, 80));
        ingreso_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        ingreso_txt.setPreferredSize(new java.awt.Dimension(0, 36));
        ingreso_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso_txtActionPerformed(evt);
            }
        });

        vencimiento_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vencimiento_txt.setForeground(new java.awt.Color(44, 62, 80));
        vencimiento_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        vencimiento_txt.setPreferredSize(new java.awt.Dimension(0, 36));
        vencimiento_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vencimiento_txtActionPerformed(evt);
            }
        });

        proveedor_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        proveedor_txt.setForeground(new java.awt.Color(44, 62, 80));
        proveedor_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        proveedor_txt.setPreferredSize(new java.awt.Dimension(0, 36));
        proveedor_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                proveedor_txtFocusGained(evt);
            }
        });
        proveedor_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedor_txtActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(0, 102, 255));
        guardar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar");
        guardar.setFocusPainted(false);
        guardar.setPreferredSize(new java.awt.Dimension(100, 36));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(127, 140, 143));
        jButton3.setText("Reestablecer");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        jButton3.setFocusPainted(false);
        jButton3.setPreferredSize(new java.awt.Dimension(120, 36));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        checkbox1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        checkbox1.setText("Tiene vencimiento");
        checkbox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombre_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoria_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(categoria_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cantidad_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cantidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ingreso_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(ingreso_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkbox1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vencimiento_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(vencimiento_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(proveedor_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(proveedor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoria_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingreso_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingreso_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(16, 16, 16)
                .addComponent(checkbox1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vencimiento_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vencimiento_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proveedor_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proveedor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String nombre = nombre_txt.getText().trim();
        String id = id_txt.getText().trim();
        String categoria = categoria_txt.getText().trim();
        String proveedor = proveedor_txt.getText().trim();
        String cantidadStr = cantidad_txt.getText().trim();
        String fechaIngreso = ingreso_txt.getText().trim();
        String fechaVencimiento = vencimiento_txt.getText().trim();
        
        if (nombre.isEmpty() || id.isEmpty() || categoria.isEmpty() || proveedor.isEmpty() || cantidadStr.isEmpty() || fechaIngreso.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this),
                "Por favor complete todos los campos", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            int cantidad = Integer.parseInt(cantidadStr);
            
            if (cantidad <= 0) {
                javax.swing.JOptionPane.showMessageDialog(
                    javax.swing.SwingUtilities.getWindowAncestor(this),
                    "La cantidad debe ser mayor a 0",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            java.time.LocalDate ingreso = java.time.LocalDate.parse(fechaIngreso);
            
            java.time.LocalDate vencimiento = null;
            // si la fecha se deja vacia quedara en null, indicando que producto no vence
            if(fechaVencimiento.isEmpty() ){
                vencimiento = null;
            } else {
                vencimiento = java.time.LocalDate.parse(fechaVencimiento);
            }
            
            String resultado = productoControl.ingresarProducto(nombre, id, categoria, proveedor, cantidad, ingreso, vencimiento);
            
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this),
                resultado, 
                "Resultado", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            if (resultado.contains("exitosamente")) {
                nombre_txt.setText("");
                id_txt.setText("");
                categoria_txt.setText("");
                proveedor_txt.setText("");
                cantidad_txt.setText("");
                ingreso_txt.setText("");
                vencimiento_txt.setText("");
                checkbox1.setSelected(false);
                vencimiento_txt.setEditable(false);
            }
            
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this),
                "La cantidad debe ser un número válido", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (java.time.format.DateTimeParseException e) {
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this),
                "Las fechas deben estar en formato yyyy-MM-dd (ejemplo: 2025-12-31) o dejar en blanco si no existe", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nombre_txt.setText("");
        id_txt.setText("");
        categoria_txt.setText("");
        proveedor_txt.setText("");
        cantidad_txt.setText("");
        ingreso_txt.setText("");
        vencimiento_txt.setText("");
        checkbox1.setSelected(false);
        vencimiento_txt.setEditable(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtActionPerformed

    private void categoria_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoria_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoria_txtActionPerformed

    private void cantidad_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad_txtActionPerformed

    private void ingreso_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso_txtActionPerformed

    private void vencimiento_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vencimiento_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vencimiento_txtActionPerformed

    private void proveedor_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedor_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedor_txtActionPerformed

    private void proveedor_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_proveedor_txtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedor_txtFocusGained

    private void checkbox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox1ItemStateChanged
        if(checkbox1.isSelected()){
            vencimiento_txt.setEditable(true);    
            vencimiento_txt.setText("");
        } 
        else{
            vencimiento_txt.setEditable(false);    
            vencimiento_txt.setText("");
        }
    }//GEN-LAST:event_checkbox1ItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cantidad_label;
    private javax.swing.JTextField cantidad_txt;
    private javax.swing.JLabel categoria_label;
    private javax.swing.JTextField categoria_txt;
    private javax.swing.JCheckBox checkbox1;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel id_label;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel ingreso_label;
    private javax.swing.JTextField ingreso_txt;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nombre_label;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JLabel proveedor_label;
    private javax.swing.JTextField proveedor_txt;
    private javax.swing.JLabel vencimiento_label;
    private javax.swing.JTextField vencimiento_txt;
    // End of variables declaration//GEN-END:variables
}

