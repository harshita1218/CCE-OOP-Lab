import java.util.Scanner;
class fact{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long a,fact=1;
        a=sc.nextLong();
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        System.out.print("Factorial of the number is "+fact);
        sc.close();
    }
}