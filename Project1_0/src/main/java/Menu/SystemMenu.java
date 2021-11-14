/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Menu;

//import Component.Table;
import Hiberneat.User.User;
import Login.Const;
import Login.Login;
import Main.FormMain;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class SystemMenu extends javax.swing.JPanel {

    boolean icon = true;
    public boolean kiemtra = true;

    public SystemMenu() {
        initComponents();
        setOpaque(false);

    }
    boolean showmenu = true;

    public boolean isShowmenu() {
        return showmenu;
    }

    public void setShowmenu(boolean showmenu) {
        this.showmenu = showmenu;
    }

    public void addevent(MouseListener event) {
        button.addMouseListener(event);

    }

    public void addButtonEvtQuanLitaiKhoan(MouseAdapter evt) {
        btnQuanLitaiKhoan.addMouseListener(evt);

    }

    public void addButtonEvtThongTin(MouseAdapter event) {

        btnthongtincanhan.addMouseListener(event);

    }

    public void addButtonEvtTrangChu(MouseAdapter event) {

        btnTrangChu.addMouseListener(event);

    }

    public void addButtonEvtDoiMatKhau(MouseAdapter event) {

        btndoimatkhau.addMouseListener(event);

    }

    public void addButtonEvtPhanQuyen(MouseAdapter event) {

        btnquanquyen.addMouseListener(event);

    }

    public void addButtonEvtThoat(MouseAdapter event) {

        btnthoat.addMouseListener(event);

    }
    public void addButtonEvtIcon(MouseAdapter event) {

        button1.addMouseListener(event);

    }
    public boolean Enable() {

        if (btnQuanLitaiKhoan.isEnabled() == false && btnquanquyen.isEnabled() == false) {
            return true;
        }
        return false;
    }

    public void Enablefalse() {
        btnQuanLitaiKhoan.setEnabled(false);
        btnquanquyen.setEnabled(false);
    }

    public void Enabletrue() {
        btnQuanLitaiKhoan.setEnabled(true);
        btnquanquyen.setEnabled(true);
    }

    public void label() {
        if (icon) {
            button.setIcon(new ImageIcon(getClass().getResource("/img/icons8_collapse_arrow_30px_1.png")));

//            lableicon.setIcon(new ImageIcon(getClass().getResource("/img/icons8_expand_arrow_30px_1.png")));
            icon = false;
        } else {

//            lableicon.setIcon(new ImageIcon(getClass().getResource("/img/icons8_collapse_arrow_30px_1.png")));
            button.setIcon(new ImageIcon(getClass().getResource("/img/icons8_expand_arrow_30px_1.png")));
            icon = true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnquanquyen = new javax.swing.JLabel();
        btnthoat = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnTrangChu = new javax.swing.JLabel();
        btndoimatkhau = new javax.swing.JLabel();
        btnthongtincanhan = new javax.swing.JLabel();
        btnQuanLitaiKhoan = new javax.swing.JLabel();
        buttona = new javax.swing.JPanel();
        button1 = new javax.swing.JLabel();
        button = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(153, 153, 255));

        btnquanquyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_portrait_30px.png"))); // NOI18N
        btnquanquyen.setText("Phân Quyền");
        btnquanquyen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnquanquyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnquanquyenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnquanquyenMouseExited(evt);
            }
        });

        btnthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_login_rounded_30px.png"))); // NOI18N
        btnthoat.setText("Thoát");
        btnthoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnthoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnthoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnthoatMouseExited(evt);
            }
        });

        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_30px.png"))); // NOI18N
        btnTrangChu.setText("Trang Chủ");
        btnTrangChu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseExited(evt);
            }
        });

        btndoimatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_password_window_30px.png"))); // NOI18N
        btndoimatkhau.setText("Đổi Mật Khẩu");
        btndoimatkhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndoimatkhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndoimatkhauMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndoimatkhauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndoimatkhauMouseExited(evt);
            }
        });

        btnthongtincanhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_male_user_30px.png"))); // NOI18N
        btnthongtincanhan.setText("Thông Tin Cá Nhân");
        btnthongtincanhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnthongtincanhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnthongtincanhanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnthongtincanhanMouseExited(evt);
            }
        });

        btnQuanLitaiKhoan.setBackground(new java.awt.Color(153, 153, 255));
        btnQuanLitaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_system_administrator_female_30px_1.png"))); // NOI18N
        btnQuanLitaiKhoan.setText("Quản Lí Tài Khoản");
        btnQuanLitaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuanLitaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLitaiKhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLitaiKhoanMouseExited(evt);
            }
        });

        buttona.setBackground(new java.awt.Color(255, 153, 153));
        buttona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttona.setOpaque(false);

        button1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_settings_30px_2.png"))); // NOI18N
        button1.setText("Hệ Thống");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_expand_arrow_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout buttonaLayout = new javax.swing.GroupLayout(buttona);
        buttona.setLayout(buttonaLayout);
        buttonaLayout.setHorizontalGroup(
            buttonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonaLayout.createSequentialGroup()
                .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button))
        );
        buttonaLayout.setVerticalGroup(
            buttonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnquanquyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnQuanLitaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(btnthoat, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(btndoimatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnthongtincanhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnQuanLitaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btndoimatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnquanquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnthongtincanhan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked

    }//GEN-LAST:event_button1MouseClicked

    private void btndoimatkhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndoimatkhauMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btndoimatkhauMouseClicked

    private void btnQuanLitaiKhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLitaiKhoanMouseEntered

        btnQuanLitaiKhoan.setForeground(Color.red);

    }//GEN-LAST:event_btnQuanLitaiKhoanMouseEntered

    private void btnQuanLitaiKhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLitaiKhoanMouseExited
        btnQuanLitaiKhoan.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnQuanLitaiKhoanMouseExited

    private void btndoimatkhauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndoimatkhauMouseEntered
        btndoimatkhau.setForeground(Color.red);
    }//GEN-LAST:event_btndoimatkhauMouseEntered

    private void btndoimatkhauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndoimatkhauMouseExited
        btndoimatkhau.setForeground(Color.BLACK);
    }//GEN-LAST:event_btndoimatkhauMouseExited

    private void btnquanquyenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanquyenMouseEntered
        btnquanquyen.setForeground(Color.red);
    }//GEN-LAST:event_btnquanquyenMouseEntered

    private void btnquanquyenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanquyenMouseExited
        btnquanquyen.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnquanquyenMouseExited

    private void btnTrangChuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseEntered
        btnTrangChu.setForeground(Color.red);
    }//GEN-LAST:event_btnTrangChuMouseEntered

    private void btnTrangChuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseExited
        btnTrangChu.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnTrangChuMouseExited

    private void btnthongtincanhanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthongtincanhanMouseEntered
        btnthongtincanhan.setForeground(Color.red);
    }//GEN-LAST:event_btnthongtincanhanMouseEntered

    private void btnthongtincanhanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthongtincanhanMouseExited
        btnthongtincanhan.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnthongtincanhanMouseExited

    private void btnthoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthoatMouseEntered
        btnthoat.setForeground(Color.red);
    }//GEN-LAST:event_btnthoatMouseEntered

    private void btnthoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthoatMouseExited
        btnthoat.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnthoatMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnQuanLitaiKhoan;
    private javax.swing.JLabel btnTrangChu;
    private javax.swing.JLabel btndoimatkhau;
    private javax.swing.JLabel btnquanquyen;
    private javax.swing.JLabel btnthoat;
    private javax.swing.JLabel btnthongtincanhan;
    private javax.swing.JLabel button;
    private javax.swing.JLabel button1;
    private javax.swing.JPanel buttona;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

//    private void AddUserList() {
//        Table table = new Table();
//        Const.ListUser = null;
//        Query q = Const.session.createQuery("FROM User");
//        Const.ListUser = q.getResultList();
//        
//        for (User item : Const.ListUser) {
//            Vector<Object> vector = new Vector();
//            vector.add(item.getHovaTen());
//            vector.add(item.getEmail());
//            vector.add(item.getUserName());
//            vector.add(item.getGioitinh());
//            vector.add(item.getNgaySinh());
//            vector.add(item.getDiaChi());
//            vector.add(item.getTrangThai());
//            vector.add(item.getQuyen());
//            table.addRow(vector);
//
//        }
//    }
}
