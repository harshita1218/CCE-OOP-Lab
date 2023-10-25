import java.util.Scanner;
class triangle{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num;
        num=sc.nextInt();
        for (int i=1;i<num+1;i++){
            for (int j=1;j<i+1;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}