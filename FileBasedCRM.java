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
    String filename, answer, request, profile, file, text;
  int choice;
  Scanner sc = new Scanner(System.in);
  answer = "y";
 while (answer.equalsIgnoreCase("Y")){
  System.out.println("1. View File");
  System.out.println("2. Add File");
  System.out.println("3. Remove File"); 
  System.out.println("4. Edit File");
  System.out.println("5. Exit");
  System.out.println("Make a selection.");
  choice=sc.nextInt();
  switch(choice){
    case 1:
      request ="View File";
        break;
    case 2:
      request ="Add File";
        break;
    case 3:
      request ="Remove File";
        break;
    case 4:
      request ="Edit File";
        break;
    case 5:
      request ="Exit";
        break;
    default: 
      request ="Selection not listed";
    
      }
    System.out.println("Loading " + request);
 
      if (request.equalsIgnoreCase("Add File")){
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
          System.out.println("Would you like to make another selection Y/N?");
          answer = user_input.nextLine();
        }
        catch (IOException e){
          System.out.println("That file exists already.");
          e.printStackTrace();
          answer = "N";  
          }
        }  
      } 
      


      if (request.equalsIgnoreCase("View File")){
      System.out.println("Enter file you would like to view.");
      profile = user_input.nextLine();
        try {
      File myObj = new File(profile);
      Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
          System.out.println("Would you like to make another selection Y/N?");
          answer = user_input.nextLine();
        }
        myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
          }
        
      }

      if(request.equalsIgnoreCase("Remove File")){
        System.out.println("What file would you like to remove");
        
      }



      if(request.equalsIgnoreCase("Edit File")){
        System.out.println("What file would you like to edit?");
        file = user_input.nextLine();
        System.out.println("You may make an entry.");
        text = user_input.nextLine();
      try {
      FileWriter myWriter = new FileWriter(file);
      myWriter.write(text);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      }
      if(request.equalsIgnoreCase("Exit")){
        System.out.println("Have a good day.");
        answer = "n";
      }
 }


  }
}


