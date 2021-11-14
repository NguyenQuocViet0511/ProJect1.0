/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import Hiberneat.Public.Diem;
import Hiberneat.Public.Khoa;
import Hiberneat.Public.Lop;
import Hiberneat.Public.Monhoc;
import Hiberneat.Public.ThiLai;
import Hiberneat.SinhVien.SinhVien;
import Hiberneat.User.User;
import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author admin
 */
public class Const {
    public static Session session = Hiberneat.Connection.getFACTORY().openSession();
    public static javax.mail.Session SessionEMail  = Hiberneat.ConectionSMTP.getEmail();
    public static List<User> ListUser ;
    public static List<SinhVien> ListSinhVien ;
    public static List<Khoa> ListKhoa ;
    public static List<Lop> ListLop ;
    public static List<Monhoc> ListMonhoc ;
    public static List<Diem> ListDiem ;
    public static List<ThiLai> ListThiLai ;
    public static User user = new User();
    public static User userRemember = new User();
    public static boolean  Checkremeber ;
    public static User user_update = new User();
     public static SinhVien SinhVienUpdate = new SinhVien();
    public static boolean  Load = true;
    
}
