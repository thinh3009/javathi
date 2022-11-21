

public class Maingenerics {
    public static void main(String[] args) {
        
        generics b = new generics<Integer>(15);
        System.out.println("gia tri: "+b.getvalues());

        generics b1=new generics<String>("hello thinh");
        System.out.println("gia tri: "+b1.getvalues());

        generics b2=new generics<Double>(15.4);
        System.out.println("gia tri: "+b2.getvalues());
        
    }
}
