import java.util.Scanner;
class countnum{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int pos=0,neg=0,zero=0,num;
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++){
            num=sc.nextInt();
            if (num>0){
                pos++;
            }
            else if (num<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println("The number of positive numbers is "+pos);
        System.out.println("The number of negative numbers is "+neg);
        System.out.println("The number of zeroes is "+zero);
        sc.close();
    }
}