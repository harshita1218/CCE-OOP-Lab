import java.util.Scanner;
class Bike{
    int speedlimit;
    Bike(int limit){
        speedlimit=limit;
    }
    void run(){
        System.out.println("The speedlimit of bike is "+speedlimit);
    }
}
class Splendar extends Bike{
    // int speeedlimit;
    Splendar(int limit){
        super(limit);
    }
    void run(){
        System.out.println("The speedlimit of splendor is "+speedlimit);
    }
}
class lol{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter speed limits: ");
        int sb=sc.nextInt(),ss=sc.nextInt();
        Bike b=new Bike(sb);
        Splendar s=new Splendar(ss);
        Bike temp;
        temp=b;
        temp.run();
        temp=s;
        temp.run();
        sc.close();
    }
}