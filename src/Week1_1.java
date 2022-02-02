import java.util.Scanner;

public class Week1_1 {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int n1 = console.nextInt();
        int[] array = new int[n1];
        for ( int n=0;n<=array.length-1;n++) {
            array[n] = console.nextInt();
        }
        for (int a =1; a<= array.length-2;a++) {
            if (array[a]>array[a-1] && array[a]>array[a+1]) {
                System.out.print(a);
                break;
            }
        }
        console.close();
    }


}
