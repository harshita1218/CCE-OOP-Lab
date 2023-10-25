import java.util.Scanner;
class combination{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the first number: ");
        // System.out.print("Enter the second number: ");
        // System.out.print("Enter the third number: ");
        // System.out.print("Enter the fourth number: ");
        char ch;
        System.out.print("MENU\n1.With Repitition\n2.Without Repitition\n\nEnter Choice: ");
        ch=sc.next().charAt(0);
        if (ch=='1'){
            for(int i=1;i<5;i++){
                for(int j=1;j<5;j++){
                   for(int k=1;k<5;k++){
                      for(int l=1;l<5;l++){
                           System.out.print((i*1000)+(j*100)+(k*10)+l);
                           System.out.println();
                       }
                   }
                }
            }
        }
        if (ch=='2'){
            for(int i=1;i<5;i++){
                for(int j=1;j<5;j++){
                   for(int k=1;k<5;k++){
                      for(int l=1;l<5;l++){
                        if (i==j || j==k || k==l || i==k || i==l || j==l){
                            continue;
                        }
                        System.out.print((i*1000)+(j*100)+(k*10)+l);
                        System.out.println();
                       }
                   }
                }
            }
        }
        sc.close();
    }
}