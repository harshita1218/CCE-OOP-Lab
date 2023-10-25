import java.util.Scanner;
class search{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num,key,flag=0,count=0;
        System.out.print("Enter the size: ");
        num=sc.nextInt();
        int a[]=new int[num];
        int x[]=new int[num];
        int y=0;
        System.out.print("Enter the elements: ");
        for (int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the key: ");
        key=sc.nextInt();

        for (int i=0;i<num;i++){
            if (key==a[i]){
                flag=1;
                x[y++]=i;
                count++;
            }
        }
        if (flag==1){
            System.out.print("The value is found at index locations: ");
            for(int i=0;i<count;i++){
                System.out.print("a["+x[i]+"], ");
            }
        }
        else{
            System.out.print("Element not found...");
        }
        sc.close();
    }
}