/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.event.ActionListener;
import java.util.Random;

/**
 *
 * @author hungh
 */
public class frm_Quenmatkhau extends javax.swing.JPanel {
    boolean hish = false;
    boolean hish1 = false;
    
    public frm_Quenmatkhau() {
        initComponents();
    }

    public void quenmatkhau() {
        txt_email.grabFocus();
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

        txt_email = new swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new swing.MyPassword();
        jLabel3 = new javax.swing.JLabel();
        myButton1 = new swing.MyButton();
        cmdBackLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPass1 = new swing.MyPassword();
        txt_code = new swing.MyTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_doimk = new swing.MyButton();
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

        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 280, 40));

        jLabel1.setText("E-mail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 24));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quên mật khẩu");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 11, 257, -1));

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 280, 40));

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

        cmdBackLogin.setForeground(new java.awt.Color(30, 122, 236));
        cmdBackLogin.setText("Đăng nhập ?");
        cmdBackLogin.setBorder(null);
        cmdBackLogin.setContentAreaFilled(false);
        cmdBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(cmdBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        jLabel4.setText("Confirm Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 24));

        txtPass1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 280, 40));

        txt_code.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txt_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 280, 40));

        jLabel5.setText("Mã bảo mật");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 24));

        btn_doimk.setBackground(new java.awt.Color(125, 229, 251));
        btn_doimk.setForeground(new java.awt.Color(0, 51, 102));
        btn_doimk.setText("Đổi mật khẩu");
        btn_doimk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_doimk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_doimkMouseClicked(evt);
            }
        });
        add(btn_doimk, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 120, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
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

    private void btn_doimkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_doimkMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_doimkMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Random random = new Random();
        int ran = random.nextInt(99999);
        String sub = "Verification code";
        String messsage = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <title>Document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <h3 style=\"color: blue;\">Verification code</h3>\n"
                + "    <div>Your verification code is : " + ran + "</div>\n"
                + "    <h3 style=\"color: blue;\">Thank you very much</h3>\n"
                + "</body>\n"
                + "</html>";
        utilconnext.SendMail.send(txt_email.getText(), sub, messsage, "beeclothes03@gmail.com", "zjauangyynxcspbl");
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton btn_doimk;
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
    private swing.MyPassword txtPass;
    private swing.MyPassword txtPass1;
    private swing.MyTextField txt_code;
    private swing.MyTextField txt_email;
    // End of variables declaration//GEN-END:variables
}
