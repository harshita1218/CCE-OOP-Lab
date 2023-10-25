import java.util.Scanner;
class symmetric{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int row,col,flag=0;
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

            for (int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if (arr[i][j]!=arr[j][i]){
                        flag=1;
                        break;
                    }
                 }
           }
            if (flag==1){
                System.out.println("NOT A SYMMETRIC MATRIX...");
            }
            else{
                System.out.println("SYMMETRIC MATRIX...");
            }
            sc.close();
        }
    }
}