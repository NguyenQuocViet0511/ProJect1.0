/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hiberneat.User;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "Tendangnhap")
    private String UserName;

    @Column(name = "Hovaten")
    private String HovaTen;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Matkhau")
    private String Password;

    @Column(name = "Diachi")
    private String DiaChi;

    @Column(name = "Gioitinh")
    private String Gioitinh;

    @Column(name = "Ngaysinh")
    private Date NgaySinh;

   

    @Column(name = "Quyen")
    private String Quyen;

    @Column(name = "Trangthai")
    private String TrangThai;
    
    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    /**
     * @return the id
     */
   

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the NamSinh
     */
    /**
     * @return the HovaTen
     */
    public String getHovaTen() {
        return HovaTen;
    }

    /**
     * @param HovaTen the HovaTen to set
     */
    public void setHovaTen(String HovaTen) {
        this.HovaTen = HovaTen;
    }

    public String getEmail() {
        return Email;
    }

    /**
     * @return the ChungMinhThu
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    /**
     * @return the Gioitinh
     */
    public String getGioitinh() {
        return Gioitinh;
    }

    /**
     * @param Gioitinh the Gioitinh to set
     */
    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    /**
     * @return the Quyen
     */
    public String getQuyen() {
        return Quyen;
    }

    /**
     * @param Quyen the Quyen to set
     */
    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }

}
