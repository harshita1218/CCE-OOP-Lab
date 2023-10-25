import java.util.Scanner;
class diagnol{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int row,col,sum=0;
        System.out.print("Enter number of rows: ");
        row=sc.nextInt();
        System.out.print("Enter number of columns: ");
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
            System.out.println("\n\nDIAGNOL ELEMENTS ARE:");
            for(int i=0;i<row;i++){
                System.out.println(arr[i][i]);
                sum+=arr[i][i];
            }
            System.out.println("\nSUM IS: "+sum);
            sc.close();
        }
    }
}