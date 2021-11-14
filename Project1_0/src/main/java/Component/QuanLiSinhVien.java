/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import Hiberneat.Public.Lop;
import Hiberneat.SinhVien.SinhVien;
import Login.Const;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Date;
import java.util.List;
import java.util.Vector;
import javax.persistence.Query;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author admin
 */
public class QuanLiSinhVien extends javax.swing.JPanel {

    JButton button = new JButton();
    Form_AddSinhVien addsinhvien = new Form_AddSinhVien();
    Form_SuaSinhVien uppdatesinhvien = new Form_SuaSinhVien();

    public QuanLiSinhVien() {
        initComponents();

        init();
        Table();
        loadDataSV();
        AddDate();

    }

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
        sp.getViewport().setBackground(Color.WHITE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sp = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtMaSinhVien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHovaTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbnNgay = new javax.swing.JComboBox<>();
        cbnNam = new javax.swing.JComboBox<>();
        cbnThang = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RdnNam = new javax.swing.JRadioButton();
        RdnNu = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtsodienthoai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        cbnlop = new javax.swing.JComboBox<>();
        txttimkiem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btncapnhatSinhVien = new javax.swing.JButton();
        btnrefesh = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnThemSinhVien = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sinh Viên", "Họ Và Tên", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Số điện Thoại", "Lớp", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setSelectionBackground(new java.awt.Color(153, 255, 255));
        Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        sp.setViewportView(Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Mã Sinh Viên :");

        TxtMaSinhVien.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Họ Và Tên :");

        txtHovaTen.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Ngày Sinh :");

        cbnNgay.setEnabled(false);

        cbnNam.setEnabled(false);

        cbnThang.setEnabled(false);

        jLabel4.setText(":");

        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Giới Tính :");

        RdnNam.setText("Nam");
        RdnNam.setEnabled(false);
        RdnNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RdnNamMouseClicked(evt);
            }
        });

        RdnNu.setText("Nữ");
        RdnNu.setEnabled(false);
        RdnNu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RdnNuMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Số điện Thoại :");

        txtsodienthoai.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Địa Chỉ :");

        txtdiachi.setColumns(20);
        txtdiachi.setRows(5);
        txtdiachi.setEnabled(false);
        jScrollPane1.setViewportView(txtdiachi);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Lớp :");

        cbnlop.setEnabled(false);

        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Tìm kiếm :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtMaSinhVien)
                            .addComponent(txtHovaTen)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RdnNam)
                                    .addComponent(cbnNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(RdnNu))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbnThang, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbnNam, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(194, 194, 194))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsodienthoai)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbnlop, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttimkiem)))))
                .addGap(156, 156, 156))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbnNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbnNam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbnThang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RdnNam)
                    .addComponent(RdnNu))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbnlop, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.lightGray));
        jPanel3.setOpaque(false);

        btncapnhatSinhVien.setBackground(new java.awt.Color(255, 255, 255));
        btncapnhatSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_edit_profile_30px.png"))); // NOI18N
        btncapnhatSinhVien.setText("Cập Nhật Sinh Viên");
        btncapnhatSinhVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btncapnhatSinhVien.setContentAreaFilled(false);
        btncapnhatSinhVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncapnhatSinhVien.setOpaque(true);
        btncapnhatSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncapnhatSinhVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncapnhatSinhVienMouseExited(evt);
            }
        });
        btncapnhatSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatSinhVienActionPerformed(evt);
            }
        });

        btnrefesh.setBackground(new java.awt.Color(255, 255, 255));
        btnrefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_refresh_20px.png"))); // NOI18N
        btnrefesh.setText("Refesh");
        btnrefesh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnrefesh.setContentAreaFilled(false);
        btnrefesh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnrefesh.setOpaque(true);
        btnrefesh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnrefeshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnrefeshMouseExited(evt);
            }
        });
        btnrefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefeshActionPerformed(evt);
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
        });

        btnThemSinhVien.setBackground(new java.awt.Color(255, 255, 255));
        btnThemSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_add_user_male_30px_1.png"))); // NOI18N
        btnThemSinhVien.setText("Thêm Sinh viên");
        btnThemSinhVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnThemSinhVien.setContentAreaFilled(false);
        btnThemSinhVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemSinhVien.setOpaque(true);
        btnThemSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemSinhVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemSinhVienMouseExited(evt);
            }
        });
        btnThemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSinhVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncapnhatSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnrefesh, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(btnThemSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnThemSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncapnhatSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnrefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemSinhVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemSinhVienMouseEntered
        btnThemSinhVien.setBackground(Color.YELLOW);
        btnThemSinhVien.setForeground(Color.red);
    }//GEN-LAST:event_btnThemSinhVienMouseEntered

    private void btnThemSinhVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemSinhVienMouseExited
        btnThemSinhVien.setBackground(Color.WHITE);
        btnThemSinhVien.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnThemSinhVienMouseExited

    private void btncapnhatSinhVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncapnhatSinhVienMouseEntered
        btncapnhatSinhVien.setBackground(Color.YELLOW);
        btncapnhatSinhVien.setForeground(Color.red);
    }//GEN-LAST:event_btncapnhatSinhVienMouseEntered

    private void btncapnhatSinhVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncapnhatSinhVienMouseExited
        btncapnhatSinhVien.setBackground(Color.WHITE);
        btncapnhatSinhVien.setForeground(Color.BLACK);
    }//GEN-LAST:event_btncapnhatSinhVienMouseExited

    private void btnrefeshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrefeshMouseEntered
        btnrefesh.setBackground(Color.YELLOW);
        btnrefesh.setForeground(Color.red);
    }//GEN-LAST:event_btnrefeshMouseEntered

    private void btnrefeshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrefeshMouseExited
        btnrefesh.setBackground(Color.WHITE);
        btnrefesh.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnrefeshMouseExited

    private void btnThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseEntered
        btnThoat.setBackground(Color.YELLOW);
        btnThoat.setForeground(Color.red);
    }//GEN-LAST:event_btnThoatMouseEntered

    private void btnThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseExited
        btnThoat.setBackground(Color.WHITE);
        btnThoat.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnThoatMouseExited

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int index = Table.getSelectedRow();
        if (index >= 0) {
            Const.SinhVienUpdate.setMaSV(Integer.parseInt(Table.getValueAt(index, 0).toString()));
            Const.SinhVienUpdate.setHoten(Table.getValueAt(index, 1).toString());
            Const.SinhVienUpdate.setNgaySinh(Date.valueOf(Table.getValueAt(index, 2).toString()));
            Const.SinhVienUpdate.setGioitinh(Table.getValueAt(index, 3).toString());
            Const.SinhVienUpdate.setDiachi(Table.getValueAt(index, 4).toString());
            Const.SinhVienUpdate.setSoDienThoai(Integer.parseInt(Table.getValueAt(index, 5).toString()));
            Const.SinhVienUpdate.setMaLop(Table.getValueAt(index, 6).toString());
            TxtMaSinhVien.setText(Table.getValueAt(index, 0).toString());
            txtHovaTen.setText(Table.getValueAt(index, 1).toString());
            String NgaySinh = Table.getValueAt(index, 2).toString();
            String[] Tachchuoi = NgaySinh.split("-");
            cbnNam.setSelectedItem(Tachchuoi[0]);
            cbnThang.setSelectedItem(Tachchuoi[1]);
            cbnNgay.setSelectedItem(Tachchuoi[2]);
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
            txtdiachi.setText(Table.getValueAt(index, 4).toString());
            txtsodienthoai.setText(Table.getValueAt(index, 5).toString());
            cbnlop.setSelectedItem(Table.getValueAt(index, 6).toString());
        }
    }//GEN-LAST:event_TableMouseClicked

    private void btnThemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSinhVienActionPerformed
        if (addsinhvien.oppen) {

            addsinhvien.LoadWindow();
            addsinhvien.AddDataLop();
            addsinhvien.setOppen(!addsinhvien.oppen);

        }

    }//GEN-LAST:event_btnThemSinhVienActionPerformed

    private void btnrefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefeshActionPerformed
        loadDataSV();
    }//GEN-LAST:event_btnrefeshActionPerformed

    private void btncapnhatSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatSinhVienActionPerformed
        int index = Table.getSelectedRow();

        if (index >= 0) {

            uppdatesinhvien.LoadDataSinhVien();
            uppdatesinhvien.AddDataLop();
            uppdatesinhvien.LoadWindow();
        } else {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Chọn Danh Sách Nào");
        }

    }//GEN-LAST:event_btncapnhatSinhVienActionPerformed

    private void RdnNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RdnNamMouseClicked
        RdnNu.setSelected(false);
    }//GEN-LAST:event_RdnNamMouseClicked

    private void RdnNuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RdnNuMouseClicked
        RdnNam.setSelected(false);
    }//GEN-LAST:event_RdnNuMouseClicked

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
        String query = txttimkiem.getText();
        SearchSinhVien(query);
    }//GEN-LAST:event_txttimkiemKeyReleased
    //
    private void SearchSinhVien(String query) {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));

    }

    //
    public void loadDataSV() {
        Query q = Const.session.createQuery("SELECT s.MaSV,s.hoten,s.NgaySinh,s.Gioitinh,s.Diachi,s.SoDienThoai,l.TenLop FROM SinhVien s join Lop l on s.MaLop = l.Malop");
        List<Object[]> listResult = null;
        listResult = q.getResultList();

        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        for (Object[] item : listResult) {
            Vector<Object> Vector = new Vector<>();
            Vector.add(item[0]);
            Vector.add(item[1]);
            Vector.add(item[2]);
            Vector.add(item[3]);
            Vector.add(item[4]);
            Vector.add(item[5]);
            Vector.add(item[6]);
            model.addRow(item);

        }
    }

    public void AddDataLop() {
        cbnlop.removeAllItems();
        Const.ListLop = null;
        Query Lop = Const.session.createQuery("FROM Lop");
        Const.ListLop = Lop.getResultList();
        for (Lop item : Const.ListLop) {
            cbnlop.addItem(item.getTenLop());;
        }
    }

    private void init() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = Table.getSelectedRow();
                if (index >= 0) {
                    int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Xóa Thông Tin Này Không", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_warning_shield_20px_1.png")));
                    if (option == 0) {
                        if (CheckmaSVDiem()) {
                            JOptionPane.showMessageDialog(null, "Hiện Tại Sinh Viên Đang Có Trong Danh Sách", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                        } else {
                            if (CheckmaSVThilai()) {
                                JOptionPane.showMessageDialog(null, "Hiện Tại Sinh Viên Đang Có Trong Danh Sách", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                            } else {
                                int search = Integer.parseInt(Table.getValueAt(index, 0).toString());
                                SinhVien Detele = Const.session.get(SinhVien.class, search);
                                Const.session.getTransaction().begin();
                                Const.session.delete(Detele);
                                Const.session.getTransaction().commit();
                                Table.removeEditor();
                                loadDataSV();
                                JOptionPane.showMessageDialog(null, "Xóa Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                            }

                        }

                    } else if (option == 1) {
                        JOptionPane.showMessageDialog(null, "Xóa Thất Bại", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                    } else {

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Bạn Chọn Quá nhanh", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                }
            }
        });
    }

    private Boolean CheckmaSVDiem() {
        int index = Table.getSelectedRow();
        Const.ListDiem = null;
        Query q = Const.session.createQuery("FROM Diem");
        Const.ListDiem = q.getResultList();
        for (int i = 0; i < Const.ListDiem.size(); i++) {
            if (Const.ListDiem.get(i).getMaSV() == Integer.parseInt(Table.getValueAt(index, 0).toString())) {
                return true;
            }
        }
        return false;

    }

    private Boolean CheckmaSVThilai() {
        int index = Table.getSelectedRow();
        Const.ListThiLai = null;
        Query q = Const.session.createQuery("FROM ThiLai");
        Const.ListThiLai = q.getResultList();
        for (int i = 0; i < Const.ListThiLai.size(); i++) {
            if (Const.ListThiLai.get(i).getMaSV() == Integer.parseInt(Table.getValueAt(index, 0).toString())) {
                return true;
            }
        }
        return false;

    }
    //loadDate

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

    //
    class ButtonEditor extends DefaultCellEditor {

        private String label;

        public ButtonEditor(JCheckBox checkBox) {

            super(checkBox);
            setOpaque(false);
//          setBackground(Color.white);
//            button.setText("delete");
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
    public void AddbuttonThoat(MouseAdapter Evt)
            
    {
        btnThoat.addMouseListener(Evt);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdnNam;
    private javax.swing.JRadioButton RdnNu;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TxtMaSinhVien;
    private javax.swing.JButton btnThemSinhVien;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btncapnhatSinhVien;
    private javax.swing.JButton btnrefesh;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane sp;
    private javax.swing.JTextField txtHovaTen;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JTextField txtsodienthoai;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
