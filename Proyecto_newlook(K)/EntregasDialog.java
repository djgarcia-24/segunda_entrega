/*
 * Reusable dialog for displaying product deliveries (entregas)
 */
package vista;

import modelo.Producto;
import java.awt.Dimension;
import java.awt.Window;

/**
 * Modal dialog for displaying product deliveries in a table format.
 * Can be called from any form using: EntregasDialog.show(producto, parentComponent);
 */
public class EntregasDialog extends javax.swing.JDialog {
    private Producto productoActual;
    
    /**
     * Shows a modal dialog with the deliveries for the given product.
     * 
     * @param producto The product whose deliveries to display
     * @param parent The parent window (can be null, but recommended for proper centering)
     */
    public static void show(Producto producto, java.awt.Component parent) {
        if (producto == null) {
            return;
        }
        
        Window parentWindow = null;
        if (parent != null) {
            parentWindow = javax.swing.SwingUtilities.getWindowAncestor(parent);
            if (parentWindow == null && parent instanceof Window) {
                parentWindow = (Window) parent;
            }
        }
        
        EntregasDialog dialog = new EntregasDialog(parentWindow, producto);
        dialog.setVisible(true);
    }
    
    private EntregasDialog(Window parent, Producto producto) {
        super(parent, ModalityType.APPLICATION_MODAL);
        this.productoActual = producto;
        
        initComponents();
        cargarEntregas();
        
        setTitle("Entregas - " + producto.nombre + " (ID: " + producto.id + ")");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        pack();
        
        if (parent != null) {
            setLocationRelativeTo(parent);
        } else {
            setLocationRelativeTo(null);
        }
    }
    
    private void cargarEntregas() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        if (productoActual != null && productoActual.entregas != null && !productoActual.entregas.isEmpty()) {
            for (modelo.Entrega e : productoActual.entregas) {
                String vencimientoStr = (e.vencimiento == null) ? "N/A" : e.vencimiento.toString();
                model.addRow(new Object[]{
                    e.numero,
                    e.cantidad_por_entrega,
                    e.ingreso.toString(),
                    vencimientoStr
                });
            }
            
            int rowCount = model.getRowCount();
            int preferredHeight = Math.min(400, Math.max(150, rowCount * 28 + 80));
            jTable1.setPreferredScrollableViewportSize(new Dimension(500, preferredHeight));
            pack();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        getContentPane().setBackground(new java.awt.Color(245, 245, 245));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Cantidad", "Ingreso", "Vencimiento"
            }
        ) {
            Class<?>[] types = new Class<?> [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class<?> getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jTable1.setForeground(new java.awt.Color(44, 62, 80));
        jTable1.setRowHeight(28);
        jTable1.setSelectionBackground(new java.awt.Color(230, 240, 255));
        jTable1.setSelectionForeground(new java.awt.Color(44, 62, 80));
        jTable1.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 13));
        jTable1.getTableHeader().setForeground(new java.awt.Color(44, 62, 80));
        jTable1.getTableHeader().setBackground(new java.awt.Color(245, 245, 245));
        jTable1.setShowGrid(true);
        jTable1.setGridColor(new java.awt.Color(230, 230, 230));
        jTable1.setFillsViewportHeight(true);
        jTable1.setPreferredScrollableViewportSize(new java.awt.Dimension(500, 200));
        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        setMinimumSize(new java.awt.Dimension(550, 200));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

