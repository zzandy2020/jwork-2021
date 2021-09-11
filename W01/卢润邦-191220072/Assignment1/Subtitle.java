package Assignment1;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;



public class Subtitle{
    List<String> contentList;
    int index;
    Subtitle(String DiaglougePath){
        Path path = Paths.get(DiaglougePath);
        try{
            contentList = Files.readAllLines(path);
        }
        catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        } 
    }

    public Object next(){
        String line = contentList.get(index);
        index++;
        return line;
    }

    public boolean hasNext(){
        if(index < contentList.size())
            return true;
        else
            return false;
    }

    public static void main(String args[]){
        Subtitle s = new Subtitle("Assignment1/Dialogue.txt");
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }
}
