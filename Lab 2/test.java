import java.util.Scanner;
class test{
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a=sc.nextInt();
        System.out.print("Enter the second number: ");
        b=sc.nextInt();
        System.out.println();
        System.out.println("(a << 2) + (b >> 2) = "+ ((a << 2) + (b >> 2)));
        System.out.println("(b > 0) = "+(b>0));
        System.out.println("(a + b * 100) / 10 = "+ ((a + b * 100) / 10));
        System.out.println("a & b = "+ (a & b));
        sc.close();
   
    }
}