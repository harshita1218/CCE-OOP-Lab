import java.io.*;
import java.util.*;

class Student implements Serializable{
    String name;
    int roll;
    int marks;
    Student(String n,int r,int m){
        name=n;
        roll=r;
        marks=m;
    }
}

class FileOperation implements Serializable{
    File f;
    Student s[];
    FileOperation(File f,Student s[]){
        this.f=f;
        this.s=s;
    }

    void WriteStudentDetails(){
        try{
            FileOutputStream fos=new FileOutputStream("Serial");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            FileWriter fq=new FileWriter(f);
            BufferedWriter bw=new BufferedWriter(fq);
            for(int i=0;i<s.length;i++){
                oos.writeObject(s[i]);
                bw.newLine();
                bw.write("Name: "+s[i].name);
                bw.newLine();
                bw.write("Roll: "+s[i].roll);
                bw.newLine();
                bw.write("Marks: "+s[i].marks);
                bw.newLine();
            }
            bw.close();
            fos.close();
        }
        catch(Exception e){}
    }

    void ReadStudentDetails(){
        try{
            FileInputStream fis=new FileInputStream("Serial");
            ObjectInputStream ois=new ObjectInputStream(fis);
            for(int i=0;i<s.length;i++){
                Student s1=(Student)ois.readObject();
                if(s1.marks>80){
                    System.out.println();
                    System.out.println("Name: "+s[i].name);
                    System.out.println("Roll: "+s[i].roll);
                    System.out.println("Marks: "+s[i].marks);
                }
            }
            ois.close();
        }
        catch(Exception e){}
    }
}

class MyThread extends Thread{
    File f;
    Student s[];
    int num;
    FileOperation FileObj;
    MyThread(int n, File f1, Student s1[]){
        num=n;
        f=f1;
        s=s1;
        FileObj=new FileOperation(f, s);
    }
    
    public void run(){
        if(num==1){
            FileObj.WriteStudentDetails();
        }
        else{
            FileObj.ReadStudentDetails();
        }
    }
}

class main1{
    public static void main(String[] args) throws InterruptedException,IOException {
        File f=new File("E://Study//OneDrive - Manipal Academy of Higher Education//Second Year//Third Semester//OOP//OOP-Lab//Lab 10//Student.txt");
        Scanner sc=new Scanner(System.in);
        if(!f.exists()){
            f.createNewFile();
        }
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        Student s[]=new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("\nEnter details of Student"+(i+1));
            s[i]=new Student(sc.next(), sc.nextInt(),sc.nextInt());
        }
        MyThread t1=new MyThread(1,f,s);
        t1.start();
        t1.join();
        MyThread t2=new MyThread(2,f,s);
        t2.start();
        sc.close();
    }
}