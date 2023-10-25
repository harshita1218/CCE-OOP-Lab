import java.util.Scanner;
class bitw{
    public static void main(String args[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        a=sc.nextInt();
        b=a>>1;
        c=a<<1;
        System.out.println("Multiplied: "+ c);
        System.out.println("Divided: "+ b);
        sc.close();
    }
}