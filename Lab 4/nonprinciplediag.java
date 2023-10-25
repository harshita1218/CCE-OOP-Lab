import java.util.Scanner;
class nondiagnol{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int row,col,sum=0;
        System.out.print("Enter number of rows and columns: ");
        row=sc.nextInt();
        col=sc.nextInt();
        if (row!=col){
            System.out.println("NOT A SQUARE MATRIX...");
            sc.close();
            return;
        }
        else{
            int arr[][]=new int[row][col];
             //Insert elements
             System.out.println("INSERT ELEMENTS");
            for (int i=0;i<row;i++){
                 for(int j=0;j<col;j++){
                     arr[i][j]=sc.nextInt();
                  }
            }
            System.out.println("\n\nNON DIAGNOL ELEMENTS ARE:");
            for(int i=0;i<row;i++){
                System.out.println(arr[i][row-i-1]);
                sum+=arr[i][row-i-1];
            }
            System.out.println("\nSUM IS: "+sum);
            sc.close();
        }
    }
}