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
@Table(name = "diem")
public class Diem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int ID;

    @Column(name = "HovaTen")
    private String HovaTen;

    @Column(name = "Diemdau")
    private double DiemDau;

    @Column(name = "Diemgiua")
    private double Diemgiua;

    @Column(name = "Diemcuoi")
    private double DiemCuoi;

    @Column(name = "DiemTong")
    private double Tongcuoi;

    @Column(name = "MaSV")
    private int MaSV;

    @Column(name = "MaMonHoc")
    private String MaMon;

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the DiemDau
     */
    public double getDiemDau() {
        return DiemDau;
    }

    /**
     * @param DiemDau the DiemDau to set
     */
    public void setDiemDau(double DiemDau) {
        this.DiemDau = DiemDau;
    }

    /**
     * @return the Diemgiua
     */
    public double getDiemgiua() {
        return Diemgiua;
    }

    /**
     * @param Diemgiua the Diemgiua to set
     */
    public void setDiemgiua(double Diemgiua) {
        this.Diemgiua = Diemgiua;
    }

    /**
     * @return the DiemCuoi
     */
    public double getDiemCuoi() {
        return DiemCuoi;
    }

    /**
     * @param DiemCuoi the DiemCuoi to set
     */
    public void setDiemCuoi(double DiemCuoi) {
        this.DiemCuoi = DiemCuoi;
    }

    /**
     * @return the Tongcuoi
     */
    public double getTongcuoi() {
        return Tongcuoi = (DiemDau + Diemgiua + DiemCuoi) / 3;
    }

    /**
     * @param Tongcuoi the Tongcuoi to set
     */
    public void setTongcuoi(double Tongcuoi) {
        this.Tongcuoi = Tongcuoi;
    }

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
