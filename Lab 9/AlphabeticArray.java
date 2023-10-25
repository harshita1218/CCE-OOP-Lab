import java.util.Scanner;

class alpha{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of terms: ");
        int term=sc.nextInt();
        String arr[]=new String[term+1];
        String temp;
        System.out.println("\nEnter terms: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("\nAFTER REVERSING: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}