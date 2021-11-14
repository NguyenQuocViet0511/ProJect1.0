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
@Table(name = "lop")
public class Lop {

    @Id
    @Column(name = "MaLop")
    private String Malop;

    @Column(name = "TenLop")
    private String TenLop;

    @Column(name = "MaKhoa")
    private String Makhoa;

    /**
     * @return the Malop
     */
    public String getMalop() {
        return Malop;
    }

    /**
     * @param Malop the Malop to set
     */
    public void setMalop(String Malop) {
        this.Malop = Malop;
    }

    /**
     * @return the TenLop
     */
    public String getTenLop() {
        return TenLop;
    }

    /**
     * @param TenLop the TenLop to set
     */
    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

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

    @Override
    public String toString() {
        return getTenLop() + "" + getMalop() + "" +getMakhoa();
    }
    
}
