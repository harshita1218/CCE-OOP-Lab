import java.util.Scanner;
class rectangle{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        float l,b,ar,cir;
        System.out.print("Enter length: ");
        l=sc.nextInt();
        System.out.print("Enter breadth: ");
        b=sc.nextInt();
        ar=l*b;
        cir=2*(l+b);
        System.out.println("Area is "+ar);
        System.out.println("Circumference is "+cir);
        sc.close();
    }
}