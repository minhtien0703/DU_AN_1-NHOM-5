/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.event.ActionListener;

/**
 *
 * @author hungh
 */
public class Quenmatkhau extends javax.swing.JPanel {
    boolean hish = false;
    boolean hish1 = false;
    
    public Quenmatkhau() {
        initComponents();
    }

    public void quenmatkhau() {
        txtUser.grabFocus();
    }

    public void addEventBackLogin(ActionListener event) {
        cmdBackLogin.addActionListener(event);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new swing.MyPassword();
        jLabel3 = new javax.swing.JLabel();
        myButton1 = new swing.MyButton();
        cmdBackLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPass1 = new swing.MyPassword();
        txtUser1 = new swing.MyTextField();
        jLabel5 = new javax.swing.JLabel();
        myButton2 = new swing.MyButton();
        jLabel6 = new javax.swing.JLabel();
        hideshow1 = new javax.swing.JLabel();
        hideshow = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(410, 450));
        setMinimumSize(new java.awt.Dimension(410, 450));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(410, 450));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 280, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("E-mail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 24));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quên mật khẩu");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 11, 257, -1));

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 280, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 24));

        myButton1.setBackground(new java.awt.Color(125, 229, 251));
        myButton1.setForeground(new java.awt.Color(0, 51, 102));
        myButton1.setText("Thoát");
        myButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });
        add(myButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 120, 40));

        cmdBackLogin.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmdBackLogin.setForeground(new java.awt.Color(30, 122, 236));
        cmdBackLogin.setText("Đăng nhập ?");
        cmdBackLogin.setBorder(null);
        cmdBackLogin.setContentAreaFilled(false);
        cmdBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(cmdBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Confirm Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 24));

        txtPass1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 280, 40));

        txtUser1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txtUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 280, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Mã bảo mật");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 24));

        myButton2.setBackground(new java.awt.Color(125, 229, 251));
        myButton2.setForeground(new java.awt.Color(0, 51, 102));
        myButton2.setText("Đổi mật khẩu");
        myButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add(myButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 120, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 30, 20));

        hideshow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/show.png"))); // NOI18N
        hideshow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideshow1MouseClicked(evt);
            }
        });
        add(hideshow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 30, -1));

        hideshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/show.png"))); // NOI18N
        hideshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideshowMouseClicked(evt);
            }
        });
        add(hideshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_myButton1ActionPerformed

    private void hideshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideshowMouseClicked
        if (hish == false) {
            hish = true;
            hideshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png")));
            txtPass.setEchoChar((char)0);
        } else {
            hish = false;
            hideshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/show.png")));
            txtPass.setEchoChar('\u25cf');
        }

    }//GEN-LAST:event_hideshowMouseClicked

    private void hideshow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideshow1MouseClicked
        if (hish1 == false) {
            hish1 = true;
            hideshow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png")));
            txtPass1.setEchoChar((char)0);
        } else {
            hish1 = false;
            hideshow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/show.png")));
            txtPass1.setEchoChar('\u25cf');
        }

    }//GEN-LAST:event_hideshow1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBackLogin;
    private javax.swing.JLabel hideshow;
    private javax.swing.JLabel hideshow1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private swing.MyButton myButton1;
    private swing.MyButton myButton2;
    private swing.MyPassword txtPass;
    private swing.MyPassword txtPass1;
    private swing.MyTextField txtUser;
    private swing.MyTextField txtUser1;
    // End of variables declaration//GEN-END:variables
}
