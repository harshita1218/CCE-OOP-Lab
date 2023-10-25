import java.util.Scanner;
class mult{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.print("Enter number of rows: ");
        row=sc.nextInt();
        System.out.print("Enter number of columns: ");
        col=sc.nextInt();
        int a[][]=new int[row][col];
        int b[][]=new int[row][col];
        int c[][]=new int[row][col];
        int d[][]=new int[row][col];
        //Insert elements
        System.out.println("INSERT ELEMENTS INTO FIRST MATRIX");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("INSERT ELEMENTS INTO SECOND MATRIX");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("MATRIX AFTER MULTIPLICATION IS");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                d[i][j]=a[i][j]+b[i][j];
                c[i][j]=0;
                for(int k=0;k<col;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("MATRIX AFTER ADDITION IS");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(d[i][j]+"   ");
            }
            System.out.println();
        }
        sc.close();
    }
}