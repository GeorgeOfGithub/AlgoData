import java.util.ArrayList;
import java.util.Scanner;

public class Queue {

    public static ArrayList<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) {

        int number = 0;
        String input = null;
        Scanner scanner= new Scanner(System.in);
        int length = scanner.nextInt();

        input = scanner.nextLine();
        for (int i=1; i<=length; i++) {
            input = scanner.next();
            if (input.equals("E")) {
                number = scanner.nextInt();
                Enqueue(number);
            } else {
                Dequeue();
            }
        }

        scanner.close();
    }
    
    public static void Enqueue(int n) {
        array.add(n);
    }

    public static void Dequeue() {
        System.out.println(array.get(0));
        array.remove(0);
    }
}
