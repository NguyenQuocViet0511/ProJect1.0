/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import Main.FormMain;
import Menu.SystemMenu;
import Menu.Teachers;

import Menu.students;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import scrollbar.ScrollBarCustom;

public class Menu extends javax.swing.JPanel {

    MigLayout migLayout;
    boolean showmenu = true;
    boolean showmenu1 = true;
    boolean showmenu2 = true;

    public boolean DongMenu;
    public boolean SoMenu;
    public boolean SoMenu1;
    public boolean SoMenu2;
    public boolean DongMenu1;
    public boolean DongMenu2;

    public boolean isShowmenu1() {
        return showmenu1;
    }

    public void setShowmenu1(boolean showmenu1) {
        this.showmenu1 = showmenu1;
    }

    public boolean isShowmenu2() {
        return showmenu2;
    }

    public void setShowmenu2(boolean showmenu2) {
        this.showmenu2 = showmenu2;
    }

    public boolean isSoMenu1() {
        return SoMenu1;
    }

    public void setSoMenu1(boolean SoMenu1) {
        this.SoMenu1 = SoMenu1;
    }

    public boolean isSoMenu2() {
        return SoMenu2;
    }

    public void setSoMenu2(boolean SoMenu2) {
        this.SoMenu2 = SoMenu2;
    }

    public boolean isSoMenu() {
        return SoMenu;
    }

    public void setSoMenu(boolean SoMenu) {
        this.SoMenu = SoMenu;
    }

    public boolean isDongMenu1() {
        return DongMenu1;
    }

    public void setDongMenu1(boolean DongMenu1) {
        this.DongMenu1 = DongMenu1;
    }

    public boolean isDongMenu2() {
        return DongMenu2;
    }

    public void setDongMenu2(boolean DongMenu2) {
        this.DongMenu2 = DongMenu2;
    }

    public boolean isDongMenu() {
        return DongMenu;
    }

    public void setDongMenu(boolean DongMenu) {
        this.DongMenu = DongMenu;
    }
    Animator animator;
    Animator animator1;
    Animator animator2;
    Animator animator3;
    Animator animator4;
    Animator animator5;
    Animator animator6;
    Animator animator7;
    Animator animator8;
    SystemMenu systemMenu;
    students students;
    Teachers teacher;

    public boolean isShowmenu() {
        return showmenu;
    }

    public void setShowmenu(boolean showmenu) {
        this.showmenu = showmenu;
    }

    public Menu() {
        initComponents();
        setOpaque(false);
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setOpaque(false);

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.setOpaque(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );

        sp.setViewportView(panel);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_group_45px_2.png"))); // NOI18N
        jLabel1.setText("Quản Lí Sinh Viên");
        jLabel1.setPreferredSize(new java.awt.Dimension(169, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables

    public void init() {
        migLayout = new MigLayout("wrap");
        systemMenu = new SystemMenu();
        students = new students();
        teacher = new Teachers();
        sp.getViewport().setOpaque(false);
        sp.setViewportBorder(null);
        sp.setVerticalScrollBar(new ScrollBarCustom());
        panel.setLayout(migLayout);
        panel.add(systemMenu, "w 213!,h 40!");
        panel.add(students, "w 213!,h 40!");
        panel.add(teacher, "w 213!,h 40!");
        EnventSytem();
        Enventstudent();
        Enventteacher();

    }

    public void EnventDongMenu() {
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double height;

                height = 40 + (304 * (1f - fraction));

                migLayout.setComponentConstraints(systemMenu, "h " + height + "!,w 213!");

                systemMenu.revalidate();

            }

            @Override
            public void end() {
                systemMenu.label();
                systemMenu.setShowmenu(!systemMenu.isShowmenu());
            }

        };

        animator3 = new Animator(1000, target);
        animator3.setResolution(0);
        animator3.setDeceleration(0.5f);
        animator3.setAcceleration(0.5f);
        animator3.start();
        //

    }
    //
    public void EnventDongMenu1() {
        TimingTarget target1 = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double height;

                height = 40 + (117 * (1f - fraction));

                migLayout.setComponentConstraints(students, "h " + height + "!,w 213!");

                students.revalidate();

            }

            @Override
            public void end() {
                students.label();
                students.setShowmenu(!students.isShowmenu());
            }

        };

        animator4 = new Animator(1000, target1);
        animator4.setResolution(0);
        animator4.setDeceleration(0.5f);
        animator4.setAcceleration(0.5f);
        animator4.start();
    }
    public void EnventDongMenu2() {

        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double height;

                height = 40 + (346 * (1f - fraction));

                migLayout.setComponentConstraints(teacher, "h " + height + "!,w 213!");

                teacher.revalidate();

            }

            @Override
            public void end() {
                teacher.label();
                teacher.setShowmenu(!teacher.isShowmenu());
            }

        };

        animator5 = new Animator(1000, target);
        animator5.setResolution(0);
        animator5.setDeceleration(0.5f);
        animator5.setAcceleration(0.5f);
        animator5.start();
    }

    //
    //
    public void EnventSoMenu() {
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double height;

                height = 40 + (304 * fraction);

                migLayout.setComponentConstraints(systemMenu, "h " + height + "!,w 213!");

                systemMenu.revalidate();

            }

            @Override
            public void end() {
                systemMenu.label();
                systemMenu.setShowmenu(!systemMenu.isShowmenu());
            }

        };

        animator6 = new Animator(1000, target);
        animator6.setResolution(0);
        animator6.setDeceleration(0.5f);
        animator6.setAcceleration(0.5f);
        animator6.start();
        //

    }
    public void EnventsoMenu1() {
        TimingTarget target1 = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double height;

                height = 40 + (117 * fraction);

                migLayout.setComponentConstraints(students, "h " + height + "!,w 213!");

                students.revalidate();

            }

            @Override
            public void end() {
                students.label();
                students.setShowmenu(!students.isShowmenu());
            }

        };

        animator7 = new Animator(1000, target1);
        animator7.setResolution(0);
        animator7.setDeceleration(0.5f);
        animator7.setAcceleration(0.5f);
        animator7.start();
    }
    public void EnventSoMenu2() {

        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double height;

                height = 40 + (346 * fraction);

                migLayout.setComponentConstraints(teacher, "h " + height + "!,w 213!");

                teacher.revalidate();

            }

            @Override
            public void end() {
                teacher.label();
                teacher.setShowmenu(!teacher.isShowmenu());
            }

        };

        animator8 = new Animator(1000, target);
        animator8.setResolution(0);
        animator8.setDeceleration(0.5f);
        animator8.setAcceleration(0.5f);
        animator8.start();
    }
     
    //
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, Color.white, getWidth(), 0, new Color(93, 58, 196));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    private void EnventSytem() {
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double height;

                if (systemMenu.isShowmenu()) {
                    DongMenu = true;
                    height = 40 + (304 * fraction);

                } else {
                    DongMenu = false;
                    height = 40 + (304 * (1f - fraction));

                }

                migLayout.setComponentConstraints(systemMenu, "h " + height + "!,w 213!");

                systemMenu.revalidate();

            }

            @Override
            public void end() {
                systemMenu.setShowmenu(!systemMenu.isShowmenu());

            }

        };

        animator = new Animator(1000, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        systemMenu.addevent(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (!animator.isRunning()) {

                    systemMenu.label();
                    animator.start();

                }

            }
        });

    }

    private void Enventstudent() {
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double height;

                if (students.isShowmenu()) {
                    DongMenu1 = true;
                    height = 40 + (117 * fraction);

                } else {
                    DongMenu1 = false;
                    height = 40 + (117 * (1f - fraction));

                }

                migLayout.setComponentConstraints(students, "h " + height + "!,w 213!");
                students.revalidate();

            }

            @Override
            public void end() {
                students.setShowmenu(!students.isShowmenu());
            }

        };
        animator1 = new Animator(1000, target);
        animator1.setResolution(0);
        animator1.setDeceleration(0.5f);
        animator1.setAcceleration(0.5f);
        students.addevent(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (students.Enable()) {
                    JOptionPane.showMessageDialog(null, "Bạn không có quyền", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/main/resources/img/icons8_ask_question_20px_3.png"));
                } else {
                    if (!animator1.isRunning()) {
                        students.label();
                        animator1.start();
                    }
                }

            }

        });

    }

    private void Enventteacher() {
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double height;

                if (teacher.isShowmenu()) {
                    DongMenu2 = true;
                    height = 40 + (346 * fraction);

                } else {
                    DongMenu2 = false;
                    height = 40 + (346 * (1f - fraction));

                }

                migLayout.setComponentConstraints(teacher, "h " + height + "!,w 213!");
                teacher.revalidate();

            }

            @Override
            public void end() {
                teacher.setShowmenu(!teacher.isShowmenu());
            }

        };
        animator2 = new Animator(1000, target);
        animator2.setResolution(0);
        animator2.setDeceleration(0.5f);
        animator2.setAcceleration(0.5f);
        teacher.addevent(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (teacher.Enable()) {
                    JOptionPane.showMessageDialog(null, "Bạn không có quyền", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/main/resources/img/icons8_ask_question_20px_3.png"));
                } else {
                    if (!animator2.isRunning()) {
                        teacher.label();
                        animator2.start();
                    }
                }

            }

        });

    }

    //
    public void AddEventIcon(MouseAdapter event) {
        systemMenu.addButtonEvtIcon(event);
    }

    public void AddEventIcon1(MouseAdapter event) {
        students.AddButtonEvtIcon(event);
    }

    public void AddEventIcon2(MouseAdapter event) {
        teacher.EnvenButtonIcon(event);
    }

    //system
    public void AddEventQuanLiTaiKhoan(MouseAdapter event) {
        systemMenu.addButtonEvtQuanLitaiKhoan(event);
    }

    public void AddEventThongtinTaikhoan(MouseAdapter event) {
        systemMenu.addButtonEvtThongTin(event);
    }

    public void AddEventTrangChu(MouseAdapter event) {
        systemMenu.addButtonEvtTrangChu(event);
    }

    public void AddEventDoiMatKhau(MouseAdapter event) {
        systemMenu.addButtonEvtDoiMatKhau(event);
    }

    public void AddEventPhanQuyen(MouseAdapter event) {
        systemMenu.addButtonEvtPhanQuyen(event);
    }

    public void AddEventThoat(MouseAdapter event) {
        systemMenu.addButtonEvtThoat(event);
    }

    //student
    public void AddEventXemDiem(MouseAdapter event) {
        students.AddButtonEvtXemDiem(event);
    }

    public void AddEventDangKythiLai(MouseAdapter event) {
        students.AddButtonEvtXemDanhSachdangkyThilai(event);
    }
    //teacher

    public void AddEventDanhSachRotmon(MouseAdapter event) {
        teacher.EnvenButtonDanhsachRotMon(event);
    }

    public void AddEventDanhSachThiLai(MouseAdapter event) {
        teacher.EnvenButtonDanhsachThiLai(event);
    }

    public void AddEventQuanLiSinhVien(MouseAdapter event) {
        teacher.EnvenButtonQuanLiSinhVien(event);
    }

    public void AddEventQuanLiDiem(MouseAdapter event) {
        teacher.EnvenButtonQuanLiDiem(event);
    }

    public void AddEventQuanLiMonHoc(MouseAdapter event) {
        teacher.EnvenButtonQuanLiMonhoc(event);
    }

    public void AddEventQuanLiLop(MouseAdapter event) {
        teacher.EnvenButtonQuanLiLop(event);
    }

    public void AddEventQuanLiKhoa(MouseAdapter event) {
        teacher.EnvenButtonQuanLiKhoa(event);
    }

    public void QuyenstudentsFalse() {

        students.Enablefalse();

    }

    public void QuyenstudentsTrue() {
        students.Enabletrue();

    }

    public void QuyensystemsFalse() {
        systemMenu.Enablefalse();

    }

    public void QuyensystemsTrue() {
        systemMenu.Enabletrue();

    }

    public void QuyenteacherFalse() {
        teacher.Enablefalse();

    }

    public void QuyenteacherTrue() {
        teacher.Enabletrue();

    }

    public boolean QuyenCheckstystem() {
        if (systemMenu.Enable()) {
            return true;
        }
        return false;
    }

}
