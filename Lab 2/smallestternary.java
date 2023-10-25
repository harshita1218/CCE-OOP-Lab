import java.util.Scanner;

class SmallestNumber {
    public static void main(String args[]) {
        int a, b, c, smallest, temp;
        // object of the Scanner class
        Scanner sc = new Scanner(System.in);
        // reading input from the user
        System.out.print("Enter the first number: ");  
        a = sc.nextInt();
        System.out.print("Enter the second number: ");  
        b = sc.nextInt();
        System.out.print("Enter the third number: ");  
        c = sc.nextInt();
        temp = a < b ? a : b;
        smallest = c < temp ? c : temp;
        System.out.println("The smallest number is: " + smallest);
        sc.close();
    }
}