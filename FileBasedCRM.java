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
          File myUser. = new File(filename);
        if (myUser.createNewFile()){
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
      try {
    FileWriter myWriter = (filename);
    System.out.println("State your first name.");
    System.out.println("State your last name.");
    System.out.println("State your email.");
    System.out.println("State your address.");
    System.out.println("State your city.");
    System.out.println("State your zipcode.");
    myWriter.write();
    myWriter.close();
    System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
  }



