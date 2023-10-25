class c1{
    static int roll;
    static int semester;
    static class c2{
        String name;
        char grade;
        c2(String n, char c){
            name=n;
            grade=c;
        }
            void display(){
                System.out.println("Name: "+name);
                System.out.println("Grade: "+grade);
                // System.out.println("RollNo: "+roll);
                // System.out.println("Semester: "+semester);
            }
    }
}

class c3{
    public static void main(String args[]){
        c1.c2 c=new c1.c2("Hello",'A');
        c.display();
    }
}