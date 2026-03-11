import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("********* File Method ***********");
		
        try{
            File obj = new File("my textfile.txt");
            System.out.println("File created");
            
            if(obj.createNewFile()){
                System.out.println("File created"+obj.getName());
            }else{
                System.out.println("File already exits");
            }
            
            FileWriter Writer = new FileWriter("my textfile.txt");
            Writer.write("Files in java are seriously good");
            Writer.close();
            System.out.println("Successfully written");
        } catch(Exception e) {
            System.out.println("Exception Occured");
        }
	}
}
