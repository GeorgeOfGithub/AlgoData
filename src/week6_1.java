import java.util.ArrayList;
import java.util.Scanner;

public class week6_1 {

    public static ArrayList<String> array = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int length = scanner.nextInt();

        for (int a = 0; a <= length; a++) {
            String input = scanner.next();
            array.add(input);
        }
        
    }
    
}
