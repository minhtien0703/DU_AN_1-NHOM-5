/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;

/**
 *
 * @author hungh
 */
public class frm_themthuoctinh extends javax.swing.JDialog {

    /**
     * Creates new form frm_themthuoctinh
     */
    public frm_themthuoctinh(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        panelBorder1 = new swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        panelBorder3 = new swing.PanelBorder();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        panelBorder4 = new swing.PanelBorder();
        jTextField1 = new javax.swing.JTextField();
        panelBorder2 = new swing.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelBorder5 = new swing.PanelBorder();
        searchText1 = new swing.SearchText();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(255, 204, 255));

        panelBorder1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText(" Nhập Tên");
        panelBorder1.add(jLabel1);
        jLabel1.setBounds(60, 60, 250, 30);

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton2.setText("Thương hiệu");
        panelBorder3.add(jRadioButton2);
        jRadioButton2.setBounds(270, 100, 110, 40);

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton5.setText("Chất liệu");
        panelBorder3.add(jRadioButton5);
        jRadioButton5.setBounds(30, 30, 110, 40);

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton6.setText("Nhà sản xuất");
        panelBorder3.add(jRadioButton6);
        jRadioButton6.setBounds(150, 30, 110, 40);

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton7.setText("Màu sắc");
        panelBorder3.add(jRadioButton7);
        jRadioButton7.setBounds(270, 30, 110, 40);

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton8.setText("Size");
        panelBorder3.add(jRadioButton8);
        jRadioButton8.setBounds(30, 100, 110, 40);

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton9.setText("Danh mục");
        panelBorder3.add(jRadioButton9);
        jRadioButton9.setBounds(150, 100, 110, 40);

        panelBorder1.add(panelBorder3);
        panelBorder3.setBounds(370, 20, 450, 170);

        panelBorder4.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setBorder(null);
        panelBorder4.add(jTextField1);
        jTextField1.setBounds(10, 0, 230, 50);

        panelBorder1.add(panelBorder4);
        panelBorder4.setBounds(60, 90, 250, 50);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(10, 0, 860, 230);

        panelBorder2.setBackground(new java.awt.Color(204, 204, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

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
        jTable1.setGridColor(new java.awt.Color(204, 204, 255));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        panelBorder2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 860, 260);

        panelBorder5.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder5.add(searchText1);
        searchText1.setBounds(10, 0, 240, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        panelBorder5.add(jLabel2);
        jLabel2.setBounds(264, 0, 40, 50);

        panelBorder2.add(panelBorder5);
        panelBorder5.setBounds(530, 10, 300, 50);

        panelGradiente1.add(panelBorder2);
        panelBorder2.setBounds(10, 250, 860, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frm_themthuoctinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_themthuoctinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_themthuoctinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_themthuoctinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm_themthuoctinh dialog = new frm_themthuoctinh(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelBorder panelBorder3;
    private swing.PanelBorder panelBorder4;
    private swing.PanelBorder panelBorder5;
    private swing.PanelGradiente panelGradiente1;
    private swing.SearchText searchText1;
    // End of variables declaration//GEN-END:variables
}
