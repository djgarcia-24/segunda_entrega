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
public class ListadoProductos extends javax.swing.JPanel {
    private productoctl productoControl;
    private ArrayList<Producto> productosActuales; // Store current products list for lookup
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ListadoProductos.class.getName());

    /**
     * Creates new form ListadoProductos
     */
    public ListadoProductos(modelo.basededatos bd) {
        initComponents();
        this.productoControl = new productoctl(bd);
        cargar();
    }
    
    private void cargar() {
        productosActuales = productoControl.obtenerTodosProductos();
        
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (Producto p : productosActuales) {
            Object[] row = {
                p.getId(),
                p.getNombre(),
                p.getCategoria(),
                p.getCantidad_total(),
                p.getMinimo()
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
        hint_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(245, 245, 245));

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
                    .addComponent(hint_label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(hint_label)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel hint_label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

