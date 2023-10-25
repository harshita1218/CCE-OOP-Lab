import java.util.Scanner;
class HelloWorld{
    public static void main(String args[]) {
        System.out.print("Hello World");
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println(a);
        sc.close();
    }
}