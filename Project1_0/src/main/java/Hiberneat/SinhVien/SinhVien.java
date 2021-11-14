/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hiberneat.SinhVien;


import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "sinhvien")
public class SinhVien{

    @Id 
    @Column(name = "Masv")
    private int MaSV;

    @Column(name = "Hovaten")
    private String hoten;

    @Column(name = "Ngaysinh")
    private Date NgaySinh;

    @Column(name = "Gioitinh")
    private String Gioitinh;

    @Column(name = "Diachi")
    private String Diachi;

    @Column(name = "Sodienthoai")
    private int SoDienThoai;

    @Column(name = "MaLop")
    private String MaLop;
    
   

    /**
     * @return the ID
     */
 

    /**
     * @return the MaSV
     */
    public int getMaSV() {
        return MaSV;
    }

    /**
     * @param MaSV the MaSV to set
     */
    public void setMaSV(int MaSV) {
        this.MaSV = MaSV;
    }

    /**
     * @return the hoten
     */
    public String getHoten() {
        return hoten;
    }

    /**
     * @param hoten the hoten to set
     */
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    /**
     * @return the NgaySinh
     */
    public Date getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
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
     * @return the Diachi
     */
    public String getDiachi() {
        return Diachi;
    }

    /**
     * @param Diachi the Diachi to set
     */
    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    /**
     * @return the SoDienThoai
     */
    public int getSoDienThoai() {
        return SoDienThoai;
    }

    /**
     * @param SoDienThoai the SoDienThoai to set
     */
    public void setSoDienThoai(int SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    @Override
    public String toString() {
        return getMaSV()+ "" + getHoten();
    }


    

}