import java.util.Scanner;

class factorial{
    public int fact(int num){
        int res=1;
        for (int i=1;i<num+1;i++){
            res*=i;
        }
        return res;
    }
}

class pascal{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter number of levels: ");
        num=sc.nextInt();
        factorial obj=new factorial();

        for (int i=0;i<num+1;i++){
            for (int j=0;j<=num-i;j++){
                System.out.print("  ");
            } 
            
            for (int j=0;j<=i;j++){
                    System.out.print(obj.fact(i)/(obj.fact(i-j)*obj.fact(j)) + "   ");
                }
                System.out.println();
        }
        sc.close();
    }
}