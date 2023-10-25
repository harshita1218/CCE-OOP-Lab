import java.io.*;
import java.util.Scanner;

class CountTotal{
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        File f=new File("E://Study//OneDrive - Manipal Academy of Higher Education//Second Year//Third Semester//OOP//EndsemPractice(Lab)//File Handling//CountTotal.txt");

        if(!f.exists()){
            f.createNewFile();
        }
        int line=0,ch=0,vow=0;

        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);

        FileWriter fw=new FileWriter(f,true);
        System.out.println("Enter info: ");
        String st=sc.nextLine();
        fw.write(st);
        fw.close();

        String str,str1="";
        while((str=br.readLine())!=null){
            for(int i=0;i<str.length();i++){
                ch++;
                switch (str.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':vow++;
                    break;
                }
            }
            str1=str1.concat(str+" ");
            line++;
        }
        String s[]=str1.split(" ");

        System.out.println("Total number of characters: "+ch);
        System.out.println("Total number of lines: "+line);
        System.out.println("Total number of words: "+s.length);
        System.out.println("Total number of vowels: "+vow);

        fr.close();
        sc.close();
    }
}