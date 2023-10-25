import java.util.Scanner;
class magicmatrix{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int row,col,sumd=0,sumnd=0;
        System.out.print("Enter number of rows: ");
        row=sc.nextInt();
        System.out.print("Enter number of columns: ");
        col=sc.nextInt();
        int sumc[]=new int[col];
        int sumr[]=new int[row];
        if (row!=col){
            System.out.println("NOT A SQUARE MATRIX...");
            sc.close();
            return;
        }
        else{
            int arr[][]=new int[row][col];
            System.out.println("INSERT ELEMENTS");
            for (int i=0;i<row;i++){
                 for(int j=0;j<col;j++){
                     arr[i][j]=sc.nextInt();
                  }
            }

            for(int i=0;i<row;i++){
                sumd+=arr[i][i];
                sumnd+=arr[i][row-i-1];
            }
            
            for (int i=0;i<row;i++){
                sumr[i]=0;
                for(int j=0;j<col;j++){
                    sumr[i] += arr[i][j];
                }
            }

            for (int i=0;i<row;i++){
                sumc[i]=0;
                for(int j=0;j<col;j++){
                    sumc[i] += arr[j][i];
                }
            }
        
            if(sumnd!=sumd){
                System.out.println("NOT A MAGIC MATRIX...");
                sc.close();
                return;
            }
            else{
                for (int i=0;i<row;i++){
                    if (sumr[i]!=sumc[i]){
                        System.out.println("NOT A MAGIC MATRIX...");
                        sc.close();
                        return;
                    }
                }
                System.out.println("MAGIC MATRIX...");
                sc.close();}}}}