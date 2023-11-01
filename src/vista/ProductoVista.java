package vista;

import accesoadatos.ProductoData;
import entidad.Producto;
import java.awt.Event;
import java.awt.event.KeyEvent;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class ProductoVista extends javax.swing.JPanel {

    private static DefaultTableModel tableModel = new DefaultTableModel() {
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };
    
    private ProductoData produData = new ProductoData();
    private ProveedorProductoVista proveProduVista = new ProveedorProductoVista();
    
    public ProductoVista() {
        initComponents();
        cargarModeloTabla();
        refrescarTabla();
        agruparRadioButton();
        
        InputMap map1 = txtPrecioActual.getInputMap(JTextField.WHEN_FOCUSED);
        map1.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        
        InputMap map2 = txtStock.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelLateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioActual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnLimpiarCampos = new javax.swing.JButton();
        btnMostrarProductos = new javax.swing.JRadioButton();
        btnActivo = new javax.swing.JRadioButton();
        btnInactivo = new javax.swing.JRadioButton();
        btnStockMinimo = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbProveedorProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        panelSuperior = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setBackground(new java.awt.Color(237, 230, 219));

        panelLateral.setBackground(new java.awt.Color(162, 179, 139));
        panelLateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código");

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(149, 165, 131));
        txtCodigo.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtCodigo.setPreferredSize(new java.awt.Dimension(240, 25));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(149, 165, 131));
        txtNombre.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtNombre.setPreferredSize(new java.awt.Dimension(240, 25));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción");

        txtDescripcion.setBackground(new java.awt.Color(149, 165, 131));
        txtDescripcion.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtDescripcion.setPreferredSize(new java.awt.Dimension(240, 25));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio actual");

        txtPrecioActual.setBackground(new java.awt.Color(149, 165, 131));
        txtPrecioActual.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtPrecioActual.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtPrecioActual.setPreferredSize(new java.awt.Dimension(240, 25));
        txtPrecioActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioActualKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stock");

        txtStock.setBackground(new java.awt.Color(149, 165, 131));
        txtStock.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtStock.setPreferredSize(new java.awt.Dimension(240, 25));
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });

        btnLimpiarCampos.setBackground(new java.awt.Color(162, 179, 139));
        btnLimpiarCampos.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnLimpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/borrador.png"))); // NOI18N
        btnLimpiarCampos.setToolTipText("Limpiar campos");
        btnLimpiarCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(162, 179, 139)));
        btnLimpiarCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarCampos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpiarCampos.setPreferredSize(new java.awt.Dimension(46, 46));
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        btnMostrarProductos.setBackground(new java.awt.Color(162, 179, 139));
        btnMostrarProductos.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnMostrarProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarProductos.setSelected(true);
        btnMostrarProductos.setText("Mostrar todos los productos");
        btnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosActionPerformed(evt);
            }
        });

        btnActivo.setBackground(new java.awt.Color(162, 179, 139));
        btnActivo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnActivo.setForeground(new java.awt.Color(255, 255, 255));
        btnActivo.setText("Mostrar productos activos");
        btnActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivoActionPerformed(evt);
            }
        });

        btnInactivo.setBackground(new java.awt.Color(162, 179, 139));
        btnInactivo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnInactivo.setForeground(new java.awt.Color(255, 255, 255));
        btnInactivo.setText("Mostrar productos inactivos");
        btnInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivoActionPerformed(evt);
            }
        });

        btnStockMinimo.setBackground(new java.awt.Color(162, 179, 139));
        btnStockMinimo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnStockMinimo.setForeground(new java.awt.Color(255, 255, 255));
        btnStockMinimo.setText("Mostrar productos con stock mínimo");
        btnStockMinimo.setToolTipText("Mostrar productos con stock menor a diez");
        btnStockMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockMinimoActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(162, 179, 139));
        btnRegistrar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/plaza-mas.png"))); // NOI18N
        btnRegistrar.setToolTipText("Registrar un nuevo producto");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(162, 179, 139)));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(46, 46));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(162, 179, 139));
        btnModificar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/boligrafo-cuadrado.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar un producto");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(162, 179, 139)));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setPreferredSize(new java.awt.Dimension(46, 46));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBaja.setBackground(new java.awt.Color(162, 179, 139));
        btnBaja.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cuadrado-menos.png"))); // NOI18N
        btnBaja.setToolTipText("Dar de baja un producto");
        btnBaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(162, 179, 139)));
        btnBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaja.setPreferredSize(new java.awt.Dimension(46, 46));
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnAlta.setBackground(new java.awt.Color(162, 179, 139));
        btnAlta.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/angulo-cuadrado-abajo.png"))); // NOI18N
        btnAlta.setToolTipText("Dar de alta un producto");
        btnAlta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(162, 179, 139)));
        btnAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlta.setPreferredSize(new java.awt.Dimension(46, 46));
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Consultas");

        lbProveedorProducto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lbProveedorProducto.setForeground(new java.awt.Color(255, 255, 255));
        lbProveedorProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/navegadores.png"))); // NOI18N
        lbProveedorProducto.setText("Ver productos por proveedor");
        lbProveedorProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbProveedorProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbProveedorProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPrecioActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInactivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStockMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLateralLayout.createSequentialGroup()
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(lbProveedorProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(txtPrecioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInactivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStockMinimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbProveedorProducto)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        tableProducto.setBackground(new java.awt.Color(237, 230, 219));
        tableProducto.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableProducto.setSelectionBackground(new java.awt.Color(162, 179, 139));
        tableProducto.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableProducto.getTableHeader().setReorderingAllowed(false);
        tableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableProductoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableProducto);

        panelSuperior.setBackground(new java.awt.Color(237, 230, 219));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setText("Buscar producto");
        jLabel7.setPreferredSize(new java.awt.Dimension(204, 22));

        txtBuscar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtBuscar.setPreferredSize(new java.awt.Dimension(300, 26));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioActualKeyTyped
        char caracter = evt.getKeyChar();
        if((caracter < '0') || (caracter > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioActualKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        char caracter = evt.getKeyChar();
        if((caracter < '0') || (caracter > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtStockKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            if (txtNombre.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtPrecioActual.getText().isEmpty() || txtStock.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe completar todos los campos.", "Error al registrar", HEIGHT);
            } else {
                Producto producto = new Producto(
                    txtNombre.getText(),
                    txtDescripcion.getText(),
                    Double.parseDouble(txtPrecioActual.getText()),
                    Integer.parseInt(txtStock.getText()),
                    true
                );//end Producto constructor
                
                produData.nuevoProducto(producto);            
                refrescarTabla();
                limpiarCampos();
                btnMostrarProductos.setSelected(true);
                
                // Actualiza los ComboBox de las otras vistas
                CompraVista.cargarComboProducto();
                DetalleCompraVista.cargarComboProducto();
            }//end if-else
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El precio y/o stock ingresado es invalido.", "Error al registrar", HEIGHT);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        try {
            int row = tableProducto.getSelectedRow();
            int id = (int) tableProducto.getValueAt(row, 0);

            if (row != -1 && (String) tableProducto.getValueAt(row, 5) == "Activo") {
                produData.cambiarEstadoProducto(id);
            } else {
                JOptionPane.showMessageDialog(this, "El producto ya está dado de baja.");
            }
            refrescarTabla();
            limpiarCampos();
            btnMostrarProductos.setSelected(true);
            
            // Actualiza los ComboBox de las otras vistas
            CompraVista.cargarComboProducto();
            DetalleCompraVista.cargarComboProducto();
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún producto para dar de baja.");
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        try {
            int row = tableProducto.getSelectedRow();
            int id = (int) tableProducto.getValueAt(row, 0);

            if (row != -1 && (String) tableProducto.getValueAt(row, 5) == "Inactivo") {
                produData.darAltaProducto(id);
            } else {
                JOptionPane.showMessageDialog(this, "El producto ya está dado de alta.");
            }
            refrescarTabla();
            limpiarCampos();
            btnMostrarProductos.setSelected(true);
            
            // Actualiza los ComboBox de las otras vistas
            CompraVista.cargarComboProducto();
            DetalleCompraVista.cargarComboProducto();
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún producto.");
        }
    }//GEN-LAST:event_btnAltaActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        tableModel.setRowCount(0); // Limpia la tabla.
        buttonGroup1.clearSelection();

        String productoBuscar = txtBuscar.getText().toLowerCase(); // Convierte el texto en minuscula.
        
        for (Producto producto : produData.listarProducto(2)) {
            String nombreProducto = producto.getNombreProducto().toLowerCase(); // Convierte el texto de la base de datos a minuscula.
            
            if (nombreProducto.startsWith(productoBuscar)) {
                String estado = cambiarEstadoAString(producto);
                tableModel.addRow(new Object[] {
                    producto.getIdProducto(),
                    producto.getNombreProducto(),
                    producto.getDescripcion(),
                    producto.getPrecioActual(),
                    producto.getStock(),
                    estado
                });
            }
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            int seleccionar = tableProducto.getSelectedRow();
            
            int codigo = Integer.parseInt(txtCodigo.getText());
            String nombre = txtNombre.getText();
            String descripcion = txtDescripcion.getText();
            double precio = Double.parseDouble(txtPrecioActual.getText());
            int stock = Integer.parseInt(txtStock.getText());
            boolean estado = cambiarEstadoABoolean((String) tableModel.getValueAt(seleccionar, 5));

            Producto produ = new Producto(codigo, nombre, descripcion, precio, stock, estado);
            produData.modificarProducto(produ);
            
            refrescarTabla();
            limpiarCampos();
            MenuVista.notificacion();
            btnMostrarProductos.setSelected(true);
            
            // Actualiza los ComboBox de las otras vistas
            CompraVista.cargarComboProducto();
            DetalleCompraVista.cargarComboProducto();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El precio y/o stock ingresado es invalido.", "Error al modificar", HEIGHT);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void tableProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductoMousePressed
        int seleccionar = tableProducto.getSelectedRow();
        
        if(seleccionar != -1){
            //Obtenemos los valores de la fila seleccionada
            int codigo = (int)tableModel.getValueAt(seleccionar, 0);
            String nombre = tableModel.getValueAt(seleccionar, 1).toString();
            String descripcion = tableModel.getValueAt(seleccionar, 2).toString();
            double precio = (double)tableModel.getValueAt(seleccionar, 3);
            int stock = (int)tableModel.getValueAt(seleccionar, 4);
            
            //Mostramos los datos en los texfields
            txtCodigo.setText(codigo + "");
            txtNombre.setText(nombre);
            txtDescripcion.setText(descripcion);
            txtPrecioActual.setText(precio + "");
            txtStock.setText(stock + "");
        }
    }//GEN-LAST:event_tableProductoMousePressed

    private void btnInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivoActionPerformed
        tableModel.setRowCount(0); // Limpia la tabla.

        for (Producto producto : produData.listarProductoEstado(0)) {
            String estado = cambiarEstadoAString(producto);
            tableModel.addRow(new Object[]{
                producto.getIdProducto(),
                producto.getNombreProducto(),
                producto.getDescripcion(),
                producto.getPrecioActual(),
                producto.getStock(),
                estado
            });
        }
    }//GEN-LAST:event_btnInactivoActionPerformed

    private void btnActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivoActionPerformed
        tableModel.setRowCount(0); // Limpia la tabla.
        
        for (Producto producto : produData.listarProductoEstado(1)) {
            String estado = cambiarEstadoAString(producto);
            tableModel.addRow(new Object[]{
                producto.getIdProducto(),
                producto.getNombreProducto(),
                producto.getDescripcion(),
                producto.getPrecioActual(),
                producto.getStock(),
                estado
            });
        }
    }//GEN-LAST:event_btnActivoActionPerformed

    private void btnMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProductosActionPerformed
        refrescarTabla();
    }//GEN-LAST:event_btnMostrarProductosActionPerformed

    private void btnStockMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockMinimoActionPerformed
        if (btnStockMinimo.isSelected()) {
            tableModel.setRowCount(0); // Limpia la tabla.
            
            for (Producto producto : produData.listarStockMinimo(10)) {
                String estado = cambiarEstadoAString(producto);
                tableModel.addRow(new Object[]{
                    producto.getIdProducto(),
                    producto.getNombreProducto(),
                    producto.getDescripcion(),
                    producto.getPrecioActual(),
                    producto.getStock(),
                    estado
                });
            }//end for
        } else {
            refrescarTabla();
        }//end if-else
    }//GEN-LAST:event_btnStockMinimoActionPerformed

    private void lbProveedorProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProveedorProductoMouseClicked
        proveProduVista.setVisible(true);
        proveProduVista.setLocationRelativeTo(null);
    }//GEN-LAST:event_lbProveedorProductoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnActivo;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JRadioButton btnInactivo;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JButton btnModificar;
    private javax.swing.JRadioButton btnMostrarProductos;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JRadioButton btnStockMinimo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbProveedorProducto;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTable tableProducto;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioActual;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

    private void cargarModeloTabla() {
        tableModel.addColumn("CÓDIGO");
        tableModel.addColumn("NOMBRE");
        tableModel.addColumn("DESCRIPCIÓN");
        tableModel.addColumn("PRECIO ACTUAL");
        tableModel.addColumn("STOCK");
        tableModel.addColumn("ESTADO");
        tableProducto.setModel(tableModel);
    }
    
    protected static void refrescarTabla() {
        tableModel.setRowCount(0); // Limpia la tabla.
        
        // Es obligatorio instanciar de nuevo un productoData en un método estatico.
        ProductoData prodData = new ProductoData();
        
        for (Producto producto : prodData.listarProducto(2)) {
            String estado = cambiarEstadoAString(producto);
            tableModel.addRow(new Object[]{
                producto.getIdProducto(),
                producto.getNombreProducto(),
                producto.getDescripcion(),
                producto.getPrecioActual(),
                producto.getStock(),
                estado
            });
        }
    }
    
    private boolean cambiarEstadoABoolean(String estado) {
        boolean estadoBool = false;
        if (estado == "Activo") {
            estadoBool = true;
        } else if (estado == "Inactivo") {
            estadoBool = false;
        }
        return estadoBool;
    }
    
    private static String cambiarEstadoAString(Producto producto) {
        String estado;
        if (producto.isEstado()) {
            estado = "Activo";
        } else {
            estado = "Inactivo";
        }
        return estado;
    }
    
    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecioActual.setText("");
        txtStock.setText("");
    }
    
    private void agruparRadioButton() {
        buttonGroup1.add(btnMostrarProductos);
        buttonGroup1.add(btnActivo);
        buttonGroup1.add(btnInactivo);
        buttonGroup1.add(btnStockMinimo);
    }
}