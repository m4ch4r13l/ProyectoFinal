/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;

import datosCaja.Ventas;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author macha
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    int xMouse, yMouse;
    Producto productList;
    Usuario usersList;
    Ventas ventasList = new Ventas();
    frmLogin loginVentana;
    int actUser;
    
    public frmMain() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public frmMain(frmLogin loginVentana, Usuario usersList, int actUser, Producto productList) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.loginVentana = loginVentana;
        this.usersList = usersList;
        this.productList = productList;
        this.actUser = actUser;
        System.out.println("idUser: " + this.actUser);
        lblTitle.setText("Bienvenido: " + usersList.users[this.actUser].getNombre());
        this.setIconImage(new ImageIcon(getClass().getResource("/img/iconoL.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        pnlHead = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnCaja = new javax.swing.JPanel();
        lblBtnCaja = new javax.swing.JLabel();
        btnUsers = new javax.swing.JPanel();
        lblBtnUsers = new javax.swing.JLabel();
        btnProduct = new javax.swing.JPanel();
        lblBtnProducts = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        lblBtnSalir = new javax.swing.JLabel();
        lblCaja = new javax.swing.JLabel();
        lblUsers = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblProducts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlBack.setBackground(new java.awt.Color(10, 70, 192));

        headerPanel.setOpaque(false);
        headerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerPanelMouseDragged(evt);
            }
        });
        headerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerPanelMousePressed(evt);
            }
        });

        lblExit.setBackground(new java.awt.Color(10, 70, 192));
        lblExit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblExit.setForeground(new java.awt.Color(242, 242, 242));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setOpaque(true);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblExitMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlBody.setBackground(new java.awt.Color(242, 242, 242));
        pnlBody.setForeground(new java.awt.Color(0, 0, 0));

        pnlHead.setBackground(new java.awt.Color(221, 221, 221));
        pnlHead.setToolTipText("");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoh (1).png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(30, 30, 30));
        lblTitle.setText("Bienvenido: ");

        javax.swing.GroupLayout pnlHeadLayout = new javax.swing.GroupLayout(pnlHead);
        pnlHead.setLayout(pnlHeadLayout);
        pnlHeadLayout.setHorizontalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlHeadLayout.setVerticalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnCaja.setBackground(new java.awt.Color(255, 223, 48));
        btnCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCajaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCajaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCajaMouseReleased(evt);
            }
        });

        lblBtnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Caja.png"))); // NOI18N

        javax.swing.GroupLayout btnCajaLayout = new javax.swing.GroupLayout(btnCaja);
        btnCaja.setLayout(btnCajaLayout);
        btnCajaLayout.setHorizontalGroup(
            btnCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBtnCaja, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnCajaLayout.setVerticalGroup(
            btnCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBtnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnUsers.setBackground(new java.awt.Color(255, 223, 48));
        btnUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUsersMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUsersMouseReleased(evt);
            }
        });

        lblBtnUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N

        javax.swing.GroupLayout btnUsersLayout = new javax.swing.GroupLayout(btnUsers);
        btnUsers.setLayout(btnUsersLayout);
        btnUsersLayout.setHorizontalGroup(
            btnUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsersLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblBtnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnUsersLayout.setVerticalGroup(
            btnUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBtnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnProduct.setBackground(new java.awt.Color(255, 223, 48));
        btnProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProductMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnProductMouseReleased(evt);
            }
        });

        lblBtnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos.png"))); // NOI18N

        javax.swing.GroupLayout btnProductLayout = new javax.swing.GroupLayout(btnProduct);
        btnProduct.setLayout(btnProductLayout);
        btnProductLayout.setHorizontalGroup(
            btnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBtnProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnProductLayout.setVerticalGroup(
            btnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBtnProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnExit.setBackground(new java.awt.Color(255, 223, 48));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExitMouseReleased(evt);
            }
        });

        lblBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblCaja.setBackground(new java.awt.Color(0, 0, 0));
        lblCaja.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCaja.setForeground(new java.awt.Color(0, 0, 0));
        lblCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaja.setText("Caja");

        lblUsers.setBackground(new java.awt.Color(0, 0, 0));
        lblUsers.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblUsers.setForeground(new java.awt.Color(0, 0, 0));
        lblUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsers.setText("Usuarios");

        lblSalir.setBackground(new java.awt.Color(0, 0, 0));
        lblSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(0, 0, 0));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("Salir");

        lblProducts.setBackground(new java.awt.Color(0, 0, 0));
        lblProducts.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblProducts.setForeground(new java.awt.Color(0, 0, 0));
        lblProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProducts.setText("Productos");

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(111, 111, 111))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addComponent(pnlHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCaja)
                    .addComponent(lblUsers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalir)
                    .addComponent(lblProducts))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        lblExit.setBackground(Color.red);
        lblExit.setForeground(new Color(242,242,242));
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setBackground(new Color(10,70,192));
        lblExit.setForeground(new Color(242,242,242));
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMousePressed
        lblExit.setBackground(new Color(204, 0, 0));
    }//GEN-LAST:event_lblExitMousePressed

    private void lblExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON1) {
            loginVentana.setVisible(true);
            dispose();
            lblExit.setBackground(Color.red);
        }
    }//GEN-LAST:event_lblExitMouseReleased

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerPanelMouseDragged

    private void headerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerPanelMousePressed

    private void btnCajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCajaMouseEntered
        btnCaja.setBackground(new Color(246, 255, 48));
    }//GEN-LAST:event_btnCajaMouseEntered

    private void btnCajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCajaMouseExited
        btnCaja.setBackground(new Color(255, 223, 48));
    }//GEN-LAST:event_btnCajaMouseExited

    private void btnCajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCajaMousePressed
        btnCaja.setBackground(new Color(242, 211, 45));
    }//GEN-LAST:event_btnCajaMousePressed

    private void btnCajaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCajaMouseReleased
        btnCaja.setBackground(new Color(255, 223, 48));
        
        frmCaja cajaWin = new frmCaja(this, productList, ventasList);
        cajaWin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCajaMouseReleased

    private void btnUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsersMouseEntered
        btnUsers.setBackground(new Color(246, 255, 48));
    }//GEN-LAST:event_btnUsersMouseEntered

    private void btnUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsersMouseExited
        btnUsers.setBackground(new Color(255, 223, 48));
    }//GEN-LAST:event_btnUsersMouseExited

    private void btnUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsersMousePressed
        btnUsers.setBackground(new Color(242, 211, 45));
    }//GEN-LAST:event_btnUsersMousePressed

    private void btnUsersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsersMouseReleased
        if (usersList.users[actUser].isAdmin()) {
            btnUsers.setBackground(new Color(255, 223, 48));
            frmUsuario userVentana = new frmUsuario(this, usersList);
            userVentana.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario sin acceso.", "Sin acceso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUsersMouseReleased

    private void btnProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseEntered
        btnProduct.setBackground(new Color(246, 255, 48));
    }//GEN-LAST:event_btnProductMouseEntered

    private void btnProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseExited
        btnProduct.setBackground(new Color(255, 223, 48));
    }//GEN-LAST:event_btnProductMouseExited

    private void btnProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMousePressed
        btnProduct.setBackground(new Color(242, 211, 45));
    }//GEN-LAST:event_btnProductMousePressed

    private void btnProductMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseReleased
        if (usersList.users[actUser].isAdmin()) {
            btnProduct.setBackground(new Color(255, 223, 48));
            frmProductos product = new frmProductos(this, productList);
            product.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario sin acceso.", "Sin acceso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnProductMouseReleased

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color(246, 255, 48));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new Color(255, 223, 48));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        btnExit.setBackground(new Color(242, 211, 45));
    }//GEN-LAST:event_btnExitMousePressed

    private void btnExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseReleased
        loginVentana.setVisible(true);
        loginVentana.passEnter = false;
        btnExit.setBackground(new Color(255, 223, 48));
        dispose();
    }//GEN-LAST:event_btnExitMouseReleased
    
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
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new frmMain().setVisible(true);
                }
            });
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCaja;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnProduct;
    private javax.swing.JPanel btnUsers;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel lblBtnCaja;
    private javax.swing.JLabel lblBtnProducts;
    private javax.swing.JLabel lblBtnSalir;
    private javax.swing.JLabel lblBtnUsers;
    private javax.swing.JLabel lblCaja;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblProducts;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHead;
    // End of variables declaration//GEN-END:variables
}
