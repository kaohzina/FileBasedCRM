 import java.util.*;
 public class user{
  public static void main(String[] args) {
  Scanner user_input = new Scanner(System.in); 
  String request;
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
  }
 }
 