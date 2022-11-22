/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jbuttonswing;

/**
 *
 * @author ASUS TUF
 */
public class Test {
    public static void main(String[] args) {
        //tao constructor rong de nhap du lieu
        SINHVIEN dssv= new SINHVIEN();
        int luaChon=0;
        do {
	System.out.println("MENU ---------- ");
	System.out.println("Vui lòng chọn chức năng: ");
	System.out.println("1.Thêm sinh viên vào danh sách.\n");
			
	luaChon = sc.nextInt();
        sc.nextLine();
        if(luaChon==1){
            System.out.println("nhap ma sv: "); String masv=sc.nextLine();
            System.out.println("nhap ho ten: "); String hoten=sc.nextLine();
            System.out.println("nhap nam sinh: "); int namsinh=sc.nextInt();
            System.out.println("nhap diem tb: "); float diemtb=sc.nextFloat();
            arrayListSV sv = new arrayListSV(masv, hoten, namsinh, diemtb);
            dssv.themSV(sv);
            }
            else if(luaChon==2){
                dssv.inDS();
            }
            else if(luaChon==3){

            }
            else if(luaChon==4){

            }
            else if(luaChon==5){

            }
            else if(luaChon==6){

            }
            else if(luaChon==7){

            }
            else if(luaChon==8){

            }
            else if(luaChon==9){

            }
        }
        while(luaChon!=0);

        
    }
}
    

