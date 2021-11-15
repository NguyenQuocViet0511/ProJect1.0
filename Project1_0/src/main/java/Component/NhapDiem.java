/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import Hiberneat.Public.Diem;
import Hiberneat.Public.Lop;
import Hiberneat.Public.Monhoc;
import Hiberneat.Public.ThiLai;
import Hiberneat.SinhVien.SinhVien;
import Login.Const;
import Menu.students;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
public class NhapDiem extends javax.swing.JPanel {

    JButton button = new JButton();

    public NhapDiem() {
        initComponents();
        Table();
        init();

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
        sp.getViewport().setBackground(Color.WHITE);
        Table.getColumn("").setCellRenderer(new ButtonRenderer());
        Table.getColumn("").setCellEditor(new ButtonEditor(new JCheckBox()));
//        Table.getColumn("").setMaxWidth(10);
        Table1.setShowHorizontalLines(true);
        Table1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

                TableHeader Table = new TableHeader(value + "");

                return Table;

            }

        });
        Table1.setRowHeight(25);
        sp1.getViewport().setBackground(Color.WHITE);
    }

    //load
    public void loadDataDiem() {
        cbnMonHoc.setSelectedItem(-1);
        cbnMaMon.setSelectedItem(-1);
        Query query = Const.session.createQuery("SELECT d.ID,s.MaSV,s.hoten,d.MaMon,d.Monhoc,d.DiemDau,d.Diemgiua,d.DiemCuoi,d.Tongcuoi FROM SinhVien s join Diem d on s.MaSV = d.MaSV");
        List<Object[]> listResult = query.getResultList();
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        for (Object[] item : listResult) {
            model.addRow(item);

        }
    }

    public void loadDataMon() {
        Query q = Const.session.createQuery("FROM Monhoc");
        Const.ListMonhoc = null;
        Const.ListMonhoc = q.getResultList();

        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        model.setRowCount(0);
        for (Monhoc item : Const.ListMonhoc) {
            Vector<Object> Vector = new Vector<>();
            Vector.add(item.getMaMonhoc());
            Vector.add(item.getTenMonhoc());
            model.addRow(Vector);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtMaSinhVien = new javax.swing.JTextField();
        TxtHovaTen = new javax.swing.JTextField();
        txtDiemdau = new javax.swing.JTextField();
        TxtDiemgiua = new javax.swing.JTextField();
        txtDiemCuoi = new javax.swing.JTextField();
        btnNhapdiem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbnMonHoc = new javax.swing.JComboBox<>();
        cbnMaMon = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        sp1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        txttimkiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sp = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.gray));
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mã Sinh Viên :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Họ Và Tên :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Điểm Đầu kỳ :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Điểm Giữa Kỳ :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Điểm Cuối kỳ :");

        btnNhapdiem.setBackground(new java.awt.Color(255, 255, 255));
        btnNhapdiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_checkmark_20px_1.png"))); // NOI18N
        btnNhapdiem.setText("Nhập");
        btnNhapdiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnNhapdiem.setContentAreaFilled(false);
        btnNhapdiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhapdiem.setOpaque(true);
        btnNhapdiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNhapdiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNhapdiemMouseExited(evt);
            }
        });
        btnNhapdiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapdiemActionPerformed(evt);
            }
        });

        btnsua.setBackground(new java.awt.Color(255, 255, 255));
        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/suado_20.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnsua.setContentAreaFilled(false);
        btnsua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsua.setOpaque(true);
        btnsua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsuaMouseExited(evt);
            }
        });
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Mã Môn :");

        jLabel8.setText("Tên Môn :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNhapdiem, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(342, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtHovaTen)
                            .addComponent(TxtMaSinhVien)
                            .addComponent(txtDiemdau)
                            .addComponent(TxtDiemgiua)
                            .addComponent(txtDiemCuoi)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cbnMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)
                                .addComponent(cbnMonHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(145, 145, 145))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtMaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtHovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbnMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbnMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiemdau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDiemgiua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiemCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhapdiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        sp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.gray));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Môn", "Tên Môn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        sp1.setViewportView(Table1);

        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Tìm Kiếm :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sp1)
                .addGap(18, 18, 18))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.gray));

        sp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Mã Sinh viên", "Họ Và Tên", "Mã Môn", "Môn Học", "Điểm Đầu Kỳ", "Diểm Giữa Kỳ", "Điểm Cuối kỳ", "Tổng TB", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        sp.setViewportView(Table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(254, 254, 254)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapdiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapdiemActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Nhập Thông Tin Này Không", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
        if (option == 0) {
            if (TxtMaSinhVien.getText().isEmpty() && TxtHovaTen.getText().isEmpty() || TxtDiemgiua.getText().isEmpty() || txtDiemCuoi.getText().isEmpty() || TxtDiemgiua.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Không Được Để Trống", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

            } else {

                if (Double.parseDouble(txtDiemdau.getText()) > 10 || Double.parseDouble(TxtDiemgiua.getText()) > 10 || Double.parseDouble(txtDiemCuoi.getText()) > 10) {
                    JOptionPane.showMessageDialog(null, "Bạn Nhập Vướt Quá 10", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                } else {
                    if (checkDiemNhap()) {
                        JOptionPane.showMessageDialog(null, "Sinh viên Này hoặc môn Đã Có", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                    } else {
                        if (CheckMaSVDiem()) {
                            Diem diem = new Diem();
                            diem.setMaSV(Integer.parseInt(TxtMaSinhVien.getText()));
                            diem.setHovaTen(TxtHovaTen.getText());
                            diem.setMonhoc(cbnMonHoc.getSelectedItem().toString());
                            diem.setMaMon(cbnMaMon.getSelectedItem().toString());
                            diem.setDiemDau(Double.parseDouble(txtDiemdau.getText()));
                            diem.setDiemgiua(Double.parseDouble(TxtDiemgiua.getText()));
                            diem.setDiemCuoi(Double.parseDouble(txtDiemCuoi.getText()));
                            diem.setTongcuoi((diem.getDiemDau() + diem.getDiemgiua() + diem.getDiemCuoi()) / 3);
                            Const.session.getTransaction().begin();
                            Const.session.save(diem);
                            Const.session.getTransaction().commit();
                            JOptionPane.showMessageDialog(null, "Nhập Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                            loadDataDiem();
                            TxtMaSinhVien.setText("");
                            TxtHovaTen.setText("");
                            txtDiemdau.setText("");
                            TxtDiemgiua.setText("");
                            txtDiemCuoi.setText("");
                            cbnMonHoc.setSelectedItem(-1);
                            cbnMaMon.setSelectedItem(-1);

                        } else {
                            JOptionPane.showMessageDialog(null, "Không Có sinh Viên Này Trong Danh Sách", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                        }

                    }

                }
            }

        } else {

        }
    }//GEN-LAST:event_btnNhapdiemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        int index = Table.getSelectedRow();
        if (index >= 0) {
            int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Sửa Thông Tin này Không", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
            if (option == 0) {
                if (TxtMaSinhVien.getText().isEmpty() && TxtHovaTen.getText().isEmpty() || TxtDiemgiua.getText().isEmpty() || txtDiemCuoi.getText().isEmpty() || TxtDiemgiua.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Không Được Để Trống", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                } else {
                    if (Double.parseDouble(txtDiemdau.getText()) > 10 || Double.parseDouble(txtDiemCuoi.getText()) > 10 || Double.parseDouble(TxtDiemgiua.getText()) > 10) {
                        JOptionPane.showMessageDialog(null, "Bạn Nhập Vướt Quá 10", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                    } else {
                        int search = Integer.parseInt(Table.getValueAt(index, 0).toString());
                        Diem sua = Const.session.get(Diem.class, search);
                        sua.setMaSV(Integer.parseInt(TxtMaSinhVien.getText()));
                        sua.setHovaTen(TxtHovaTen.getText());
                        sua.setMaMon(cbnMaMon.getSelectedItem().toString());
                        sua.setDiemDau(Double.parseDouble(txtDiemdau.getText()));
                        sua.setDiemgiua(Double.parseDouble(TxtDiemgiua.getText()));
                        sua.setDiemCuoi(Double.parseDouble(txtDiemCuoi.getText()));
                        sua.setTongcuoi((sua.getDiemDau() + sua.getDiemgiua() + sua.getDiemCuoi()) / 3);
                        JOptionPane.showMessageDialog(null, "Bạn sửa Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                        Const.session.getTransaction().begin();
                        Const.session.save(sua);
                        Const.session.getTransaction().commit();
                        loadDataDiem();
                        TxtMaSinhVien.setText("");
                        TxtHovaTen.setText("");
                        txtDiemdau.setText("");
                        TxtDiemgiua.setText("");
                        txtDiemCuoi.setText("");
                        cbnMonHoc.setSelectedItem(-1);
                    }

                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn Danh Sách Nào", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

        }


    }//GEN-LAST:event_btnsuaActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        int index = Table1.getSelectedRow();
        if (index >= 0) {
            TxtMaSinhVien.setText("");
            TxtHovaTen.setText("");
            txtDiemdau.setText("");
            TxtDiemgiua.setText("");
            txtDiemCuoi.setText("");
            cbnMonHoc.setSelectedItem(-1);
            cbnMaMon.setSelectedItem(-1);
            cbnMaMon.setSelectedItem(Table1.getValueAt(index, 0).toString());
            cbnMonHoc.setSelectedItem(Table1.getValueAt(index, 1).toString());
        }
    }//GEN-LAST:event_Table1MouseClicked

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int index = Table.getSelectedRow();
        if (index >= 0) {
            TxtMaSinhVien.setText("");
            TxtHovaTen.setText("");
            txtDiemdau.setText("");
            TxtDiemgiua.setText("");
            txtDiemCuoi.setText("");
            cbnMonHoc.setSelectedItem(-1);
            cbnMaMon.setSelectedItem(-1);
            TxtMaSinhVien.setText(Table.getValueAt(index, 1).toString());
            TxtHovaTen.setText(Table.getValueAt(index, 2).toString());
            cbnMaMon.setSelectedItem(Table.getValueAt(index, 3).toString());
            cbnMonHoc.setSelectedItem(Table.getValueAt(index, 4).toString());
            txtDiemdau.setText(Table.getValueAt(index, 5).toString());
            TxtDiemgiua.setText(Table.getValueAt(index, 6).toString());
            txtDiemCuoi.setText(Table.getValueAt(index, 7).toString());
        }
    }//GEN-LAST:event_TableMouseClicked

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
        String query = txttimkiem.getText();
        Searchdiem(query);
    }//GEN-LAST:event_txttimkiemKeyReleased

    private void btnNhapdiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhapdiemMouseEntered
        btnNhapdiem.setBackground(Color.YELLOW);
        btnNhapdiem.setForeground(Color.RED);
    }//GEN-LAST:event_btnNhapdiemMouseEntered

    private void btnNhapdiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhapdiemMouseExited
        btnNhapdiem.setBackground(Color.WHITE);
        btnNhapdiem.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnNhapdiemMouseExited

    private void btnsuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuaMouseEntered
        btnsua.setBackground(Color.YELLOW);
        btnsua.setForeground(Color.RED);
    }//GEN-LAST:event_btnsuaMouseEntered

    private void btnsuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuaMouseExited
        btnsua.setBackground(Color.WHITE);
        btnsua.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnsuaMouseExited

    private void init() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = Table.getSelectedRow();
                if (index >= 0) {
                    int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Xóa không", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                    if (option == 0) {
                        int search = Integer.parseInt(Table.getValueAt(index, 0).toString());
                        Diem delete = Const.session.get(Diem.class, search);
                        Const.session.getTransaction().begin();
                        Const.session.delete(delete);
                        Const.session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Xóa Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                        Table.removeEditor();
                        loadDataDiem();
                        TxtMaSinhVien.setText("");
                        TxtHovaTen.setText("");
                        txtDiemdau.setText("");
                        TxtDiemgiua.setText("");
                        txtDiemCuoi.setText("");
                        cbnMonHoc.setSelectedItem(-1);
                        cbnMaMon.setSelectedItem(-1);

                    } else {

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Bạn chưa chọn Danh Sách Nào", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                }

            }
        });
    }

    //
    private boolean CheckMaSVDiem() {
        Const.ListSinhVien = null;
        Query q = Const.session.createQuery("FROM SinhVien");
        Const.ListSinhVien = q.getResultList();
        for (int i = 0; i < Const.ListSinhVien.size(); i++) {
            if (Const.ListSinhVien.get(i).getMaSV() == Integer.parseInt(TxtMaSinhVien.getText())) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiemNhap() {
        Const.ListDiem = null;
        Query q = Const.session.createQuery("FROM Diem");
        Const.ListDiem = q.getResultList();
        for (int i = 0; i < Const.ListDiem.size(); i++) {
            if (Const.ListDiem.get(i).getMaSV() == Integer.parseInt(TxtMaSinhVien.getText()) && Const.ListDiem.get(i).getMaMon().equals(cbnMaMon.getSelectedItem().toString()) && Const.ListDiem.get(i).getMonhoc().equals(cbnMonHoc.getSelectedItem().toString())) {
                return true;
            }
        }
        return false;
    }

    //
    private void Searchdiem(String query) {
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        Table1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));

    }

    //
    public void AddDataMon() {
        cbnMonHoc.removeAllItems();
        cbnMaMon.removeAllItems();
        Const.ListMonhoc = null;
        Query Mon = Const.session.createQuery("FROM Monhoc");
        Const.ListMonhoc = Mon.getResultList();
        for (Monhoc item : Const.ListMonhoc) {
            cbnMonHoc.addItem(item.getTenMonhoc());;
            cbnMaMon.addItem(item.getMaMonhoc());
        }
    }

    class ButtonEditor extends DefaultCellEditor {

        public ButtonEditor(JCheckBox checkBox) {

            super(checkBox);
//        setOpaque(false);
//        setBackground(Color.white);
            button.setText("Xóa");
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png")));

        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {

            return button;

        }
    }

    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {

            setOpaque(true);
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png")));
            setText("Xóa");

        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            return this;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTable Table1;
    private javax.swing.JTextField TxtDiemgiua;
    private javax.swing.JTextField TxtHovaTen;
    private javax.swing.JTextField TxtMaSinhVien;
    private javax.swing.JButton btnNhapdiem;
    private javax.swing.JButton btnsua;
    private javax.swing.JComboBox<String> cbnMaMon;
    private javax.swing.JComboBox<String> cbnMonHoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane sp;
    private javax.swing.JScrollPane sp1;
    private javax.swing.JTextField txtDiemCuoi;
    private javax.swing.JTextField txtDiemdau;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
