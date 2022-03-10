import java.util.ArrayList;
import java.util.Scanner;

public class Stack {

    public static ArrayList<Integer> array = new ArrayList<Integer>();
    static int current = -1;


    static int[] arr;

    public static void main(String[] args) {

        for (int a : array ) {
            
        }

        int number = 0;
        String input = null;
        Scanner scanner= new Scanner(System.in);
        int length = scanner.nextInt();
        arr = new int[length];



        input = scanner.nextLine();
        for (int i=1; i<=length; i++) {
            input = scanner.next();
            if (input.equals("PU")) {
                number = scanner.nextInt();
                Push(number);
            } else {
                Pop();
            }
        }

        scanner.close();
    }
    
    public static void Push(int n) {
        array.add(n);
        current++;
    }

    public static void Pop() {
        System.out.println(array.get(current));
        array.remove(current);
        current--;
    }
}
