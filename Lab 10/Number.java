class Seventh{
    public static void main(String args[]){
        try{
            int a= Integer.parseInt("9cudc");
            System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("Not a number");
        }
    }
}