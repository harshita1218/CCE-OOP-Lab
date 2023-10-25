import java.util.*;
// import java.io.*;
class Customer{
    int CustID;
    String CustName;
    float purchase;
    public Customer(int id,String name,float pur){
        CustID=id;
        CustName=name;
        purchase=pur;
    }
}
class Regular extends Customer{
    public Regular(int id,String name,float pur){
        super(id,name,pur);
    }
    void calculate(){
        if (purchase>=5000){
            purchase*=0.95;
        }
        System.out.println("Total Amount Due Paid: "+purchase);
    }
}
class Privileged extends Customer{
    String cardType;
    public Privileged(int id,String name,float pur,String type){
        super(id,name,pur);
        cardType=type;
    }
    void calculate(){
        if (cardType=="Silver"){
            purchase*=0.90;
            System.out.println("Total Amount Due Paid: "+purchase);
        }
        else{
            purchase*=0.80;
            System.out.println("Total Amount Due Paid: "+purchase);
        }
    }
}
class Bill{
    public void flush(){};
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // Writer writer = new PrintWriter(System.out);
        System.out.print("CUSTOMER TYPE\n1.Regular\n2.Silver\n3.Gold\n\nEnter your choice: ");
        int ch=sc.nextInt();
        System.out.print("Enter Customer ID: ");
        int id=sc.nextInt();
        // writer.flush();
        System.out.print("Enter Customer Name: ");
        String name=sc.nextLine();
        name=sc.nextLine();
        System.out.print("Enter purchase: ");
        float pur=sc.nextFloat();
        System.out.println();
        switch(ch){
            case 1:
            Regular reg=new Regular(id,name,pur);
            reg.calculate();
            break;
            case 2:
            Privileged sil=new Privileged(id,name,pur,"Silver");
            sil.calculate();
            break;
            case 3:
            Privileged gold=new Privileged(id,name,pur,"Gold");
            gold.calculate();
            break;
            default:
            System.out.println("Invalid Card Type...");
        }
        sc.close();
    }
}