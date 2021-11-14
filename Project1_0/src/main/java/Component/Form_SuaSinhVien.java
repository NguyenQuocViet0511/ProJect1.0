/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Component;

import Hiberneat.Public.Lop;
import Hiberneat.SinhVien.SinhVien;
import Hiberneat.User.User;
import Login.Const;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Form_SuaSinhVien extends javax.swing.JFrame {

    boolean oppen = true;

    public boolean isOppen() {
        return oppen;
    }

    public void setOppen(boolean oppen) {
        this.oppen = oppen;
    }

    public Form_SuaSinhVien() {

        initComponents();
        AddDate();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btndongy = new javax.swing.JButton();
        btnhuybo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        cbnlop = new javax.swing.JComboBox<>();
        txtsodienthoai = new javax.swing.JTextField();
        RdnNam = new javax.swing.JRadioButton();
        RdnNu = new javax.swing.JRadioButton();
        cbnThang = new javax.swing.JComboBox<>();
        cbnNgay = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbnNam = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtMaSinhVien = new javax.swing.JTextField();
        txtHovaTen = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin"));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btndongy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_checkmark_20px_1.png"))); // NOI18N
        btndongy.setText("Đồng Ý");
        btndongy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndongyActionPerformed(evt);
            }
        });

        btnhuybo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cross_mark_20px.png"))); // NOI18N
        btnhuybo.setText("Hủy Bỏ");
        btnhuybo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuyboActionPerformed(evt);
            }
        });

        txtdiachi.setColumns(20);
        txtdiachi.setRows(5);
        jScrollPane1.setViewportView(txtdiachi);

        RdnNam.setText("Nam");
        RdnNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RdnNamMouseClicked(evt);
            }
        });

        RdnNu.setText("Nữ");
        RdnNu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RdnNuMouseClicked(evt);
            }
        });

        jLabel4.setText(":");

        jLabel5.setText(":");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Lớp :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Địa Chỉ :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Số điện Thoại :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Giới Tính :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Ngày Sinh :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Họ Và Tên :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Mã Sinh Viên :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RdnNam)
                            .addComponent(cbnNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btndongy, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(243, 243, 243)
                                .addComponent(btnhuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(RdnNu))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbnThang, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbnNam, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbnlop, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(365, 365, 365)))
                .addGap(0, 81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RdnNu)
                    .addComponent(RdnNam))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbnNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbnThang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbnNam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbnlop, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndongy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 106, 728, 589);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Thêm Sinh viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 88);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhuyboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuyboActionPerformed
        setOppen(!oppen);
        this.dispose();
    }//GEN-LAST:event_btnhuyboActionPerformed

    private void btndongyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndongyActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn sửa Thông tin Này Không", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

        if (option == 0) {
            int search = Const.SinhVienUpdate.getMaSV();
            SinhVien Update = Const.session.get(SinhVien.class, search);
            if (TxtMaSinhVien.getText().equals("" + Const.SinhVienUpdate.getMaSV())) {
                Update.setMaSV(Integer.parseInt(TxtMaSinhVien.getText()));
                Update.setHoten(txtHovaTen.getText());
                String NgaySinh = cbnNam.getSelectedItem() + "-" + cbnThang.getSelectedItem() + "-" + cbnNgay.getSelectedItem();
                Update.setNgaySinh(java.sql.Date.valueOf(NgaySinh));
                if (RdnNam.isSelected()) {
                    Update.setGioitinh("Nam");
                } else {
                    Update.setGioitinh("Nữ");
                }

                Update.setDiachi(txtdiachi.getText());
                Update.setSoDienThoai(Integer.parseInt(txtsodienthoai.getText()));
                Update.setMaLop(cbnlop.getSelectedItem().toString());
                Const.session.getTransaction().begin();
                Const.session.save(Update);
                Const.session.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                TxtMaSinhVien.setText("");
                txtHovaTen.setText("");
                cbnNam.setSelectedIndex(-1);
                cbnNgay.setSelectedIndex(-1);
                cbnThang.setSelectedIndex(-1);
                RdnNam.setSelected(false);
                RdnNu.setSelected(false);
                txtdiachi.setText("");
                txtdiachi.setText("");
                cbnlop.setSelectedIndex(-1);
                this.dispose();
                setOppen(!oppen);

            } else {

                JOptionPane.showMessageDialog(null, "Không Thể Sửa Mã Sinh Viên Khi Nằm Trong Danh Sách", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
            }

        } else if (option == 1) {
            JOptionPane.showMessageDialog(null, "Cập nhật Thất Bại", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

        } else {

        }


    }//GEN-LAST:event_btndongyActionPerformed

    private void RdnNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RdnNamMouseClicked
        RdnNu.setSelected(false);
    }//GEN-LAST:event_RdnNamMouseClicked

    private void RdnNuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RdnNuMouseClicked
        RdnNam.setSelected(false);
    }//GEN-LAST:event_RdnNuMouseClicked

    private boolean checkMaSV() {
        Const.ListSinhVien = null;
        Query sinhvien = Const.session.createQuery("FROM SinhVien");
        Const.ListSinhVien = sinhvien.getResultList();
        Vector<Object> CheckMasv = new Vector();
        for (int i = 0; i < Const.ListSinhVien.size(); i++) {
            CheckMasv.add(Const.ListSinhVien.get(i).getMaSV());
        }
        for (int i = 0; i < CheckMasv.size(); i++) {
            if (TxtMaSinhVien.getText().equals(CheckMasv.get(i).toString())) {
                return true;
            }
        }
        return false;
    }

    public void LoadDataSinhVien() {

        TxtMaSinhVien.setText("" + Const.SinhVienUpdate.getMaSV());
        txtHovaTen.setText("" + Const.SinhVienUpdate.getHoten());
        if (Const.SinhVienUpdate.getGioitinh().equals("Nam")) {
            RdnNam.setSelected(true);
        }
        if (Const.SinhVienUpdate.getGioitinh().equals("Nữ")) {
            RdnNu.setSelected(true);
        }
        String NgaySinh = Const.SinhVienUpdate.getNgaySinh().toString();
        String[] Tachchuoi = NgaySinh.split("-");
        cbnNam.setSelectedItem(Tachchuoi[0]);
        cbnThang.setSelectedItem(Tachchuoi[1]);
        cbnNgay.setSelectedItem(Tachchuoi[2]);
        txtsodienthoai.setText("" + Const.SinhVienUpdate.getSoDienThoai());
        txtdiachi.setText(Const.SinhVienUpdate.getDiachi());
        cbnlop.setSelectedItem(Const.SinhVienUpdate.getMaLop().toString());

    }

    private void AddDate() {
        for (int i = 1; i <= 9; i++) {
            cbnNgay.addItem(0 + "" + i);

        }
        for (int i = 10; i <= 31; i++) {
            cbnNgay.addItem("" + i);

        }
        for (int i = 1; i <= 9; i++) {
            cbnThang.addItem(0 + "" + i);

        }
        for (int i = 10; i <= 12; i++) {
            cbnThang.addItem("" + i);

        }
        for (int i = 1991; i <= 2200; i++) {
            cbnNam.addItem("" + i);

        }
        AddDataLop();
    }

    public void AddDataLop() {
        cbnlop.removeAllItems();
        Const.ListLop = null;
        Query Lop = Const.session.createQuery("FROM Lop");
        Const.ListLop = Lop.getResultList();
        for (Lop item : Const.ListLop) {
            cbnlop.addItem(item.getMalop());;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdnNam;
    private javax.swing.JRadioButton RdnNu;
    private javax.swing.JTextField TxtMaSinhVien;
    private javax.swing.JButton btndongy;
    private javax.swing.JButton btnhuybo;
    private javax.swing.JComboBox<String> cbnNam;
    private javax.swing.JComboBox<String> cbnNgay;
    private javax.swing.JComboBox<String> cbnThang;
    private javax.swing.JComboBox<String> cbnlop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHovaTen;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JTextField txtsodienthoai;
    // End of variables declaration//GEN-END:variables

    public void LoadWindow() {

        setSize(749, 690);
        setVisible(true);
        setLocationRelativeTo(null);

//        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

}
