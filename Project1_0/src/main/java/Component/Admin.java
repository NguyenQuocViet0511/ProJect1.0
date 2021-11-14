/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import Hiberneat.User.User;
import Login.Const;
import com.sun.xml.bind.v2.Messages;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.persistence.Query;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author admin
 */
public class Admin extends javax.swing.JPanel {

    DefaultTableModel model;
    boolean oppenupdatauser = true;
    boolean oppenadduser = true;

    JButton button = new JButton();

    public boolean isOppenupdatauser() {
        return oppenupdatauser;
    }

    public void setOppenupdatauser(boolean oppenupdatauser) {
        this.oppenupdatauser = oppenupdatauser;
    }

    public boolean isOppenadduser() {
        return oppenadduser;
    }

    public void setOppenadduser(boolean oppenadduser) {
        this.oppenadduser = oppenadduser;
    }
    MigLayout migLayout;
    Form_UpdateUser updateUser = new Form_UpdateUser();
    Form_AddUser addUser = new Form_AddUser();

    public Admin() {
        initComponents();
        setOpaque(false);
        Table();
        init();
        AddDate();
        LoadDataResource();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPAdmin = new javax.swing.JPanel();
        TxtHovaTen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RdnNam = new javax.swing.JRadioButton();
        RdnNu = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtTenDangNhap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbnNgay = new javax.swing.JComboBox<>();
        cbnThang = new javax.swing.JComboBox<>();
        cbnNam = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtDiachi = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        RdnKhoa = new javax.swing.JRadioButton();
        RdnBinhthuong = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        SP = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ChucNang = new javax.swing.JPanel();
        btnthemtaikhoan = new javax.swing.JButton();
        btnsuataikhoan = new javax.swing.JButton();
        btnFresh = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jPAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jPAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPAdmin.setOpaque(false);

        TxtHovaTen.setEnabled(false);

        jLabel1.setText("Họ Và Tên :");

        jLabel2.setText("Giới Tính :");

        RdnNam.setText("Nam");
        RdnNam.setEnabled(false);

        RdnNu.setText("Nữ");
        RdnNu.setEnabled(false);

        jLabel3.setText("Email :");

        TxtEmail.setEnabled(false);

        jLabel4.setText("Tên Đăng Nhập :");

        TxtTenDangNhap.setEnabled(false);

        jLabel5.setText("Ngày Sinh :");

        cbnNgay.setEnabled(false);

        cbnThang.setEnabled(false);

        cbnNam.setEnabled(false);

        jLabel6.setText(":");

        jLabel7.setText(":");

        jLabel8.setText("Địa Chỉ :");

        TxtDiachi.setColumns(20);
        TxtDiachi.setRows(5);
        TxtDiachi.setEnabled(false);
        jScrollPane2.setViewportView(TxtDiachi);

        jLabel9.setText("Trạng Thái :");

        RdnKhoa.setText("Khóa");
        RdnKhoa.setEnabled(false);

        RdnBinhthuong.setText("Bình Thường");
        RdnBinhthuong.setEnabled(false);

        javax.swing.GroupLayout jPAdminLayout = new javax.swing.GroupLayout(jPAdmin);
        jPAdmin.setLayout(jPAdminLayout);
        jPAdminLayout.setHorizontalGroup(
            jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAdminLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addGroup(jPAdminLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPAdminLayout.createSequentialGroup()
                        .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(28, 28, 28)))
                .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAdminLayout.createSequentialGroup()
                        .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPAdminLayout.createSequentialGroup()
                                .addComponent(RdnNam)
                                .addGap(67, 67, 67)
                                .addComponent(RdnNu))
                            .addGroup(jPAdminLayout.createSequentialGroup()
                                .addComponent(cbnNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbnThang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbnNam, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPAdminLayout.createSequentialGroup()
                                .addComponent(RdnKhoa)
                                .addGap(52, 52, 52)
                                .addComponent(RdnBinhthuong)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAdminLayout.createSequentialGroup()
                        .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtHovaTen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTenDangNhap, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                        .addGap(129, 129, 129))))
        );
        jPAdminLayout.setVerticalGroup(
            jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAdminLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtHovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdnNam)
                    .addComponent(RdnNu)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbnNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbnThang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbnNam, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RdnBinhthuong)
                    .addGroup(jPAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RdnKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGap(30, 30, 30))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        SP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SP.setOpaque(false);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Họ Và Tên", "Email", "Tên Đăng Nhập", "Giới Tính", "Ngày Sinh", "Địa Chỉ", "Trạng Thái", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        Table.setGridColor(new java.awt.Color(255, 255, 255));
        Table.setSelectionBackground(new java.awt.Color(153, 255, 255));
        Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        SP.setViewportView(Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SP)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SP, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        ChucNang.setBackground(new java.awt.Color(255, 255, 255));
        ChucNang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ChucNang.setOpaque(false);

        btnthemtaikhoan.setBackground(new java.awt.Color(255, 255, 255));
        btnthemtaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_add_user_male_30px_1.png"))); // NOI18N
        btnthemtaikhoan.setText("Thêm Tài Khoản");
        btnthemtaikhoan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnthemtaikhoan.setContentAreaFilled(false);
        btnthemtaikhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnthemtaikhoan.setFocusPainted(false);
        btnthemtaikhoan.setOpaque(true);
        btnthemtaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnthemtaikhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnthemtaikhoanMouseExited(evt);
            }
        });
        btnthemtaikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemtaikhoanActionPerformed(evt);
            }
        });

        btnsuataikhoan.setBackground(new java.awt.Color(255, 255, 255));
        btnsuataikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_edit_profile_30px.png"))); // NOI18N
        btnsuataikhoan.setText("Sửa Tài Khoản");
        btnsuataikhoan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnsuataikhoan.setContentAreaFilled(false);
        btnsuataikhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsuataikhoan.setOpaque(true);
        btnsuataikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsuataikhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsuataikhoanMouseExited(evt);
            }
        });
        btnsuataikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuataikhoanActionPerformed(evt);
            }
        });

        btnFresh.setBackground(new java.awt.Color(255, 255, 255));
        btnFresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_refresh_20px.png"))); // NOI18N
        btnFresh.setText("Fresh");
        btnFresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnFresh.setContentAreaFilled(false);
        btnFresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFresh.setOpaque(true);
        btnFresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFreshMouseExited(evt);
            }
        });
        btnFresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreshActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_exit_30px_2.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnThoat.setContentAreaFilled(false);
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.setOpaque(true);
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThoatMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnThoatMouseReleased(evt);
            }
        });
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChucNangLayout = new javax.swing.GroupLayout(ChucNang);
        ChucNang.setLayout(ChucNangLayout);
        ChucNangLayout.setHorizontalGroup(
            ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnthemtaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(btnsuataikhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ChucNangLayout.setVerticalGroup(
            ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChucNangLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnthemtaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsuataikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemtaikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemtaikhoanActionPerformed
        if (addUser.oppen) {

            addUser.LoadWindow();
            addUser.setOppen(!addUser.oppen);

        }
    }//GEN-LAST:event_btnthemtaikhoanActionPerformed

    private void btnthemtaikhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthemtaikhoanMouseExited
        btnthemtaikhoan.setBackground(Color.WHITE);
        btnthemtaikhoan.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnthemtaikhoanMouseExited

    private void btnthemtaikhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthemtaikhoanMouseEntered
        btnthemtaikhoan.setBackground(Color.YELLOW);
        btnthemtaikhoan.setForeground(Color.red);

    }//GEN-LAST:event_btnthemtaikhoanMouseEntered

    private void btnsuataikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuataikhoanActionPerformed

        int index = Table.getSelectedRow();

        if (index >= 0) {

            updateUser.LoadDataUser();
            updateUser.LoadWindow();
        } else {
            JOptionPane.showMessageDialog(null, "Bạn Chưa Chọn Danh Sách Nào", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

        }


    }//GEN-LAST:event_btnsuataikhoanActionPerformed

    private void btnFreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreshActionPerformed
        model.setRowCount(0);
        LoadDataResource();
    }//GEN-LAST:event_btnFreshActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed

    }//GEN-LAST:event_btnThoatActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int index = Table.getSelectedRow();
        if (index >= 0) {
            TxtHovaTen.setText("");
            TxtEmail.setText("");
            TxtTenDangNhap.setText("");
            TxtDiachi.setText("");
            cbnNam.setSelectedIndex(-1);
            cbnNgay.setSelectedIndex(-1);
            cbnThang.setSelectedIndex(-1);
            //
            Const.user_update.setHovaTen(Table.getValueAt(index, 0).toString());
            Const.user_update.setEmail(Table.getValueAt(index, 1).toString());
            Const.user_update.setUserName(Table.getValueAt(index, 2).toString());
            Const.user_update.setGioitinh(Table.getValueAt(index, 3).toString());
            Const.user_update.setNgaySinh(Date.valueOf(Table.getValueAt(index, 4).toString()));
            Const.user_update.setDiaChi(Table.getValueAt(index, 5).toString());
            Const.user_update.setTrangThai(Table.getValueAt(index, 6).toString());
            //
            TxtHovaTen.setText(Table.getValueAt(index, 0).toString());
            TxtEmail.setText(Table.getValueAt(index, 1).toString());
            TxtTenDangNhap.setText(Table.getValueAt(index, 2).toString());
            String Gioitinh = Table.getValueAt(index, 3).toString();
            if (Gioitinh.equals("Nam")) {
                RdnNam.setSelected(true);
            } else {
                RdnNam.setSelected(false);
            }
            if (Gioitinh.equals("Nữ")) {

                RdnNu.setSelected(true);
            } else {
                RdnNu.setSelected(false);
            }

            String NgaySinh = Table.getValueAt(index, 4).toString();
            String[] Tachchuoi = NgaySinh.split("-");

            cbnNam.setSelectedItem(Tachchuoi[0]);
            cbnThang.setSelectedItem(Tachchuoi[1]);
            cbnNgay.setSelectedItem(Tachchuoi[2]);
            TxtDiachi.setText(Table.getValueAt(index, 5).toString());
            String TrangThai = Table.getValueAt(index, 6).toString();
            if (TrangThai.endsWith("Khóa")) {
                RdnKhoa.setSelected(true);
            } else {
                RdnKhoa.setSelected(false);
            }
            if (TrangThai.endsWith("Bình Thường")) {
                RdnBinhthuong.setSelected(true);
            } else {
                RdnBinhthuong.setSelected(false);
            }
        }
    }//GEN-LAST:event_TableMouseClicked

    private void btnsuataikhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuataikhoanMouseEntered
        btnsuataikhoan.setBackground(Color.YELLOW);
        btnsuataikhoan.setForeground(Color.red);
    }//GEN-LAST:event_btnsuataikhoanMouseEntered

    private void btnsuataikhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuataikhoanMouseExited
        btnsuataikhoan.setBackground(Color.WHITE);
        btnsuataikhoan.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnsuataikhoanMouseExited

    private void btnFreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFreshMouseEntered
        btnFresh.setBackground(Color.YELLOW);
        btnFresh.setForeground(Color.red);
    }//GEN-LAST:event_btnFreshMouseEntered

    private void btnFreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFreshMouseExited
        btnFresh.setBackground(Color.WHITE);
        btnFresh.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnFreshMouseExited

    private void btnThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseEntered
        btnThoat.setBackground(Color.YELLOW);
        btnThoat.setForeground(Color.red);
    }//GEN-LAST:event_btnThoatMouseEntered

    private void btnThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseExited
        btnThoat.setBackground(Color.WHITE);
        btnThoat.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnThoatMouseExited

    private void btnThoatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseReleased
        btnThoat.setBackground(Color.WHITE);
        btnThoat.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnThoatMouseReleased

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, Color.white, getWidth(), 0, new Color(93, 58, 196));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChucNang;
    private javax.swing.JRadioButton RdnBinhthuong;
    private javax.swing.JRadioButton RdnKhoa;
    private javax.swing.JRadioButton RdnNam;
    private javax.swing.JRadioButton RdnNu;
    private javax.swing.JScrollPane SP;
    private javax.swing.JTable Table;
    private javax.swing.JTextArea TxtDiachi;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtHovaTen;
    private javax.swing.JTextField TxtTenDangNhap;
    private javax.swing.JButton btnFresh;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnsuataikhoan;
    private javax.swing.JButton btnthemtaikhoan;
    private javax.swing.JComboBox<String> cbnNam;
    private javax.swing.JComboBox<String> cbnNgay;
    private javax.swing.JComboBox<String> cbnThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    // talbe
    private void Table() {
        setOpaque(false);
        Table.setShowHorizontalLines(true);
        Table.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

                TableHeader Table = new TableHeader(value + "");

                return Table;

            }

        });
        Table.setRowHeight(25);

        Table.getColumn("").setCellRenderer(new ButtonRenderer());
        Table.getColumn("").setCellEditor(new ButtonEditor(new JCheckBox()));
        SP.getViewport().setBackground(Color.WHITE);

    }

    // loadbutton delete
    private void init() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = Table.getSelectedRow();
                if (index >= 0) {
                    System.out.println("" + Table.getValueAt(index, 2).toString());
                    int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Xóa Thông Tin Này Không", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_warning_shield_20px_1.png")));
                    if (option == 0) {
                        String search = Table.getValueAt(index, 2).toString();

                        User Detele = Const.session.get(User.class, search);
                        Const.session.getTransaction().begin();
                        Const.session.delete(Detele);
                        Const.session.getTransaction().commit();
                        Table.removeEditor();
                        LoadDataResource();
                        JOptionPane.showMessageDialog(null, "Xóa Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                    } else if (option == 1) {
                        JOptionPane.showMessageDialog(null, "Xóa Thất Bại", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                    } else {

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Thao Tác Quá Nhanh", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                }

            }

        });
    }

    // load date
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

    }

    // load du lieu
    public void LoadDataResource() {

        model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        Vector<Object> vector;

        Const.ListUser = null;
        Query q = Const.session.createQuery("FROM User");
        Const.ListUser = q.getResultList();
        for (User item : Const.ListUser) {

            vector = new Vector();
            vector.add(item.getHovaTen());
            vector.add(item.getEmail());
            vector.add(item.getUserName());
            vector.add(item.getGioitinh());
            vector.add(item.getNgaySinh());
            vector.add(item.getDiaChi());
            vector.add(item.getTrangThai());
            vector.add("");
            model.addRow(vector);

        }

    }

    // button
    public void AddButtonThoat(MouseAdapter evt) {
        btnThoat.addMouseListener(evt);

    }

   

    //
    class ButtonEditor extends DefaultCellEditor {

        private String label;

        public ButtonEditor(JCheckBox checkBox) {

            super(checkBox);
//        setOpaque(false);
//        setBackground(Color.white);
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png")));

        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {

            label = (value == null) ? "" : value.toString();

            button.setText(label);
            return button;

        }

        public Object getCellEditorValue() {

            return new String(label);

        }

    }

    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {

            setOpaque(true);
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png")));
            setText("delete");

        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            return this;
        }
    }

}
