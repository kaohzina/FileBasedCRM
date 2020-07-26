import java.io.FileWriter; 
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class FileBasedCRM {
  public static void main(String[] args){
    Scanner user_input = new Scanner(System.in); 
    String filename, answer, request;
  int choice;
  Scanner sc = new Scanner(System.in);
  System.out.println("1. Employee List");
  System.out.println("2. Add Employee");
  System.out.println("3. Remove Employee"); 
  System.out.println("4. Edit Employee");
  System.out.println("Make a selection.");
  choice=sc.nextInt();
  switch(choice){
    case 1:
      request ="Employee List";
        break;
    case 2:
      request ="Add Employee";
        break;
    case 3:
      request ="Remove Employee";
        break;
    case 4:
      request ="Edit Employee";
        break;
    default: 
      request ="Selection not listed";
      }
    System.out.println("Loading " + request);

   do {
      System.out.println("Give your file a name.");
      filename = user_input.nextLine(); 
      System.out.println("Is that file properly spelt? Y/N");
      answer = user_input.nextLine();
      if (answer.equalsIgnoreCase("Y")){
        try{
          File myUser = new File(filename);
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
      while (request.equals ("2"));
      System.out.println("Would you like to read a file? Y/N"); 
        answer = user_input.nextLine();
      if (answer.equalsIgnoreCase("Y")){
      System.out.println("Enter file name");
      request = user_input.nextLine();
    try {
      File myObj = new File(request);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    }
  }
}

