/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Menu;

import Component.DanhSachDangKyThiLai;
import Component.XemDiem;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class students extends javax.swing.JPanel {

    DanhSachDangKyThiLai dangKyThiLai = new DanhSachDangKyThiLai();
    boolean icon = true;
    public boolean Kiemtra = true;

    public students() {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btnlichdangkythilai = new javax.swing.JLabel();
        btnxemdiem = new javax.swing.JLabel();
        buttona = new javax.swing.JPanel();
        button1 = new javax.swing.JLabel();
        button = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(153, 153, 255));

        btnlichdangkythilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_invisible_30px.png"))); // NOI18N
        btnlichdangkythilai.setText("Xem Môn Đăng ký Thi Lại");
        btnlichdangkythilai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlichdangkythilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlichdangkythilaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlichdangkythilaiMouseExited(evt);
            }
        });

        btnxemdiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_grades_30px.png"))); // NOI18N
        btnxemdiem.setText("Xem Điểm");
        btnxemdiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnxemdiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnxemdiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnxemdiemMouseExited(evt);
            }
        });

        buttona.setBackground(new java.awt.Color(255, 153, 153));
        buttona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttona.setOpaque(false);

        button1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_student_male_30px_3.png"))); // NOI18N
        button1.setText("Sinh Viên");
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
            .addComponent(btnxemdiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(btnlichdangkythilai, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnxemdiem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnlichdangkythilai, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnxemdiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnxemdiemMouseEntered
        btnxemdiem.setForeground(Color.red);
    }//GEN-LAST:event_btnxemdiemMouseEntered

    private void btnxemdiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnxemdiemMouseExited
        btnxemdiem.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnxemdiemMouseExited

    private void btnlichdangkythilaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlichdangkythilaiMouseEntered
        btnlichdangkythilai.setForeground(Color.red);
    }//GEN-LAST:event_btnlichdangkythilaiMouseEntered

    private void btnlichdangkythilaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlichdangkythilaiMouseExited
        btnlichdangkythilai.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnlichdangkythilaiMouseExited

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseClicked

    }//GEN-LAST:event_buttonMouseClicked
    public void AddButtonEvtXemDiem(MouseAdapter Evt) {
        btnxemdiem.addMouseListener(Evt);
    }

    public void AddButtonEvtXemDanhSachdangkyThilai(MouseAdapter Evt) {
        btnlichdangkythilai.addMouseListener(Evt);
    }

    public void AddButtonEvtIcon(MouseAdapter Evt) {
        button1.addMouseListener(Evt);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnlichdangkythilai;
    private javax.swing.JLabel btnxemdiem;
    private javax.swing.JLabel button;
    private javax.swing.JLabel button1;
    private javax.swing.JPanel buttona;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
