/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import Hiberneat.Public.ThiLai;
import Login.Const;
import Menu.students;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.persistence.Query;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author admin
 */
public class DanhSachDangKyThiLai extends javax.swing.JPanel {

    JButton button = new JButton();

    public DanhSachDangKyThiLai() {
        initComponents();
        Table();
//        LoadDataDangKyThiLai();
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
        Table.getColumn("").setMinWidth(20);

    }

    //load
    public void LoadDataDangKyThiLai() {

        Query query = Const.session.createQuery("SELECT T.MaMon,T.ID,T.tieude FROM  ThiLai T where T.MaSV=" + "'" + Const.user.getUserName() + "'");
        List<Object[]> ListResult = query.getResultList();
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        for (Object[] item : ListResult) {

            model.addRow(item);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Môn", "Môn", "Tiêu Đề", ""
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
        sp.setViewportView(Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 1219, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = Table.getSelectedRow();
                if (index >= 0) {
                    int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn hủy Thông Tin Này Không", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_warning_shield_20px_1.png")));
                    if (option == 0) {
                        String search = Table.getValueAt(index, 1).toString();
                        ThiLai thiLai = Const.session.get(ThiLai.class, search);

                        Const.session.getTransaction().begin();
                        Const.session.delete(thiLai);
                        Const.session.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "hủy Thành Công", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                        Table.removeEditor();
                        LoadDataDangKyThiLai();

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Bạn chọn quá nhanh", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                }

            }
        });
    }
    //

    class ButtonEditor extends DefaultCellEditor {

        public ButtonEditor(JCheckBox checkBox) {

            super(checkBox);
//        setOpaque(false);
//        setBackground(Color.white);
            button.setText("Hủy Đăng Ký");
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
            setText("Hủy Đăng Ký");

        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            return this;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
