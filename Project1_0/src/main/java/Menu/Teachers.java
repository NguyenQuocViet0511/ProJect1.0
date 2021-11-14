/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Menu;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author admin
 */
public class Teachers extends javax.swing.JPanel {

    boolean icon = true;

    public Teachers() {
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

    public void EnvenButtonDanhsachThiLai(MouseAdapter Etv) {
        btndanhsachthilai.addMouseListener(Etv);
    }

    public void EnvenButtonDanhsachRotMon(MouseAdapter Etv) {
        btndanhsachrotmon.addMouseListener(Etv);
    }

    public void EnvenButtonQuanLiSinhVien(MouseAdapter Etv) {
        btnquanlisinhvien.addMouseListener(Etv);
    }

    public void EnvenButtonQuanLiDiem(MouseAdapter Etv) {
        btnquanlidiem.addMouseListener(Etv);
    }

    public void EnvenButtonQuanLiLop(MouseAdapter Etv) {
        btnquanlilop.addMouseListener(Etv);
    }

    public void EnvenButtonQuanLiKhoa(MouseAdapter Etv) {
        btnquanlikhoa.addMouseListener(Etv);
    }

    public void EnvenButtonQuanLiMonhoc(MouseAdapter Etv) {
        btnquanlimonhoc.addMouseListener(Etv);
    }

    public void EnvenButtonIcon(MouseAdapter Etv) {
        button1.addMouseListener(Etv);
    }

    public boolean Enable() {
        if (button.isEnabled() == false && button1.isEnabled() == false) {
            return true;
        }
        return false;
    }

    public void Enabletrue() {
        button.setEnabled(true);
        button1.setEnabled(true);
    }

    public void Enablefalse() {
        button.setEnabled(false);
        button1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnquanlidiem = new javax.swing.JLabel();
        btnquanlilop = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnquanlikhoa = new javax.swing.JLabel();
        btnquanlimonhoc = new javax.swing.JLabel();
        btndanhsachrotmon = new javax.swing.JLabel();
        btndanhsachthilai = new javax.swing.JLabel();
        btnquanlisinhvien = new javax.swing.JLabel();
        buttona = new javax.swing.JPanel();
        button1 = new javax.swing.JLabel();
        button = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(153, 153, 255));

        btnquanlidiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_book_and_pencil_30px.png"))); // NOI18N
        btnquanlidiem.setText("Quản Lí Điểm");
        btnquanlidiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnquanlidiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnquanlidiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnquanlidiemMouseExited(evt);
            }
        });

        btnquanlilop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_book_and_pencil_30px.png"))); // NOI18N
        btnquanlilop.setText("Quản Lí lớp");
        btnquanlilop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnquanlilop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnquanlilopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnquanlilopMouseExited(evt);
            }
        });

        btnquanlikhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_book_and_pencil_30px.png"))); // NOI18N
        btnquanlikhoa.setText("Quản Lí Khoa");
        btnquanlikhoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnquanlikhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnquanlikhoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnquanlikhoaMouseExited(evt);
            }
        });

        btnquanlimonhoc.setBackground(new java.awt.Color(153, 153, 255));
        btnquanlimonhoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_book_and_pencil_30px.png"))); // NOI18N
        btnquanlimonhoc.setText("Quản Lí Môn Học");
        btnquanlimonhoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnquanlimonhoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnquanlimonhocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnquanlimonhocMouseExited(evt);
            }
        });

        btndanhsachrotmon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_tasklist_30px.png"))); // NOI18N
        btndanhsachrotmon.setText("Danh Sách Sinh Viên Rớt Môn");
        btndanhsachrotmon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndanhsachrotmon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndanhsachrotmonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndanhsachrotmonMouseExited(evt);
            }
        });

        btndanhsachthilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_tasklist_30px.png"))); // NOI18N
        btndanhsachthilai.setText("Danh Sách Thi Lại");
        btndanhsachthilai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndanhsachthilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndanhsachthilaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndanhsachthilaiMouseExited(evt);
            }
        });

        btnquanlisinhvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_mba_30px.png"))); // NOI18N
        btnquanlisinhvien.setText("Quản Lí Sinh Viên");
        btnquanlisinhvien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnquanlisinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnquanlisinhvienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnquanlisinhvienMouseExited(evt);
            }
        });

        buttona.setBackground(new java.awt.Color(255, 153, 153));
        buttona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttona.setOpaque(false);

        button1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_tuition_30px.png"))); // NOI18N
        button1.setText("Giáo Viên");
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_expand_arrow_30px_1.png"))); // NOI18N
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMouseClicked(evt);
            }
        });

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
            .addComponent(btnquanlidiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnquanlimonhoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(btnquanlilop, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(btnquanlikhoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnquanlisinhvien, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(btndanhsachrotmon, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(btndanhsachthilai, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnquanlimonhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnquanlikhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnquanlidiem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnquanlilop, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnquanlisinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndanhsachrotmon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndanhsachthilai, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked

    }//GEN-LAST:event_button1MouseClicked

    private void btnquanlimonhocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanlimonhocMouseEntered
        btnquanlimonhoc.setForeground(Color.red);
    }//GEN-LAST:event_btnquanlimonhocMouseEntered

    private void btnquanlimonhocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanlimonhocMouseExited
        btnquanlimonhoc.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnquanlimonhocMouseExited

    private void btnquanlikhoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanlikhoaMouseEntered
        btnquanlikhoa.setForeground(Color.red);
    }//GEN-LAST:event_btnquanlikhoaMouseEntered

    private void btnquanlikhoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanlikhoaMouseExited
        btnquanlikhoa.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnquanlikhoaMouseExited

    private void btnquanlidiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanlidiemMouseEntered
        btnquanlidiem.setForeground(Color.red);
    }//GEN-LAST:event_btnquanlidiemMouseEntered

    private void btnquanlidiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanlidiemMouseExited
        btnquanlidiem.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnquanlidiemMouseExited

    private void btnquanlilopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanlilopMouseEntered
        btnquanlilop.setForeground(Color.red);
    }//GEN-LAST:event_btnquanlilopMouseEntered

    private void btnquanlilopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanlilopMouseExited
        btnquanlilop.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnquanlilopMouseExited

    private void btnquanlisinhvienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanlisinhvienMouseExited
        btnquanlisinhvien.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnquanlisinhvienMouseExited

    private void btnquanlisinhvienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquanlisinhvienMouseEntered
        btnquanlisinhvien.setForeground(Color.RED);
    }//GEN-LAST:event_btnquanlisinhvienMouseEntered

    private void btndanhsachrotmonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndanhsachrotmonMouseEntered
        btndanhsachrotmon.setForeground(Color.RED);
    }//GEN-LAST:event_btndanhsachrotmonMouseEntered

    private void btndanhsachrotmonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndanhsachrotmonMouseExited
        btndanhsachrotmon.setForeground(Color.BLACK);
    }//GEN-LAST:event_btndanhsachrotmonMouseExited

    private void btndanhsachthilaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndanhsachthilaiMouseEntered
        btndanhsachthilai.setForeground(Color.RED);
    }//GEN-LAST:event_btndanhsachthilaiMouseEntered

    private void btndanhsachthilaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndanhsachthilaiMouseExited
        btndanhsachthilai.setForeground(Color.BLACK);
    }//GEN-LAST:event_btndanhsachthilaiMouseExited

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseClicked

    }//GEN-LAST:event_buttonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btndanhsachrotmon;
    private javax.swing.JLabel btndanhsachthilai;
    private javax.swing.JLabel btnquanlidiem;
    private javax.swing.JLabel btnquanlikhoa;
    private javax.swing.JLabel btnquanlilop;
    private javax.swing.JLabel btnquanlimonhoc;
    private javax.swing.JLabel btnquanlisinhvien;
    private javax.swing.JLabel button;
    private javax.swing.JLabel button1;
    private javax.swing.JPanel buttona;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
