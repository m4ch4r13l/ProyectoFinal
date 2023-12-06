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
public class ifrmProductAñadir extends javax.swing.JInternalFrame {
public Producto product;
    /**
     * Creates new form Añadir
     */
    public ifrmProductAñadir(frmProductos pro, Producto prod) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnmost = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Añadir nuevo producto");
        setToolTipText("");

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

        jLabel1.setText("Nombre del producto");

        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("Precio");

        txtpre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreKeyTyped(evt);
            }
        });

        jLabel4.setText("Cantidad de stok");

        txtstok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstokKeyTyped(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnmost.setText("Mostrar");
        btnmost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid)
                    .addComponent(txtnom)
                    .addComponent(txtpre)
                    .addComponent(txtstok)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmost, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!txtid.getText().isEmpty() && !txtnom.getText().isEmpty() && !txtpre.getText().isEmpty() && !txtstok.getText().isEmpty()){
        product.add(Integer.valueOf(txtid.getText()), txtnom.getText(), Float.valueOf(txtpre.getText()), Integer.valueOf(txtstok.getText()));
        DefaultTableModel modp = new DefaultTableModel();
        String[] cabezap = {"ID","Nombre","Precio","Stock"}; 
        Object[] datosp = new Object[product.pro.length];
        modp.setColumnIdentifiers(cabezap);
        for(int i =0; i<product.cant;i++){
            datosp [0] = product.pro[i].getId();
            datosp [1] = product.pro[i].getNombre();
            datosp [2] = product.pro[i].getPrecio();
            datosp [3] = product.pro[i].getStock();
            modp.addRow(datosp);
        }
        table.setModel(modp);
        clear();
    }else{ 
        JOptionPane.showMessageDialog(this, "Ingrese todos los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            
        }                  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnmostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostActionPerformed
   
    }//GEN-LAST:event_btnmostActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        char c = evt.getKeyChar();

        // Acepta solo números y el signo de asterisco
        if (!Character.isDigit(c)) {
            evt.consume(); // Elimina el carácter si no es un número o asterisco
        }
    }//GEN-LAST:event_txtidKeyTyped

    private void txtstokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstokKeyTyped
        char c = evt.getKeyChar();

        // Acepta solo números y el signo de asterisco
        if (!Character.isDigit(c)) {
            evt.consume(); // Elimina el carácter si no es un número o asterisco
        }
    }//GEN-LAST:event_txtstokKeyTyped

    private void txtpreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreKeyTyped
        char c = evt.getKeyChar();

        // Acepta solo números y el signo de asterisco
        if (!Character.isDigit(c) && c != '.') {
            evt.consume(); // Elimina el carácter si no es un número o asterisco
        }
    }//GEN-LAST:event_txtpreKeyTyped

    public void clear(){
        txtid.setText("");
        txtnom.setText("");
        txtpre.setText("");
        txtstok.setText("");
        txtid.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmost;
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
