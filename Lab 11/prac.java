class rt extends Thread
{
    String name;
    rt(String name)
    {
        this.name=name;
    }

    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(name);
        }
        try{Thread.sleep(1000);}
        catch (InterruptedException e){}
    }
}

class oops 
{
    public static void main(String args[])
    {
        Thread t=Thread.currentThread();
        t.setName("OOP");
        rt t1= new rt("MIT");
        t1.start();
        rt t2= new rt("ICT");
        t2.start();
        for(int i=0;i<5;i++){
            System.out.println(t.getName());
        }
        // rt t= new rt(Thread.currentThread().setName("OOP"));
    }
}