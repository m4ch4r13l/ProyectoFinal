/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalFrames;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinal.Producto;
import proyectofinal.frmProductos;
/**
 *
 * @author tikis
 */
public class ifrmProductEditar extends javax.swing.JInternalFrame {
public Producto product;
frmProductos pros;
    /**
     * Creates new form ifrmEditarProductos
     */
    public ifrmProductEditar(frmProductos pro, Producto prod) {
        initComponents();
        DefaultTableModel modp = new DefaultTableModel();
       String[] cabezap = {"ID","Nombre","Precio","Stock"}; 
      product = prod;
      modp.setColumnIdentifiers(cabezap);
      if(product.cant !=0){
       Object[] datosp = new Object[product.pro.length];
       for(int i =0; i<product.cant;i++){
           datosp [0] = product.pro[i].getId();
           datosp [1] = product.pro[i].getNombre();
           datosp [2] = product.pro[i].getPrecio();
           datosp [3] = product.pro[i].getStock();
           modp.addRow(datosp);   
      } 
      
       } 
       
       table.setModel(modp);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar Productos");
        setToolTipText("");

        jLabel2.setText("ID");

        txtnom.setEnabled(false);

        jLabel3.setText("Precio");

        txtpre.setEnabled(false);
        txtpre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreKeyTyped(evt);
            }
        });

        jLabel4.setText("Cantidad de stok");

        txtstok.setEnabled(false);
        txtstok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstokKeyTyped(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setText("Confirmar cambios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del producto");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid)
                            .addComponent(txtnom)
                            .addComponent(txtpre)
                            .addComponent(txtstok)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtstok, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String idm = txtid.getText();
 String nom = txtnom.getText();
 float pre = Float.parseFloat(txtpre.getText());
 int stokn = Integer.parseInt(txtstok.getText());
      int band=0;
        int cant=0;
        DefaultTableModel modp = new DefaultTableModel();
       String[] cabezap = {"ID","Nombre","Precio","Stock"}; 
       
       
        for(int i=0; i < product.cant;i++){
        if(product.pro[i].getId().equals(idm)){
        band = 1;
        int val = JOptionPane.showConfirmDialog(this,"Confirmar Este movimiento");
           
        if(val == 0){
        product.pro[i].setId(idm);
        product.pro[i].setStock(stokn);
        product.pro[i].setNombre(nom);
        product.pro[i].setPrecio(pre);
         }else{
          JOptionPane.showMessageDialog(this, "Cambio cancelado", "Advertencia", JOptionPane.WARNING_MESSAGE);  
        }
       modp.setColumnIdentifiers(cabezap);
      if(product.cant !=0){
       Object[] datosp = new Object[product.pro.length];
       for(int x=0; x<product.cant;x++){
           datosp [0] = product.pro[x].getId();
           datosp [1] = product.pro[x].getNombre();
           datosp [2] = product.pro[x].getPrecio();
           datosp [3] = product.pro[x].getStock();
           modp.addRow(datosp);   
      } 
      
       } 
       
       table.setModel(modp);
        
        }
         
        }  
         if(band == 1){
            JOptionPane.showMessageDialog(this, "Producto modoficado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
         }else{
            JOptionPane.showMessageDialog(this, "ID no encontrada", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }     
         clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        char c = evt.getKeyChar();

        // Acepta solo números y el signo de asterisco
        if (!Character.isDigit(c)) {
            evt.consume(); // Elimina el carácter si no es un número o asterisco
        }
    }//GEN-LAST:event_txtidKeyTyped

    private void txtpreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreKeyTyped
        char c = evt.getKeyChar();

        // Acepta solo números y el signo de asterisco
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Elimina el carácter si no es un número o asterisco
        }
    }//GEN-LAST:event_txtpreKeyTyped

    private void txtstokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstokKeyTyped
        char c = evt.getKeyChar();

        // Acepta solo números y el signo de asterisco
        if (!Character.isDigit(c)) {
            evt.consume(); // Elimina el carácter si no es un número o asterisco
        }
    }//GEN-LAST:event_txtstokKeyTyped

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        String idm = txtid.getText();
        int band=0;
        for(int i=0; i < product.cant;i++){
            if(product.pro[i].getId().equals(idm)){
                txtnom.setEnabled(true);
                txtpre.setEnabled(true);
                txtstok.setEnabled(true);
                
                txtnom.setText(product.pro[i].getNombre());
                txtpre.setText(Float.toString(product.pro[i].getPrecio()));
                txtstok.setText(Integer.toString(product.pro[i].getStock()));
                
                band = 1;
            }
        }  
         if(band == 1){
         }else{
            JOptionPane.showMessageDialog(this, "ID no encontrada", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtidActionPerformed

    public void clear(){
        txtid.setText("");
        txtnom.setText("");
        txtpre.setText("");
        txtstok.setText("");
        txtnom.setEnabled(false);
        txtpre.setEnabled(false);
        txtstok.setEnabled(false);
        txtid.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpre;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables
}
