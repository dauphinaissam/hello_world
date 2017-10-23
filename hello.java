// a simple program to practice common Github commands 
import java.util.Scanner;
public class hello {

    public static void main(String [] args) {
	String name = “”;

	Scanner input = new Scanner(System.in);

        System.out.println(“Please enter your name“);

	name = input.nextLine();

        System.out.println(“Hello ” + name + “, my name is Sam.”);

    }
}

