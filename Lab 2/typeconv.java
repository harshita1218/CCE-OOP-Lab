import java.util.Scanner;
class typeconv{
    public static void main(String args[]){
        int i;
        double d;
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer:");
        i=sc.nextInt();
        System.out.print("Enter an double:");
        d=sc.nextDouble();
        System.out.print("Enter an character:");
        c=sc.next().charAt(0);
        System.out.println();
        System.out.println("Integer After Type Conversion: "+(byte)i);
        System.out.println("Char After Type Conversion: "+(int)c);
        System.out.println("Double After Type Conversion: "+(byte)d);
        System.out.println("Double After Type Conversion: "+(int)d);
        sc.close();
    }
}