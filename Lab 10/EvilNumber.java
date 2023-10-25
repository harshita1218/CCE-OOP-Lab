class EvilNumber extends Exception{
    public String toString(){
        return "Evil Number Entered";
    }
}

class Tenth{
    public static void main(String args[]){
        try{
            int n= 666;
            if(n==666)
                throw new EvilNumber();
            System.out.println(n);
        }
        catch(EvilNumber e){
            System.out.println(e);
        }
    }
}