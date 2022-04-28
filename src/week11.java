import java.util.Scanner;

public class week11 {
    static int repeats = 0;

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int N = scanner.nextInt();
        int K = 11;


        int[] array = new int[N];

        for(int i =0; i <= N; i++) {
            int number = scanner.nextInt();
            int place = number%K;
            
            placement(number, place, array);

        }

        scanner.close();

    }

    public static void numberrepeats() {
        repeats++;
    }

    public static void placement(int n, int place, int[] array){
        if(place <= array.length-1) {
            if (array[place]==0) {
                array[place] = n;
            } else if(array[place] == n) {
                array[place] = n;
                numberrepeats();
            }else {
                placement(n , place+1,array);
            }
        } else {
            placement(n, 0, array);
        }

    }


}
