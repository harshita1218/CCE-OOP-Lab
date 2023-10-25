import java.util.Scanner;
class prg1
{
    public static void main(String args[]){
        int year;
        boolean value=false;
        System.out.print("Enter the year: ");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();

        if ((year%100!=0 | year%400==0) & year%4==0){
            value=true;
        }
        else if (year%4!=0 | year%100==0){
            value=false;
        }

        if (value){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is a common year");
        }
        sc.close();
    }
}