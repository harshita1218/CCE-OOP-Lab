import java.util.Scanner;
class table{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num;
        num=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
            sc.close();
        }
    }
}