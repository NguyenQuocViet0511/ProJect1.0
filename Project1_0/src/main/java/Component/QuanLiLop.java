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
public class QuanLiLop extends javax.swing.JPanel {

    JButton button = new JButton();

    public QuanLiLop() {
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
        jLabel4 = new javax.swing.JLabel();
        txtMalop = new javax.swing.JTextField();
        txtTenLop = new javax.swing.JTextField();
        btnsua = new javax.swing.JButton();
        btnnhap = new javax.swing.JButton();
        cbnmakhoa = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemKeyReleased(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Lớp", "Tên Lớp", "Mã  Khoa", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                .addGap(256, 256, 256))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mã Lớp :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tên Lớp :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Mã Khoa :");

        txtTenLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenLopActionPerformed(evt);
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTenLop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                            .addComponent(txtMalop, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(273, 273, 273))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbnmakhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMalop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbnmakhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
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
        if (txtMalop.getText().isEmpty() && txtTenLop.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không Được Để Trống", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
        } else {
            if (CheckTenMaLop()) {
                JOptionPane.showMessageDialog(null, "Đã Có Mã Lớp Này Trong Danh Sach", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
            } else {
                int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Thêm Thông tin này", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                if (option == 0) {
                    Lop lop = new Lop();
                    lop.setMalop(txtMalop.getText());
                    lop.setTenLop(txtTenLop.getText());
                    lop.setMakhoa(cbnmakhoa.getSelectedItem().toString());
                    Const.session.getTransaction().begin();
                    Const.session.save(lop);
                    Const.session.getTransaction().commit();
                    JOptionPane.showMessageDialog(null, "Thêm Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                    LoadDataLop();
                } else {
                }

            }
        }
    }//GEN-LAST:event_btnnhapActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int index = Table.getSelectedRow();
        if (index >= 0) {
            txtMalop.setText(Table.getValueAt(index, 0).toString());
            txtTenLop.setText(Table.getValueAt(index, 1).toString());
            cbnmakhoa.setSelectedItem(Table.getValueAt(index, 2).toString());
        }
    }//GEN-LAST:event_TableMouseClicked

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
        String query = txttimkiem.getText();
        SearchLop(query);
    }//GEN-LAST:event_txttimkiemKeyReleased

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        int index = Table.getSelectedRow();

        if (index >= 0) {
            int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Sửa Thông tin này", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
            if (option == 0) {
                if (CheckTenMaLop()) {
                    JOptionPane.showMessageDialog(null, "Hiện Tại đã có Danh Sách Này Vui lòng Không Thể Sửa Vui Lòng Sửa Tên Khác", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                } else {
                    if (CheckMaLopSV()) {
                        JOptionPane.showMessageDialog(null, "Hiện Tại đã có Danh Sách Này Vui lòng Không Thể Sửa Vui Lòng Sửa Tên Khác", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                    } else {
                        Lop Sua = Const.session.get(Lop.class, Table.getValueAt(index, 0).toString());
                        Sua.setMalop(txtMalop.getText());
                        Sua.setTenLop(txtTenLop.getText());
                        Sua.setMakhoa(cbnmakhoa.getSelectedItem().toString());
                        Const.session.getTransaction().begin();
                        Const.session.delete(Sua);
                        Const.session.save(Sua);
                        Const.session.getTransaction().commit();
                        LoadDataLop();
                        JOptionPane.showMessageDialog(null, "Sửa Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

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

    private void txtTenLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenLopActionPerformed
    //
    private void SearchLop(String query) {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));

    }

    //
    public void LoadDataLop() {
        Const.ListLop = null;
        Query q = Const.session.createQuery("FROM Lop");
        Const.ListLop = q.getResultList();
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);

        for (Lop item : Const.ListLop) {
            Vector<Object> vector = new Vector();
            vector.add(item.getMalop());
            vector.add(item.getMalop());
            vector.add(item.getMakhoa());
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
                    int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Xóa Thông Tin Này Không", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                    if (option == 0) {
                        if (CheckMaLopSV()) {
                            JOptionPane.showMessageDialog(null, "Hiện Tại Có Sinh Viên Trong Danh Sách Này Vui lòng Không Thể Sửa Và Xoa", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                        } else {
                            Lop Delete = Const.session.get(Lop.class, Table.getValueAt(index, 0).toString());
                            Const.session.getTransaction().begin();
                            Const.session.delete(Delete);
                            Const.session.getTransaction().commit();
                            JOptionPane.showMessageDialog(null, "Xóa Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                            Table.removeEditor();
                            LoadDataLop();
                        }

                    } else {

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "bạn Chưa Chọn danh Sách Nào", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                }
            }
        });

    }

    private boolean CheckTenMaLop() {
        for (int i = 0; i < Const.ListLop.size(); i++) {
            if (txtMalop.getText().equals(Const.ListLop.get(i).getMalop())) {
                return true;
            }
        }
        return false;

    }

    private boolean CheckMaLopSV() {
        Const.ListSinhVien = null;
        Query q = Const.session.createQuery("FROM SinhVien");
        Const.ListSinhVien = q.getResultList();

        int index = Table.getSelectedRow();
        for (int j = 0; j < Const.ListSinhVien.size(); j++) {
            while (Const.ListSinhVien.get(j).getMaLop().equals(Table.getValueAt(index, 0).toString())) {
                return true;
            }

        }

        return false;

    }

    //
    public void AddMakhoa() {
        cbnmakhoa.removeAllItems();
        Const.ListKhoa = null;
        Query q = Const.session.createQuery("FROM Khoa");
        Const.ListKhoa = q.getResultList();
        for (Khoa item : Const.ListKhoa) {
            cbnmakhoa.addItem(item.getMakhoa());

        }

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
    private javax.swing.JComboBox<String> cbnmakhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane sp;
    private javax.swing.JTextField txtMalop;
    private javax.swing.JTextField txtTenLop;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
