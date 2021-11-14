/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hiberneat.Public;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "monhoc")
public class Monhoc {
    
    @Id
    @Column(name = "MaMonHoc")
    private String MaMonhoc;
    
    @Column(name = "TenMonHoc")
    private String TenMonhoc;
    
    @Column(name = "MaKhoa")
    private String MaKhoa;

    /**
     * @return the MaMonhoc
     */
    public String getMaMonhoc() {
        return MaMonhoc;
    }

    /**
     * @param MaMonhoc the MaMonhoc to set
     */
    public void setMaMonhoc(String MaMonhoc) {
        this.MaMonhoc = MaMonhoc;
    }

    /**
     * @return the TenMonhoc
     */
    public String getTenMonhoc() {
        return TenMonhoc;
    }

    /**
     * @param TenMonhoc the TenMonhoc to set
     */
    public void setTenMonhoc(String TenMonhoc) {
        this.TenMonhoc = TenMonhoc;
    }

    /**
     * @return the MaKhoa
     */
    public String getMaKhoa() {
        return MaKhoa;
    }

    /**
     * @param MaKhoa the MaKhoa to set
     */
    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }
    
}
