/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.KhachHang;
import services.KhachHangSV;
import services.imp.khahangsvImpl;

/**
 *
 * @author hungh
 */
public class frm_Khachhang extends javax.swing.JPanel {

    DefaultTableModel defaultTableModel = new DefaultTableModel();
    List<KhachHang> listKhachHang;
    KhachHangSV KH = new khahangsvImpl();

    public frm_Khachhang() {
        initComponents();
        listKhachHang = KH.getall();
        showTable(listKhachHang);
    }

    public void showTable(List<KhachHang> list) {
        defaultTableModel = (DefaultTableModel) TB_bang.getModel();
        defaultTableModel.setRowCount(0);
        for (KhachHang khachHang01 : list) {
            defaultTableModel.addRow(khachHang01.toDataRow());
        }
    }

    private KhachHang getData() {
        KhachHang cv = new KhachHang();
        cv.setTen(txt_Ten.getText());
        cv.setTendem(txt_tenDem.getText());
        cv.setHo(txt_Ho.getText());
        int gt;
        if (rd_Nam.isSelected()) {
            gt = 0;
        } else {
            gt = 1;
        }
        cv.setGioitinh(gt);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        cv.setNgaysinh(sdf.format(date_ngaysinh.getDate()));
        cv.setSdt(txt_sdt.getText());
        cv.setEmail(txt_email.getText());
        cv.setDiemthuong(Integer.parseInt(txt_diemthuong.getText()));

        return cv;
    }

    public int layid() {
        Integer row = TB_bang.getSelectedRow();
        int id = (int) TB_bang.getValueAt(row, 0);
        return id;

    }

    public boolean check() {
        if (txt_Ten.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên!");
            return false;
        }
        if (txt_tenDem.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên Đệm!");
            return false;
        }
        if (txt_Ho.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Họ!");
            return false;
        }
        if (txt_sdt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập SĐT!");
            return false;
        }
        if (txt_email.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Email!");
            return false;
        }
        if (txt_diemthuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập điểm thưởng!");
            return false;
        }

        return true;

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
        txt_Ten = new swing.MyTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_tenDem = new swing.MyTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Ho = new swing.MyTextField();
        jLabel8 = new javax.swing.JLabel();
        rd_nu = new javax.swing.JRadioButton();
        rd_Nam = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_sdt = new swing.MyTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_email = new swing.MyTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_diemthuong = new swing.MyTextField();
        btn_LamMoi = new swing.MyButton();
        btn_them = new swing.MyButton();
        Btn_capNhat = new swing.MyButton();
        btn_xoa = new swing.MyButton();
        date_ngaysinh = new com.toedter.calendar.JDateChooser();
        panelBorder2 = new swing.PanelBorder();
        panelBorder3 = new swing.PanelBorder();
        txt_timKiem = new swing.SearchText();
        Btn_timKiem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_bang = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1010, 640));
        setMinimumSize(new java.awt.Dimension(1010, 640));
        setPreferredSize(new java.awt.Dimension(1010, 640));

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(255, 204, 255));

        panelBorder1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tên");
        panelBorder1.add(jLabel1);
        jLabel1.setBounds(90, 10, 210, 20);
        panelBorder1.add(txt_Ten);
        txt_Ten.setBounds(90, 30, 210, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tên đệm");
        panelBorder1.add(jLabel5);
        jLabel5.setBounds(90, 70, 210, 20);
        panelBorder1.add(txt_tenDem);
        txt_tenDem.setBounds(90, 90, 210, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Họ");
        panelBorder1.add(jLabel6);
        jLabel6.setBounds(90, 130, 210, 20);
        panelBorder1.add(txt_Ho);
        txt_Ho.setBounds(90, 150, 210, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Giới tính");
        panelBorder1.add(jLabel8);
        jLabel8.setBounds(90, 200, 48, 30);

        rd_nu.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rd_nu);
        rd_nu.setText("Nữ");
        panelBorder1.add(rd_nu);
        rd_nu.setBounds(230, 200, 60, 30);

        rd_Nam.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rd_Nam);
        rd_Nam.setSelected(true);
        rd_Nam.setText("Nam");
        rd_Nam.setToolTipText("");
        rd_Nam.setDoubleBuffered(true);
        panelBorder1.add(rd_Nam);
        rd_Nam.setBounds(157, 200, 60, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ngày sinh");
        panelBorder1.add(jLabel2);
        jLabel2.setBounds(390, 10, 210, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Số điện thoại");
        panelBorder1.add(jLabel7);
        jLabel7.setBounds(390, 70, 210, 20);
        panelBorder1.add(txt_sdt);
        txt_sdt.setBounds(390, 90, 210, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("E-mail");
        panelBorder1.add(jLabel9);
        jLabel9.setBounds(390, 130, 210, 20);
        panelBorder1.add(txt_email);
        txt_email.setBounds(390, 150, 210, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Điểm thưởng");
        panelBorder1.add(jLabel10);
        jLabel10.setBounds(390, 190, 210, 20);
        panelBorder1.add(txt_diemthuong);
        txt_diemthuong.setBounds(390, 210, 210, 30);

        btn_LamMoi.setBackground(new java.awt.Color(125, 224, 237));
        btn_LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btn_LamMoi.setText("Làm Mới");
        btn_LamMoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_LamMoi);
        btn_LamMoi.setBounds(660, 50, 120, 30);

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
        btn_them.setBounds(820, 50, 120, 30);

        Btn_capNhat.setBackground(new java.awt.Color(125, 224, 237));
        Btn_capNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        Btn_capNhat.setText("Cập nhật");
        Btn_capNhat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_capNhatActionPerformed(evt);
            }
        });
        panelBorder1.add(Btn_capNhat);
        Btn_capNhat.setBounds(660, 130, 120, 30);

        btn_xoa.setBackground(new java.awt.Color(125, 224, 237));
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tay.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_xoa);
        btn_xoa.setBounds(820, 130, 120, 30);

        date_ngaysinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        date_ngaysinh.setDateFormatString("dd/MM/yyyy");
        panelBorder1.add(date_ngaysinh);
        date_ngaysinh.setBounds(390, 30, 210, 30);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(10, 0, 990, 260);

        panelBorder2.setBackground(new java.awt.Color(204, 204, 255));

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder3.add(txt_timKiem);
        txt_timKiem.setBounds(10, 0, 220, 40);

        Btn_timKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        panelBorder3.add(Btn_timKiem);
        Btn_timKiem.setBounds(240, 0, 40, 40);

        panelBorder2.add(panelBorder3);
        panelBorder3.setBounds(640, 10, 280, 40);

        TB_bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên", "Tên Đệm", "Họ", "Giới Tính", "Ngày Sinh", "SĐT", "Email", "Điểm Thưởng"
            }
        ));
        TB_bang.setGridColor(new java.awt.Color(255, 255, 255));
        TB_bang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_bangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TB_bang);

        panelBorder2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 990, 300);

        panelGradiente1.add(panelBorder2);
        panelBorder2.setBounds(10, 270, 990, 360);

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
        if (check()) {
            JOptionPane.showMessageDialog(this, KH.add(getData()));
            listKhachHang = KH.getall();
            showTable(listKhachHang);
        }

    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        txt_Ten.setText("");
        txt_tenDem.setText("");
        txt_Ho.setText("");
        date_ngaysinh.setCalendar(null);
        txt_sdt.setText("");
        txt_email.setText("");
        txt_diemthuong.setText("");

    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void Btn_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_capNhatActionPerformed
        int row = TB_bang.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "cần chọn khách hàng để cập nhật");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật không?") == JOptionPane.YES_OPTION) {
            int id = layid();

            JOptionPane.showMessageDialog(this, KH.update(id, getData()));
            listKhachHang = KH.getall();
            showTable(listKhachHang);
        }
    }//GEN-LAST:event_Btn_capNhatActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int row = TB_bang.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "cần chọn khách hàng để xoá");

            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?") == JOptionPane.YES_OPTION) {
            int id = layid();

            JOptionPane.showMessageDialog(this, KH.delete(id));
            listKhachHang = KH.getall();
            showTable(listKhachHang);
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void TB_bangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_bangMouseClicked
        try {
            int row = TB_bang.getSelectedRow();
            KhachHang kh = listKhachHang.get(row);
            txt_Ten.setText(kh.getTen());
            txt_tenDem.setText(kh.getTendem());
            txt_Ho.setText(kh.getHo());
            String gt = (TB_bang.getValueAt(row, 4).toString());;
            if (gt == "Nam") {
                rd_Nam.setSelected(true);
            } else {
                rd_nu.setSelected(true);
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            date_ngaysinh.setDate(sdf.parse(kh.getNgaysinh()));
            txt_sdt.setText(kh.getSdt());
            txt_email.setText(kh.getEmail());
            txt_diemthuong.setText(String.valueOf(kh.getDiemthuong()));

        } catch (ParseException ex) {
            Logger.getLogger(frm_Khachhang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TB_bangMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton Btn_capNhat;
    private javax.swing.JLabel Btn_timKiem;
    private javax.swing.JTable TB_bang;
    private swing.MyButton btn_LamMoi;
    private swing.MyButton btn_them;
    private swing.MyButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser date_ngaysinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelBorder panelBorder3;
    private swing.PanelGradiente panelGradiente1;
    private javax.swing.JRadioButton rd_Nam;
    private javax.swing.JRadioButton rd_nu;
    private swing.MyTextField txt_Ho;
    private swing.MyTextField txt_Ten;
    private swing.MyTextField txt_diemthuong;
    private swing.MyTextField txt_email;
    private swing.MyTextField txt_sdt;
    private swing.MyTextField txt_tenDem;
    private swing.SearchText txt_timKiem;
    // End of variables declaration//GEN-END:variables
}
