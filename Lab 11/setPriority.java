class MT implements Runnable{
    public void run(){}
}
class hello{
    public static void main(String[] args) {
        try{
            MT m=new MT();
            Thread t=new Thread(m);
            System.out.println(t.getPriority());
            t.setPriority(9);
            System.out.println(t.getPriority());
            t.start();
            t.join();
        }catch(InterruptedException e){}
    }
}