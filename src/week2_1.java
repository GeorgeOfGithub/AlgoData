import java.util.Arrays;
import java.util.Scanner;

public class week2_1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int W = console.nextInt();
        int[] array = new int[N];
        for ( int n=0;n<=array.length-1;n++) {
            array[n] = console.nextInt();
        }
        console.close();

        Arrays.sort(array);

        int stones = 0;

        while(stones < N && array[stones] <= W) {
            W -= array[stones];
            stones++;
        }

        System.out.println(stones);




    }



 
}
