import java.util.Scanner;
class armstrng{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,dig,sum=0,temp;
        System.out.print("Enter the number: ");
        a=sc.nextInt();
        sc.close();
        temp=a;
        for (;temp>0;temp/=10){
            dig=temp%10;
            sum+=Math.pow(dig,3);
        }
        if (a==sum){
            System.out.print("It is an armstrong number...");
        }
        else{
            System.out.print("It is not an armstrong number...");
        }
    }
}