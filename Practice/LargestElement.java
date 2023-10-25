import java.util.Scanner;
class BubbleSort{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n,large;
        System.out.print("Enter size:");
        n=sc.nextInt();
        int a[]=new int[100];
        System.out.println("Enter the Array Elements:");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        large=a[0];
        for (int i=0;i<n;i++){
            if (a[i]>large){
                large=a[i];
            }
        }
        System.out.println("The largest element in the array is "+large);
        sc.close();
    }
}
