/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author admin
 */
public class TrangChu extends javax.swing.JPanel {

    public boolean Kiemtra = true;

    public TrangChu() {
        initComponents();
        setOpaque(false);

    }

    public void AddEnventButtonTrangChu(java.awt.event.MouseAdapter evt) {
        btnTrangChu.addMouseListener(evt);

    }

    public void AddEnventButtonThongTin(java.awt.event.MouseAdapter evt) {
        btnThongTin.addMouseListener(evt);

    }

    public void AddEnventButtonAdmin(java.awt.event.MouseAdapter evt) {
        btnAdmin.addMouseListener(evt);

    }

    public void AddEnventButtonDoimatKhau(java.awt.event.MouseAdapter evt) {
        BtnDoimatKhau.addMouseListener(evt);

    }

    public void AddEnventButtonThoat(java.awt.event.MouseAdapter evt) {
        btnThoat.addMouseListener(evt);

    }

    public void AddEnventButtonXemDiem(java.awt.event.MouseAdapter evt) {
        btnXemdiem.addMouseListener(evt);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroudThongtin = new javax.swing.JPanel();
        btnThongTin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Backgrounđoimatkhau = new javax.swing.JPanel();
        BtnDoimatKhau = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BackgroundTrangchu = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backGourndThoat = new javax.swing.JPanel();
        btnThoat = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backgroundadmin = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BackGroundXemDiem = new javax.swing.JPanel();
        btnXemdiem = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setOpaque(false);

        backgroudThongtin.setBackground(new java.awt.Color(255, 255, 255));
        backgroudThongtin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_male_user_100px_1.png"))); // NOI18N
        btnThongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongTinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongTinMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Thông Tin");

        javax.swing.GroupLayout backgroudThongtinLayout = new javax.swing.GroupLayout(backgroudThongtin);
        backgroudThongtin.setLayout(backgroudThongtinLayout);
        backgroudThongtinLayout.setHorizontalGroup(
            backgroudThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroudThongtinLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(backgroudThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroudThongtinLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        backgroudThongtinLayout.setVerticalGroup(
            backgroudThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroudThongtinLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        Backgrounđoimatkhau.setBackground(new java.awt.Color(255, 255, 255));
        Backgrounđoimatkhau.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        BtnDoimatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_unlock_private_100px_1.png"))); // NOI18N
        BtnDoimatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDoimatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnDoimatKhauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnDoimatKhauMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Đổi Mật Khẩu");

        javax.swing.GroupLayout BackgrounđoimatkhauLayout = new javax.swing.GroupLayout(Backgrounđoimatkhau);
        Backgrounđoimatkhau.setLayout(BackgrounđoimatkhauLayout);
        BackgrounđoimatkhauLayout.setHorizontalGroup(
            BackgrounđoimatkhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgrounđoimatkhauLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(BackgrounđoimatkhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgrounđoimatkhauLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(104, 104, 104))
                    .addGroup(BackgrounđoimatkhauLayout.createSequentialGroup()
                        .addComponent(BtnDoimatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(97, 97, 97))))
        );
        BackgrounđoimatkhauLayout.setVerticalGroup(
            BackgrounđoimatkhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgrounđoimatkhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDoimatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackgroundTrangchu.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundTrangchu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_100px_1.png"))); // NOI18N
        btnTrangChu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Trang Chủ");

        javax.swing.GroupLayout BackgroundTrangchuLayout = new javax.swing.GroupLayout(BackgroundTrangchu);
        BackgroundTrangchu.setLayout(BackgroundTrangchuLayout);
        BackgroundTrangchuLayout.setHorizontalGroup(
            BackgroundTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundTrangchuLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(BackgroundTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackgroundTrangchuLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        BackgroundTrangchuLayout.setVerticalGroup(
            BackgroundTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundTrangchuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        backGourndThoat.setBackground(new java.awt.Color(255, 255, 255));
        backGourndThoat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_logout_rounded_left_100px.png"))); // NOI18N
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThoatMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Thoát");

        javax.swing.GroupLayout backGourndThoatLayout = new javax.swing.GroupLayout(backGourndThoat);
        backGourndThoat.setLayout(backGourndThoatLayout);
        backGourndThoatLayout.setHorizontalGroup(
            backGourndThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGourndThoatLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(backGourndThoatLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backGourndThoatLayout.setVerticalGroup(
            backGourndThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGourndThoatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backgroundadmin.setBackground(new java.awt.Color(255, 255, 255));
        backgroundadmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_admin_settings_male_100px.png"))); // NOI18N
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdminMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Admin");

        javax.swing.GroupLayout backgroundadminLayout = new javax.swing.GroupLayout(backgroundadmin);
        backgroundadmin.setLayout(backgroundadminLayout);
        backgroundadminLayout.setHorizontalGroup(
            backgroundadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundadminLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundadminLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        backgroundadminLayout.setVerticalGroup(
            backgroundadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundadminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackGroundXemDiem.setBackground(new java.awt.Color(255, 255, 255));
        BackGroundXemDiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnXemdiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_mark_view_as_non_hidden_100px_1.png"))); // NOI18N
        btnXemdiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXemdiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXemdiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXemdiemMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Xem Điểm");

        javax.swing.GroupLayout BackGroundXemDiemLayout = new javax.swing.GroupLayout(BackGroundXemDiem);
        BackGroundXemDiem.setLayout(BackGroundXemDiemLayout);
        BackGroundXemDiemLayout.setHorizontalGroup(
            BackGroundXemDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundXemDiemLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(BackGroundXemDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXemdiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackGroundXemDiemLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        BackGroundXemDiemLayout.setVerticalGroup(
            BackGroundXemDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundXemDiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnXemdiem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backGourndThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackgroundTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Backgrounđoimatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backgroundadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backgroudThongtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackGroundXemDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BackgroundTrangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backgroudThongtin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Backgrounđoimatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(backgroundadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backGourndThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackGroundXemDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongTinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinMouseEntered
        backgroudThongtin.setBackground(Color.YELLOW);
    }//GEN-LAST:event_btnThongTinMouseEntered

    private void btnThongTinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinMouseExited
        backgroudThongtin.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnThongTinMouseExited

    private void btnTrangChuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseEntered
        BackgroundTrangchu.setBackground(Color.YELLOW);
    }//GEN-LAST:event_btnTrangChuMouseEntered

    private void btnTrangChuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseExited
        BackgroundTrangchu.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnTrangChuMouseExited

    private void BtnDoimatKhauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDoimatKhauMouseEntered
        Backgrounđoimatkhau.setBackground(Color.YELLOW);
    }//GEN-LAST:event_BtnDoimatKhauMouseEntered

    private void BtnDoimatKhauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDoimatKhauMouseExited
        Backgrounđoimatkhau.setBackground(Color.WHITE);
    }//GEN-LAST:event_BtnDoimatKhauMouseExited

    private void btnThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseEntered
        backGourndThoat.setBackground(Color.RED);
    }//GEN-LAST:event_btnThoatMouseEntered

    private void btnThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseExited
        backGourndThoat.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnThoatMouseExited

    private void btnAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseEntered
        backgroundadmin.setBackground(Color.YELLOW);
    }//GEN-LAST:event_btnAdminMouseEntered

    private void btnAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseExited
        backgroundadmin.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnAdminMouseExited

    private void btnXemdiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemdiemMouseExited
        BackGroundXemDiem.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnXemdiemMouseExited

    private void btnXemdiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemdiemMouseEntered
        BackGroundXemDiem.setBackground(Color.YELLOW);
    }//GEN-LAST:event_btnXemdiemMouseEntered

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, Color.white, getWidth(), 0, new Color(93, 58, 196));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    public boolean EnableCheckAdmin() {

        if (btnAdmin.isEnabled() == false ) {
            return true;
        }
        return false;

    }
    public boolean EnableCheckXemDiem() {

        if ( btnXemdiem.isEnabled() == false) {
            return true;
        }
        return false;

    }
    public void EnableAdmmintrue()
    {
     btnAdmin.setEnabled(true);

    }
     public void EnableAdminfalse()
    {
     btnAdmin.setEnabled(false);

    }
      public void EnableXemDiemtrue()
    {

     btnXemdiem.setEnabled(true);
    }
     public void EnableXemDiemfalse()
    {

     btnXemdiem.setEnabled(false);
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundXemDiem;
    private javax.swing.JPanel BackgroundTrangchu;
    private javax.swing.JPanel Backgrounđoimatkhau;
    private javax.swing.JLabel BtnDoimatKhau;
    private javax.swing.JPanel backGourndThoat;
    private javax.swing.JPanel backgroudThongtin;
    private javax.swing.JPanel backgroundadmin;
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnThoat;
    private javax.swing.JLabel btnThongTin;
    private javax.swing.JLabel btnTrangChu;
    private javax.swing.JLabel btnXemdiem;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
