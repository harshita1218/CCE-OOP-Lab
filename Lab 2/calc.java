import java.util.Scanner;
class calc{
    public static void main(String args[]){
        float num1,num2;
        char op,resp='y';
        Scanner sc=new Scanner(System.in);

        do{
            System.out.print("Enter firstnumber, operation and secondnumber: ");
            num1=sc.nextFloat();
            op=sc.next().charAt(0); 
            num2=sc.nextFloat();
            switch(op){
                case '+':
                System.out.println(num1+num2);
                break;
                case '-':
                System.out.println(num1-num2);
                break;
                case '*':
                System.out.println(num1*num2);
                break;
                case '/':
                System.out.println(num1/num2);
                break;
                default:
                System.out.println("Invalid Operation...");
            }

            System.out.println("Do another (y/n)?");
            resp=sc.next().charAt(0);
            } while(resp=='y');

            sc.close();
        }
    }