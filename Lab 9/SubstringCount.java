import java.util.Scanner;
class alagaasman{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.nextLine();
        str=str.trim();
        System.out.print("\nEnter key: ");
        String key=sc.nextLine();
        int count=0;
        String s[]=str.split(key);
        if(!str.endsWith(key) && !str.startsWith(key)){
            count=s.length-1;
        }
        else if(str.endsWith(key) && !str.startsWith(key)){
            count=s.length;
        }
        else if(!str.endsWith(key) && str.startsWith(key)){
            count=s.length-1;
        }
        else{
            count=s.length;
        }
        System.out.println("Occurances: "+count);
        sc.close();
    }
}