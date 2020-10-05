/* Activity 1.2 - Question 2 */
import java.util.Scanner;


class Question2 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in); //this is the delacred variable 
    
    String name1;
    String name2;
    String name3;

    System.out.println("Please enter three names.");
    
    name1 = scan.nextLine(); //user input
    name2 = scan.nextLine(); //user input
    name3 = scan.nextLine(); //user input

    System.out.println(name1 + " "+ name2 + " "+ name3 );
    
    }
}