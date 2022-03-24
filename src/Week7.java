import java.util.ArrayList;
import java.util.Scanner;

public class Week7 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer>[] queue = new ArrayList[N];
        for (int i=0; i<N; i++) {
            queue[i] = new ArrayList<>();
        }

        int number = 1;

        String test = scanner.next();
        if (test.equals("N")) {
            queue[number].add(scanner.nextInt());
            queue[number].add(scanner.nextInt());
            number++;
        } else {

        }


        scanner.close();
        
    }



}