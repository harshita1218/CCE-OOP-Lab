class RThread implements Runnable{
    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    int num;
    int rsum;
    Thread t;
    RThread(int n){
        num=n;
        rsum=0;
        t=new Thread();
        t.start();
    }
    public void run(){
        for(int i=0;i<3;i++){
            rsum+=arr[num][i];
        }
    }
}

class Matrix{
    public static void main(String args[]) {
        // Scanner sc=new Scanner(System.in);
        RThread r1=new RThread(0);
        Thread t1=new Thread(r1);
        t1.start();
        RThread r2=new RThread(1);
        Thread t2=new Thread(r2);
        t2.start();
        RThread r3=new RThread(2);
        Thread t3=new Thread(r3);
        t3.start();
        int total=0;
        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch(InterruptedException e){}
        total=r1.rsum+r2.rsum+r3.rsum;
        System.out.println("Total: "+total);
    }
}