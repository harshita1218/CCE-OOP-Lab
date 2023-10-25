class newThread implements Runnable{
    int num;
    newThread(int num){
        this.num=num;
    }
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("T"+Integer.toString(num)+"= "+i);
            try{Thread.sleep(2000);}
            catch(InterruptedException e){}
        }
    }
}
class mainfunc{
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            newThread m=new newThread(i);
            Thread m1=new Thread(m);
            m1.start();
        }
    }
}