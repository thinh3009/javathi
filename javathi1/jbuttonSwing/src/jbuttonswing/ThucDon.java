/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jbuttonswing;

/**
 *
 * @author ASUS TUF
 */
public class ThucDon implements Comparable<ThucDon>{
    private String maso;
    private String hoten;
    private String lop;
    private String ngaysinh;
    private String gioitinh;

    public ThucDon(String maso, String hoten, String lop, String ngaysinh, String gioitinh) {
        this.maso = maso;
        this.hoten = hoten;
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "ThucDon{" + "maso=" + maso + ", hoten=" + hoten + ", lop=" + lop + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + '}';
    }
    
    @Override
    public int compareTo(ThucDon o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
