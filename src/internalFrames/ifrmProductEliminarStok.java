/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalFrames;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinal.Producto;
import proyectofinal.frmProductos;
/**
 *
 * @author tikis
 */
public class ifrmProductEliminarStok extends javax.swing.JInternalFrame {
public Producto product;
    /**
     * Creates new form ifrmeliminarStok
     */
    public ifrmProductEliminarStok(frmProductos pro, Producto prod) {
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

        txtNT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtidm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Eliminar Producto");

        txtNT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNTKeyTyped(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        txtidm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidmKeyTyped(evt);
            }
        });

        jLabel1.setText("Coloque la Id del producto");

        jLabel2.setText("Ingrese cantidad a eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidm)
                            .addComponent(txtNT)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int idm = Integer.parseInt(txtidm.getText());
        int stokn = Integer.parseInt(txtNT.getText());
        int band=0;
        int cant=0;
        DefaultTableModel modp = new DefaultTableModel();
        String[] cabezap = {"ID","Nombre","Precio","Stock"};

        for(int i=0; i < product.cant;i++){
            if(product.pro[i].getId() == idm){
                band = 1;

                int val = JOptionPane.showConfirmDialog(this,"Confirmar Este movimiento");

                if(val == 0){
                    int stok = product.pro[i].getStock();
                    stokn = stok-stokn;
                    if(stokn < 0){
                       JOptionPane.showMessageDialog(this, "Cantidad no valida el resultado es negativo", "Advertencia", JOptionPane.WARNING_MESSAGE); 
                    }else{
                        product.pro[i].setStock(stokn);
                    }
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
            JOptionPane.showMessageDialog(this, "Producto eliminado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "ERROR: ID no encontrada", "Error", JOptionPane.WARNING_MESSAGE);
        }
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtidmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidmKeyTyped
        char c = evt.getKeyChar();

        // Acepta solo números y el signo de asterisco
        if (!Character.isDigit(c)) {
            evt.consume(); // Elimina el carácter si no es un número o asterisco
        }
    }//GEN-LAST:event_txtidmKeyTyped

    private void txtNTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNTKeyTyped
        char c = evt.getKeyChar();

        // Acepta solo números y el signo de asterisco
        if (!Character.isDigit(c)) {
            evt.consume(); // Elimina el carácter si no es un número o asterisco
        }
    }//GEN-LAST:event_txtNTKeyTyped

    public void clear(){
        txtNT.setText("");
        txtidm.setText("");
        txtidm.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtNT;
    private javax.swing.JTextField txtidm;
    // End of variables declaration//GEN-END:variables
}
