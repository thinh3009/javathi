/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class QLSVModel {
    private ArrayList<ThiSinh> dsThiSinh;
    private String luaChon;
    private String tenFile;
    
    
    public QLSVModel() {
        this.dsThiSinh = new ArrayList</*ThiSinh*/>();
        this.luaChon = "";
        this.tenFile = "";
    }
    
    public QLSVModel(ArrayList<ThiSinh> dsThiSinh){
        this.dsThiSinh=dsThiSinh;
    }

    public ArrayList<ThiSinh> getDsThiSinh() {
        return dsThiSinh;
    }

    public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }

    public String getLuaChon() {
        return luaChon;
    }

    public void setLuaChon(String luaChon) {
        this.luaChon = luaChon;
    }

    public String getTenFile() {
        return tenFile;
    }

    public void setTenFile(String tenFile) {
        this.tenFile = tenFile;
    }
    
    public void insert(ThiSinh thiSinh){
        this.dsThiSinh.add(thiSinh);
    }
    
    public void delete(ThiSinh thiSinh){
        this.dsThiSinh.remove(thiSinh);
    }
    
    public void update(ThiSinh thiSinh){
        this.dsThiSinh.remove(thiSinh);
        this.dsThiSinh.add(thiSinh);
    }
}
