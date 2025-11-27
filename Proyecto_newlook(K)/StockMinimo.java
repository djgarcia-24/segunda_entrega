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
public class StockMinimo extends javax.swing.JPanel {
    private productoctl productoControl;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StockMinimo.class.getName());

    /**
     * Creates new form StockMinimo
     */
    public StockMinimo(modelo.basededatos bd) {
        initComponents();
        this.productoControl = new productoctl(bd);
        cargarProductos();
        limpiarCampos();
    }
    
    private void cargarProductos() {
        jComboBoxProducto.removeAllItems();
        for (modelo.Producto p : productoControl.obtenerTodosProductos()) {
            jComboBoxProducto.addItem(p.id);
        }
    }
    
    private void limpiarCampos() {
        jComboBoxProducto.setSelectedIndex(-1);
        nombre_value.setText("");
        id_value.setText("");
        cantidad_value.setText("");
        stockMinimo_txt.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        id_label = new javax.swing.JLabel();
        jComboBoxProducto = new javax.swing.JComboBox<>();
        buscar_button = new javax.swing.JButton();
        nombre_label = new javax.swing.JLabel();
        nombre_value = new javax.swing.JTextField();
        id_label1 = new javax.swing.JLabel();
        id_value = new javax.swing.JTextField();
        cantidad_label = new javax.swing.JLabel();
        cantidad_value = new javax.swing.JTextField();
        stockMinimo_label = new javax.swing.JLabel();
        stockMinimo_txt = new javax.swing.JTextField();
        establecer_button = new javax.swing.JButton();
        reestablecer_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true));

        id_label.setFont(new java.awt.Font("Segoe UI", 0, 13));
        id_label.setForeground(new java.awt.Color(96, 96, 96));
        id_label.setText("Buscar por ID:");
        id_label.setPreferredSize(new java.awt.Dimension(120, 20));

        jComboBoxProducto.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxProducto.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jComboBoxProducto.setForeground(new java.awt.Color(44, 62, 80));
        jComboBoxProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        jComboBoxProducto.setPreferredSize(new java.awt.Dimension(0, 36));
        jComboBoxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductoActionPerformed(evt);
            }
        });

        buscar_button.setBackground(new java.awt.Color(46, 125, 50));
        buscar_button.setFont(new java.awt.Font("Segoe UI", 1, 13));
        buscar_button.setForeground(new java.awt.Color(255, 255, 255));
        buscar_button.setText("Buscar");
        buscar_button.setFocusPainted(false);
        buscar_button.setPreferredSize(new java.awt.Dimension(100, 36));
        buscar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_buttonActionPerformed(evt);
            }
        });

        nombre_label.setFont(new java.awt.Font("Segoe UI", 0, 13));
        nombre_label.setForeground(new java.awt.Color(96, 96, 96));
        nombre_label.setText("Nombre:");
        nombre_label.setPreferredSize(new java.awt.Dimension(120, 20));

        nombre_value.setEditable(false);
        nombre_value.setBackground(new java.awt.Color(245, 245, 245));
        nombre_value.setFont(new java.awt.Font("Segoe UI", 0, 14));
        nombre_value.setForeground(new java.awt.Color(44, 62, 80));
        nombre_value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        nombre_value.setPreferredSize(new java.awt.Dimension(0, 36));

        id_label1.setFont(new java.awt.Font("Segoe UI", 0, 13));
        id_label1.setForeground(new java.awt.Color(96, 96, 96));
        id_label1.setText("ID:");
        id_label1.setPreferredSize(new java.awt.Dimension(120, 20));

        id_value.setEditable(false);
        id_value.setBackground(new java.awt.Color(245, 245, 245));
        id_value.setFont(new java.awt.Font("Segoe UI", 0, 14));
        id_value.setForeground(new java.awt.Color(44, 62, 80));
        id_value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        id_value.setPreferredSize(new java.awt.Dimension(0, 36));

        cantidad_label.setFont(new java.awt.Font("Segoe UI", 0, 13));
        cantidad_label.setForeground(new java.awt.Color(96, 96, 96));
        cantidad_label.setText("Cantidad:");
        cantidad_label.setPreferredSize(new java.awt.Dimension(120, 20));

        cantidad_value.setEditable(false);
        cantidad_value.setBackground(new java.awt.Color(245, 245, 245));
        cantidad_value.setFont(new java.awt.Font("Segoe UI", 0, 14));
        cantidad_value.setForeground(new java.awt.Color(44, 62, 80));
        cantidad_value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        cantidad_value.setPreferredSize(new java.awt.Dimension(0, 36));

        stockMinimo_label.setFont(new java.awt.Font("Segoe UI", 0, 13));
        stockMinimo_label.setForeground(new java.awt.Color(96, 96, 96));
        stockMinimo_label.setText("Establecer stock mínimo:");
        stockMinimo_label.setPreferredSize(new java.awt.Dimension(180, 20));

        stockMinimo_txt.setBackground(new java.awt.Color(255, 255, 255));
        stockMinimo_txt.setFont(new java.awt.Font("Segoe UI", 0, 14));
        stockMinimo_txt.setForeground(new java.awt.Color(44, 62, 80));
        stockMinimo_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        stockMinimo_txt.setPreferredSize(new java.awt.Dimension(0, 36));

        establecer_button.setBackground(new java.awt.Color(46, 125, 50));
        establecer_button.setFont(new java.awt.Font("Segoe UI", 1, 13));
        establecer_button.setForeground(new java.awt.Color(255, 255, 255));
        establecer_button.setText("Establecer stock mínimo");
        establecer_button.setFocusPainted(false);
        establecer_button.setPreferredSize(new java.awt.Dimension(200, 36));
        establecer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                establecer_buttonActionPerformed(evt);
            }
        });

        reestablecer_button.setBackground(new java.awt.Color(255, 255, 255));
        reestablecer_button.setFont(new java.awt.Font("Segoe UI", 0, 13));
        reestablecer_button.setForeground(new java.awt.Color(96, 96, 96));
        reestablecer_button.setText("Reestablecer");
        reestablecer_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        reestablecer_button.setFocusPainted(false);
        reestablecer_button.setPreferredSize(new java.awt.Dimension(120, 36));
        reestablecer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reestablecer_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(buscar_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(nombre_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(id_label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(id_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cantidad_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cantidad_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(stockMinimo_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(stockMinimo_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reestablecer_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(establecer_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockMinimo_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockMinimo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(establecer_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reestablecer_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_buttonActionPerformed
        mostrarInformacion();
    }//GEN-LAST:event_buscar_buttonActionPerformed

    private void jComboBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductoActionPerformed
        mostrarInformacion();
    }//GEN-LAST:event_jComboBoxProductoActionPerformed
    
    private void mostrarInformacion() {
        String valorBusqueda = (String) jComboBoxProducto.getSelectedItem();
        
        if (valorBusqueda == null || valorBusqueda.isEmpty()) {
            return;
        }
        
        modelo.Producto producto = productoControl.obtenerProducto(valorBusqueda, "id");
        
        if (producto == null) {
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this), 
                "Producto no encontrado", 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        nombre_value.setText(producto.nombre);
        id_value.setText(producto.id);
        cantidad_value.setText(Integer.toString(producto.cantidad_total));
        stockMinimo_txt.setText(Integer.toString(producto.minimo));
    }

    private void establecer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_establecer_buttonActionPerformed
        String id = id_value.getText().trim();
        
        if (id.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this),
                "Por favor busque un producto primero",
                "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int minimo;
        
        try {
            minimo = Integer.parseInt(stockMinimo_txt.getText().trim());
            
            if (minimo <= 0) {
                javax.swing.JOptionPane.showMessageDialog(
                    javax.swing.SwingUtilities.getWindowAncestor(this),
                    "La cantidad debe ser mayor a 0", 
                    "Validación", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            productoControl.establecer_minimo(id, minimo);
            
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this),
                "Stock mínimo establecido correctamente",
                "Éxito",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this),
                "La cantidad debe ser un número válido", 
                "Validación", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_establecer_buttonActionPerformed

    private void reestablecer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reestablecer_buttonActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_reestablecer_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buscar_button;
    private javax.swing.JTextField cantidad_value;
    private javax.swing.JLabel cantidad_label;
    private javax.swing.JButton establecer_button;
    private javax.swing.JLabel id_label;
    private javax.swing.JLabel id_label1;
    private javax.swing.JTextField id_value;
    private javax.swing.JComboBox<String> jComboBoxProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre_value;
    private javax.swing.JLabel nombre_label;
    private javax.swing.JButton reestablecer_button;
    private javax.swing.JTextField stockMinimo_txt;
    private javax.swing.JLabel stockMinimo_label;
    // End of variables declaration//GEN-END:variables
}

