/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hiberneat;

//import Hiberneat.Public.Diem;
//import Hiberneat.Public.Khoa;
//import Hiberneat.Public.Lop;
//import Hiberneat.Public.Monhoc;
//import Hiberneat.Public.ThiLai;
import Hiberneat.Public.Diem;
import Hiberneat.Public.Khoa;
import Hiberneat.Public.Lop;
import Hiberneat.Public.Monhoc;
import Hiberneat.Public.ThiLai;
import Hiberneat.SinhVien.SinhVien;
import Hiberneat.User.User;
//
//import Hiberneat.SinhVien.SinhVien;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author admin
 */
public class Connection {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();
        Properties props = new Properties();
        props.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//        props.put(Environment.URL, "jdbc:mysql://remotemysql.com:3306/4g20fnAWs6");
        props.put(Environment.URL, "jdbc:mysql://localhost:3306/demo");
        props.put(Environment.USER, "root");
//        props.put(Environment.USER, "4g20fnAWs6");
        props.put(Environment.PASS, "admin");
//        props.put(Environment.PASS, "qK9jg49qBc");
        props.put(Environment.SHOW_SQL, "true");
        conf.setProperties(props);
        conf.addAnnotatedClass(User.class);
        conf.addAnnotatedClass(SinhVien.class);
        conf.addAnnotatedClass(Khoa.class);
        conf.addAnnotatedClass(Lop.class);
        conf.addAnnotatedClass(Monhoc.class);
        conf.addAnnotatedClass(Diem.class);      
        conf.addAnnotatedClass(ThiLai.class);      
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(serviceRegistry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

}
