/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.productoctl;
import javax.swing.JOptionPane;
import modelo.Producto;


public class ProductosxIdoNombre extends javax.swing.JPanel {
    private  productoctl productoControl;
    private boolean cargandoCombo = false;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProductosxIdoNombre.class.getName());

    /**
     * Creates new form ProductosxIdoNombre
     */
    public ProductosxIdoNombre(modelo.basededatos bd) {
        initComponents();
        this.productoControl = new productoctl(bd);
    }

   
    private void cargarids() {
        cargandoCombo = true;

        jComboBoxProducto.removeAllItems();
        for (modelo.Producto p : productoControl.obtenerTodosProductos()) {
            jComboBoxProducto.addItem(p.getId());
        
        }
                cargandoCombo = false;

    }
    
    private void cargarnombres() {
            cargandoCombo = true;

        jComboBoxProducto.removeAllItems();
        for (modelo.Producto p : productoControl.obtenerTodosProductos()) {
            jComboBoxProducto.addItem(p.getNombre());
        }
                        cargandoCombo = false;

    }
    
    
    
    
    private void escribir_panel_de_busqueda(Producto producto){
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
    
    
    private  void mostrar_informacion(){
        
         
        String dato =(String) jComboBoxProducto.getSelectedItem();
        
        
        Producto producto;
        if(nombres.isSelected()){
           producto = productoControl.buscar_producto(dato,"nombre" );
           escribir_panel_de_busqueda(producto);
        }
        if(ID.isSelected()){
           producto = productoControl.buscar_producto(dato,"id" );
           escribir_panel_de_busqueda(producto);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxProducto = new javax.swing.JComboBox<>();
        ID = new javax.swing.JRadioButton();
        nombres = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        contenedor = new javax.swing.JPanel();
        producto_panel = new javax.swing.JPanel();
        id_label = new javax.swing.JLabel();
        id_value = new javax.swing.JTextField();
        producto_label = new javax.swing.JLabel();
        producto_value = new javax.swing.JTextField();
        categoria_label = new javax.swing.JLabel();
        categoria_value = new javax.swing.JTextField();
        cantidad_label = new javax.swing.JLabel();
        cantidad_value = new javax.swing.JTextField();
        cantidad_label4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area_entregas = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jLabel1.setForeground(new java.awt.Color(96, 96, 96));
        jLabel1.setText("Buscar por");

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

        buttonGroup1.add(ID);
        ID.setFont(new java.awt.Font("Segoe UI", 0, 13));
        ID.setForeground(new java.awt.Color(44, 62, 80));
        ID.setText("ID");
        ID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                IDItemStateChanged(evt);
            }
        });

        buttonGroup1.add(nombres);
        nombres.setFont(new java.awt.Font("Segoe UI", 0, 13));
        nombres.setForeground(new java.awt.Color(44, 62, 80));
        nombres.setText("Nombre");
        nombres.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nombresItemStateChanged(evt);
            }
        });

        contenedor.setLayout(new java.awt.GridLayout());

        producto_panel.setBackground(new java.awt.Color(255, 255, 255));
        producto_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true));

        id_label.setFont(new java.awt.Font("Segoe UI", 0, 13));
        id_label.setForeground(new java.awt.Color(96, 96, 96));
        id_label.setText("ID:");
        id_label.setPreferredSize(new java.awt.Dimension(120, 20));

        id_value.setEditable(false);
        id_value.setBackground(new java.awt.Color(245, 245, 245));
        id_value.setFont(new java.awt.Font("Segoe UI", 0, 14));
        id_value.setForeground(new java.awt.Color(44, 62, 80));
        id_value.setText("---");
        id_value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        id_value.setPreferredSize(new java.awt.Dimension(0, 36));

        producto_label.setFont(new java.awt.Font("Segoe UI", 0, 13));
        producto_label.setForeground(new java.awt.Color(96, 96, 96));
        producto_label.setText("Producto:");
        producto_label.setPreferredSize(new java.awt.Dimension(120, 20));

        producto_value.setEditable(false);
        producto_value.setBackground(new java.awt.Color(245, 245, 245));
        producto_value.setFont(new java.awt.Font("Segoe UI", 0, 14));
        producto_value.setForeground(new java.awt.Color(44, 62, 80));
        producto_value.setText("---");
        producto_value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        producto_value.setPreferredSize(new java.awt.Dimension(0, 36));

        categoria_label.setFont(new java.awt.Font("Segoe UI", 0, 13));
        categoria_label.setForeground(new java.awt.Color(96, 96, 96));
        categoria_label.setText("Categoría:");
        categoria_label.setPreferredSize(new java.awt.Dimension(120, 20));

        categoria_value.setEditable(false);
        categoria_value.setBackground(new java.awt.Color(245, 245, 245));
        categoria_value.setFont(new java.awt.Font("Segoe UI", 0, 14));
        categoria_value.setForeground(new java.awt.Color(44, 62, 80));
        categoria_value.setText("---");
        categoria_value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        categoria_value.setPreferredSize(new java.awt.Dimension(0, 36));

        cantidad_label.setFont(new java.awt.Font("Segoe UI", 0, 13));
        cantidad_label.setForeground(new java.awt.Color(96, 96, 96));
        cantidad_label.setText("Cantidad total:");
        cantidad_label.setPreferredSize(new java.awt.Dimension(120, 20));

        cantidad_value.setEditable(false);
        cantidad_value.setBackground(new java.awt.Color(245, 245, 245));
        cantidad_value.setFont(new java.awt.Font("Segoe UI", 0, 14));
        cantidad_value.setForeground(new java.awt.Color(44, 62, 80));
        cantidad_value.setText("---");
        cantidad_value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 200, 200), 1, true));
        cantidad_value.setPreferredSize(new java.awt.Dimension(0, 36));

        cantidad_label4.setFont(new java.awt.Font("Segoe UI", 0, 13));
        cantidad_label4.setForeground(new java.awt.Color(96, 96, 96));
        cantidad_label4.setText("Entregas:");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        area_entregas.setEditable(false);
        area_entregas.setBackground(new java.awt.Color(255, 255, 255));
        area_entregas.setColumns(20);
        area_entregas.setFont(new java.awt.Font("Segoe UI", 0, 11));
        area_entregas.setForeground(new java.awt.Color(44, 62, 80));
        area_entregas.setRows(5);
        jScrollPane2.setViewportView(area_entregas);

        javax.swing.GroupLayout producto_panelLayout = new javax.swing.GroupLayout(producto_panel);
        producto_panel.setLayout(producto_panelLayout);
        producto_panelLayout.setHorizontalGroup(
            producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(producto_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(producto_panelLayout.createSequentialGroup()
                        .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(id_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(producto_panelLayout.createSequentialGroup()
                        .addComponent(producto_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(producto_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(producto_panelLayout.createSequentialGroup()
                        .addComponent(categoria_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(categoria_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(producto_panelLayout.createSequentialGroup()
                        .addComponent(cantidad_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cantidad_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cantidad_label4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        producto_panelLayout.setVerticalGroup(
            producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(producto_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(producto_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoria_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(cantidad_label4)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        contenedor.add(producto_panel);

        jScrollPane3.setViewportView(contenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(nombres)
                        .addGap(12, 12, 12)
                        .addComponent(ID)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombres)
                    .addComponent(ID)
                    .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductoActionPerformed
        
            if (cargandoCombo) return;  // Ignorar evento provocado por cargar el combo

        
        if(!nombres.isSelected() && !ID.isSelected()){
            JOptionPane.showMessageDialog(
                javax.swing.SwingUtilities.getWindowAncestor(this),  
                "Para buscar un producto debe introducir un seleccionar un parametro", 
                "Info", 
                JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            mostrar_informacion();
        }
        
        
        
        
    }//GEN-LAST:event_jComboBoxProductoActionPerformed

    private void nombresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nombresItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            cargarnombres();
            if (jComboBoxProducto.getItemCount() > 0) {
                jComboBoxProducto.setSelectedIndex(0);
                mostrar_informacion();
            }
        }
    }//GEN-LAST:event_nombresItemStateChanged

    private void IDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_IDItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            cargarids();
            if (jComboBoxProducto.getItemCount() > 0) {
                jComboBoxProducto.setSelectedIndex(0);
                mostrar_informacion();
            }
        }
    }//GEN-LAST:event_IDItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ID;
    private javax.swing.JTextArea area_entregas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cantidad_label;
    private javax.swing.JLabel cantidad_label4;
    private javax.swing.JTextField cantidad_value;
    private javax.swing.JLabel categoria_label;
    private javax.swing.JTextField categoria_value;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel id_label;
    private javax.swing.JTextField id_value;
    private javax.swing.JComboBox<String> jComboBoxProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton nombres;
    private javax.swing.JLabel producto_label;
    private javax.swing.JPanel producto_panel;
    private javax.swing.JTextField producto_value;
    // End of variables declaration//GEN-END:variables
}

