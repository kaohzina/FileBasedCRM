import java.util.*;
import java.io.File;
import java.io.IOException;
public class FileBasedCRM{
  public static void main(String[] args){
      Scanner user_input = new Scanner(System.in); 
      String filename, answer;
      answer = "N";
      while(answer.equalsIgnoreCase("N")){
      System.out.println("Give your file a name.");
      filename = user_input.nextLine(); 
      System.out.println("Is that a good file name? Y/N");
        answer = user_input.nextLine();
      if (answer.equalsIgnoreCase("Y")){
        try{ 
          File myObj = new File(filename);
        if (myObj.createNewFile()){
          System.out.println("You created file " + filename);
          }
        else{
          System.out.println("That file exists already.");
          answer = "N";
          }
        }
        catch (IOException e){
          System.out.println("That file exists already.");
          e.printStackTrace();
          answer = "N";  
          }
        }  
      }
    }
  }
  