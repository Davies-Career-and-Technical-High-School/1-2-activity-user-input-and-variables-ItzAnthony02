/* Activity 1.2 - Question 1 */
import java.util.Scanner;


class Question1 {
    public static void main(String[] args) {

        /* Write your code here */
Scanner scan = new Scanner(System.in); //this is the delacred variable 
    
    String name;

    System.out.println("What is your name?");
    
    name = scan.nextLine(); //user input
    
    System.out.println("Hi, " + name + " nice to meet you.");
    }
}