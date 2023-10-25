class StringException extends java.lang.Exception{
    String st;
    StringException(String s){
        st=s;
    }
    public String toString(){
        return st+" is not a palindrome";
    }
}
class impl{
    static void strop(String s1, String s2) throws StringException{
        StringBuffer s3=new StringBuffer(s1);
        StringBuffer s4=new StringBuffer(s2);
        s3.reverse();
        s4.reverse();
        String s5=s3.toString().concat(s4.toString());
        int flag=1;
        char ch[]=s5.toCharArray();
        for(int i=0;i<s5.length();i++){
            if(ch[i] != ch[s5.length()-i-1]){
                flag=0;
                break;
            }
        }
        if(flag==0){
            throw new StringException(s5);
        }
        else{
            System.out.println(s5 +" is a palindrome...");
        }
    }
    public static void main(String[] args) {
        try{
            impl.strop("ecr", "rac");
        }
        catch(StringException e){
            System.out.println(e);
        }
    }
}