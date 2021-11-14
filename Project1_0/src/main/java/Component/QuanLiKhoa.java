/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import Hiberneat.Public.Diem;
import Hiberneat.Public.Khoa;
import Hiberneat.Public.Lop;
import Login.Const;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class QuanLiKhoa extends javax.swing.JPanel {

    JButton button = new JButton();

    public QuanLiKhoa() {
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

        Table.getColumn("").setCellRenderer(new ButtonRenderer());
        Table.getColumn("").setCellEditor(new ButtonEditor(new JCheckBox()));
        sp.getViewport().setBackground(Color.WHITE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        sp = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaKhoa = new javax.swing.JTextField();
        txtTenKhoa = new javax.swing.JTextField();
        btnsua = new javax.swing.JButton();
        btnnhap = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemKeyReleased(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên Khoa", "Mã  Khoa", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Tìm kiếm :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                        .addGap(246, 246, 246)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mã Khoa :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tên Khoa :");

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
        btnsua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsuaKeyPressed(evt);
            }
        });

        btnnhap.setBackground(new java.awt.Color(255, 255, 255));
        btnnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_checkmark_20px_1.png"))); // NOI18N
        btnnhap.setText("Nhập");
        btnnhap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnnhap.setContentAreaFilled(false);
        btnnhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnhap.setOpaque(true);
        btnnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnnhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnnhapMouseExited(evt);
            }
        });
        btnnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                            .addComponent(txtTenKhoa))))
                .addGap(316, 316, 316))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhapActionPerformed
        Khoa khoa = new Khoa();
        int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Thêm Thông tin này", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
        if (option == 0) {
            if (txtMaKhoa.getText().isEmpty() && txtTenKhoa.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Không Được Để Trống", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

            } else {
                if (CheckTenMaKhoa()) {
                    JOptionPane.showMessageDialog(null, "Đã Có Mã Khoa Này Trong Danh Sách", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                } else {
                    khoa.setMakhoa(txtMaKhoa.getText());
                    khoa.setTenKhoa(txtTenKhoa.getText());
                    Const.session.getTransaction().begin();
                    Const.session.save(khoa);
                    Const.session.getTransaction().commit();
                    LoadDataKhoa();
                    JOptionPane.showMessageDialog(null, "Nhập Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                }
            }
        } else {

        }
    }//GEN-LAST:event_btnnhapActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int index = Table.getSelectedRow();
        if (index >= 0) {
            txtMaKhoa.setText(Table.getValueAt(index, 0).toString());
            txtTenKhoa.setText(Table.getValueAt(index, 1).toString());

        }
    }//GEN-LAST:event_TableMouseClicked

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
        String query = txttimkiem.getText();
        SearchLop(query);
    }//GEN-LAST:event_txttimkiemKeyReleased

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        int index = Table.getSelectedRow();
        if (index >= 0) {
            int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Sửa Thông tin Này", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

            if (option == 0) {
                if (CheckMaKhoaLop()) {
                    JOptionPane.showMessageDialog(null, "Hiện Tại Có Sinh Viên Trong Danh Sách Này Vui lòng Không Thể Sửa Và Xoa", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                } else {
                    if (CheckMaKhoaMonHoc()) {
                        JOptionPane.showMessageDialog(null, "Hiện Tại Có Sinh Viên Trong Danh Sách Này Vui lòng Không Thể Sửa Và Xoa", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                    } else {
                        Khoa Sua = Const.session.get(Khoa.class, Table.getValueAt(index, 0).toString());
                        Sua.setMakhoa(txtMaKhoa.getText());
                        Sua.setTenKhoa(txtTenKhoa.getText());
                        Const.session.getTransaction().begin();
                        Const.session.delete(Sua);
                        Const.session.save(Sua);
                        Const.session.getTransaction().commit();
                        LoadDataKhoa();
                        JOptionPane.showMessageDialog(null, "bạn sửa  danh Sách thành công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                    }

                }

            } else {

            }

        } else {
            JOptionPane.showMessageDialog(null, "bạn Chưa Chọn danh Sách Nào", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnnhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnhapMouseEntered
        btnnhap.setBackground(Color.YELLOW);
        btnnhap.setForeground(Color.RED);
    }//GEN-LAST:event_btnnhapMouseEntered

    private void btnnhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnhapMouseExited
        btnnhap.setBackground(Color.WHITE);
        btnnhap.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnnhapMouseExited

    private void btnsuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsuaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsuaKeyPressed

    private void btnsuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuaMouseEntered
        btnsua.setBackground(Color.YELLOW);
        btnsua.setForeground(Color.RED);
    }//GEN-LAST:event_btnsuaMouseEntered

    private void btnsuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuaMouseExited
        btnsua.setBackground(Color.WHITE);
        btnsua.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnsuaMouseExited
    //
    private void SearchLop(String query) {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));

    }

    //
    public void LoadDataKhoa() {
        Const.ListKhoa = null;
        Query q = Const.session.createQuery("FROM Khoa");
        Const.ListKhoa = q.getResultList();
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);

        for (Khoa item : Const.ListKhoa) {
            Vector<Object> vector = new Vector();
            vector.add(item.getMakhoa());
            vector.add(item.getTenKhoa());
            model.addRow(vector);

        }
    }

    //
    private void init() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = Table.getSelectedRow();

                if (index >= 0) {
                    int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Xóa Thông Tin Này Không", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_warning_shield_20px_1.png")));
                    if (option == 0) {
                        if (CheckMaKhoaLop()) {
                            JOptionPane.showMessageDialog(null, "Hiện Tại Có Sinh Viên Trong Danh Sách Này Vui lòng Không Thể Sửa Và Xoa", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                        } else {
                            if (CheckMaKhoaMonHoc()) {
                                JOptionPane.showMessageDialog(null, "Hiện Tại Có Sinh Viên Trong Danh Sách Này Vui lòng Không Thể Sửa Và Xoa", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                            } else {
                                Khoa Delete = Const.session.get(Khoa.class, Table.getValueAt(index, 0).toString());
                                Const.session.getTransaction().begin();
                                Const.session.delete(Delete);
                                Const.session.getTransaction().commit();
                                JOptionPane.showMessageDialog(null, "Xóa Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                                Table.removeEditor();
                                LoadDataKhoa();
                            }

                        }

                    } else {

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "bạn Chưa Chọn danh Sách Nào", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                }
            }
        });

    }

    //
    private boolean CheckTenMaKhoa() {
        for (int i = 0; i < Const.ListKhoa.size(); i++) {
            if (txtMaKhoa.getText().equals(Const.ListKhoa.get(i).getMakhoa())) {
                return true;
            }
        }
        return false;

    }

    private boolean CheckMaKhoaLop() {
        int index = Table.getSelectedRow();
        Const.ListLop = null;
        Query query = Const.session.createQuery("From Lop");
        Const.ListLop = query.getResultList();
        for (int j = 0; j < Const.ListLop.size(); j++) {
            while (Const.ListLop.get(j).getMakhoa().equals(Table.getValueAt(index, 0).toString())) {
                return true;
            }
        }

        return false;
    }

    private boolean CheckMaKhoaMonHoc() {
        int index = Table.getSelectedRow();
        Const.ListMonhoc = null;
        Query query = Const.session.createQuery("From Monhoc");
        Const.ListMonhoc = query.getResultList();
        for (int j = 0; j < Const.ListMonhoc.size(); j++) {
            while (Const.ListMonhoc.get(j).getMaKhoa().equals(Table.getValueAt(index, 0).toString())) {
                return true;
            }
        }

        return false;
    }

    //
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
    private javax.swing.JButton btnnhap;
    private javax.swing.JButton btnsua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane sp;
    private javax.swing.JTextField txtMaKhoa;
    private javax.swing.JTextField txtTenKhoa;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
