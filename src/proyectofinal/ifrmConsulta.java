/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tikis
 */
public class ifrmConsulta extends javax.swing.JInternalFrame {
public Producto product;
frmProductos pros;
    /**
     * Creates new form ifrmConsulta
     */
    public ifrmConsulta(frmProductos pro, Producto prod) {
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
        btnacc = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Inventario completo ");

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

        btnacc.setText("Actualizar");
        btnacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(btnacc, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnacc, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccActionPerformed
      DefaultTableModel modp = new DefaultTableModel();
       String[] cabezap = {"ID","Nombre","Precio","Stock"}; 
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
    }//GEN-LAST:event_btnaccActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}