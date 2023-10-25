import java.util.Scanner;
class  IncreQ{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int a= (int) num/100;
    int b= (int)(num/10 - (a*10));
    int c=num%10;
    if(a+c==b){
      System.out.print("Sum is equal:\n");
      for(int i=1;i<b;i++){
        if (b%i==0){
          System.out.print(i+" ");
        }
      }
    }
    else{
      System.out.println("As sum is not equal, sum: "+a+c);
    }
    System.out.print(b);
    sc.close();
  }
} 
  