package Assignment1;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


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

    public ListIterator<String> Iterator(){
        return contentList.listIterator();
    }

    public static void main(String args[]){
        Subtitle s = new Subtitle("Assignment1/Dialogue.txt");
        ListIterator<String> line = s.Iterator();
        while(line.hasNext())
            System.out.println(line.next());
    }
}
