import java.io.*;
class Text{
    public static void main(String[] args) throws IOException{
        File f=new File("E://Study//OneDrive - Manipal Academy of Higher Education//Second Year//Third Semester//OOP//Insem Practice//Text.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String str;
        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
    }
}