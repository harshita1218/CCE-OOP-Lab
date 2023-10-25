import java.util.Scanner;
class palindrome{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num,temp,dig,revno=0;
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        temp=num;
        while(temp>0){
            dig=temp%10;
            revno= (revno*10)+dig;
            temp/=10;
        }
        if (revno==num){
            System.out.println("The number is a palindrome...");
        }
        else{
            System.out.println("The number is not a palindrome...");
        }
        sc.close();
    }
}