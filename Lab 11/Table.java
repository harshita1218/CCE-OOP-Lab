class Table {
    synchronized void printTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+ (n*i));
        }
    }
}
class My extends Thread{
    Table t;
    int n;
    My(Table t,int n){
        this.t=t;
        this.n=n;
    }
    public void run(){
        
        t.printTable(n);
    }
}
class bleh4 {
    public static void main(String[] args) {
        Table mt=new Table();
        My t1= new My(mt,5);
        t1.start();
        My t2= new My(mt,6);
        t2.start();
    } 
}
