import java.io.Console;
import java.util.Scanner;
public class codejudge01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Read input from System.in
        int A = scanner.nextInt(); // Reads the next integer 
        int B = scanner.nextInt();
        System.out.println(A+B); // Print result using System.out.println()
        scanner.close();
    }
}
