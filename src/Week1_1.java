import java.util.Scanner;

public class Week1_1 {
    public static void main(String[] args) throws Exception {
        boolean stop = false;
/*         Scanner console = new Scanner(System.in);
        int n1 = console.nextInt();
        int[] array = new int[n1];
        for ( int n=0;n<=array.length-1;n++) {
            array[n] = console.nextInt();
        }
        if (array[0]>=array[1]) {System.out.println(0);stop=true;} */
        int[] array = {2,1,3,7,3,11,1,5,7,10};
        for (int a =1; a<= array.length-2;a++) {
            if (stop==false && array[a]>=array[a-1] && array[a]>=array[a+1]) {
                System.out.print(a);
                stop = true;
                break;
            }
        }
        if (stop==false && array[array.length-1]>array[array.length-2]) {System.out.println(array.length-1);}
        //console.close();
    }


}
