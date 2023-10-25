class prac{
    public static void main(String args[]){
        String s="rishabh.java python.java java.java spyder.py";
        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++){
            if(s1[i].endsWith(".java"))
            System.out.println(s1[i]);
        }
    }
}