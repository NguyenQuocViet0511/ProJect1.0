/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Component.Footer;
import Component.Admin;
import Component.DanhSachDangKyThiLai;
import Component.DanhSachRotMon;
import Component.DanhSachThiLai;
import Component.DoiMatKhau;
import Component.header;
import Component.Menu;
import Component.NhapDiem;
import Component.PhanQuyen;
import Component.QuanLiKhoa;
import Component.QuanLiLop;
import Component.QuanLiLMonhoc;
import Component.QuanLiSinhVien;
import Component.Thongtin;
import Component.TrangChu;
import Component.XemDiem;
import Login.Const;
import Login.Login;
import Menu.SystemMenu;
import Menu.students;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author admin
 */
public class FormMain extends javax.swing.JFrame {

    MigLayout migLayout;
    header header;
    Menu menu;
    Footer footer;
    Admin Admin;
    Animator animator;
    Animator animator1;
    Animator animator2;
    Animator animator3;
    Thongtin thongtin;
    TrangChu trangchu;
    SystemMenu systemmenu;
    DoiMatKhau doiMatKhau;
    PhanQuyen phanQuyen;
    DanhSachDangKyThiLai danhSachDangKyThiLai;
    DanhSachRotMon danhSachRotMon;
    DanhSachThiLai danhSachThiLai;
    QuanLiSinhVien quanLiSinhVien;
    NhapDiem nhapDiem;
    XemDiem xemDiem;
    QuanLiLop quanLiLop;
    QuanLiKhoa quanLiKhoa;
    QuanLiLMonhoc quanLiMonhoc;
    Main_ main;

    /**
     * Creates new form FormMain
     */
    public FormMain() {
        initComponents();
        init();
        setLocationRelativeTo(null);
        ButtonEvt();
        Position();

    }

    public void Thoat() {
        System.exit(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout spLayout = new javax.swing.GroupLayout(sp);
        sp.setLayout(spLayout);
        spLayout.setHorizontalGroup(
            spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        spLayout.setVerticalGroup(
            spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 885, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Init Load
    private void init() {
        migLayout = new MigLayout();
        main = new Main_();
        header = new header();
        footer = new Footer();
        Admin = new Admin();
        menu = new Menu();
        doiMatKhau = new DoiMatKhau();
        trangchu = new TrangChu();
        thongtin = new Thongtin();
        phanQuyen = new PhanQuyen();
        danhSachDangKyThiLai = new DanhSachDangKyThiLai();
        danhSachRotMon = new DanhSachRotMon();
        danhSachThiLai = new DanhSachThiLai();
        xemDiem = new XemDiem();
        quanLiSinhVien = new QuanLiSinhVien();
        nhapDiem = new NhapDiem();
        quanLiKhoa = new QuanLiKhoa();
        quanLiLop = new QuanLiLop();
        quanLiMonhoc = new QuanLiLMonhoc();
        sp.setLayout(migLayout);
        systemmenu = new SystemMenu();
        sp.add(menu, "w 230!,west");
        sp.add(header, "h 50! , dock north");
        sp.add(main, "h 100%, w 100%");
        main.ShowFrom(trangchu);
        sp.add(footer, "h 50!,w 100%,dock south");
        //timer
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowmenu()) {
                    width = 41 + (189 * (1f - fraction));
                } else {
                    width = 45 + (189 * fraction);

                }
                migLayout.setComponentConstraints(menu, "w " + width + "!, west");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowmenu(!menu.isShowmenu());
                menu.setDongMenu(false);
                menu.setDongMenu1(false);
                menu.setDongMenu2(false);
                menu.setSoMenu(true);
                menu.setSoMenu1(true);
                menu.setSoMenu2(true);

            }

        };
        animator = new Animator(1200, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        //SK Menu
        header.addevent(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (menu.DongMenu == true) {
                    menu.EnventDongMenu();
                }
                if (menu.DongMenu1 == true) {
                    menu.EnventDongMenu1();
                }
                if (menu.DongMenu2 == true) {
                    menu.EnventDongMenu2();
                }

                if (!animator.isRunning()) {

                    animator.start();

                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

    }

    //buuton Envent Main AddJPanel
    private void ButtonEvt() {
        //System
        menu.AddEventQuanLiTaiKhoan(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (menu.QuyenCheckstystem()) {
                    JOptionPane.showMessageDialog(null, "Bạn không có quyền", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                } else {
                    Admin.LoadDataResource();
                    main.ShowFrom(Admin);
                }

            }

        });
        menu.AddEventThongtinTaikhoan(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                thongtin.LoadDataLen();
                main.ShowFrom(thongtin);
            }

        });

        menu.AddEventTrangChu(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.ShowFrom(trangchu);
            }

        });
        menu.AddEventDoiMatKhau(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.ShowFrom(doiMatKhau);
            }

        });
        menu.AddEventPhanQuyen(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (menu.QuyenCheckstystem()) {
                    JOptionPane.showMessageDialog(null, "Bạn không có quyền", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                } else {
                    phanQuyen.LoadDataResource();
                    main.ShowFrom(phanQuyen);
                }

            }

        });
        menu.AddEventThoat(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Thoát Không", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/main/resources/img/icons8_ask_question_20px_3.png"));
                if (option == 0) {
                    Login login = new Login();
                    login.show();
                    dispose();
                } else {

                }

            }

        });
        //student
        menu.AddEventXemDiem(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                xemDiem.loadDataXemDiem();
                main.ShowFrom(xemDiem);
            }

        });
        menu.AddEventDangKythiLai(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                danhSachDangKyThiLai.LoadDataDangKyThiLai();
                main.ShowFrom(danhSachDangKyThiLai);

            }

        });
        //Teachers
        menu.AddEventDanhSachRotmon(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                danhSachRotMon.LoadDataDanhSachRotMon();
                main.ShowFrom(danhSachRotMon);
            }

        });
        menu.AddEventDanhSachThiLai(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                danhSachThiLai.LoadDataDanhSachThiLai();
                main.ShowFrom(danhSachThiLai);
            }

        });
        menu.AddEventQuanLiSinhVien(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                quanLiSinhVien.loadDataSV();
                quanLiSinhVien.AddDataLop();
                main.ShowFrom(quanLiSinhVien);
            }

        });
        menu.AddEventQuanLiDiem(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                nhapDiem.loadDataDiem();
                nhapDiem.loadDataMon();
                nhapDiem.AddDataMon();
                main.ShowFrom(nhapDiem);
            }

        });
        menu.AddEventQuanLiLop(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                quanLiLop.LoadDataLop();
                quanLiLop.AddMakhoa();
                main.ShowFrom(quanLiLop);
            }

        });
        menu.AddEventQuanLiKhoa(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                quanLiKhoa.LoadDataKhoa();
                main.ShowFrom(quanLiKhoa);
            }

        });
        menu.AddEventQuanLiMonHoc(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                quanLiMonhoc.loadDataMon();
                quanLiMonhoc.AddMakhoa();
                main.ShowFrom(quanLiMonhoc);
            }

        });
        // 
        ButtonTrangChu();
        //
        //
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowmenu()) {
                    width = 41 + (189 * (1f - fraction));

                } else {
                    width = 45 + (189 * fraction);

                }
                migLayout.setComponentConstraints(menu, "w " + width + "!, west");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowmenu(!menu.isShowmenu());
                menu.setSoMenu(false);
                menu.setSoMenu1(false);
                menu.setSoMenu2(false);
                menu.setDongMenu(true);

            }

        };
        animator1 = new Animator(1000, target);
        animator1.setResolution(0);
        animator1.setDeceleration(0.5f);
        animator1.setAcceleration(0.5f);
        menu.AddEventIcon(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (menu.SoMenu == true) {
                    menu.EnventSoMenu();
                    animator1.start();
                }           

            }

        });
        TimingTarget target1 = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowmenu()) {
                    width = 41 + (189 * (1f - fraction));

                } else {
                    width = 45 + (189 * fraction);

                }
                migLayout.setComponentConstraints(menu, "w " + width + "!, west");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowmenu(!menu.isShowmenu());
                menu.setSoMenu1(false);
                menu.setSoMenu(false);
                menu.setSoMenu2(false);
                menu.setDongMenu1(true);

            }

        };
        animator2 = new Animator(1000, target1);
        animator2.setResolution(0);
        animator2.setDeceleration(0.5f);
        animator2.setAcceleration(0.5f);
        menu.AddEventIcon1(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (menu.SoMenu1 == true) {
                    menu.EnventsoMenu1();
                    animator2.start();
                }
                

            }

        });
         TimingTarget target2 = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowmenu()) {
                    width = 41 + (189 * (1f - fraction));

                } else {
                    width = 45 + (189 * fraction);

                }
                migLayout.setComponentConstraints(menu, "w " + width + "!, west");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowmenu(!menu.isShowmenu());
                menu.setSoMenu1(false);
                menu.setSoMenu(false);
                menu.setSoMenu2(false);
                menu.setDongMenu2(true);

            }

        };
        animator3 = new Animator(1000, target2);
        animator3.setResolution(0);
        animator3.setDeceleration(0.5f);
        animator3.setAcceleration(0.5f);
        menu.AddEventIcon2(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (menu.SoMenu2 == true) {
                    menu.EnventSoMenu2();
                      animator3.start();
                }
               

            }

        });
//        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane sp;
    // End of variables declaration//GEN-END:variables
    //Button Evt TrangChu
    private void ButtonTrangChu() {
        trangchu.AddEnventButtonTrangChu(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                main.ShowFrom(trangchu);
            }

        });
        trangchu.AddEnventButtonThongTin(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.ShowFrom(thongtin);
            }

        });
        trangchu.AddEnventButtonAdmin(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (trangchu.EnableCheckAdmin()) {
                    JOptionPane.showMessageDialog(null, "Bạn không có quyền", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                } else {
                    main.ShowFrom(Admin);
                }

            }

        });
        trangchu.AddEnventButtonThoat(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Thoát Không", "Nhắc Nhở", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                if (option == 0) {
                    Login login = new Login();
                    login.show();
                    dispose();
                } else {

                }
            }

        });
        trangchu.AddEnventButtonXemDiem(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (trangchu.EnableCheckXemDiem()) {
                    JOptionPane.showMessageDialog(null, "Bạn không có quyền", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                } else {
                    xemDiem.loadDataXemDiem();
                    main.ShowFrom(xemDiem);

                }

            }

        });
        trangchu.AddEnventButtonDoimatKhau(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.ShowFrom(doiMatKhau);
            }

        });
        //Main
        Admin.AddButtonThoat(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.ShowFrom(trangchu);
            }

        });
        quanLiSinhVien.AddbuttonThoat(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.ShowFrom(trangchu);
            }

        });

    }

    //Phan Quyen
    private void Position() {
        String position = Const.user.getQuyen();
        switch (position) {
            case "Admin":
                menu.QuyenstudentsTrue();
                menu.QuyensystemsTrue();
                menu.QuyenteacherTrue();
                trangchu.EnableAdmmintrue();
                trangchu.EnableXemDiemtrue();
                break;
            case "GiaoVien": // Admin GiaoVien SinhVien User  

                menu.QuyenstudentsFalse();
                menu.QuyensystemsFalse();
                menu.QuyenteacherTrue();
                menu.QuyensystemsTrue();
                trangchu.EnableAdminfalse();
//               
                break;
            case "SinhVien": // Admin GiaoVien SinhVien User    
                menu.QuyenstudentsTrue();
                menu.QuyensystemsFalse();
                trangchu.EnableAdminfalse();
                menu.QuyenteacherFalse();
                break;
            case "User":
                menu.QuyenstudentsFalse();
                menu.QuyensystemsFalse();
                menu.QuyenteacherFalse();
                trangchu.EnableAdminfalse();
                trangchu.EnableXemDiemfalse();
                break;
        }
    }
}
