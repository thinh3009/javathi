import java.io.File;
import java.util.Scanner;

public class MainarrayList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //tao constructor rong de nhap du lieu
        arrayListdsSV dssv= new arrayListdsSV();
        int luaChon=0;
        do {
			System.out.println("MENU ---------- ");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println("""
                                           1.\tTh\u00eam sinh vi\u00ean v\u00e0o danh s\u00e1ch.
                                           2.\tIn danh s\u00e1ch sinh vi\u00ean ra m\u00e0n h\u00ecnh.
                                           3.\tKi\u1ec3m tra danh s\u00e1ch c\u00f3 r\u1ed7ng hay kh\u00f4ng.
                                           4.\tL\u1ea5y ra s\u1ed1 l\u01b0\u1ee3ng sinh vi\u00ean trong danh s\u00e1ch.
                                           5.\tL\u00e0m r\u1ed7ng danh s\u00e1ch sinh vi\u00ean.
                                           6.\tKi\u1ec3m tra sinh vi\u00ean c\u00f3 t\u1ed3n t\u1ea1i trong danh s\u00e1ch hay kh\u00f4ng, d\u1ef1a tr\u00ean m\u00e3 sinh vi\u00ean.
                                           7.\tX\u00f3a m\u1ed9t sinh vi\u00ean ra kh\u1ecfi danh s\u00e1ch d\u1ef1a tr\u00ean m\u00e3 sinh vi\u00ean.
                                           8.\tT\u00ecm ki\u1ebfm t\u1ea5t c\u1ea3 sinh vi\u00ean d\u1ef1a tr\u00ean T\u00ean \u0111\u01b0\u1ee3c nh\u1eadp t\u1eeb b\u00e0n ph\u00edm.
                                           9.\tXu\u1ea5t ra danh s\u00e1ch sinh vi\u00ean c\u00f3 \u0111i\u1ec3m t\u1eeb cao \u0111\u1ebfn th\u1ea5p.
                                           10.\tghi du lieu vao file dat.
                                           11.\tdoc danh sach sinh vien tu file dat.
                                           0.   Tho\u00e1t kh\u1ecfi ch\u01b0\u01a1ng tr\u00ecnh""");
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
            else if(luaChon==10){
                System.out.println("nhap ten file: ");
                String tenFile=sc.nextLine();
                File f=new File(tenFile);
                dssv.ghiFile(f);
            }
            else if(luaChon==11){
                System.out.println("nhap ten file: ");
                String tenFile=sc.nextLine();
                File f=new File(tenFile);
                dssv.docFile(f);
            }
        }
        while(luaChon!=0);

        
    }
}
