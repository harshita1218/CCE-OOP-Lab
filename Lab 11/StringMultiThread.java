class TThread extends Thread{
    String str[];
    int num;
    TThread(String s[],int n){
        num=n;
        str=s;
    }
    public void run(){
        if (num==1){
            System.out.println();
            for(int i=0;i<str.length;i++){
                StringBuffer s=new StringBuffer(str[i]);
                s.reverse();
                if(str[i].equals(s.toString())){
                    System.out.println("Palindrome");
                }
                else{
                    System.out.println("Not Palindrome");
                }
            }
        }
        else if(num==2){
            System.out.println();
            String larg="", smal="";
            for(int i=0;i<str.length;i++){
                if(str[i].length()>larg.length()){
                    larg=str[i];
                }
                else{
                    smal=str[i];
                }
            }
            System.out.println("Largest: "+larg);
            System.out.println("Smallest: "+smal);
            System.out.println();
        }
    }
}

class normal{
    public static void main(String[] args) throws InterruptedException {
        String s[]={"Hello","racecar","malayalam","world","yoy"};
        TThread t1=new TThread(s,1);
        t1.setName("Palindrome");
        t1.start();
        t1.join();
        TThread t2=new TThread(s,2);
        t2.setName("MaxMin");
        t2.start();
    }
}