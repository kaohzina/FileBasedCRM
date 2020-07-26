import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.Scanner; 
public class readEntry {
  public static void main(String[] args) {
       Scanner user_input = new Scanner(System.in);
       System.out.println("Would you like to read a file? Y/N"); 
        answer = user_input.nextLine();
      if (answer.equalsIgnoreCase("Y")){
    try {
      File myObj = new File(filename);
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