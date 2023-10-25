import java.util.Scanner;
class primegen{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,flag;
        System.out.print("Enter the lower limit: ");
        num1=sc.nextInt();
        System.out.print("Enter the upper limit: ");
        num2=sc.nextInt();
        for (int i=num1;i<=num2;i++){
            flag=0;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.print(i+", ");
            }
        }
        sc.close();
    }
}