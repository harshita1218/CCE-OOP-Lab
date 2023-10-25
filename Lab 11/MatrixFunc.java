class MatThread implements Runnable{
    int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
    int num;
   public int sum;
    MatThread(int n){
        num=n;
        sum=0;
    }
    public void run(){
        if (num==1){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(j>i){
                        sum+=mat[i][j];
                        try{Thread.sleep(1000);}
                        catch(InterruptedException e){}
                    }
                }
            }
        }
        else if(num==2){
            for(int i=0;i<3;i++){
                sum+=mat[i][i];
                try{Thread.sleep(1000);}
                        catch(InterruptedException e){}
            }
            
        }
        else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(i>j){
                        sum+=mat[i][j];                      
                    }
                }
            }
        }
    }
}

class mainth{
    public static void main(String[] args){
        int total=0;
        MatThread m1=new MatThread(1);
        Thread t1=new Thread(m1);
        t1.start();
        MatThread m2=new MatThread(2);
        Thread t2=new Thread(m2);
        t2.start();
        MatThread m3=new MatThread(3);
        Thread t3=new Thread(m3);
        t3.start();
        try{
        t1.join();
        t2.join();
        t3.join();
        }catch(InterruptedException e){}
        total=m1.sum+m2.sum+m3.sum;
        System.out.println(total);
    }
}