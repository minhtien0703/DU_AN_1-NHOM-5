package views;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.IHoaDonService;
import services.imp.HoaDonService;
import viewmodels.HoaDonCHiTietViewModel;
import viewmodels.HoaDonViewModel;

public class frm_Hoadon extends javax.swing.JPanel {

    DefaultTableModel defaultTableModel;
    private HoaDonService iHoaDonService;
    private HoaDonService hoaDonService;

    public frm_Hoadon() {
        initComponents();

        iHoaDonService = new HoaDonService();
        hoaDonService = new HoaDonService();

//        loatdate1();

    }

    private void loatdate1() {
        defaultTableModel = (DefaultTableModel) tbl_hoadon.getModel();
        defaultTableModel.setRowCount(0);
        List<HoaDonViewModel> hdv = iHoaDonService.getAllHD();
        for (HoaDonViewModel hoaDonViewModel : hdv) {
            defaultTableModel.addRow(new Object[]{
                hoaDonViewModel.getKh().getTen(),
                hoaDonViewModel.getUs().getTen(),
                hoaDonViewModel.getMa(),
                hoaDonViewModel.getNgayTao(),
                hoaDonViewModel.getNgayThanhToan(),
                hoaDonViewModel.getTinhTrang()== 1 ? "chưa thanh toán" : "đã thanh toán",});
        }

    }

    private void loatdate2() {
        defaultTableModel = (DefaultTableModel) tbl_HoaDonCT.getModel();
        defaultTableModel.setRowCount(0);
        List<HoaDonCHiTietViewModel> hdct = hoaDonService.getAllHDCT();
        for (HoaDonCHiTietViewModel c : hdct) {
            defaultTableModel.addRow(new Object[]{
                c.getSanPham().getMa(),
                c.getSanPham().getTen(),
                c.getSoluong(),
                c.getDonGia(),
                c.getDonGiaKhiGiam()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panelGradiente1 = new swing.PanelGradiente();
        panelBorder1 = new swing.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hoadon = new javax.swing.JTable();
        panelBorder3 = new swing.PanelBorder();
        jLabel3 = new javax.swing.JLabel();
        txt_tk = new swing.SearchText();
        cbo_nam = new javax.swing.JComboBox<>();
        cbo_trangthai = new javax.swing.JComboBox<>();
        cbo_thang = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelBorder2 = new swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_HoaDonCT = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Hóa đơn");

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1010, 640));

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(255, 204, 255));

        panelBorder1.setBackground(new java.awt.Color(204, 204, 255));

        tbl_hoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MA", "TÊN NHÂN VIÊN", "TÊN KHÁCH HÀNG", "NGÀY TẠO", "NGÀY TT", "TRẠNG THÁI", "GHI CHÚ"
            }
        ));
        tbl_hoadon.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_hoadon.setRowHeight(20);
        tbl_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_hoadonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_hoadon);

        panelBorder1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 190, 990, 180);

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        panelBorder3.add(jLabel3);
        jLabel3.setBounds(750, 0, 40, 40);

        txt_tk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tkMouseClicked(evt);
            }
        });
        panelBorder3.add(txt_tk);
        txt_tk.setBounds(10, 0, 730, 40);

        panelBorder1.add(panelBorder3);
        panelBorder3.setBounds(100, 30, 810, 40);

        cbo_nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelBorder1.add(cbo_nam);
        cbo_nam.setBounds(670, 120, 140, 40);

        cbo_trangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelBorder1.add(cbo_trangthai);
        cbo_trangthai.setBounds(180, 120, 220, 40);

        cbo_thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelBorder1.add(cbo_thang);
        cbo_thang.setBounds(520, 120, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Năm");
        panelBorder1.add(jLabel4);
        jLabel4.setBounds(670, 100, 140, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Trạng thái");
        panelBorder1.add(jLabel5);
        jLabel5.setBounds(180, 100, 220, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Tháng");
        panelBorder1.add(jLabel6);
        jLabel6.setBounds(520, 100, 140, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Hóa Đơn");
        panelBorder1.add(jLabel7);
        jLabel7.setBounds(0, 160, 220, 30);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(10, -1, 990, 370);

        panelBorder2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Hóa đơn chi tiết");
        panelBorder2.add(jLabel1);
        jLabel1.setBounds(10, 0, 220, 30);

        tbl_HoaDonCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SẢN PHẨM", "TÊN SẢN PHẨM", "SỐ LƯỢNG", "ĐƠN GIÁ", "ĐƠN GIÁ KHI GIẢM"
            }
        ));
        tbl_HoaDonCT.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_HoaDonCT.setRowHeight(20);
        jScrollPane2.setViewportView(tbl_HoaDonCT);

        panelBorder2.add(jScrollPane2);
        jScrollPane2.setBounds(0, 30, 990, 220);

        panelGradiente1.add(panelBorder2);
        panelBorder2.setBounds(10, 380, 990, 250);

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

    private void tbl_hoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hoadonMouseClicked
        // TODO add your handling code here:
        loatdate2();
    }//GEN-LAST:event_tbl_hoadonMouseClicked

    private void txt_tkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tkMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_txt_tkMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if (txt_tk.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "bạn chưa nhập id cần tìm");
            return;
        }
        if (hoaDonService.TimID(txt_tk.getText()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "id này không có trong danh sách");
            return;
        }
        defaultTableModel = (DefaultTableModel) tbl_hoadon.getModel();

        defaultTableModel.setRowCount(0);
        int stt = 1;
        for (HoaDonViewModel x : hoaDonService.TimID( txt_tk.getText())) {
            defaultTableModel.addRow(new Object[]{
                stt,
                x.getMa(),
                x.getUs().getTen(),
                x.getKh().getTen(),
                x.getMa(),
                x.getNgayTao(),
                x.getNgayThanhToan(),
                x.getTinhTrang()== 1 ? "chưa thanh toán" : "đã thanh toán",});
            stt++;
        }
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo_nam;
    private javax.swing.JComboBox<String> cbo_thang;
    private javax.swing.JComboBox<String> cbo_trangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelBorder panelBorder3;
    private swing.PanelGradiente panelGradiente1;
    private javax.swing.JTable tbl_HoaDonCT;
    private javax.swing.JTable tbl_hoadon;
    private swing.SearchText txt_tk;
    // End of variables declaration//GEN-END:variables
}
