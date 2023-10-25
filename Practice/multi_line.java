import java.util.Scanner;

// class Solution {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter string: ");
//         String n;
//         n=sc.nextLine();
//         System.out.print(n);
//         sc.close();
//     }
// }

class Solution {

    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        int b =1;
        while(scanner.hasNext()){
            String a = scanner.nextLine();
            System.out.println(b+" "+a);
            b++;            
        }
        scanner.close();
    }
}