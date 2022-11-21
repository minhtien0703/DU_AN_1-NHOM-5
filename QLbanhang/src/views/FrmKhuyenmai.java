/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import services.IKhuyenmaiService;
import services.imp.KhuyenmaiService;
import viewmodels.KhuyenmaiViewmodel;

/**
 *
 * @author hungh
 */
public class FrmKhuyenmai extends javax.swing.JPanel {
    DefaultTableModel defaultTableModel;
    private IKhuyenmaiService khuyenmaiService;
    /**
     * Creates new form khuyenmai
     */
    public FrmKhuyenmai() {
        initComponents();
        defaultTableModel = (DefaultTableModel) tb_khuyenmai.getModel();
        khuyenmaiService = new KhuyenmaiService();
//        LoadData();
    }
    void LoadData(){
        defaultTableModel.setRowCount(0);
        int stt =1;
        for (KhuyenmaiViewmodel x : khuyenmaiService.GetALL()) {
            defaultTableModel.addRow(new Object[]{
                stt,
                x.getTenKm(),
                x.getHinhthucKM(),
                x.getNgaybatdau(),
                x.getNgayketthuc(),
                x.getSanpham(),
                x.getGiatrigiam()
            });
            stt++;
        }
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
        jLabel2 = new javax.swing.JLabel();
        txt_tenkm = new swing.MyTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        date_batdau = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        date_ketthuc = new com.toedter.calendar.JDateChooser();
        txt_giatrigiam = new swing.MyTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_danhmuc = new javax.swing.JComboBox<>();
        cb_sanpham = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_them = new swing.MyButton();
        btn_update = new swing.MyButton();
        btn_clear = new swing.MyButton();
        btn_delete = new swing.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_khuyenmai = new javax.swing.JTable();
        panelBorder2 = new swing.PanelBorder();
        txt_search = new swing.SearchText();
        btn_search = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1010, 640));

        panelGradiente1.setBackground(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(255, 204, 255));

        panelBorder1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Ngày bắt đầu");
        panelBorder1.add(jLabel2);
        jLabel2.setBounds(390, 10, 260, 20);
        panelBorder1.add(txt_tenkm);
        txt_tenkm.setBounds(60, 30, 260, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tên khuyễn mãi");
        panelBorder1.add(jLabel3);
        jLabel3.setBounds(60, 10, 260, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Hình thức giảm giá");
        panelBorder1.add(jLabel4);
        jLabel4.setBounds(60, 170, 130, 30);

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1.setText("VND");
        panelBorder1.add(jRadioButton1);
        jRadioButton1.setBounds(200, 170, 50, 30);

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("%");
        panelBorder1.add(jRadioButton2);
        jRadioButton2.setBounds(270, 170, 50, 30);

        date_batdau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        date_batdau.setDateFormatString("dd/MM/yyyy");
        panelBorder1.add(date_batdau);
        date_batdau.setBounds(390, 30, 260, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Ngày kết thúc");
        panelBorder1.add(jLabel6);
        jLabel6.setBounds(390, 80, 260, 20);

        date_ketthuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        date_ketthuc.setDateFormatString("dd/MM/yyyy");
        panelBorder1.add(date_ketthuc);
        date_ketthuc.setBounds(390, 100, 260, 40);
        panelBorder1.add(txt_giatrigiam);
        txt_giatrigiam.setBounds(60, 100, 260, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Danh mục");
        panelBorder1.add(jLabel7);
        jLabel7.setBounds(60, 220, 260, 20);

        cb_danhmuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        panelBorder1.add(cb_danhmuc);
        cb_danhmuc.setBounds(60, 240, 260, 40);

        cb_sanpham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_sanpham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        panelBorder1.add(cb_sanpham);
        cb_sanpham.setBounds(390, 240, 260, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Số tiền giảm");
        panelBorder1.add(jLabel8);
        jLabel8.setBounds(60, 80, 260, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Sản phẩm");
        panelBorder1.add(jLabel9);
        jLabel9.setBounds(390, 220, 260, 20);

        btn_them.setBackground(new java.awt.Color(125, 224, 237));
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_them);
        btn_them.setBounds(690, 90, 130, 40);

        btn_update.setBackground(new java.awt.Color(125, 224, 237));
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        btn_update.setText("Cập nhật");
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_update);
        btn_update.setBounds(840, 90, 120, 40);

        btn_clear.setBackground(new java.awt.Color(125, 224, 237));
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btn_clear.setText("Làm mới");
        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_clear);
        btn_clear.setBounds(690, 160, 130, 40);

        btn_delete.setBackground(new java.awt.Color(125, 224, 237));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tay.png"))); // NOI18N
        btn_delete.setText("Xóa");
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_delete);
        btn_delete.setBounds(840, 160, 120, 40);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(10, 0, 990, 300);

        tb_khuyenmai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên khuyến mãi", "Hình thức giảm", "Ngày bắt đầu", "Ngày kết thúc", "Tên sản phẩm", "Giá trị giảm"
            }
        ));
        tb_khuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_khuyenmaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_khuyenmai);

        panelGradiente1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 370, 990, 260);

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder2.add(txt_search);
        txt_search.setBounds(10, 0, 240, 40);

        btn_search.setBackground(new java.awt.Color(125, 224, 237));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        panelBorder2.add(btn_search);
        btn_search.setBounds(250, 0, 40, 40);

        panelGradiente1.add(panelBorder2);
        panelBorder2.setBounds(660, 310, 290, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date1 =sdf.format(date_batdau.getDate());
        String date2 =sdf.format(date_ketthuc.getDate());
        
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_tenkm.setText("");
        txt_giatrigiam.setText("");
        cb_sanpham.setSelectedIndex(0);
        date_batdau.setCalendar(null);
        date_ketthuc.setCalendar(null);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tb_khuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_khuyenmaiMouseClicked
        try {
            // TODO add your handling code here:
            int r = tb_khuyenmai.getSelectedRow();
            txt_tenkm.setText((String) tb_khuyenmai.getValueAt(r, 1));
            txt_giatrigiam.setText((String) tb_khuyenmai.getValueAt(r, 6));
            cb_sanpham.setSelectedItem(tb_khuyenmai.getValueAt(r, 5));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = sdf.parse((String) tb_khuyenmai.getValueAt(r, 3));
            Date date2 = sdf.parse((String) tb_khuyenmai.getValueAt(r, 4));
            date_batdau.setDate(date1);
            date_ketthuc.setDate(date2);
        } catch (ParseException ex) {
            Logger.getLogger(FrmKhuyenmai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_khuyenmaiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton btn_clear;
    private swing.MyButton btn_delete;
    private javax.swing.JButton btn_search;
    private swing.MyButton btn_them;
    private swing.MyButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_danhmuc;
    private javax.swing.JComboBox<String> cb_sanpham;
    private com.toedter.calendar.JDateChooser date_batdau;
    private com.toedter.calendar.JDateChooser date_ketthuc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelGradiente panelGradiente1;
    private javax.swing.JTable tb_khuyenmai;
    private swing.MyTextField txt_giatrigiam;
    private swing.SearchText txt_search;
    private swing.MyTextField txt_tenkm;
    // End of variables declaration//GEN-END:variables
}
