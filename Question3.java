/* Activity 1.2 - Question 3 */
import java.util.Scanner;


class Question3 {
    public static void main(String[] args) {

        /* Write your code here */
        Scanner scan = new Scanner(System.in);
      String name;
      String adjective;
      System.out.println("Hi, what is your name.");
      name = scan.nextLine(); 
      System.out.println("What adjective describes you?");
      adjective = scan.nextLine(); 
      System.out.println("My name is " + name +"." + " I am " + adjective + ".");



    }
}