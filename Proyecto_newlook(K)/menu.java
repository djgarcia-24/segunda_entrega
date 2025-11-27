/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.Usuario;

/**
 *
 * @author j
 */
public class menu extends javax.swing.JFrame {
    private modelo.basededatos bd;
    private Usuario usuarioActual;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(menu.class.getName());

    
    public menu(modelo.basededatos bd, Usuario usuario) {
        initComponents();
        this.bd = bd;
        this.usuarioActual = usuario;
        setLocationRelativeTo(null);
        
        userNameLabel.setText(usuario.getNombre());
        userTypeLabel.setText(usuario.getTipo());

        setTitle("Menu Principal - " + usuario.getNombre() + " (" + usuario.getTipo() + ")");
        
        if (usuario.getTipo().toLowerCase().equals("vendedor")) {
            producto_nuevo.setVisible(false);
            Editar_producto.setVisible(false);
            registrar_entrega.setVisible(false);
            stock.setVisible(false);
            cambio_proveedores.setVisible(false);
            buscar_categoria.setVisible(true);

        } else if (usuario.getTipo().toLowerCase().equals("encargado almacen")) {

            stock.setVisible(false);
            cambio_proveedores.setVisible(false);
            buscar_categoria.setVisible(false);
            reg_venta.setVisible(false);

            
            
            
        } else if (usuario.getTipo().toLowerCase().equals("administrador")) {
            buscar_categoria.setVisible(false);
            reg_venta.setVisible(false);
            producto_nuevo.setVisible(false);
            Editar_producto.setVisible(false);
            registrar_entrega.setVisible(false);
            cambio_proveedores.setVisible(false);
            
        } else if (usuario.getTipo().toLowerCase().equals("encargado compras")) {
            buscar_categoria.setVisible(false);
            reg_venta.setVisible(false);
            producto_nuevo.setVisible(false);
            Editar_producto.setVisible(false);
            registrar_entrega.setVisible(false);
            stock.setVisible(false);
            
        
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebarPanel = new javax.swing.JPanel();
        userInfoPanel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        userTypeLabel = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        buscar_categoria = new javax.swing.JButton();
        listado = new javax.swing.JButton();
        reg_venta = new javax.swing.JButton();
        producto_nuevo = new javax.swing.JButton();
        Editar_producto = new javax.swing.JButton();
        registrar_entrega = new javax.swing.JButton();
        stock = new javax.swing.JButton();
        cambio_proveedores = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        contentTabbedPane = new javax.swing.JTabbedPane();
        contentPlaceholder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);

        sidebarPanel.setBackground(new java.awt.Color(44, 63, 83));
        sidebarPanel.setPreferredSize(new java.awt.Dimension(250, 600));

        userInfoPanel.setBackground(new java.awt.Color(52, 73, 94));
        userInfoPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("Usuario");

        userTypeLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        userTypeLabel.setForeground(new java.awt.Color(200, 200, 200));
        userTypeLabel.setText("Tipo de usuario");

        javax.swing.GroupLayout userInfoPanelLayout = new javax.swing.GroupLayout(userInfoPanel);
        userInfoPanel.setLayout(userInfoPanelLayout);
        userInfoPanelLayout.setHorizontalGroup(
            userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        userInfoPanelLayout.setVerticalGroup(
            userInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInfoPanelLayout.createSequentialGroup()
                .addComponent(userNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTypeLabel)
                .addContainerGap())
        );

        buscar.setBackground(new java.awt.Color(44, 63, 83));
        buscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar producto");
        buscar.setAlignmentX(0.5F);
        buscar.setBorderPainted(false);
        buscar.setFocusPainted(false);
        buscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buscar.setIconTextGap(15);
        buscar.setMaximumSize(new java.awt.Dimension(250, 40));
        buscar.setMinimumSize(new java.awt.Dimension(250, 40));
        buscar.setPreferredSize(new java.awt.Dimension(250, 40));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        buscar_categoria.setBackground(new java.awt.Color(44, 63, 83));
        buscar_categoria.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        buscar_categoria.setForeground(new java.awt.Color(255, 255, 255));
        buscar_categoria.setText("Buscar por categoria");
        buscar_categoria.setAlignmentX(0.5F);
        buscar_categoria.setBorderPainted(false);
        buscar_categoria.setFocusPainted(false);
        buscar_categoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buscar_categoria.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buscar_categoria.setIconTextGap(15);
        buscar_categoria.setMaximumSize(new java.awt.Dimension(250, 40));
        buscar_categoria.setMinimumSize(new java.awt.Dimension(250, 40));
        buscar_categoria.setPreferredSize(new java.awt.Dimension(250, 40));
        buscar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_categoriaActionPerformed(evt);
            }
        });

        listado.setBackground(new java.awt.Color(44, 63, 83));
        listado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        listado.setForeground(new java.awt.Color(255, 255, 255));
        listado.setText("Lista de productos");
        listado.setAlignmentX(0.5F);
        listado.setBorderPainted(false);
        listado.setFocusPainted(false);
        listado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        listado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        listado.setIconTextGap(15);
        listado.setMaximumSize(new java.awt.Dimension(250, 40));
        listado.setMinimumSize(new java.awt.Dimension(250, 40));
        listado.setPreferredSize(new java.awt.Dimension(250, 40));
        listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoActionPerformed(evt);
            }
        });

        reg_venta.setBackground(new java.awt.Color(44, 63, 83));
        reg_venta.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        reg_venta.setForeground(new java.awt.Color(255, 255, 255));
        reg_venta.setText("Registrar venta");
        reg_venta.setAlignmentX(0.5F);
        reg_venta.setBorderPainted(false);
        reg_venta.setFocusPainted(false);
        reg_venta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reg_venta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        reg_venta.setIconTextGap(15);
        reg_venta.setMaximumSize(new java.awt.Dimension(250, 40));
        reg_venta.setMinimumSize(new java.awt.Dimension(250, 40));
        reg_venta.setPreferredSize(new java.awt.Dimension(250, 40));
        reg_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_ventaActionPerformed(evt);
            }
        });

        producto_nuevo.setBackground(new java.awt.Color(44, 63, 83));
        producto_nuevo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        producto_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        producto_nuevo.setText("Producto nuevo");
        producto_nuevo.setAlignmentX(0.5F);
        producto_nuevo.setBorderPainted(false);
        producto_nuevo.setFocusPainted(false);
        producto_nuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        producto_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        producto_nuevo.setIconTextGap(15);
        producto_nuevo.setMaximumSize(new java.awt.Dimension(250, 40));
        producto_nuevo.setMinimumSize(new java.awt.Dimension(250, 40));
        producto_nuevo.setPreferredSize(new java.awt.Dimension(250, 40));
        producto_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_nuevoActionPerformed(evt);
            }
        });

        Editar_producto.setBackground(new java.awt.Color(44, 63, 83));
        Editar_producto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Editar_producto.setForeground(new java.awt.Color(255, 255, 255));
        Editar_producto.setText("Editar producto");
        Editar_producto.setAlignmentX(0.5F);
        Editar_producto.setBorderPainted(false);
        Editar_producto.setFocusPainted(false);
        Editar_producto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Editar_producto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Editar_producto.setIconTextGap(15);
        Editar_producto.setMaximumSize(new java.awt.Dimension(250, 40));
        Editar_producto.setMinimumSize(new java.awt.Dimension(250, 40));
        Editar_producto.setPreferredSize(new java.awt.Dimension(250, 40));
        Editar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar_productoActionPerformed(evt);
            }
        });

        registrar_entrega.setBackground(new java.awt.Color(44, 63, 83));
        registrar_entrega.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        registrar_entrega.setForeground(new java.awt.Color(255, 255, 255));
        registrar_entrega.setText("Registrar entrega");
        registrar_entrega.setAlignmentX(0.5F);
        registrar_entrega.setBorderPainted(false);
        registrar_entrega.setFocusPainted(false);
        registrar_entrega.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrar_entrega.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        registrar_entrega.setIconTextGap(15);
        registrar_entrega.setMaximumSize(new java.awt.Dimension(250, 40));
        registrar_entrega.setMinimumSize(new java.awt.Dimension(250, 40));
        registrar_entrega.setPreferredSize(new java.awt.Dimension(250, 40));
        registrar_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_entregaActionPerformed(evt);
            }
        });

        stock.setBackground(new java.awt.Color(44, 63, 83));
        stock.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        stock.setForeground(new java.awt.Color(255, 255, 255));
        stock.setText("Establecer stock");
        stock.setAlignmentX(0.5F);
        stock.setBorderPainted(false);
        stock.setFocusPainted(false);
        stock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stock.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        stock.setIconTextGap(15);
        stock.setMaximumSize(new java.awt.Dimension(250, 40));
        stock.setMinimumSize(new java.awt.Dimension(250, 40));
        stock.setPreferredSize(new java.awt.Dimension(250, 40));
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });

        cambio_proveedores.setBackground(new java.awt.Color(44, 63, 83));
        cambio_proveedores.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cambio_proveedores.setForeground(new java.awt.Color(255, 255, 255));
        cambio_proveedores.setText("Editar proveedores");
        cambio_proveedores.setAlignmentX(0.5F);
        cambio_proveedores.setBorderPainted(false);
        cambio_proveedores.setFocusPainted(false);
        cambio_proveedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cambio_proveedores.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cambio_proveedores.setIconTextGap(15);
        cambio_proveedores.setMaximumSize(new java.awt.Dimension(250, 40));
        cambio_proveedores.setMinimumSize(new java.awt.Dimension(250, 40));
        cambio_proveedores.setPreferredSize(new java.awt.Dimension(250, 40));
        cambio_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambio_proveedoresActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(192, 34, 42));
        Salir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.setAlignmentX(0.5F);
        Salir.setBorderPainted(false);
        Salir.setFocusPainted(false);
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Salir.setIconTextGap(15);
        Salir.setMaximumSize(new java.awt.Dimension(250, 40));
        Salir.setMinimumSize(new java.awt.Dimension(250, 40));
        Salir.setPreferredSize(new java.awt.Dimension(250, 40));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buscar_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reg_venta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(producto_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Editar_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(registrar_entrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cambio_proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addComponent(userInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buscar_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(listado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(reg_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(producto_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Editar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(registrar_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cambio_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentTabbedPane.setBackground(new java.awt.Color(245, 245, 245));
        contentTabbedPane.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        contentPlaceholder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contentPlaceholder.setForeground(new java.awt.Color(127, 140, 141));
        contentPlaceholder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentPlaceholder.setText("Seleccione una opción del menú");
        contentTabbedPane.addTab("Inicio", contentPlaceholder);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        mostrarPanelEnContenido(new ProductosxIdoNombre(bd), "Buscar Producto");
    }//GEN-LAST:event_buscarActionPerformed

    private void buscar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_categoriaActionPerformed
        mostrarPanelEnContenido(new ProductosxCategoria(bd), "Buscar por Categoría");
    }//GEN-LAST:event_buscar_categoriaActionPerformed

    private void reg_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_ventaActionPerformed
        mostrarPanelEnContenido(new RegistroVenta(bd), "Registrar Venta");
    }//GEN-LAST:event_reg_ventaActionPerformed

    private void listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoActionPerformed
        mostrarPanelEnContenido(new ListadoProductos(bd), "Listado de Productos");
    }//GEN-LAST:event_listadoActionPerformed

    private void producto_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_nuevoActionPerformed
        mostrarPanelEnContenido(new IngresoProducto(bd), "Ingresar Producto");
    }//GEN-LAST:event_producto_nuevoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
        
        java.awt.EventQueue.invokeLater(() -> {
            inicio loginWindow = new inicio(bd);
            loginWindow.setVisible(true);
            loginWindow.setLocationRelativeTo(null);
        });
    }//GEN-LAST:event_SalirActionPerformed

    private void Editar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar_productoActionPerformed
        mostrarPanelEnContenido(new EdicionProducto(bd), "Editar Producto");
    }//GEN-LAST:event_Editar_productoActionPerformed
    
    private void mostrarPanelEnContenido(javax.swing.JPanel panel, String tabTitle) {
        for (int i = 0; i < contentTabbedPane.getTabCount(); i++) {
            if (tabTitle.equals(contentTabbedPane.getTitleAt(i))) {
                contentTabbedPane.setSelectedIndex(i);
                return;
            }
        }
        
        int inicioIndex = -1;
        for (int i = 0; i < contentTabbedPane.getTabCount(); i++) {
            if ("Inicio".equals(contentTabbedPane.getTitleAt(i))) {
                inicioIndex = i;
                break;
            }
        }
        if (inicioIndex >= 0) {
            contentTabbedPane.removeTabAt(inicioIndex);
        }
        
        javax.swing.JPanel tabPanel = new javax.swing.JPanel(new java.awt.BorderLayout());
        tabPanel.add(panel, java.awt.BorderLayout.CENTER);
        
        contentTabbedPane.addTab(tabTitle, tabPanel);
        int tabIndex = contentTabbedPane.getTabCount() - 1;
        
        javax.swing.JPanel tabComponent = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));
        tabComponent.setOpaque(false);
        
        javax.swing.JLabel label = new javax.swing.JLabel(tabTitle);
        label.setFont(new java.awt.Font("Segoe UI", 0, 12));
        tabComponent.add(label);
        
        javax.swing.JLabel closeLabel = new javax.swing.JLabel("X");
        closeLabel.setFont(new java.awt.Font("Arial", 1, 14));
        closeLabel.setForeground(new java.awt.Color(127, 140, 141));
        closeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int index = contentTabbedPane.indexOfTabComponent(tabComponent);
                if (index >= 0) {
                    contentTabbedPane.removeTabAt(index);
                    if (contentTabbedPane.getTabCount() == 0) {
                        contentTabbedPane.addTab("Inicio", contentPlaceholder);
                    }
                }
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeLabel.setForeground(new java.awt.Color(192, 34, 42));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeLabel.setForeground(new java.awt.Color(127, 140, 141));
            }
        });
        tabComponent.add(closeLabel);
        
        contentTabbedPane.setTabComponentAt(tabIndex, tabComponent);
        contentTabbedPane.setSelectedIndex(tabIndex);
    }

    private void registrar_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_entregaActionPerformed
        mostrarPanelEnContenido(new RegistroEntregaProducto(bd), "Registrar Entrega Producto");
    }//GEN-LAST:event_registrar_entregaActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        mostrarPanelEnContenido(new StockMinimo(bd), "Stock Mínimo");
    }//GEN-LAST:event_stockActionPerformed

    private void cambio_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambio_proveedoresActionPerformed
        verProveedores form = new verProveedores(bd);
        form.setVisible(true);    }//GEN-LAST:event_cambio_proveedoresActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            modelo.basededatos bd = new modelo.basededatos();
            modelo.Usuario testUser = new modelo.Usuario();
            testUser.leer_datos("prueba", "prueba", "prueba");
            
            
            
            new menu(bd, testUser).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar_producto;
    private javax.swing.JButton Salir;
    private javax.swing.JButton buscar;
    private javax.swing.JButton buscar_categoria;
    private javax.swing.JButton cambio_proveedores;
    private javax.swing.JLabel contentPlaceholder;
    private javax.swing.JTabbedPane contentTabbedPane;
    private javax.swing.JButton listado;
    private javax.swing.JButton producto_nuevo;
    private javax.swing.JButton reg_venta;
    private javax.swing.JButton registrar_entrega;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JButton stock;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userTypeLabel;
    private javax.swing.JPanel userInfoPanel;
    // End of variables declaration//GEN-END:variables
}
