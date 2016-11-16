import java.io.IOException;
import java.util.Scanner;

/**
 * @author Thomas
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("Please enter your name: ");
		HelloUser myself = new HelloUser(scanner.next());
		myself.greetUser();
		scanner.close();
	}

}
