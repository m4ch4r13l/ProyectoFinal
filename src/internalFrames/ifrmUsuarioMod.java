package internalFrames;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import proyectofinal.Usuario;
import proyectofinal.frmUsuario;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author lcarv
 */
public class ifrmUsuarioMod extends javax.swing.JInternalFrame {

    frmUsuario usuarioVentana;
    Usuario userList;
    
    public ifrmUsuarioMod(frmUsuario usuarioVentana, Usuario userList) {
        initComponents();
        this.usuarioVentana = usuarioVentana;
        this.usuarioVentana = usuarioVentana;
        this.userList = userList;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupAdmin = new javax.swing.ButtonGroup();
        btnGrupEstado = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        txtPassNueva = new javax.swing.JPasswordField();
        cbxBoxUsers = new javax.swing.JComboBox<>();
        lblAcceso = new javax.swing.JLabel();
        rbtCajero = new javax.swing.JRadioButton();
        rbtAdmin = new javax.swing.JRadioButton();
        btnModificar = new javax.swing.JButton();
        lblcontraseña1 = new javax.swing.JLabel();
        txtPassActual = new javax.swing.JPasswordField();
        lblAcceso1 = new javax.swing.JLabel();
        rbtHabilitado = new javax.swing.JRadioButton();
        rbtDeshabilitado = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Modificar usuarios");

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Modificar usuarios");

        lblUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setText("Nombre de Usuario:");

        lblcontraseña.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblcontraseña.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcontraseña.setText("Contraseña nueva:");

        txtPassNueva.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtPassNueva.setEnabled(false);

        cbxBoxUsers.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbxBoxUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un usuario." }));
        cbxBoxUsers.setToolTipText("Selecciona un usuario");
        cbxBoxUsers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxBoxUsersItemStateChanged(evt);
            }
        });
        cbxBoxUsers.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbxBoxUsersFocusGained(evt);
            }
        });
        cbxBoxUsers.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxBoxUsersPopupMenuWillBecomeVisible(evt);
            }
        });
        cbxBoxUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxBoxUsersMousePressed(evt);
            }
        });
        cbxBoxUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBoxUsersActionPerformed(evt);
            }
        });

        lblAcceso.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblAcceso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAcceso.setText("Nivel de Acceso:");

        btnGrupAdmin.add(rbtCajero);
        rbtCajero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbtCajero.setText("Cajero");
        rbtCajero.setEnabled(false);

        btnGrupAdmin.add(rbtAdmin);
        rbtAdmin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbtAdmin.setText("Administrador");
        rbtAdmin.setEnabled(false);

        btnModificar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lblcontraseña1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblcontraseña1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcontraseña1.setText("Contraseña actual:");

        txtPassActual.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtPassActual.setEnabled(false);

        lblAcceso1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblAcceso1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAcceso1.setText("Estado:");

        btnGrupEstado.add(rbtHabilitado);
        rbtHabilitado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbtHabilitado.setText("Habilitado");
        rbtHabilitado.setEnabled(false);

        btnGrupEstado.add(rbtDeshabilitado);
        rbtDeshabilitado.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rbtDeshabilitado.setText("Deshabilitado");
        rbtDeshabilitado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnModificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAcceso1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcontraseña1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblcontraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxBoxUsers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassNueva)
                            .addComponent(txtPassActual)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbtHabilitado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbtCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtAdmin)
                                    .addComponent(rbtDeshabilitado))
                                .addGap(0, 39, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(cbxBoxUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontraseña1)
                    .addComponent(txtPassActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontraseña)
                    .addComponent(txtPassNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAcceso)
                    .addComponent(rbtCajero)
                    .addComponent(rbtAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAcceso1)
                    .addComponent(rbtHabilitado)
                    .addComponent(rbtDeshabilitado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int modificar = JOptionPane.showConfirmDialog(this, "Esta seguro de continuar", "Confirmación",JOptionPane.YES_NO_OPTION);
        if (modificar == JOptionPane.YES_OPTION) {
            int idUser = cbxBoxUsers.getSelectedIndex();
            String user = (String) cbxBoxUsers.getSelectedItem();
            String passActual = txtPassActual.getText();
            String passNueva = txtPassNueva.getText();
            boolean admin = false;
            if (rbtCajero.isSelected()) {
                admin = false;
            }
            if (rbtAdmin.isSelected()) {
                admin = true;
            }
            boolean disp = false;
            if (rbtDeshabilitado.isSelected()) {
                disp = false;
            }
            if (rbtHabilitado.isSelected()) {
                disp = true;
            }
            if (txtPassNueva.getText().isEmpty()) {
                userList.users[idUser].setAdmin(admin);
                userList.users[idUser].setDisponible(disp);
                JOptionPane.showMessageDialog(this, "Usuario "+user+" modificado con exito.", "Modificado", JOptionPane.INFORMATION_MESSAGE);
                clear();
            } else if (passActual.equals(userList.users[idUser].getContrasena())) {
                userList.users[idUser].setContrasena(passNueva);
                userList.users[idUser].setAdmin(admin);
                userList.users[idUser].setDisponible(disp);
                JOptionPane.showMessageDialog(this, "Usuario "+user+" modificado con exito.", "Modificado", JOptionPane.INFORMATION_MESSAGE);
                clear();
            } else {
                JOptionPane.showMessageDialog(this, "contraseña actual incorrecta.", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtPassActual.requestFocus();
            }
        } else {
            clear();
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cbxBoxUsersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxBoxUsersItemStateChanged
        if (userList.users[cbxBoxUsers.getSelectedIndex()].isDisponible()) {
            rbtHabilitado.setSelected(true);
            rbtDeshabilitado.setSelected(false);
        } else {
            rbtHabilitado.setSelected(false);
            rbtDeshabilitado.setSelected(true);
        }
        if (userList.users[cbxBoxUsers.getSelectedIndex()].isAdmin()) {
            rbtAdmin.setSelected(true);
            rbtCajero.setSelected(false);
        } else {
            rbtAdmin.setSelected(false);
            rbtCajero.setSelected(true);
        }
    }//GEN-LAST:event_cbxBoxUsersItemStateChanged

    private void cbxBoxUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBoxUsersActionPerformed
        
    }//GEN-LAST:event_cbxBoxUsersActionPerformed

    private void cbxBoxUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxBoxUsersMousePressed
        
    }//GEN-LAST:event_cbxBoxUsersMousePressed

    private void cbxBoxUsersFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxBoxUsersFocusGained
        
    }//GEN-LAST:event_cbxBoxUsersFocusGained

    private void cbxBoxUsersPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxBoxUsersPopupMenuWillBecomeVisible
        String users[] = new String[userList.idUsers+1];
        DefaultComboBoxModel<String> modelUsers = new DefaultComboBoxModel<String>();
        for (int i = 0; i < userList.idUsers; i++) {
            users[i] = userList.users[i].getNombre();
            modelUsers.addElement(users[i]);
        }
        if (userList.users[cbxBoxUsers.getSelectedIndex()].isDisponible()) {
            rbtHabilitado.setSelected(true);
            rbtDeshabilitado.setSelected(false);
        } else {
            rbtHabilitado.setSelected(false);
            rbtDeshabilitado.setSelected(true);
        }
        if (userList.users[cbxBoxUsers.getSelectedIndex()].isAdmin()) {
            rbtAdmin.setSelected(true);
            rbtCajero.setSelected(false);
        } else {
            rbtAdmin.setSelected(false);
            rbtCajero.setSelected(true);
        }
        cbxBoxUsers.setModel(modelUsers);
        txtPassActual.setEnabled(true);
        txtPassNueva.setEnabled(true);
        rbtAdmin.setEnabled(true);
        rbtCajero.setEnabled(true);
        rbtHabilitado.setEnabled(true);
        rbtDeshabilitado.setEnabled(true);
    }//GEN-LAST:event_cbxBoxUsersPopupMenuWillBecomeVisible

    public void clear(){
        DefaultComboBoxModel<String> modelUsers = new DefaultComboBoxModel<String>();
        modelUsers.addElement("Seleccione un usuario.");
        cbxBoxUsers.setModel(modelUsers);
        txtPassActual.setEnabled(false);
        txtPassNueva.setEnabled(false);
        rbtAdmin.setEnabled(false);
        rbtCajero.setEnabled(false);
        rbtHabilitado.setEnabled(false);
        rbtDeshabilitado.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupAdmin;
    private javax.swing.ButtonGroup btnGrupEstado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxBoxUsers;
    private javax.swing.JLabel lblAcceso;
    private javax.swing.JLabel lblAcceso1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblcontraseña1;
    private javax.swing.JRadioButton rbtAdmin;
    private javax.swing.JRadioButton rbtCajero;
    private javax.swing.JRadioButton rbtDeshabilitado;
    private javax.swing.JRadioButton rbtHabilitado;
    private javax.swing.JPasswordField txtPassActual;
    private javax.swing.JPasswordField txtPassNueva;
    // End of variables declaration//GEN-END:variables
}
