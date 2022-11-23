/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.KhuyenMai;
import repositorys.IKhuyenmaiRepository;
import repositorys.imp.KhuyenmaiReponsitory;
import services.IKhuyenmaiService;
import services.imp.KhuyenmaiService;
import viewmodels.KhuyenmaiViewmodel;
/**
 *
 * @author hungh
 */
public class frm_Khuyenmai extends javax.swing.JPanel {
    DefaultTableModel defaultTableModel;
    private IKhuyenmaiService khuyenmaiService;
    /**
     * Creates new form khuyenmai
     */
    public frm_Khuyenmai() {
        initComponents();
        defaultTableModel = (DefaultTableModel) tb_khuyenmai.getModel();
        khuyenmaiService = new KhuyenmaiService();
        LoadData();
    }
    void LoadData() {
        defaultTableModel.setRowCount(0);
        int stt = 1;
        for (KhuyenmaiViewmodel x : khuyenmaiService.GetALL()) {
            defaultTableModel.addRow(new Object[]{
                stt,
                x.getTenKM(),
                x.getNgayBatDau(),
                x.getNgayKetThuc(),
                String.format("%.0f", x.getGiaTriGiam()) + " " + x.getHinhThucKM()
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
        rd_VND = new javax.swing.JRadioButton();
        rd_phantram = new javax.swing.JRadioButton();
        date_BD = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        date_KT = new com.toedter.calendar.JDateChooser();
        txt_giatrgiam = new swing.MyTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_them = new swing.MyButton();
        btn_sua = new swing.MyButton();
        btn_clear = new swing.MyButton();
        btn_xoa = new swing.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_khuyenmai = new javax.swing.JTable();
        panelBorder2 = new swing.PanelBorder();
        searchText2 = new swing.SearchText();
        lbl_timkiem = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateTK_KT = new com.toedter.calendar.JDateChooser();
        dateTK_BD = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

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
        jLabel4.setBounds(60, 160, 130, 30);

        rd_VND.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rd_VND);
        rd_VND.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd_VND.setText("VND");
        panelBorder1.add(rd_VND);
        rd_VND.setBounds(200, 160, 50, 30);

        rd_phantram.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(rd_phantram);
        rd_phantram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd_phantram.setText("%");
        panelBorder1.add(rd_phantram);
        rd_phantram.setBounds(270, 160, 50, 30);

        date_BD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        date_BD.setDateFormatString("dd/MM/yyyy");
        panelBorder1.add(date_BD);
        date_BD.setBounds(390, 30, 260, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Ngày kết thúc");
        panelBorder1.add(jLabel6);
        jLabel6.setBounds(60, 80, 260, 20);

        date_KT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        date_KT.setDateFormatString("dd/MM/yyyy");
        panelBorder1.add(date_KT);
        date_KT.setBounds(60, 100, 260, 40);
        panelBorder1.add(txt_giatrgiam);
        txt_giatrgiam.setBounds(390, 100, 260, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Giá trị giảm");
        panelBorder1.add(jLabel8);
        jLabel8.setBounds(390, 80, 260, 20);

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

        btn_sua.setBackground(new java.awt.Color(125, 224, 237));
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        btn_sua.setText("Cập nhật");
        btn_sua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_sua);
        btn_sua.setBounds(840, 90, 120, 40);

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
        btn_xoa.setBounds(840, 160, 120, 40);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(10, 0, 990, 300);

        tb_khuyenmai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên khuyến mãi", "Ngày bắt đầu", "Ngày kết thúc", "Giá trị giảm"
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
        panelBorder2.add(searchText2);
        searchText2.setBounds(10, 0, 240, 40);

        lbl_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        lbl_timkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_timkiemMouseClicked(evt);
            }
        });
        panelBorder2.add(lbl_timkiem);
        lbl_timkiem.setBounds(250, 0, 40, 40);

        panelGradiente1.add(panelBorder2);
        panelBorder2.setBounds(660, 310, 290, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Ngày kết thúc");
        panelGradiente1.add(jLabel7);
        jLabel7.setBounds(370, 300, 260, 20);

        dateTK_KT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        dateTK_KT.setDateFormatString("dd/MM/yyyy");
        panelGradiente1.add(dateTK_KT);
        dateTK_KT.setBounds(370, 320, 260, 40);

        dateTK_BD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        dateTK_BD.setDateFormatString("dd/MM/yyyy");
        panelGradiente1.add(dateTK_BD);
        dateTK_BD.setBounds(50, 320, 260, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ngày bắt đầu");
        panelGradiente1.add(jLabel5);
        jLabel5.setBounds(50, 300, 260, 20);

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
        try {
            if (txt_tenkm.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên khuyến mãi");
                return ;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            if (date_BD.getDate()==null) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày bắt đầu");
                return;
            }
        } catch (Exception e) {
        }
        try {
            if (date_KT.getDate()==null) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày kết thúc");
                return;
            }
        } catch (Exception e) {
        }
        try {
            if (txt_giatrgiam.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập giá trị giảm");
                return;
            }
        } catch (Exception e) {
        }
        try {
            if (date_KT.getDate().before(date_BD.getDate())) {
                JOptionPane.showMessageDialog(this, "Ngày kết thúc phải lớn hơn ngày bắt đầu");
                return;
            }
        } catch (Exception e) {
        }
        if (khuyenmaiService.checktrung(txt_tenkm.getText())!= null) {
            JOptionPane.showMessageDialog(this, "Tên khuyến mãi đã tồn tại");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?")==JOptionPane.YES_OPTION) {
            KhuyenmaiViewmodel km = new KhuyenmaiViewmodel();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(date_BD.getDate());
            String date2 = sdf.format(date_KT.getDate());
            km.setNgayBatDau(date1);
            km.setNgayKetThuc(date2);
            km.setTenKM(txt_tenkm.getText());
            if (rd_VND.isSelected()) {
                km.setHinhThucKM("VND");
            }else if (rd_phantram.isSelected()) {
                km.setHinhThucKM("%");
            }
            km.setGiaTriGiam(Double.parseDouble(txt_giatrgiam.getText()));
            khuyenmaiService.Add(km);
            LoadData();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        int r = tb_khuyenmai.getSelectedRow();
        IKhuyenmaiRepository repository= new KhuyenmaiReponsitory();
        List<KhuyenMai> lst = repository.GetAll();
        if (r<0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng nào");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?")==JOptionPane.YES_OPTION) {
            KhuyenmaiViewmodel km = new KhuyenmaiViewmodel();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(date_BD.getDate());
            String date2 = sdf.format(date_KT.getDate());
            km.setNgayBatDau(date1);
            km.setNgayKetThuc(date2);
            km.setTenKM(txt_tenkm.getText());
            if (rd_VND.isSelected()) {
                km.setHinhThucKM("VND");
            }else if (rd_phantram.isSelected()) {
                km.setHinhThucKM("%");
            }
            km.setGiaTriGiam(Double.parseDouble(txt_giatrgiam.getText()));
//            if (khuyenmaiService.checktrung(txt_tenkm.getText()) != null) {
//                JOptionPane.showMessageDialog(this, "Tên khuyến mãi đã tồn tại");
//                return;
//            }
            if (date_KT.getDate().before(date_BD.getDate())) {
                JOptionPane.showMessageDialog(this, "Ngày kết thúc phải lớn hơn ngày bắt đầu");
                return;
            }
            khuyenmaiService.Update(km,lst.get(r).getID());
            LoadData();
            JOptionPane.showMessageDialog(this, "Sửa thành công");
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int r = tb_khuyenmai.getSelectedRow();
        IKhuyenmaiRepository repository= new KhuyenmaiReponsitory();
        List<KhuyenMai> lst = repository.GetAll();
        if (r<0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng nào");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?")==JOptionPane.YES_OPTION) {
            khuyenmaiService.Delete(lst.get(r).getID());
            LoadData();
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_tenkm.setText("");
        txt_giatrgiam.setText("");
        date_BD.setCalendar(null);
        date_KT.setCalendar(null);
        dateTK_BD.setCalendar(null);
        dateTK_KT.setCalendar(null);
        buttonGroup1.clearSelection();
        LoadData();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void tb_khuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_khuyenmaiMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            int r = tb_khuyenmai.getSelectedRow();
            txt_tenkm.setText((String) tb_khuyenmai.getValueAt(r, 1));
            txt_giatrgiam.setText((String) tb_khuyenmai.getValueAt(r, 4));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = sdf.parse((String) tb_khuyenmai.getValueAt(r, 2));
            Date date2 = sdf.parse((String) tb_khuyenmai.getValueAt(r, 3));
            date_BD.setDate(date1);
            date_KT.setDate(date2);
            String hinhthuc=tb_khuyenmai.getValueAt(r, 4).toString();
            if (hinhthuc.contains("%")) {
                rd_phantram.setSelected(true);
            }else if (hinhthuc.contains("VND")) {
                rd_VND.setSelected(true);
            }
        } catch (ParseException ex) {
//            Logger.getLogger(FrmKhuyenmai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_khuyenmaiMouseClicked

    private void lbl_timkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_timkiemMouseClicked
        // TODO add your handling code here:
        if (dateTK_BD.getDate()==null && dateTK_KT.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày bắt đầu hoặc ngày kết thúc để tìm kiếm");
            return;      
        }
        if (dateTK_BD.getDate()!=null && dateTK_KT.getDate()==null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date3 = sdf.format(dateTK_BD.getDate());
            if (khuyenmaiService.GetOnebyBD(date3).isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có khuyến mãi nào");
                return;
            }
            defaultTableModel.setRowCount(0);
            int stt = 1;
            for (KhuyenmaiViewmodel x : khuyenmaiService.GetOnebyBD(date3)) {
                defaultTableModel.addRow(new Object[]{
                    stt,
                    x.getTenKM(),
                    x.getNgayBatDau(),
                    x.getNgayKetThuc(),
                    String.format("%.0f", x.getGiaTriGiam()) + " " + x.getHinhThucKM()
                });
                stt++;
            }
            return;
        }
        if (dateTK_BD.getDate()==null && dateTK_KT.getDate()!=null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date4 = sdf.format(dateTK_KT.getDate());
            if (khuyenmaiService.GetOnebyKT(date4).isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có khuyến mãi nào");
                return;
            }
            defaultTableModel.setRowCount(0);
            int stt = 1;
            for (KhuyenmaiViewmodel x : khuyenmaiService.GetOnebyKT(date4)) {
                defaultTableModel.addRow(new Object[]{
                    stt,
                    x.getTenKM(),
                    x.getNgayBatDau(),
                    x.getNgayKetThuc(),
                    String.format("%.0f", x.getGiaTriGiam()) + " " + x.getHinhThucKM()
                });
                stt++;
            }
            return;
        }
        if (dateTK_BD.getDate()!=null && dateTK_KT.getDate()!=null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date3 = sdf.format(dateTK_BD.getDate());
            String date4 = sdf.format(dateTK_KT.getDate());
            if (khuyenmaiService.GetOnebyALL(date3,date4).isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không có khuyến mãi nào");
                return;
            }
            defaultTableModel.setRowCount(0);
            int stt = 1;
            for (KhuyenmaiViewmodel x : khuyenmaiService.GetOnebyALL(date3,date4)) {
                defaultTableModel.addRow(new Object[]{
                    stt,
                    x.getTenKM(),
                    x.getNgayBatDau(),
                    x.getNgayKetThuc(),
                    String.format("%.0f", x.getGiaTriGiam()) + " " + x.getHinhThucKM()
                });
                stt++;
            }
        }
    }//GEN-LAST:event_lbl_timkiemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton btn_clear;
    private swing.MyButton btn_sua;
    private swing.MyButton btn_them;
    private swing.MyButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dateTK_BD;
    private com.toedter.calendar.JDateChooser dateTK_KT;
    private com.toedter.calendar.JDateChooser date_BD;
    private com.toedter.calendar.JDateChooser date_KT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_timkiem;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelGradiente panelGradiente1;
    private javax.swing.JRadioButton rd_VND;
    private javax.swing.JRadioButton rd_phantram;
    private swing.SearchText searchText2;
    private javax.swing.JTable tb_khuyenmai;
    private swing.MyTextField txt_giatrgiam;
    private swing.MyTextField txt_tenkm;
    // End of variables declaration//GEN-END:variables
}
