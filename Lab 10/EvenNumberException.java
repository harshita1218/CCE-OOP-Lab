import java.util.Scanner;

class EvenNumberException extends Exception{
    public String toString(){
        return "Even Number Detected";
    }
}

class Even{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter Number: ");
            int num=sc.nextInt();
            if(num%2==0){
                sc.close();
                throw new EvenNumberException();
            }
            System.out.println("You shall pass");
        }
        catch(EvenNumberException e){
            System.out.println(e);
        }
        
        sc.close();
    }
}