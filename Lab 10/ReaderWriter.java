import java.io.*;
import java.util.Scanner;

public class ReaderWriter{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        File f=new File("E://Study//OneDrive - Manipal Academy of Higher Education//Second Year//Third Semester//OOP//EndsemPractice(Lab)//File Handling//ReaderWrite.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        while(true){
            System.out.print("\n\nMENU\n1.Read\n2.Override\n3.Write\n4.CopyFile\n5.Exit\nEnter your choice: ");
            int res=sc.nextInt();
            if(res==1){
                FileReader fr=new FileReader(f);
                int num;
                while((num=fr.read())!=-1){
                    System.out.print((char)num);
                }
                fr.close();
            }
            else if(res==2){
                FileWriter fw=new FileWriter(f);
                System.out.print("Enter info: ");
                String str=sc.nextLine();
                str=sc.nextLine();
                fw.write(str);
                fw.close();
            }
            else if(res==3){
                FileWriter fw=new FileWriter(f,true);
                System.out.print("Enter info: ");
                String str=sc.nextLine();
                str=sc.nextLine();
                fw.write(str);
                fw.close();
            }
            else if(res==4){
                File f1=new File("E://Study//OneDrive - Manipal Academy of Higher Education//Second Year//Third Semester//OOP//EndsemPractice(Lab)//File Handling//ReaderWriteCopy.txt");
                FileReader fr=new FileReader(f);
                FileWriter fw=new FileWriter(f1,true);
                int num;
                while((num=fr.read())!=-1){
                    fw.write((char)num);
                }
                fr.close();
                fw.close();
            }
            else{
                break;
            }
        }

        sc.close();
    }
}