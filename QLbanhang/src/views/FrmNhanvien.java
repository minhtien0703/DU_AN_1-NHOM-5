/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

/**
 *
 * @author hungh
 */
public class FrmNhanvien extends javax.swing.JPanel {

    /**
     * Creates new form nhanvien
     */
    public FrmNhanvien() {
        initComponents();
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
        panelGradiente1 = new swing.PanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        myTextField1 = new swing.MyTextField();
        jLabel2 = new javax.swing.JLabel();
        myTextField2 = new swing.MyTextField();
        jLabel3 = new javax.swing.JLabel();
        myTextField3 = new swing.MyTextField();
        jLabel4 = new javax.swing.JLabel();
        myTextField4 = new swing.MyTextField();
        jLabel5 = new javax.swing.JLabel();
        myTextField5 = new swing.MyTextField();
        jLabel6 = new javax.swing.JLabel();
        myTextField6 = new swing.MyTextField();
        jLabel7 = new javax.swing.JLabel();
        myTextField7 = new swing.MyTextField();
        jLabel8 = new javax.swing.JLabel();
        myTextField8 = new swing.MyTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        myButton1 = new swing.MyButton();
        myButton2 = new swing.MyButton();
        myButton3 = new swing.MyButton();
        myButton4 = new swing.MyButton();
        panelBorder2 = new swing.PanelBorder();
        searchText2 = new swing.SearchText();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1010, 640));

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(255, 204, 255));
        panelGradiente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tên");
        panelGradiente1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 220, 20));
        panelGradiente1.add(myTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 220, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tên đệm");
        panelGradiente1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 220, 20));
        panelGradiente1.add(myTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 220, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Họ");
        panelGradiente1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 220, 20));
        panelGradiente1.add(myTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 220, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày sinh");
        panelGradiente1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 220, 20));
        panelGradiente1.add(myTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 220, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("SĐT");
        panelGradiente1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 220, 20));
        panelGradiente1.add(myTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 220, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tài Khoản");
        panelGradiente1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 220, 20));
        panelGradiente1.add(myTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 220, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Mật khẩu");
        panelGradiente1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 220, 20));
        panelGradiente1.add(myTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 220, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Giới tính");
        panelGradiente1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 60, 20));
        panelGradiente1.add(myTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 220, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        panelGradiente1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 990, 280));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Trạng thái");
        panelGradiente1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 60, 20));

        jRadioButton1.setBackground(new java.awt.Color(230, 230, 250));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nữ");
        panelGradiente1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(230, 230, 250));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nam");
        panelGradiente1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Email");
        panelGradiente1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 220, 20));

        jCheckBox1.setBackground(new java.awt.Color(230, 230, 250));
        jCheckBox1.setText("Làm việc");
        panelGradiente1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 90, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Tổng nhân viên :");
        panelGradiente1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, -1));

        myButton1.setBackground(new java.awt.Color(125, 224, 237));
        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        myButton1.setText("Hiển thị");
        myButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelGradiente1.add(myButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 120, 40));

        myButton2.setBackground(new java.awt.Color(125, 224, 237));
        myButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        myButton2.setText("Thêm");
        myButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });
        panelGradiente1.add(myButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 120, 40));

        myButton3.setBackground(new java.awt.Color(125, 224, 237));
        myButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        myButton3.setText("Cập nhật");
        myButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelGradiente1.add(myButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 120, 40));

        myButton4.setBackground(new java.awt.Color(125, 224, 237));
        myButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tay.png"))); // NOI18N
        myButton4.setText("Xóa");
        myButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelGradiente1.add(myButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 120, 40));

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder2.add(searchText2);
        searchText2.setBounds(10, 0, 240, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        panelBorder2.add(jLabel13);
        jLabel13.setBounds(260, 0, 40, 40);

        panelGradiente1.add(panelBorder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 300, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private swing.MyButton myButton1;
    private swing.MyButton myButton2;
    private swing.MyButton myButton3;
    private swing.MyButton myButton4;
    private swing.MyTextField myTextField1;
    private swing.MyTextField myTextField2;
    private swing.MyTextField myTextField3;
    private swing.MyTextField myTextField4;
    private swing.MyTextField myTextField5;
    private swing.MyTextField myTextField6;
    private swing.MyTextField myTextField7;
    private swing.MyTextField myTextField8;
    private swing.PanelBorder panelBorder2;
    private swing.PanelGradiente panelGradiente1;
    private swing.SearchText searchText2;
    // End of variables declaration//GEN-END:variables
}
