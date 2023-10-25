import java.util.Scanner;

class menu2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1 and string2: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        while (true) {
            System.out.println("\n\nMENU\n1.Compare\n2.Case Inverter\n3.Substring Check\n4.Replace\n5.Exit\n\nEnter your choice: ");
            int res = sc.nextInt();
            if (res == 1) {
                if (str1.compareTo(str2) == 0) {
                    System.out.println("EQUAL");
                } else if (str1.compareTo(str2) < 0) {
                    System.out.println("STRING-1 IS SMALLER");
                } else {
                    System.out.println("STRING-1 IS GREATER");
                }
            }
            else if (res == 2) {
                for (int i = 0; i < str1.length(); i++) {
                    String str3 = str1.substring(i, i + 1);
                    if (Character.isUpperCase(str1.charAt(i))) {
                        str3 = str3.toLowerCase();
                    }
                    else{
                        str3=str3.toUpperCase();
                    }  
                    System.out.print(str3);
                }
                System.out.println();
                for (int i = 0; i < str2.length(); i++) {
                    String str4 = str2.substring(i, i + 1);
                    if (Character.isUpperCase(str1.charAt(i))) {
                        str4 = str4.toLowerCase();
                    } 
                    else{  
                        str4=str4.toUpperCase();
                    }
                    System.out.print(str4);
                }
            }
            else if (res == 3) {
                if (str1.compareTo(str2) == 0) {
                    System.out.println("both are substrings of each other");
                } else if (str1.contains(str2)) {
                    System.out.println("str2 is a substring of str1");
                } else if (str2.contains(str1)) {
                    System.out.println("str1 is a substring of str2");
                } else {
                    System.out.println("Not a substring");
                }
            }
            else if (res == 4) {
                if (str1.compareTo(str2) == 0) {
                    str2 = "Hello";
                    str1 = "Hello";
                } else if (str1.contains(str2)) {
                    str2 = "Hello";
                } else if (str2.contains(str1)) {
                    str1 = "Hello";
                } else {
                    System.out.println("Not a substring");
                }
            }
            else if (res == 5) {
                break;
            }
        }
    sc.close();
    }   
}