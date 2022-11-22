/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jbuttonswing;
import java.util.ArrayList;
/**
 *
 * @author ASUS TUF
 */
public class SINHVIEN {
    private ArrayList<ThucDon> danhsach;
    
    public SINHVIEN(){
        this.danhsach= new ArrayList<ThucDon>();
    }
    
    public SINHVIEN(ArrayList<ThucDon> danhsach){
        this.danhsach=danhsach;
    }
    
    public void themSV(ThucDon sv){
        //them vao cuoi dds
        this.danhsach.add(sv);
    }
}
