/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import Hiberneat.User.User;
import Main.FormMain;
import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.persistence.Query;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.bytebuddy.utility.RandomString;

/**
 *
 * @author admin
 */
public class Login extends javax.swing.JFrame {

    private String randomCode;
    private Vector<Object> ArrayEmail;
    private String CheckCode;
    User user;
    public  Preferences pref = Preferences.userRoot().node("Remember"); 
    public Login() {
       
        initComponents();
         Remmember();
        setLocationRelativeTo(null);
        window_ForgotPW();
         LoadDataUser();
    }

    public void SaveRemember(String UserName, String Password)
            {
                if(UserName == null || Password == null)
                    {
                        
                       
                    }
                else
                    {

                        pref.put("UserName", UserName);
                        pref.put("Password", Password);
                    }
            }
    public final void Checked(boolean Remember)
            {
                if(Remember == true)
                    {
                        SaveRemember(txtusernamelogin.getText(), txtpwlogin.getText());
                    }
                else
                    {
                        SaveRemember("Tên Đăng Nhập","Mật Khẩu");
                    }
               
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtverycode = new javax.swing.JTextField();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        btnChangePW = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnchangePWforgot1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        btnbackSigninforgotpw = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtchangefotgot1 = new javax.swing.JPasswordField();
        txtPWchangeforgot = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        JPaneSignupCode = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnsignCode = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        btnbackforgotpw3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btnbackforgotpw4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lblTitlesignupCode = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtCodeChecksignup = new javax.swing.JTextField();
        JPaneForgotpassword = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnchangePWforgot = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        btnbackforgotpw2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnbackforgotpw = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTitleCode = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCodeCheck = new javax.swing.JTextField();
        JPanesignup = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtusernamesignup = new javax.swing.JTextField();
        txtpwsignup = new javax.swing.JPasswordField();
        btnsignupnlogin = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        CheckFemale = new javax.swing.JRadioButton();
        CheckMale = new javax.swing.JRadioButton();
        txtemailsignup = new javax.swing.JTextField();
        txthovatensignup = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnbacksignup = new javax.swing.JLabel();
        cknCheckCreate = new javax.swing.JCheckBox();
        JPaneLogin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusernamelogin = new javax.swing.JTextField();
        txtpwlogin = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        CheckRemember = new javax.swing.JCheckBox();
        btnforgotpw = new javax.swing.JLabel();
        btnsinginlogin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnsignuplogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JPaneForgotpassword1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnSendEmail = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnbackforgotpw1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtemailSend = new javax.swing.JTextField();

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(null);
        jPanel8.add(jLabel6);
        jLabel6.setBounds(20, 17, 30, 20);

        txtverycode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtverycode.setText("Code");
        txtverycode.setBorder(null);
        txtverycode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtverycodeMouseClicked(evt);
            }
        });
        jPanel8.add(txtverycode);
        txtverycode.setBounds(60, 1, 295, 45);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel2.setStartColor(new java.awt.Color(153, 0, 153));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grap.png"))); // NOI18N
        kGradientPanel2.add(jLabel5);
        jLabel5.setBounds(220, 260, 380, 320);

        btnChangePW.setBackground(new java.awt.Color(255, 255, 255));
        btnChangePW.setPreferredSize(new java.awt.Dimension(400, 600));
        btnChangePW.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_group_100px.png"))); // NOI18N
        btnChangePW.add(jLabel15);
        jLabel15.setBounds(135, 20, 100, 80);

        btnchangePWforgot1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_checkmark_20px.png"))); // NOI18N
        btnchangePWforgot1.setText("Đồng Ý");
        btnchangePWforgot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchangePWforgot1ActionPerformed(evt);
            }
        });
        btnChangePW.add(btnchangePWforgot1);
        btnchangePWforgot1.setBounds(40, 270, 300, 40);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        btnbackSigninforgotpw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnbackSigninforgotpw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_go_back_20px_1.png"))); // NOI18N
        btnbackSigninforgotpw.setText("Quay Lại Đăng Nhập");
        btnbackSigninforgotpw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbackSigninforgotpw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackSigninforgotpwMouseClicked(evt);
            }
        });
        jPanel13.add(btnbackSigninforgotpw);

        btnChangePW.add(jPanel13);
        jPanel13.setBounds(40, 320, 300, 40);
        btnChangePW.add(jLabel17);
        jLabel17.setBounds(20, 170, 0, 0);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_forgot_password_32px_1.png"))); // NOI18N
        jLabel19.setText("Quên Mật Khẩu");
        jPanel15.add(jLabel19);

        btnChangePW.add(jPanel15);
        jPanel15.setBounds(60, 100, 250, 40);

        txtchangefotgot1.setText("New Password");
        txtchangefotgot1.setToolTipText("");
        txtchangefotgot1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtchangefotgot1FocusGained(evt);
            }
        });
        btnChangePW.add(txtchangefotgot1);
        txtchangefotgot1.setBounds(40, 220, 300, 30);

        txtPWchangeforgot.setText("New Password");
        txtPWchangeforgot.setToolTipText("");
        txtPWchangeforgot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPWchangeforgotFocusGained(evt);
            }
        });
        btnChangePW.add(txtPWchangeforgot);
        txtPWchangeforgot.setBounds(40, 180, 300, 30);

        jLabel20.setText("Mật Khẩu Mới");
        btnChangePW.add(jLabel20);
        jLabel20.setBounds(40, 150, 90, 14);

        kGradientPanel2.add(btnChangePW);
        btnChangePW.setBounds(790, 110, 370, 510);

        JPaneSignupCode.setBackground(new java.awt.Color(255, 255, 255));
        JPaneSignupCode.setPreferredSize(new java.awt.Dimension(400, 600));
        JPaneSignupCode.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_group_100px.png"))); // NOI18N
        JPaneSignupCode.add(jLabel8);
        jLabel8.setBounds(135, 20, 100, 80);

        btnsignCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_checkmark_20px.png"))); // NOI18N
        btnsignCode.setText("xác minh lại mã");
        btnsignCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignCodeActionPerformed(evt);
            }
        });
        JPaneSignupCode.add(btnsignCode);
        btnsignCode.setBounds(40, 240, 300, 40);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        btnbackforgotpw3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnbackforgotpw3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_go_back_20px_1.png"))); // NOI18N
        btnbackforgotpw3.setText("Đăng Nhập");
        btnbackforgotpw3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbackforgotpw3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackforgotpw3MouseClicked(evt);
            }
        });
        jPanel14.add(btnbackforgotpw3);

        JPaneSignupCode.add(jPanel14);
        jPanel14.setBounds(40, 320, 130, 40);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        btnbackforgotpw4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnbackforgotpw4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_go_back_20px_1.png"))); // NOI18N
        btnbackforgotpw4.setText("Back");
        btnbackforgotpw4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbackforgotpw4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackforgotpw4MouseClicked(evt);
            }
        });
        jPanel16.add(btnbackforgotpw4);

        JPaneSignupCode.add(jPanel16);
        jPanel16.setBounds(200, 320, 140, 40);
        JPaneSignupCode.add(jLabel21);
        jLabel21.setBounds(20, 170, 0, 0);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        lblTitlesignupCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitlesignupCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_forgot_password_32px_1.png"))); // NOI18N
        lblTitlesignupCode.setText("Quên Mật Khẩu");
        jPanel17.add(lblTitlesignupCode);

        JPaneSignupCode.add(jPanel17);
        jPanel17.setBounds(60, 100, 250, 40);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setLayout(null);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_envelope_20px.png"))); // NOI18N
        jPanel18.add(jLabel22);
        jLabel22.setBounds(10, 10, 20, 20);

        txtCodeChecksignup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodeChecksignup.setText("Nhập Vào Code Được Gửi Tới Email");
        txtCodeChecksignup.setBorder(null);
        txtCodeChecksignup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodeChecksignupFocusGained(evt);
            }
        });
        txtCodeChecksignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodeChecksignupMouseClicked(evt);
            }
        });
        jPanel18.add(txtCodeChecksignup);
        txtCodeChecksignup.setBounds(41, 1, 255, 35);

        JPaneSignupCode.add(jPanel18);
        jPanel18.setBounds(40, 170, 300, 40);

        kGradientPanel2.add(JPaneSignupCode);
        JPaneSignupCode.setBounds(790, 110, 370, 510);

        JPaneForgotpassword.setBackground(new java.awt.Color(255, 255, 255));
        JPaneForgotpassword.setPreferredSize(new java.awt.Dimension(400, 600));
        JPaneForgotpassword.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_group_100px.png"))); // NOI18N
        JPaneForgotpassword.add(jLabel7);
        jLabel7.setBounds(135, 20, 100, 80);

        btnchangePWforgot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_checkmark_20px.png"))); // NOI18N
        btnchangePWforgot.setText("xác minh lại mã");
        btnchangePWforgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchangePWforgotActionPerformed(evt);
            }
        });
        JPaneForgotpassword.add(btnchangePWforgot);
        btnchangePWforgot.setBounds(40, 240, 300, 40);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        btnbackforgotpw2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnbackforgotpw2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_go_back_20px_1.png"))); // NOI18N
        btnbackforgotpw2.setText("Sign In");
        btnbackforgotpw2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbackforgotpw2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackforgotpw2MouseClicked(evt);
            }
        });
        jPanel12.add(btnbackforgotpw2);

        JPaneForgotpassword.add(jPanel12);
        jPanel12.setBounds(40, 320, 130, 40);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnbackforgotpw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnbackforgotpw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_go_back_20px_1.png"))); // NOI18N
        btnbackforgotpw.setText("Back");
        btnbackforgotpw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbackforgotpw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackforgotpwMouseClicked(evt);
            }
        });
        jPanel5.add(btnbackforgotpw);

        JPaneForgotpassword.add(jPanel5);
        jPanel5.setBounds(200, 320, 140, 40);
        JPaneForgotpassword.add(jLabel11);
        jLabel11.setBounds(20, 170, 0, 0);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitleCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitleCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_forgot_password_32px_1.png"))); // NOI18N
        lblTitleCode.setText("Quên Mật Khẩu");
        jPanel1.add(lblTitleCode);

        JPaneForgotpassword.add(jPanel1);
        jPanel1.setBounds(60, 100, 250, 40);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_envelope_20px.png"))); // NOI18N
        jPanel6.add(jLabel12);
        jLabel12.setBounds(10, 10, 20, 20);

        txtCodeCheck.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodeCheck.setText("Nhập Vào Code Được gởi tới Email");
        txtCodeCheck.setBorder(null);
        txtCodeCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodeCheckMouseClicked(evt);
            }
        });
        jPanel6.add(txtCodeCheck);
        txtCodeCheck.setBounds(41, 1, 255, 35);

        JPaneForgotpassword.add(jPanel6);
        jPanel6.setBounds(40, 170, 300, 40);

        kGradientPanel2.add(JPaneForgotpassword);
        JPaneForgotpassword.setBounds(790, 110, 370, 510);

        JPanesignup.setBackground(new java.awt.Color(255, 255, 255));
        JPanesignup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPanesignup.setPreferredSize(new java.awt.Dimension(400, 600));
        JPanesignup.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Tạo Tài Khoản Mới");
        JPanesignup.add(jLabel16);
        jLabel16.setBounds(92, 80, 185, 40);

        txtusernamesignup.setText("Tên Đăng Nhập");
        txtusernamesignup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernamesignupFocusGained(evt);
            }
        });
        txtusernamesignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusernamesignupMouseClicked(evt);
            }
        });
        JPanesignup.add(txtusernamesignup);
        txtusernamesignup.setBounds(60, 190, 250, 30);

        txtpwsignup.setText("Password");
        txtpwsignup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpwsignupFocusGained(evt);
            }
        });
        JPanesignup.add(txtpwsignup);
        txtpwsignup.setBounds(60, 240, 250, 30);

        btnsignupnlogin.setBackground(new java.awt.Color(0, 153, 255));
        btnsignupnlogin.setForeground(new java.awt.Color(51, 51, 255));
        btnsignupnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_right_32px_2.png"))); // NOI18N
        btnsignupnlogin.setText("Đăng Ký");
        btnsignupnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsignupnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsignupnloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsignupnloginMouseExited(evt);
            }
        });
        btnsignupnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupnloginActionPerformed(evt);
            }
        });
        JPanesignup.add(btnsignupnlogin);
        btnsignupnlogin.setBounds(60, 410, 250, 40);
        JPanesignup.add(jLabel18);
        jLabel18.setBounds(20, 170, 0, 0);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_account_100px.png"))); // NOI18N
        JPanesignup.add(jLabel1);
        jLabel1.setBounds(135, 0, 100, 90);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        CheckFemale.setText("Nữ");
        CheckFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckFemaleActionPerformed(evt);
            }
        });
        jPanel9.add(CheckFemale, java.awt.BorderLayout.EAST);

        CheckMale.setText("Nam");
        CheckMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMaleActionPerformed(evt);
            }
        });
        jPanel9.add(CheckMale, java.awt.BorderLayout.CENTER);

        JPanesignup.add(jPanel9);
        jPanel9.setBounds(60, 335, 140, 20);

        txtemailsignup.setText("Email");
        txtemailsignup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtemailsignupFocusGained(evt);
            }
        });
        JPanesignup.add(txtemailsignup);
        txtemailsignup.setBounds(60, 290, 250, 30);

        txthovatensignup.setText("Họ Và Tên");
        txthovatensignup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txthovatensignupFocusGained(evt);
            }
        });
        JPanesignup.add(txthovatensignup);
        txthovatensignup.setBounds(60, 140, 250, 30);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnbacksignup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnbacksignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_go_back_20px_1.png"))); // NOI18N
        btnbacksignup.setText("Quay Lại");
        btnbacksignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbacksignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbacksignupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbacksignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbacksignupMouseExited(evt);
            }
        });
        jPanel7.add(btnbacksignup);

        JPanesignup.add(jPanel7);
        jPanel7.setBounds(60, 460, 250, 30);

        cknCheckCreate.setText("đồng Ý Điều Kiện Thỏa Thuận");
        JPanesignup.add(cknCheckCreate);
        cknCheckCreate.setBounds(60, 370, 250, 23);

        kGradientPanel2.add(JPanesignup);
        JPanesignup.setBounds(790, 110, 370, 510);

        JPaneLogin.setBackground(new java.awt.Color(255, 255, 255));
        JPaneLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JPaneLogin.setPreferredSize(new java.awt.Dimension(400, 600));
        JPaneLogin.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_group_100px.png"))); // NOI18N
        JPaneLogin.add(jLabel3);
        jLabel3.setBounds(135, 20, 100, 80);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Chào Mừng Trở Lại");
        JPaneLogin.add(jLabel4);
        jLabel4.setBounds(120, 110, 140, 17);

        txtusernamelogin.setText("Tên Đăng Nhập");
        txtusernamelogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusernameloginMouseClicked(evt);
            }
        });
        JPaneLogin.add(txtusernamelogin);
        txtusernamelogin.setBounds(60, 160, 250, 30);

        txtpwlogin.setText("Password");
        txtpwlogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpwloginFocusGained(evt);
            }
        });
        JPaneLogin.add(txtpwlogin);
        txtpwlogin.setBounds(60, 210, 250, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        CheckRemember.setText("Nhớ Mật Khẩu");
        jPanel2.add(CheckRemember, java.awt.BorderLayout.WEST);

        btnforgotpw.setText("Bạn Quên Mật Khẩu");
        btnforgotpw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnforgotpw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnforgotpwMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnforgotpwMouseEntered(evt);
            }
        });
        jPanel2.add(btnforgotpw, java.awt.BorderLayout.EAST);

        JPaneLogin.add(jPanel2);
        jPanel2.setBounds(60, 260, 250, 20);

        btnsinginlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_right_32px_2.png"))); // NOI18N
        btnsinginlogin.setText("Đăng Nhập");
        btnsinginlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsinginlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinginloginActionPerformed(evt);
            }
        });
        JPaneLogin.add(btnsinginlogin);
        btnsinginlogin.setBounds(60, 300, 250, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnsignuplogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsignuplogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_inquiry_32px.png"))); // NOI18N
        btnsignuplogin.setText("Đăng Ký Tài Khoản Mới Tại Đây");
        btnsignuplogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsignuplogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsignuploginMouseClicked(evt);
            }
        });
        jPanel3.add(btnsignuplogin);

        JPaneLogin.add(jPanel3);
        jPanel3.setBounds(60, 370, 250, 40);
        JPaneLogin.add(jLabel2);
        jLabel2.setBounds(20, 170, 0, 0);

        kGradientPanel2.add(JPaneLogin);
        JPaneLogin.setBounds(790, 110, 370, 510);

        JPaneForgotpassword1.setBackground(new java.awt.Color(255, 255, 255));
        JPaneForgotpassword1.setPreferredSize(new java.awt.Dimension(400, 600));
        JPaneForgotpassword1.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_group_100px.png"))); // NOI18N
        JPaneForgotpassword1.add(jLabel9);
        jLabel9.setBounds(135, 20, 100, 80);

        btnSendEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_send_20px.png"))); // NOI18N
        btnSendEmail.setText("Gửi");
        btnSendEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        btnSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmailActionPerformed(evt);
            }
        });
        JPaneForgotpassword1.add(btnSendEmail);
        btnSendEmail.setBounds(40, 240, 300, 40);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        btnbackforgotpw1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnbackforgotpw1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_go_back_20px_1.png"))); // NOI18N
        btnbackforgotpw1.setText("Back");
        btnbackforgotpw1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbackforgotpw1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackforgotpw1MouseClicked(evt);
            }
        });
        jPanel10.add(btnbackforgotpw1);

        JPaneForgotpassword1.add(jPanel10);
        jPanel10.setBounds(60, 320, 250, 40);
        JPaneForgotpassword1.add(jLabel13);
        jLabel13.setBounds(20, 170, 0, 0);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_forgot_password_32px_1.png"))); // NOI18N
        jLabel10.setText("Quên Mật Khẩu");
        jPanel4.add(jLabel10);

        JPaneForgotpassword1.add(jPanel4);
        jPanel4.setBounds(60, 100, 250, 40);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_envelope_20px.png"))); // NOI18N
        jPanel11.add(jLabel14);
        jLabel14.setBounds(10, 10, 20, 20);

        txtemailSend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtemailSend.setText("Nhập Vào Email ");
        txtemailSend.setBorder(null);
        txtemailSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtemailSendMouseClicked(evt);
            }
        });
        jPanel11.add(txtemailSend);
        txtemailSend.setBounds(41, 1, 255, 35);

        JPaneForgotpassword1.add(jPanel11);
        jPanel11.setBounds(40, 170, 300, 40);

        kGradientPanel2.add(JPaneForgotpassword1);
        JPaneForgotpassword1.setBounds(790, 110, 370, 510);

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodeCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodeCheckMouseClicked
        txtCodeCheck.setText("");
    }//GEN-LAST:event_txtCodeCheckMouseClicked

    private void btnbackforgotpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackforgotpwMouseClicked
        window_ForgotPW();
    }//GEN-LAST:event_btnbackforgotpwMouseClicked

    private void btnsignuploginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsignuploginMouseClicked
        txthovatensignup.setText("Họ Và Tên");
        txtusernamesignup.setText("Username");
        txtpwsignup.setText("Password");
        txtemailsignup.setText("Email");
        CheckFemale.setSelected(false);
        CheckMale.setSelected(false);
        JPaneLogin.hide();
        JPaneForgotpassword.hide();
        JPanesignup.show();
        JPaneSignupCode.hide();
    }//GEN-LAST:event_btnsignuploginMouseClicked

    private void btnforgotpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnforgotpwMouseClicked
        JPaneLogin.hide();
        JPaneForgotpassword.hide();
        JPaneLogin.hide();
        JPanesignup.hide();
        btnChangePW.hide();
        JPaneSignupCode.hide();
        JPaneForgotpassword1.show();

    }//GEN-LAST:event_btnforgotpwMouseClicked

    private void btnforgotpwMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnforgotpwMouseEntered

    }//GEN-LAST:event_btnforgotpwMouseEntered

    private void txtusernameloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusernameloginMouseClicked
        txtusernamelogin.setText("");
    }//GEN-LAST:event_txtusernameloginMouseClicked

    private void txtpwloginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpwloginFocusGained
        txtpwlogin.setText("");
    }//GEN-LAST:event_txtpwloginFocusGained

    private void txtusernamesignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusernamesignupMouseClicked
        txtemailsignup.setText("");
    }//GEN-LAST:event_txtusernamesignupMouseClicked

    private void txtpwsignupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpwsignupFocusGained
        txtpwsignup.setText("");
    }//GEN-LAST:event_txtpwsignupFocusGained

    private void btnbacksignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbacksignupMouseClicked

        window_ForgotPW();
    }//GEN-LAST:event_btnbacksignupMouseClicked

    private void btnbacksignupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbacksignupMouseEntered
        btnbacksignup.setForeground(Color.red);
    }//GEN-LAST:event_btnbacksignupMouseEntered

    private void btnsignupnloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsignupnloginMouseEntered
        btnsignupnlogin.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnsignupnloginMouseEntered

    private void btnsignupnloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsignupnloginMouseExited
        btnsignupnlogin.setBackground(getBackground());
    }//GEN-LAST:event_btnsignupnloginMouseExited

    private void btnbacksignupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbacksignupMouseExited
        btnbacksignup.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnbacksignupMouseExited

    private void btnsinginloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsinginloginActionPerformed
        if(CheckRemember.isSelected())
            {
                Checked(true);
            }
        else
            {
                Checked(false);
            }
        if (txtusernamelogin.getText().isEmpty() || txtpwlogin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng Không Được Để Trống", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
        } else {
            if (checkUserlogin()) {
                if (checkTrangThai()) {
                    FormMain formMain = new FormMain();
                    formMain.show();
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "Tài Khoản Đang Bị khóa Vui lòng liên Hệ Admin ", "Thông Tin", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_lock_20px_1.png")));
                }

            } else {
                JOptionPane.showMessageDialog(this, "Sai Tên Tài Khoản Hoặc Mật Khẩu", "Cảnh Báo", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_warning_20px_1.png")));
            }

        }
    }//GEN-LAST:event_btnsinginloginActionPerformed

    private void btnchangePWforgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchangePWforgotActionPerformed
        if (txtverycode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng Nhập Vào Mã Code Được Gửi đến Email Của Bạn", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

        } else {
            if (checkCode()) {

                JPaneForgotpassword.hide();
                JPaneForgotpassword1.hide();
                JPaneLogin.hide();
                JPanesignup.hide();
                btnChangePW.show();
                JPaneSignupCode.hide();
            } else {
                JOptionPane.showMessageDialog(null, "Code Bạn Nhập Sai Vui lòng Nhập Lại", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

            }
        }
    }//GEN-LAST:event_btnchangePWforgotActionPerformed

    private void btnSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmailActionPerformed
        if (txtemailSend.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui Lòng Nhập Email Vào không Để Trống", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
        } else {
            if (CheckEMailID()) {
                if (CodeMailSMTP()) {
                    JPaneForgotpassword.show();
                    JPaneForgotpassword1.hide();
                    JPaneLogin.hide();
                    JPanesignup.hide();
                    btnChangePW.hide();
                    JPaneSignupCode.hide();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Email Này không Tồn Tại Vui Lòng Nhập Đúng Email", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
            }
        }

    }//GEN-LAST:event_btnSendEmailActionPerformed

    private void btnbackforgotpw1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackforgotpw1MouseClicked
        window_ForgotPW();
    }//GEN-LAST:event_btnbackforgotpw1MouseClicked

    private void txtemailSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailSendMouseClicked
        txtemailSend.setText("");
    }//GEN-LAST:event_txtemailSendMouseClicked

    private void txtverycodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtverycodeMouseClicked
        txtverycode.setText("");
    }//GEN-LAST:event_txtverycodeMouseClicked

    private void btnbackforgotpw2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackforgotpw2MouseClicked
        window_ForgotPW();
    }//GEN-LAST:event_btnbackforgotpw2MouseClicked

    private void btnchangePWforgot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchangePWforgot1ActionPerformed
        if (txtPWchangeforgot.getText().isEmpty() && txtchangefotgot1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng Nhập Vào Mật khẩu Mới", "Nhắc Nhở", JOptionPane.INFORMATION_MESSAGE,  new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
        } else {
            User Update = Const.session.get(User.class, user.getUserName());
            Update.setPassword(txtPWchangeforgot.getText());
            if (txtPWchangeforgot.getText().equals(txtchangefotgot1.getText())) {
                Const.session.getTransaction().begin();
                Const.session.save(Update);
                Const.session.getTransaction().commit();
                JOptionPane.showMessageDialog(this, "Bạn Đã Thay Đổi Mật Khẩu Mới Thành Công", "Nhắc Nhở", JOptionPane.QUESTION_MESSAGE,  new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                user = null;

            } else {
                JOptionPane.showMessageDialog(this, "Nhập Lại Mật khẩu Không Giống Nhau", "Thông Tin", JOptionPane.WARNING_MESSAGE,  new ImageIcon(getClass().getResource("/img/icons8_lock_20px_1.png")));
            }
        }
    }//GEN-LAST:event_btnchangePWforgot1ActionPerformed

    private void btnbackSigninforgotpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackSigninforgotpwMouseClicked
        window_ForgotPW();
    }//GEN-LAST:event_btnbackSigninforgotpwMouseClicked

    private void txtPWchangeforgotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPWchangeforgotFocusGained
        txtPWchangeforgot.setText("");
    }//GEN-LAST:event_txtPWchangeforgotFocusGained

    private void txtchangefotgot1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtchangefotgot1FocusGained
        txtchangefotgot1.setText("");
    }//GEN-LAST:event_txtchangefotgot1FocusGained

    private void txthovatensignupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthovatensignupFocusGained
        txthovatensignup.setText("");
    }//GEN-LAST:event_txthovatensignupFocusGained

    private void txtusernamesignupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernamesignupFocusGained
        txtusernamesignup.setText("");
    }//GEN-LAST:event_txtusernamesignupFocusGained

    private void txtemailsignupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailsignupFocusGained
        txtemailsignup.setText("");
    }//GEN-LAST:event_txtemailsignupFocusGained

    private void CheckMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMaleActionPerformed
        if (CheckMale.isSelected() == true) {
            CheckFemale.setSelected(false);
        }

    }//GEN-LAST:event_CheckMaleActionPerformed

    private void CheckFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckFemaleActionPerformed
        if (CheckFemale.isSelected() == true) {
            CheckMale.setSelected(false);;
        }
    }//GEN-LAST:event_CheckFemaleActionPerformed

    private void btnsignupnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupnloginActionPerformed
        if (txthovatensignup.getText().isEmpty() || txtusernamesignup.getText().isEmpty() || txtemailsignup.getText().isEmpty() || txtpwsignup.getText().isEmpty() || CheckMale.isSelected() == false
                && CheckFemale.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Vui lòng Nhập Đầy Đủ không Để Trống", "Thông Tin", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
        } else {
            if (cknCheckCreate.isSelected() == true) {
                if (ChecktypeMailSignup()) {
                    if (CheckUserName()) {
                        JOptionPane.showMessageDialog(this, "Tài Khoản  Này Đã Tồn Tại Vui Lòng Thử Lại Tài Khoản  Khác", "Thông Tin", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                    } else {

                        if (CheckEmailSignup()) {
                            JOptionPane.showMessageDialog(this, "Email Này Đã Tồn Tại Vui Lòng Thử Lại Email Khác", "Thông Tin", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

                        } else {

                            if (checkSendMailSignUp()) {
                                LoadCheckCode();

                            }

                        }

                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Email Không Đúng Định Dạng Vui Lòng Thử lại", "Thông Tin", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
                }

            } else {
                JOptionPane.showMessageDialog(this, "Bạn Chưa Chấp Nhận Thỏa Thuận", "Thông Tin", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
            }
        }
    }//GEN-LAST:event_btnsignupnloginActionPerformed

    private void btnsignCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignCodeActionPerformed
        if (txtCodeChecksignup.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng Nhập Vào Mã Code Được Gửi đến Email Của Bạn", "Thông Tin", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
        } else {
            if (checkCodeSignup()) {
                User user = new User();
                user.setHovaTen(txthovatensignup.getText());
                user.setEmail(txtemailsignup.getText());
                user.setUserName(txtusernamesignup.getText());
                user.setPassword(txtpwsignup.getText());
                user.setQuyen("User");
                user.setTrangThai("Bình Thường");
                if (CheckMale.isSelected()) {
                    user.setGioitinh("Nam");
                } else {
                    user.setGioitinh("Nữ");
                }

                Const.session.getTransaction().begin();
                Const.session.save(user);
                Const.session.getTransaction().commit();
                JOptionPane.showMessageDialog(this, "Đăng Ký Thành Công", "Thông Tin", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));

            } else {
                JOptionPane.showMessageDialog(this, "Code Bạn Nhập Sai Vui lòng Nhập Lại", "Thông Tin", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("/img/icons8_ask_question_20px_3.png")));
            }
        }
    }//GEN-LAST:event_btnsignCodeActionPerformed

    private void txtCodeChecksignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodeChecksignupMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeChecksignupMouseClicked

    private void txtCodeChecksignupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeChecksignupFocusGained
        txtCodeChecksignup.setText("");
    }//GEN-LAST:event_txtCodeChecksignupFocusGained

    private void btnbackforgotpw4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackforgotpw4MouseClicked
        window_ForgotPW();
    }//GEN-LAST:event_btnbackforgotpw4MouseClicked

    private void btnbackforgotpw3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackforgotpw3MouseClicked

        window_ForgotPW();
    }//GEN-LAST:event_btnbackforgotpw3MouseClicked
    private void window_ForgotPW() {
        JPaneForgotpassword.hide();
        JPaneLogin.show();
        JPanesignup.hide();
        JPaneForgotpassword1.hide();
        btnChangePW.hide();
        JPaneSignupCode.hide();

    }

    //check 
    private boolean checkTrangThai() {
        for (int i = 0; i < Const.ListUser.size(); i++) {
            String UserName = txtusernamelogin.getText();
            String Password = txtpwlogin.getText();
            if (Const.ListUser.get(i).getUserName().equals(UserName) && Const.ListUser.get(i).getPassword().equals(Password) && Const.ListUser.get(i).getTrangThai().equals("Bình Thường")) {

                return true;
            }

        }

        return false;

    }

    private boolean CheckEmailSignup() {
        Const.ListUser = null;
        Query q = Const.session.createQuery("FROM User");
        Const.ListUser = q.getResultList();
        String Email = txtemailsignup.getText();
        for (int i = 0; i < Const.ListUser.size(); i++) {

            if (Email.equals(Const.ListUser.get(i).getEmail())) {

                return true;
            }

        }
        return false;
    }

    private boolean CheckEMailID() {
        Const.ListUser = null;
        Query q = Const.session.createQuery("FROM User");
        Const.ListUser = q.getResultList();
        String Email = txtemailSend.getText();
        for (int i = 0; i < Const.ListUser.size(); i++) {

            if (Email.equals(Const.ListUser.get(i).getEmail())) {
                user = new User();
                return true;
            }

        }
        return false;
    }

    private boolean ChecktypeMail() {
        Pattern Check = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String Email = txtemailSend.getText();
        if (Check.matcher(Email).find()) {

            return true;

        }
        return false;
    }

    private boolean ChecktypeMailSignup() {
        Pattern Check = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String Email = txtemailsignup.getText();
        if (Check.matcher(Email).find()) {

            return true;

        }
        return false;
    }

    private boolean CodeMailSMTP() {
        RandomString random = new RandomString(6);
        randomCode = random.nextString();
        final String fromEmail = "thuykieunguyen310@gmail.com"; //Email Gửi
//      final String Password = "etqhxcumxrodcatq"; //MK Ung Dung(etqhxcumxrodcatq)
        final String toEmail = txtemailSend.getText();
        final String subject = "Reseting code";
        final String message = "Your reset Code is " + randomCode;

        MimeMessage msg = new MimeMessage(Const.SessionEMail);
        try {
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            try {
                msg.setFrom(new InternetAddress(fromEmail, "NoReply-JD"));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            msg.setReplyTo(InternetAddress.parse(fromEmail, false));
            msg.setSubject(subject, "UTF-8");
            msg.setText(message, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            Transport.send(msg);
            CheckCode = randomCode;
            return true;

        } catch (MessagingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    private boolean checkUserlogin() {
        for (int i = 0; i < Const.ListUser.size(); i++) {
            String UserName = txtusernamelogin.getText();
            String Password = txtpwlogin.getText();
            String Position;
            if (Const.ListUser.get(i).getUserName().equals(UserName) && Const.ListUser.get(i).getPassword().equals(Password)) {
                Const.user = Const.ListUser.get(i);
                Const.userRemember = Const.user;
                return true;
            }

        }

        return false;

    }

    private boolean checkSendMailSignUp() {
        RandomString random = new RandomString(6);
        randomCode = random.nextString();
        final String fromEmail = "thuykieunguyen310@gmail.com"; //Email Gửi
//      final String Password = "etqhxcumxrodcatq"; //MK Ung Dung(etqhxcumxrodcatq)
        final String toEmail = txtemailsignup.getText();
        final String subject = "Create New Account";
        final String message = "Your Create New Code is " + randomCode;

        MimeMessage msg = new MimeMessage(Const.SessionEMail);
        try {
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            try {
                msg.setFrom(new InternetAddress(fromEmail, "NoReply-JD"));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            msg.setReplyTo(InternetAddress.parse(fromEmail, false));
            msg.setSubject(subject, "UTF-8");
            msg.setText(message, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            Transport.send(msg);
            CheckCode = randomCode;
            return true;

        } catch (MessagingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    private boolean checkCode() {

        if (txtCodeCheck.getText().equals(CheckCode)) {
            return true;
        }
        return false;
    }

    private boolean checkCodeSignup() {

        if (txtCodeChecksignup.getText().equals(CheckCode)) {
            return true;
        }
        return false;
    }

    private boolean CheckUserName() {
        Const.ListUser = null;
        Query q = Const.session.createQuery("FROM User");
        Const.ListUser = q.getResultList();
        Vector<Object> CheckuserName = new Vector<>();;
        for (int i = 0; i < Const.ListUser.size(); i++) {

            CheckuserName.add(Const.ListUser.get(i).getUserName());
        }
        for (int i = 0; i < CheckuserName.size(); i++) {
            if (txtusernamesignup.getText().equals(CheckuserName.get(i))) {
                return true;
            }

        }
        return false;
    }

    // loaddata
    private void LoadCheckCode() {
        lblTitlesignupCode.setText("Create Your Account");
        lblTitlesignupCode.setIcon(new ImageIcon(getClass().getResource("/img/icons8_person_20px_1.png")));
        JPaneForgotpassword.hide();
        JPaneLogin.hide();
        JPanesignup.hide();
        JPaneForgotpassword1.hide();
        btnChangePW.hide();
        JPaneSignupCode.show();

    }

    private void LoadDataUser() {
        Const.ListUser = null;
        Query q = Const.session.createQuery("FROM User");
        Const.ListUser = q.getResultList();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CheckFemale;
    private javax.swing.JRadioButton CheckMale;
    private javax.swing.JCheckBox CheckRemember;
    private javax.swing.JPanel JPaneForgotpassword;
    private javax.swing.JPanel JPaneForgotpassword1;
    private javax.swing.JPanel JPaneLogin;
    private javax.swing.JPanel JPaneSignupCode;
    private javax.swing.JPanel JPanesignup;
    private javax.swing.JPanel btnChangePW;
    private javax.swing.JButton btnSendEmail;
    private javax.swing.JLabel btnbackSigninforgotpw;
    private javax.swing.JLabel btnbackforgotpw;
    private javax.swing.JLabel btnbackforgotpw1;
    private javax.swing.JLabel btnbackforgotpw2;
    private javax.swing.JLabel btnbackforgotpw3;
    private javax.swing.JLabel btnbackforgotpw4;
    private javax.swing.JLabel btnbacksignup;
    private javax.swing.JButton btnchangePWforgot;
    private javax.swing.JButton btnchangePWforgot1;
    private javax.swing.JLabel btnforgotpw;
    private javax.swing.JButton btnsignCode;
    private javax.swing.JLabel btnsignuplogin;
    private javax.swing.JButton btnsignupnlogin;
    private javax.swing.JButton btnsinginlogin;
    private javax.swing.JCheckBox cknCheckCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblTitleCode;
    private javax.swing.JLabel lblTitlesignupCode;
    private javax.swing.JTextField txtCodeCheck;
    private javax.swing.JTextField txtCodeChecksignup;
    private javax.swing.JPasswordField txtPWchangeforgot;
    private javax.swing.JPasswordField txtchangefotgot1;
    private javax.swing.JTextField txtemailSend;
    private javax.swing.JTextField txtemailsignup;
    private javax.swing.JTextField txthovatensignup;
    private javax.swing.JPasswordField txtpwlogin;
    private javax.swing.JPasswordField txtpwsignup;
    private javax.swing.JTextField txtusernamelogin;
    private javax.swing.JTextField txtusernamesignup;
    private javax.swing.JTextField txtverycode;
    // End of variables declaration//GEN-END:variables

    private void Remmember() {
        String urs = null;
        urs = pref.get("UserName", urs);
        txtusernamelogin.setText(urs);
        String pass = null;
        pass = pref.get("Password", pass);
        txtpwlogin.setText(pass);
    }
}
