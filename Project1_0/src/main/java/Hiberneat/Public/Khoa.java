/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hiberneat.Public;

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
@Table(name = "khoa")
public class Khoa{
    
    @Id
    @Column(name = "MaKhoa")
    private String Makhoa;
    
    
    @Column(name = "TenKhoa")
    private String TenKhoa;

    /**
     * @return the Id
     */
  

    /**
     * @return the Makhoa
     */
    public String getMakhoa() {
        return Makhoa;
    }

    /**
     * @param Makhoa the Makhoa to set
     */
    public void setMakhoa(String Makhoa) {
        this.Makhoa = Makhoa;
    }

    /**
     * @return the TenKhoa
     */
    public String getTenKhoa() {
        return TenKhoa;
    }

    /**
     * @param TenKhoa the TenKhoa to set
     */
    public void setTenKhoa(String TenKhoa) {
        this.TenKhoa = TenKhoa;
    }
    
    
}
