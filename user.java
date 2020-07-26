 import java.util.*;
 public class user{
  public static void main(String[] args) {
  Scanner user_input = new Scanner(System.in); 
  String request;
  String[] Menu = {"Employee List","Add Employee", "Remove Employee", "Edit Employee"};
  for (int i = 0; i < Menu.length; i++) {
  System.out.println(i + ": " + Menu[i]); }

  System.out.println("Make a selection.");
  user_input.nextLine();
  }
 }
 