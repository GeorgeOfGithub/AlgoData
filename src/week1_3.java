import java.util.Scanner;

public class week1_3 {
    static int m;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n1 = console.nextInt();
        int[] array = new int[n1];
        for ( int n=0;n<=array.length-1;n++) {
            array[n] = console.nextInt();
        }
        console.close();  
        
        //int[] array = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        int n = peak(array,0,array.length);
        System.out.println(n);
        
    }

    public static int peak(int[] array, int i, int j) {
        m = (i+j)/2;

        if (array[m] >= array[m-1] && array[m] >= array[m+1]) {
            return m;
        } else if (array[0] > array[1]) {
            return 0;
        } else if (array[array.length-1]>=array[array.length-2]){
            return array.length-1;
        }else if (array[m] < array[m+1]) {
            return peak(array, m+1, j);
        }  else if (array[m-1] > array[m]) {
            return peak(array, j, m-1);
        }
        return m;
    }
    
}
