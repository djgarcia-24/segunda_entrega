/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.productoctl;
import controlador.ventactl;
import java.time.LocalDate;
import modelo.Producto;

/**
 *
 * @author j
 */
public class RegistroVenta extends javax.swing.JPanel {
    private productoctl productoControl;
    private ventactl ventaControl;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistroVenta.class.getName());

    /**
     * Creates new form RegistroVenta
     */
    public RegistroVenta(modelo.basededatos bd) {
        initComponents();
        this.productoControl = new productoctl(bd);
        this.ventaControl = new ventactl(bd);
        cargarProductos();
    }
    
    private void cargarProductos() {
        combobox.removeAllItems();
        for (modelo.Producto p : productoControl.obtenerTodosProductos()) {
            combobox.addItem(p.getNombre());
        }
    }
  
    
    private void mostrar_panel(){
        String nombre = (String) combobox.getSelectedItem();
        if (nombre == null || nombre.isEmpty()) {
            return;
        }
        
        Producto producto = productoControl.buscar_producto(nombre , "nombre");
        producto_value.setText(producto.getNombre());
        categoria_value.setText(producto.getCategoria());
        cantidad_value.setText(String.valueOf(producto.getCantidad_total()));
        id_value.setText(producto.getId());
        area_entregas.setText("");

        area_entregas.append("  #  | Cantidad |   Ingreso    | Vencimiento\n");
        String String_entrega;
        for(modelo.Entrega e :producto.entregas){
            String_entrega= "";
            
            String_entrega =(+e.numero+"        "+e.cantidad_por_entrega+"           "+e.ingreso);
            if (e.vencimiento == null) {
                String_entrega = String_entrega+("\n");
            } else {
                String_entrega = String_entrega+("     "+e.vencimiento+"\n");
            }
            
            area_entregas.append(String_entrega);
        }
        
        contenedor.revalidate();
        contenedor.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        producto_combo_label = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        cantidad_label = new javax.swing.JLabel();
        jTextCI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        id_label = new javax.swing.JLabel();
        id_value = new javax.swing.JTextField();
        producto_label1 = new javax.swing.JLabel();
        producto_value = new javax.swing.JTextField();
        categoria_label = new javax.swing.JLabel();
        categoria_value = new javax.swing.JTextField();
        cantidad_label1 = new javax.swing.JLabel();
        cantidad_value = new javax.swing.JTextField();
        cantidad_label4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area_entregas = new javax.swing.JTextArea();
        cantidad_label2 = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        producto_combo_label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        producto_combo_label.setForeground(new java.awt.Color(96, 96, 96));
        producto_combo_label.setText("Producto:");

        combobox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combobox.setForeground(new java.awt.Color(44, 62, 80));
        combobox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        combobox.setPreferredSize(new java.awt.Dimension(0, 36));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        cantidad_label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cantidad_label.setForeground(new java.awt.Color(96, 96, 96));
        cantidad_label.setText("Cantidad:");
        cantidad_label.setPreferredSize(new java.awt.Dimension(120, 20));

        jTextCI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCI.setForeground(new java.awt.Color(44, 62, 80));
        jTextCI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        jTextCI.setPreferredSize(new java.awt.Dimension(0, 36));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirmar venta");
        jButton1.setFocusPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(180, 36));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true));

        id_label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        id_label.setForeground(new java.awt.Color(96, 96, 96));
        id_label.setText("ID:");
        id_label.setPreferredSize(new java.awt.Dimension(120, 20));

        id_value.setEditable(false);
        id_value.setBackground(new java.awt.Color(245, 245, 245));
        id_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id_value.setForeground(new java.awt.Color(44, 62, 80));
        id_value.setText("---");
        id_value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        id_value.setPreferredSize(new java.awt.Dimension(0, 36));

        producto_label1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        producto_label1.setForeground(new java.awt.Color(96, 96, 96));
        producto_label1.setText("Producto:");
        producto_label1.setPreferredSize(new java.awt.Dimension(120, 20));

        producto_value.setEditable(false);
        producto_value.setBackground(new java.awt.Color(245, 245, 245));
        producto_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        producto_value.setForeground(new java.awt.Color(44, 62, 80));
        producto_value.setText("---");
        producto_value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        producto_value.setPreferredSize(new java.awt.Dimension(0, 36));

        categoria_label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        categoria_label.setForeground(new java.awt.Color(96, 96, 96));
        categoria_label.setText("Categoría:");
        categoria_label.setPreferredSize(new java.awt.Dimension(120, 20));

        categoria_value.setEditable(false);
        categoria_value.setBackground(new java.awt.Color(245, 245, 245));
        categoria_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoria_value.setForeground(new java.awt.Color(44, 62, 80));
        categoria_value.setText("---");
        categoria_value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        categoria_value.setPreferredSize(new java.awt.Dimension(0, 36));

        cantidad_label1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cantidad_label1.setForeground(new java.awt.Color(96, 96, 96));
        cantidad_label1.setText("Cantidad total:");
        cantidad_label1.setPreferredSize(new java.awt.Dimension(120, 20));

        cantidad_value.setEditable(false);
        cantidad_value.setBackground(new java.awt.Color(245, 245, 245));
        cantidad_value.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cantidad_value.setForeground(new java.awt.Color(44, 62, 80));
        cantidad_value.setText("---");
        cantidad_value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        cantidad_value.setPreferredSize(new java.awt.Dimension(0, 36));

        cantidad_label4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cantidad_label4.setForeground(new java.awt.Color(96, 96, 96));
        cantidad_label4.setText("Entregas:");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        area_entregas.setEditable(false);
        area_entregas.setBackground(new java.awt.Color(255, 255, 255));
        area_entregas.setColumns(20);
        area_entregas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        area_entregas.setForeground(new java.awt.Color(44, 62, 80));
        area_entregas.setRows(5);
        area_entregas.setWrapStyleWord(true);
        jScrollPane2.setViewportView(area_entregas);

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(id_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(producto_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(producto_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(categoria_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(categoria_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(cantidad_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cantidad_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(cantidad_label4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(producto_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoria_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad_label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(cantidad_label4)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, Short.MAX_VALUE))
        );

        cantidad_label2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cantidad_label2.setForeground(new java.awt.Color(96, 96, 96));
        cantidad_label2.setText("CI del cliente:");
        cantidad_label2.setPreferredSize(new java.awt.Dimension(120, 20));

        jTextCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextCantidad.setForeground(new java.awt.Color(44, 62, 80));
        jTextCantidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        jTextCantidad.setPreferredSize(new java.awt.Dimension(0, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantidad_label, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(producto_combo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cantidad_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextCI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(producto_combo_label)
                            .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidad_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad_label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String productoNombre = (String) combobox.getSelectedItem();
        String cantidadStr = jTextCantidad.getText().trim();
        String ci = jTextCI.getText().trim();
        
        if (productoNombre == null || productoNombre.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this), 
                "Por favor seleccione un producto", 
                "Validación", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (cantidadStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this), 
                "Por favor ingrese la cantidad", 
                "Validación", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (ci.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this), 
                "Por favor ingrese la cedula del cliente", 
                "Validación", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (!(ci.matches("^\\d{1,8}$"))) {
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this), 
                "Cedula invalida", 
                "Validación", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }   
        
        try {
            int cantidad = Integer.parseInt(cantidadStr);
            
            if (cantidad <= 0) {
                javax.swing.JOptionPane.showMessageDialog(
                    javax.swing.SwingUtilities.getWindowAncestor(this), 
                    "La cantidad debe ser mayor a 0", 
                    "Validación", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            
            String resultado = productoControl.registrar_venta(productoNombre, cantidad, ci);
            ventaControl.registrarVenta(productoNombre, LocalDate.now(), cantidad, ci);
            
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this), 
                resultado, 
                "Éxito", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            mostrar_panel();
            jTextCI.setText(""); 
            
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this), 
                "La cantidad debe ser un número válido", 
                "Validación", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        mostrar_panel();
    }//GEN-LAST:event_comboboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_entregas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cantidad_label;
    private javax.swing.JLabel cantidad_label1;
    private javax.swing.JLabel cantidad_label2;
    private javax.swing.JLabel cantidad_label4;
    private javax.swing.JTextField cantidad_value;
    private javax.swing.JLabel categoria_label;
    private javax.swing.JTextField categoria_value;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel id_label;
    private javax.swing.JTextField id_value;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextCI;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JLabel producto_combo_label;
    private javax.swing.JLabel producto_label1;
    private javax.swing.JTextField producto_value;
    // End of variables declaration//GEN-END:variables
}

