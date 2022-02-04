import java.util.Scanner;

public class week1_2{

    public static void main(String[] args) {
        int max = 0;
        Scanner console = new Scanner(System.in);
        int n1 = console.nextInt();
        int[] array = new int[n1];
        for ( int n=0;n<=array.length-1;n++) {
            array[n] = console.nextInt();
        }
        for (int i =0; i<=array.length-1;i++) {
            if (array[i] > array[max]) {max = i;}
        }
        System.out.println(max);
    }
    
}
