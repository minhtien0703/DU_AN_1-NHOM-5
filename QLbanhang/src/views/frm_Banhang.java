/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.sql.Date;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.HoaDon;
import models.SanPham;
import services.IHoaDonServiec;
import services.ISamPhamServiecs;
import services.imp.HoaDonServiec;
import services.imp.SanPhamServiec;
import viewmodels.GioHangViewModel;
import viewmodels.HoaDonCHiTietViewModel;
import viewmodels.HoaDonViewModel;
import viewmodels.SanPhamViewModel;

/**
 *
 * @author hungh
 */
public class frm_Banhang extends javax.swing.JPanel {

    private DefaultTableModel model;
    private DefaultTableModel modelGioHang;
    private ISamPhamServiecs sanISamPhamServiecs;
    private IHoaDonServiec hoaDonServiec;
    private List<GioHangViewModel> listGioHang = new ArrayList<>();
    private DecimalFormat format = new DecimalFormat("#.###");
    private Integer id;

    public frm_Banhang(Integer idNhanVien) {
        initComponents();
        model = new DefaultTableModel();
        modelGioHang = (DefaultTableModel) tb_gioHang.getModel();
        sanISamPhamServiecs = new SanPhamServiec();
        hoaDonServiec = new HoaDonServiec();

        id = idNhanVien;
        getListSP();
        getListHoaDon();
    }

    private void getListSP() {
        model = (DefaultTableModel) tb_sanPham.getModel();
        model.setRowCount(0);
        List<SanPhamViewModel> getList = sanISamPhamServiecs.getListSanPham();
        for (SanPhamViewModel x : getList) {
            model.addRow(new Object[]{
                x.getMa(),
                x.getTen(),
                x.getMauSac().getTen(),
                format.format(x.getKhuyenMai().getGiaTriGiam()),
                x.getKhuyenMai().getHinhThucKM(),
                x.getChatLieu().getTen(),
                x.getKichCo().getTen(),
                format.format(x.getGiaBan()),
                x.getSoLuongTon(),});
        }
    }

    private void getListGioHang() {
        modelGioHang = (DefaultTableModel) tb_gioHang.getModel();
        modelGioHang.setRowCount(0);
        for (GioHangViewModel x : listGioHang) {
            modelGioHang.addRow(new Object[]{
                x.getMaSP(),
                x.getTenSP(),
                x.getSoLuong(),
                format.format(x.getDonGia()),
                format.format(x.getThanhTien()),});
        }
    }

    private void getListGioHangHDCT(String MaHD) {
        modelGioHang = (DefaultTableModel) tb_gioHang.getModel();
        modelGioHang.setRowCount(0);
        List<HoaDonCHiTietViewModel> list = hoaDonServiec.getListHoaDonChiTiet(MaHD);
        if (list.isEmpty()) {
            return;
        }
        for (HoaDonCHiTietViewModel x : list) {
            modelGioHang.addRow(new Object[]{
                x.getSanPham().getMa(),
                x.getSanPham().getTen(),
                x.getSoluong(),
                format.format(x.getDonGia()),
                format.format(x.getThanhTien()),});
        }
    }

    private String getTrangThaiHD(int TrangThai) {
        if (TrangThai == 1) {
            return "chờ thanh Toán";
        }
        if (TrangThai == 2) {
            return "Đã thanh Toán";
        }
        if (TrangThai == 3) {
            return "Đã Huỷ";
        }
        return null;
    }

    private void getListHoaDon() {
        model = (DefaultTableModel) tb_hoaDon.getModel();
        model.setRowCount(0);
        List<HoaDonViewModel> getList = hoaDonServiec.getListHD(1);
        for (HoaDonViewModel x : getList) {
            model.addRow(new Object[]{
                x.getMa(),
                x.getNgayTao(),
                x.getUser().getTen(),
                getTrangThaiHD(x.getTrangThai())

            });
        }
    }

    private HoaDonViewModel inputHD() {
        HoaDonViewModel hd = new HoaDonViewModel();
        String Ma = "HD";
        Random random = new Random();
        hd.setMa(Ma + random.nextInt());
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        hd.setNgayTao(date);

        return hd;
    }

    private HoaDonCHiTietViewModel inputHDCT(Double DonGia, int SoLuong) {
        HoaDonCHiTietViewModel hdct = new HoaDonCHiTietViewModel();
        hdct.setDonGia(DonGia);
        hdct.setSoluong(SoLuong);

        return hdct;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        panelGradiente1 = new swing.PanelGradiente();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_sanPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        myButton3 = new swing.MyButton();
        panelBorder1 = new swing.PanelBorder();
        searchText1 = new swing.SearchText();
        jLabel3 = new javax.swing.JLabel();
        panelGradiente2 = new swing.PanelGradiente();
        myButton1 = new swing.MyButton();
        myButton2 = new swing.MyButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_gioHang = new javax.swing.JTable();
        panelGradiente3 = new swing.PanelGradiente();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_hoaDon = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        myButton4 = new swing.MyButton();
        myButton5 = new swing.MyButton();
        panelGradiente4 = new swing.PanelGradiente();
        jLabel5 = new javax.swing.JLabel();
        myTextField1 = new swing.MyTextField();
        jLabel7 = new javax.swing.JLabel();
        myTextField2 = new swing.MyTextField();
        jLabel8 = new javax.swing.JLabel();
        lbl_diem = new swing.MyTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        myTextField5 = new swing.MyTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        myButton6 = new swing.MyButton();
        myButton7 = new swing.MyButton();
        myButton8 = new swing.MyButton();
        lbl_thanhTien = new javax.swing.JLabel();
        lbl_tienThua = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_tongTien1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_giamGia1 = new javax.swing.JLabel();

        jMenuItem1.setText("Thêm");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setBackground(new java.awt.Color(204, 255, 255));
        setMinimumSize(new java.awt.Dimension(1010, 640));
        setName(""); // NOI18N
        setLayout(null);

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(255, 204, 255));

        tb_sanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Mằu Sắc", "Giảm Giá", "Hình Thức Giảm", "Chất Liệu", "Kích Cỡ", "Giá Bán", "Số Lượng"
            }
        ));
        tb_sanPham.setGridColor(new java.awt.Color(255, 255, 255));
        tb_sanPham.setRowHeight(20);
        tb_sanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_sanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_sanPham);

        panelGradiente1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 60, 560, 190);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Sản phẩm");
        panelGradiente1.add(jLabel1);
        jLabel1.setBounds(0, 0, 100, 15);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        panelGradiente1.add(jComboBox1);
        jComboBox1.setBounds(270, 20, 200, 30);

        myButton3.setBackground(new java.awt.Color(125, 224, 237));
        myButton3.setText("Lọc");
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });
        panelGradiente1.add(myButton3);
        myButton3.setBounds(490, 20, 70, 30);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        searchText1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchText1CaretUpdate(evt);
            }
        });
        panelBorder1.add(searchText1);
        searchText1.setBounds(10, 0, 180, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        panelBorder1.add(jLabel3);
        jLabel3.setBounds(194, 0, 40, 30);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(10, 20, 230, 30);

        add(panelGradiente1);
        panelGradiente1.setBounds(4, 375, 583, 420);

        panelGradiente2.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente2.setColorSecundario(new java.awt.Color(255, 204, 255));

        myButton1.setBackground(new java.awt.Color(125, 224, 237));
        myButton1.setText("Xóa");
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });
        panelGradiente2.add(myButton1);
        myButton1.setBounds(500, 50, 70, 30);

        myButton2.setBackground(new java.awt.Color(125, 224, 237));
        myButton2.setText("Clear");
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });
        panelGradiente2.add(myButton2);
        myButton2.setBounds(500, 100, 70, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Giỏ hàng");
        panelGradiente2.add(jLabel2);
        jLabel2.setBounds(0, 0, 55, 15);

        tb_gioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Số Lượng", "Đơn Giá", "Thành Tiền"
            }
        ));
        tb_gioHang.setComponentPopupMenu(jPopupMenu1);
        tb_gioHang.setGridColor(new java.awt.Color(255, 255, 255));
        tb_gioHang.setRowHeight(20);
        jScrollPane3.setViewportView(tb_gioHang);

        panelGradiente2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 20, 470, 150);

        add(panelGradiente2);
        panelGradiente2.setBounds(5, 188, 580, 176);

        panelGradiente3.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente3.setColorSecundario(new java.awt.Color(255, 204, 255));

        tb_hoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã HD", "Ngày Tạo", "Nhân Viên", "Trạng Thái"
            }
        ));
        tb_hoaDon.setGridColor(new java.awt.Color(255, 255, 255));
        tb_hoaDon.setRowHeight(20);
        tb_hoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_hoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_hoaDon);

        panelGradiente3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 460, 150);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Hóa đơn chờ");
        jLabel4.setToolTipText("");
        panelGradiente3.add(jLabel4);
        jLabel4.setBounds(0, 0, 90, 15);

        myButton4.setBackground(new java.awt.Color(125, 224, 237));
        myButton4.setText("Tạo hóa đơn");
        myButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton4ActionPerformed(evt);
            }
        });
        panelGradiente3.add(myButton4);
        myButton4.setBounds(482, 50, 99, 30);

        myButton5.setBackground(new java.awt.Color(125, 224, 237));
        myButton5.setText("Hủy");
        panelGradiente3.add(myButton5);
        myButton5.setBounds(485, 100, 90, 30);

        add(panelGradiente3);
        panelGradiente3.setBounds(5, 0, 583, 177);

        panelGradiente4.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente4.setColorSecundario(new java.awt.Color(255, 204, 255));
        panelGradiente4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Thanh toán");
        jLabel5.setToolTipText("");
        panelGradiente4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));
        panelGradiente4.add(myTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 250, 30));

        jLabel7.setText("Tên khách hàng");
        panelGradiente4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, 20));
        panelGradiente4.add(myTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 250, 30));

        jLabel8.setText("SĐT khách hàng");
        panelGradiente4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 250, 20));
        panelGradiente4.add(lbl_diem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 250, 30));

        jLabel9.setText("Điểm thưởng");
        panelGradiente4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, 20));

        jLabel10.setText("Hình thức thanh toán");
        panelGradiente4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 250, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        panelGradiente4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 250, 30));

        jLabel11.setText("Thành Tiền");
        panelGradiente4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 250, 20));
        panelGradiente4.add(myTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 250, 30));

        jLabel12.setText("Tiền khách đưa");
        panelGradiente4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 250, 20));

        jLabel13.setText("Ghi chú");
        panelGradiente4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 250, 20));

        jLabel14.setText("Tiền thừa");
        panelGradiente4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 250, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(3);
        jTextArea1.setTabSize(0);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jScrollPane4.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleDescription("");

        panelGradiente4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 250, 60));

        jCheckBox1.setBackground(new java.awt.Color(255, 204, 255));
        jCheckBox1.setText("In hóa đơn");
        panelGradiente4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, 100, -1));

        myButton6.setBackground(new java.awt.Color(125, 224, 237));
        myButton6.setForeground(new java.awt.Color(0, 51, 102));
        myButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/credit-card.png"))); // NOI18N
        myButton6.setText("Thanh toán");
        myButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        myButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton6ActionPerformed(evt);
            }
        });
        panelGradiente4.add(myButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 740, 250, 40));

        myButton7.setBackground(new java.awt.Color(125, 224, 237));
        myButton7.setText("Xác nhận");
        panelGradiente4.add(myButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 90, 30));

        myButton8.setBackground(new java.awt.Color(125, 224, 237));
        myButton8.setText("Sử dụng");
        myButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton8ActionPerformed(evt);
            }
        });
        panelGradiente4.add(myButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 90, 30));

        lbl_thanhTien.setForeground(new java.awt.Color(255, 51, 51));
        panelGradiente4.add(lbl_thanhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 250, -1));

        lbl_tienThua.setText("jLabel6");
        panelGradiente4.add(lbl_tienThua, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 240, -1));

        jLabel15.setText("Tổng tiền");
        panelGradiente4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 250, 20));

        lbl_tongTien1.setForeground(new java.awt.Color(255, 51, 51));
        panelGradiente4.add(lbl_tongTien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 250, -1));

        jLabel16.setText("Giảm Giá");
        panelGradiente4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 250, 20));

        lbl_giamGia1.setForeground(new java.awt.Color(255, 51, 51));
        lbl_giamGia1.setText("0.0");
        panelGradiente4.add(lbl_giamGia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 250, -1));

        add(panelGradiente4);
        panelGradiente4.setBounds(593, 0, 412, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void tb_sanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_sanPhamMouseClicked
        int row = tb_sanPham.getSelectedRow();
        int rowHD = tb_hoaDon.getSelectedRow();
        if (row < 0) {
            return;
        }
        if (rowHD < 0) {
            JOptionPane.showMessageDialog(this, "chọn vào sản phẩm bạn muốn mua");
            return;
        }
        try {

            int NhapSoLuong = Integer.parseInt(JOptionPane.showInputDialog(this, "nhap so luong"));
            String MaSP = tb_sanPham.getValueAt(row, 0).toString();
            String TenSP = tb_sanPham.getValueAt(row, 1).toString();
            int SoLuong = Integer.parseInt(tb_sanPham.getValueAt(row, 8).toString());
            Double DonGia = Double.parseDouble(tb_sanPham.getValueAt(row, 7).toString());
            Double GiamGia = Double.parseDouble(tb_sanPham.getValueAt(row, 3).toString());
            String hinhThucGiamGia = tb_sanPham.getValueAt(row, 4).toString();
            List<HoaDonCHiTietViewModel> listh = hoaDonServiec.getListHoaDonChiTiet(tb_hoaDon.getValueAt(rowHD, 0).toString());
            if (SoLuong >= NhapSoLuong) {
                for (HoaDonCHiTietViewModel x : listh) {
                    if (x.getSanPham().getMa().equals(MaSP)) {
                        JOptionPane.showMessageDialog(this, "sản Phẩm Đã Có Trên Giỏ Hàng");
                        return;
                    }
                }

                listGioHang.add(new GioHangViewModel(MaSP, TenSP, NhapSoLuong, DonGia, GiamGia, hinhThucGiamGia));
                getListGioHang();

                int kq = SoLuong - NhapSoLuong;
                sanISamPhamServiecs.updateSoLuongSP(MaSP, kq);
                List<SanPhamViewModel> list = sanISamPhamServiecs.getListSanPham();
                list.clear();
                getListSP();
                Double tongPT = 0.0;
                Double tongVN = 0.0;
                Double tongTien = 0.0;
                Double giam = Double.parseDouble(lbl_giamGia1.getText());
                int count = 0;
                for (GioHangViewModel x : listGioHang) {
                    tongTien = tongTien + x.getThanhTien();
                    lbl_tongTien1.setText(String.valueOf(tongTien));
                    if (tb_gioHang.getValueAt(count, 0).equals(MaSP) && x.getHinhThucGiamGia().equals("%")) {
                        tongPT = x.getThanhTien() * x.getGiamGia() / 100;
                        lbl_giamGia1.setText(String.valueOf(giam += tongPT));
                        lbl_giamGia1.setText(String.valueOf(giam));
                    } else {
                        tongVN = x.getGiamGia();
                        lbl_giamGia1.setText(String.valueOf(giam + tongVN));
                    }
                    count++;

                }
                Double ThanhTien = Double.parseDouble(lbl_tongTien1.getText()) - Double.parseDouble(lbl_giamGia1.getText());
                lbl_thanhTien.setText(String.valueOf(format.format(ThanhTien)));
            } else if (SoLuong < NhapSoLuong) {
                JOptionPane.showMessageDialog(this, "san pham không đủ ");
                return;

            }
            List<HoaDonViewModel> listHoaDon = hoaDonServiec.getListHD(1);
            for (HoaDonViewModel x : listHoaDon) {
                if (tb_hoaDon.getValueAt(rowHD, 0).toString().equals(x.getMa())) {
                    HoaDonCHiTietViewModel hdct = inputHDCT(DonGia, NhapSoLuong);
                    hoaDonServiec.saveHDCT(hdct, MaSP, x.getMa());
                    return;

                }
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_tb_sanPhamMouseClicked

    private void myButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton6ActionPerformed

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton4ActionPerformed
        HoaDonViewModel hoaDon = inputHD();
        Integer add = hoaDonServiec.saveHD(hoaDon, id);
        if (add > 0) {
            System.out.println("thêm thành công");
            List<HoaDonViewModel> list = hoaDonServiec.getListHD(1);
            list.clear();
            getListHoaDon();
        } else {
            System.out.println("thêm thất bại");
        }
    }//GEN-LAST:event_myButton4ActionPerformed

    private void myButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton8ActionPerformed
        double tongTien = Double.parseDouble(lbl_thanhTien.getText());
        String diem = lbl_diem.getText() + "0000";
        double suDungDien = Double.parseDouble(diem);

        double thanhTien = tongTien - suDungDien;

        lbl_thanhTien.setText(String.valueOf(thanhTien));
    }//GEN-LAST:event_myButton8ActionPerformed

    private void tb_hoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_hoaDonMouseClicked
        int row = tb_hoaDon.getSelectedRow();
        if (row < 0) {
            return;
        }
        listGioHang.clear();
        String MaHD = tb_hoaDon.getValueAt(row, 0).toString();
        try {
            lbl_tongTien1.setText(String.valueOf(0));
            lbl_giamGia1.setText(String.valueOf(0));
            lbl_thanhTien.setText(String.valueOf(0));

            getListGioHangHDCT(MaHD);

            Double tongPT = 0.0;
            Double tongVN = 0.0;
            Double tongTien = 0.0;
            Double giam = Double.parseDouble(lbl_giamGia1.getText());
            int count = 0;
            List<HoaDonCHiTietViewModel> list = hoaDonServiec.getListHoaDonChiTiet(MaHD);

            for (HoaDonCHiTietViewModel x : list) {
                tongTien = tongTien + x.getThanhTien();
                lbl_tongTien1.setText(String.valueOf(tongTien));

                List<SanPhamViewModel> listSanPham = sanISamPhamServiecs.getListSanPham();

                if (tb_gioHang.getValueAt(count, 0).equals(x.getSanPham().getMa()) && x.getSanPham().getKhuenMai().getHinhThucKM().equals("%")) {
                    tongPT = x.getThanhTien() * x.getSanPham().getKhuenMai().getGiaTriGiam() / 100;
                    lbl_giamGia1.setText(String.valueOf(giam += tongPT));
                    lbl_giamGia1.setText(String.valueOf(giam));
                } else {
                    tongVN = x.getSanPham().getKhuenMai().getGiaTriGiam();
                    lbl_giamGia1.setText(String.valueOf(giam += tongVN));
                }

                count++;

            }
            Double ThanhTien = Double.parseDouble(lbl_tongTien1.getText()) - Double.parseDouble(lbl_giamGia1.getText());
            lbl_thanhTien.setText(String.valueOf(format.format(ThanhTien)));
        } catch (Exception e) {
            lbl_tongTien1.setText(String.valueOf(0));
            lbl_giamGia1.setText(String.valueOf(0));
            lbl_thanhTien.setText(String.valueOf(0));
        }
    }//GEN-LAST:event_tb_hoaDonMouseClicked

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        int rowSP = tb_gioHang.getSelectedRow();
        int rowHD = tb_hoaDon.getSelectedRow();
        if (rowSP < 0) {
            JOptionPane.showMessageDialog(this, "chọn 1 sản phẩm trong giỏ hàng để xoá");
            return;
        }
        if (rowHD < 0) {
            JOptionPane.showMessageDialog(this, "chọn Hoá đơn bạn muốn xoá sản phẩm đấy");
            return;
        }

        String MaSP = tb_gioHang.getValueAt(rowSP, 0).toString();
        String MaHD = tb_hoaDon.getValueAt(rowHD, 0).toString();
        Integer soLuong = Integer.parseInt(tb_gioHang.getValueAt(rowSP, 2).toString());
        Integer idSP = sanISamPhamServiecs.getIdSanPham(MaSP);
        Integer idHd = hoaDonServiec.getIdHD(MaHD);
        Integer isDelete = hoaDonServiec.deleteSanPham(idHd, idSP);
        List<SanPhamViewModel> list = sanISamPhamServiecs.getListSanPham();
        for (SanPhamViewModel x : list) {
            if (MaSP.equals(x.getMa())) {
                sanISamPhamServiecs.updateSoLuongSP(MaSP, x.getSoLuongTon() + soLuong);
                list.clear();
                getListSP();
                getListGioHangHDCT(MaHD);
                break;

            }
        }
         listGioHang.clear();


    }//GEN-LAST:event_myButton1ActionPerformed

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
        int rowHD = tb_hoaDon.getSelectedRow();
        int rowGH = tb_gioHang.getSelectedRow();
        if (rowHD < 0) {
            return;
        }

        String MaHD = tb_hoaDon.getValueAt(rowHD, 0).toString();
        int count = 0;
        List<SanPhamViewModel> list = sanISamPhamServiecs.getListSanPham();
        List<HoaDonCHiTietViewModel> listHD = hoaDonServiec.getListHoaDonChiTiet(MaHD);
        for (HoaDonCHiTietViewModel gioHang : listHD) {
            GioHangViewModel hg = new GioHangViewModel();
            hg.setMaSP(tb_gioHang.getValueAt(count, 0).toString());
            hg.setSoLuong(Integer.parseInt(tb_gioHang.getValueAt(count, 2).toString()));
            hg.setTenSP(tb_gioHang.getValueAt(count, 1).toString());
            hg.setDonGia(Double.parseDouble(tb_gioHang.getValueAt(count, 3).toString()));

            count++;
            listGioHang.add(hg);
        }
        Integer idHd = hoaDonServiec.getIdHD(MaHD);
        hoaDonServiec.clearSanPhamTrenGioHang(idHd);
        for (GioHangViewModel x : listGioHang) {
            for (SanPhamViewModel sanPham : list) {
                if (x.getMaSP().equals(sanPham.getMa())) {
                    sanISamPhamServiecs.updateSoLuongSP(sanPham.getMa(), sanPham.getSoLuongTon() + x.getSoLuong());
                    getListGioHangHDCT(MaHD);

                }
            }

        }
        list.clear();
        getListSP();
        listGioHang.clear();
        lbl_tongTien1.setText(String.valueOf(0));
        lbl_giamGia1.setText(String.valueOf(0));
        lbl_thanhTien.setText(String.valueOf(0));

    }//GEN-LAST:event_myButton2ActionPerformed

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed

    }//GEN-LAST:event_myButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int rowSP = tb_gioHang.getSelectedRow();
        int rowHD = tb_hoaDon.getSelectedRow();
        if (rowSP < 0) {
            return;
        }
        if (rowHD < 0) {
            return;
        }
        String MaSP = tb_gioHang.getValueAt(rowSP, 0).toString();
        String MaHD = tb_hoaDon.getValueAt(rowHD, 0).toString();

        List<SanPhamViewModel> list = sanISamPhamServiecs.getListSanPham();
//        List<HoaDonCHiTietViewModel> getList = hoaDonServiec.getListHoaDonChiTiet(MaHD);
        try {
            int NhapSoLuong = Integer.parseInt(JOptionPane.showInputDialog(this, "nhap so luong"));
            for (SanPhamViewModel x : list) {
                if (MaSP.equals(x.getMa())) {
                    if (x.getSoLuongTon() >= NhapSoLuong) {

                        Integer isupdate = hoaDonServiec.updateSoLuongGioHang(NhapSoLuong, MaSP, MaHD);
                        int updateSoLuong = x.getSoLuongTon() + Integer.parseInt(tb_gioHang.getValueAt(rowSP, 2).toString());
                        getListGioHangHDCT(MaHD);
                        sanISamPhamServiecs.updateSoLuongSP(x.getMa(), updateSoLuong - NhapSoLuong);
                        list.clear();
                        getListSP();
                        return;
                    } else if (x.getSoLuongTon() < NhapSoLuong) {
                        JOptionPane.showMessageDialog(this, "số Lượng sản phẩm không đủ");
                        return;
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "vui lòng nhập nó không nhập kí tự");
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void searchText1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchText1CaretUpdate
        String Ten = searchText1.getText().trim();
        if (Ten.isEmpty()) {
            List<SanPhamViewModel> list = sanISamPhamServiecs.getListSanPham();
            list.clear();
            getListSP();
            return;
        }
        model = (DefaultTableModel) tb_sanPham.getModel();
        model.setRowCount(0);
        List<SanPham> getList = sanISamPhamServiecs.seachSanPham(Ten);
        for (SanPham x : getList) {
            model.addRow(new Object[]{
                x.getMa(),
                x.getTen(),
                x.getMauSac().getTen(),
                format.format(x.getKhuenMai().getGiaTriGiam()),
                x.getKhuenMai().getHinhThucKM(),
                x.getChatLieu().getTen(),
                x.getKichCo().getTen(),
                format.format(x.getGiaBan()),
                x.getSoLuongTon(),});
        }

    }//GEN-LAST:event_searchText1CaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private swing.MyTextField lbl_diem;
    private javax.swing.JLabel lbl_giamGia1;
    private javax.swing.JLabel lbl_thanhTien;
    private javax.swing.JLabel lbl_tienThua;
    private javax.swing.JLabel lbl_tongTien1;
    private swing.MyButton myButton1;
    private swing.MyButton myButton2;
    private swing.MyButton myButton3;
    private swing.MyButton myButton4;
    private swing.MyButton myButton5;
    private swing.MyButton myButton6;
    private swing.MyButton myButton7;
    private swing.MyButton myButton8;
    private swing.MyTextField myTextField1;
    private swing.MyTextField myTextField2;
    private swing.MyTextField myTextField5;
    private swing.PanelBorder panelBorder1;
    private swing.PanelGradiente panelGradiente1;
    private swing.PanelGradiente panelGradiente2;
    private swing.PanelGradiente panelGradiente3;
    private swing.PanelGradiente panelGradiente4;
    private swing.SearchText searchText1;
    private javax.swing.JTable tb_gioHang;
    private javax.swing.JTable tb_hoaDon;
    private javax.swing.JTable tb_sanPham;
    // End of variables declaration//GEN-END:variables
}
