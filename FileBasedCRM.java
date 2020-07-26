import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class FileBasedCRM extends editcustomerfile{
  public static void main(String[] args){
    Scanner user_input = new Scanner(System.in); 
    String filename, answer;
    answer = "N";
    while(answer.equalsIgnoreCase("N")){
      System.out.println("Give your customer a username.");
      filename = user_input.nextLine(); 
      System.out.println("Is that file properly spelt? Y/N");
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



