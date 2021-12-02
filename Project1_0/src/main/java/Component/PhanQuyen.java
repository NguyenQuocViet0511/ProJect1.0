/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import Hiberneat.User.User;
import Login.Const;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class PhanQuyen extends javax.swing.JPanel {

    /**
     * Creates new form PhanQuyen
     */
    public PhanQuyen() {
        initComponents();
        setOpaque(false);
        Table();
        LoadDataResource();

    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, Color.white, getWidth(), 0, new Color(93, 58, 196));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sp = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxthoveTen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtTenDangNhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CbnQuyen = new javax.swing.JComboBox<>();
        btnQuyen = new javax.swing.JButton();
        BtnResetQuyen = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setOpaque(false);

        sp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Họ Và Tên", "Tên Đăng Nhập", "Quyền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sp.setViewportView(Table);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Họ Và Tên :");

        TxthoveTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TxthoveTen.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tên Đăng Nhập :");

        TxtTenDangNhap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TxtTenDangNhap.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Quyền :");

        btnQuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_checkmark_20px_1.png"))); // NOI18N
        btnQuyen.setText("Phân Quyền");
        btnQuyen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuyenActionPerformed(evt);
            }
        });

        BtnResetQuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_refresh_20px.png"))); // NOI18N
        BtnResetQuyen.setText("Reset Quyền");
        BtnResetQuyen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnResetQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetQuyenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTenDangNhap)
                    .addComponent(TxthoveTen)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbnQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(BtnResetQuyen)))
                        .addGap(0, 646, Short.MAX_VALUE)))
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxthoveTen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CbnQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnResetQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1239, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuyenActionPerformed
        int index = Table.getSelectedRow();
        if (index >= 0) {
            int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Phân quyền cho người này", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
            if (option == 0) {
                User Sua = Const.session.get(User.class, Table.getValueAt(index, 1).toString());
                Sua.setQuyen(CbnQuyen.getSelectedItem().toString());
                Const.session.getTransaction().begin();
                Const.session.save(Sua);
                Const.session.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Phân Quyền Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                LoadDataResource();
            } else {

            }

        } else {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn Danh Sách Nào", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

        }

    }//GEN-LAST:event_btnQuyenActionPerformed

    private void BtnResetQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetQuyenActionPerformed
        int index = Table.getSelectedRow();
        if (index >= 0) {
            int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Reset quyền người này", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
            if (option == 0) {
                User Sua = Const.session.get(User.class, Table.getValueAt(index, 1).toString());
                Sua.setQuyen("User");
                Const.session.getTransaction().begin();
                Const.session.save(Sua);
                Const.session.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Reset Quyền Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                LoadDataResource();
            } else {

            }

        } else {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn Danh Sách Nào", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

        }
    }//GEN-LAST:event_BtnResetQuyenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnResetQuyen;
    private javax.swing.JComboBox<String> CbnQuyen;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TxtTenDangNhap;
    private javax.swing.JTextField TxthoveTen;
    private javax.swing.JButton btnQuyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables

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
        String[] Position = {"Admin", "GiaoVien", "SinhVien", "User"};
        for (String item : Position) {
            CbnQuyen.addItem(item);

        }
        Table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index = Table.getSelectedRow();
                if (index >= 0) {
                    TxthoveTen.setText(Table.getValueAt(index, 0).toString());
                    TxtTenDangNhap.setText(Table.getValueAt(index, 1).toString());
                    CbnQuyen.setSelectedItem(Table.getValueAt(index, 2).toString());
                }
            }

        });
        sp.getViewport().setBackground(Color.WHITE);
    }

    public void LoadDataResource() {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        Const.ListUser = null;
        Query q = Const.session.createQuery("FROM User");
        Const.ListUser = q.getResultList();
        model.setRowCount(0);
        for (User item : Const.ListUser) {
            Vector<Object> vector = new Vector();
            vector.add(item.getHovaTen());
            vector.add(item.getUserName());
            vector.add(item.getQuyen());
            model.addRow(vector);

        }
    }

}
