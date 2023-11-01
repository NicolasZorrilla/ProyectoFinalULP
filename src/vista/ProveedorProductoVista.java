package vista;

import accesoadatos.DetalleCompraData;
import entidad.DetalleCompra;
import javax.swing.table.DefaultTableModel;

public class ProveedorProductoVista extends javax.swing.JFrame {

    private static DefaultTableModel tableModel = new DefaultTableModel() {
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };
    
    DetalleCompraData detalleData = new DetalleCompraData();
    
    public ProveedorProductoVista() {
        initComponents();
        cargarModeloTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar productos por proveedor");

        jPanel1.setBackground(new java.awt.Color(237, 230, 219));

        tableProducto.setBackground(new java.awt.Color(237, 230, 219));
        tableProducto.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
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
        jScrollPane1.setViewportView(tableProducto);

        txtBuscar.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtBuscar.setPreferredSize(new java.awt.Dimension(300, 26));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Buscar productos por proveedor");
        jLabel7.setPreferredSize(new java.awt.Dimension(204, 22));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        tableModel.setRowCount(0); // Limpia la tabla.

        String proveedorBuscar = txtBuscar.getText().toLowerCase(); // Convierte el texto en minuscula.

        for (DetalleCompra detalle : detalleData.listarDetallesSet()) {
            String nombreProveedor = detalle.getCompra().getProveedor().getRazonSocial().toLowerCase(); // Convierte el texto de la base de datos a minuscula.
            if (nombreProveedor.startsWith(proveedorBuscar)) {
                tableModel.addRow(new Object[] {
                    detalle.getProducto().getIdProducto(),
                    detalle.getProducto().getNombreProducto(),
                    detalle.getProducto().getDescripcion(),
                    detalle.getCompra().getProveedor().getRazonSocial(),
                    detalle.getCompra().getProveedor().getTelefono()
                });
            }
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProducto;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void cargarModeloTabla() {
        tableModel.addColumn("CÓDIGO");
        tableModel.addColumn("NOMBRE");
        tableModel.addColumn("DESCRIPCIÓN");
        tableModel.addColumn("PROVEEDOR");
        tableModel.addColumn("TELÉFONO");
        tableProducto.setModel(tableModel);
    }
}
