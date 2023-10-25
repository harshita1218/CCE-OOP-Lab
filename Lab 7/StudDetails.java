import java.util.Scanner;
class Student {
    String name, college;
    long id;
    public Student(String n, long sid) {
        id = sid;
        college = "MIT";
        name = n;}
    void display_details() {
        System.out.println(name + " from " + college + " has ID: " + id);}}

class stud {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
     
   System.out.println("Enter Name and ID: ");
        String name = sc.nextLine();
        long id = sc.nextLong();
        Student s = new Student(name, id);
        s.display_details();
        sc.close();}}