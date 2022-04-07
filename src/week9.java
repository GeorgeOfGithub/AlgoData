import java.util.ArrayList;
import java.util.Scanner;

public class week9 {


    public void findLowest(int[][] edges) {

        for(int[] testing : edges) {
            
        }
    }


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] edges = new int[N+1][N+1];

        for(int i =0; i <= M; i++) {
            edges[scanner.nextInt()][scanner.nextInt()] = scanner.nextInt();
        }

        scanner.close();

    }


}