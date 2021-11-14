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
@Table(name = "thilai")
public class ThiLai {

    @Id
    @Column(name = "Mon")
    private String ID;

    @Column(name = "Tieude")
    private String tieude;

    @Column(name = "MaSV")
    private int MaSV;

    @Column(name = "MaMon")
    private String MaMon;

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the tieude
     */
    public String getTieude() {
        return tieude;
    }

    /**
     * @param tieude the tieude to set
     */
    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

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
     * @return the MaMon
     */
    public String getMaMon() {
        return MaMon;
    }

    /**
     * @param MaMon the MaMon to set
     */
    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }
}
