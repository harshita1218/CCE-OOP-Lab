import java.util.Scanner;
import java.lang.Math;
class series{
    static int fact(int num){
        int fct=0;
        for (int i=1;i<num;i++){
            fct*=i;
        }
        return fct;
    }
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.print("MENU\n1.Sine Series\n2.Sum Series\n\nEnter Choice: ");
        ch=sc.nextInt();
        double x;
        System.out.print("Enter value of x: ");
        x=sc.nextDouble();
        switch(ch){
            case 1:
            double sin=0;
            int n;
            System.out.print("Enter the numer of terms: ");
            n=sc.nextInt(); 
            for (int i=0;i<n;i++){
                sin += (Math.pow(-1,n))*(Math.pow(x,(2*n)-1))/(fact((2*n)-1));
            }
            System.out.print("Sin("+x+") = "+sin);
        }
        sc.close();
    }
}