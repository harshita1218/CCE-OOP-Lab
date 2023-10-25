import java.util.Scanner;
class arraystring{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");   
        }

        sc.close();
    }
}