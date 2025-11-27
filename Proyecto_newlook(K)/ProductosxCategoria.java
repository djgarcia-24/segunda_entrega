/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.productoctl;
import java.util.ArrayList;
import modelo.Producto;

/**
 *
 * @author j
 */
public class ProductosxCategoria extends javax.swing.JPanel {
    private productoctl productoControl;
    private ArrayList<Producto> productosActuales; // Store current products list for lookup
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProductosxCategoria.class.getName());

    /**
     * Creates new form ProductosxCategoria
     */
    public ProductosxCategoria(modelo.basededatos bd) {
        initComponents();
        this.productoControl = new productoctl(bd);
        cargacategorias();
    }

    private void cargacategorias() {
        jComboBoxProducto.removeAllItems();
        ArrayList<String> categorias = new ArrayList<>();
        for (modelo.Producto p : productoControl.obtenerTodosProductos()) {
            if (!categorias.contains(p.categoria)) {
                categorias.add(p.categoria);
            }
        }
        
        for (String s : categorias) {
            jComboBoxProducto.addItem(s);
        }
    }
    
    private void mostrar_informacion() {
        String categoria = (String) jComboBoxProducto.getSelectedItem();
        if (categoria == null || categoria.isEmpty()) {
            return;
        }
        
        productosActuales = productoControl.filtrar_productos(categoria);
        
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (Producto p : productosActuales) {
            Object[] row = {
                p.id,
                p.nombre,
                p.categoria,
                p.cantidad_total,
                p.minimo
            };
            model.addRow(row);
        }
    }
    
    private void mostrarEntregas(int rowIndex) {
        if (productosActuales == null || rowIndex < 0 || rowIndex >= productosActuales.size()) {
            return;
        }
        
        Producto producto = productosActuales.get(rowIndex);
        EntregasDialog.show(producto, this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        categoria_label = new javax.swing.JLabel();
        jComboBoxProducto = new javax.swing.JComboBox<>();
        hint_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(245, 245, 245));

        categoria_label.setFont(new java.awt.Font("Segoe UI", 0, 13));
        categoria_label.setForeground(new java.awt.Color(96, 96, 96));
        categoria_label.setText("Categoría:");

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

        hint_label.setFont(new java.awt.Font("Segoe UI", 2, 12)); // Italic font
        hint_label.setForeground(new java.awt.Color(127, 140, 141));
        hint_label.setText("Haga doble click en la fila para ver el detalle de las entregas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoría", "Cantidad Total", "Stock Mínimo"
            }
        ) {
            Class<?>[] types = new Class<?> [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class<?> getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jTable1.setForeground(new java.awt.Color(44, 62, 80));
        jTable1.setRowHeight(32);
        jTable1.setSelectionBackground(new java.awt.Color(230, 240, 255));
        jTable1.setSelectionForeground(new java.awt.Color(44, 62, 80));
        jTable1.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 13));
        jTable1.getTableHeader().setForeground(new java.awt.Color(44, 62, 80));
        jTable1.getTableHeader().setBackground(new java.awt.Color(245, 245, 245));
        jTable1.setShowGrid(true);
        jTable1.setGridColor(new java.awt.Color(230, 230, 230));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int row = jTable1.rowAtPoint(evt.getPoint());
                    if (row >= 0) {
                        mostrarEntregas(row);
                    }
                }
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoria_label)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hint_label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoria_label)
                    .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(hint_label)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductoActionPerformed
        mostrar_informacion();
    }//GEN-LAST:event_jComboBoxProductoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel categoria_label;
    private javax.swing.JLabel hint_label;
    private javax.swing.JComboBox<String> jComboBoxProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

