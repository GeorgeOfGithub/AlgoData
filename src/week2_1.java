import java.util.Scanner;

public class week2_1 {

    public static void main(String[] args) {
/*          Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int W = console.nextInt();
        int[] array = new int[N];
        for ( int n=0;n<=array.length-1;n++) {
            array[n] = console.nextInt();
        }
        console.close();

        int stone = Stones(array,N,W);
        System.out.println(stone); */

        int[] array1 = {6,4,6,3,2,4,6,7,9,8,2,1,3};

        int[] array = MergeSort(array1, 0, array1.length-1);
        for (int a=0;a<=array.length-1;a++) {
            System.out.println(array[a]);
        }

    }



    public static int Stones(int[] array, int N, int W ) {
        return 3;
    }
    

    public static int[] MergeSort(int[] array, int i, int j) {
        if (i<j) {
            int m = (i+j)/2;
            int[] a1 = MergeSort(array, i, m);
            int[] a2 = MergeSort(array, m+1, j);
            array = Merge(a1, a2);
        }
        return array;

    }

    public static int[] Merge(int[] array, int i,int m, int j) {

        int n1 = m - i + 1;
        int n2 = j - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int a = 0; a < n1; ++a)
            L[a] = array[a];
        for (int b = 0; b < n2; ++b)
            R[b] = array[m + 1 + b];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int n1 = 0, n2 = 0;

        int[] merged = new int[a1.length+a2.length-2];
        for (int a =0; a <= merged.length-1; a++) {
            if (n1 > a1.length-1) {
                merged[a] = a2[n2];
            }else if (a1[n1] <= a2[n2]) {
                merged[a] = a1[n1];
                n1++;
            } else if (a2[n2] <= a1[n1]){
                merged[a] = a2[n2];
                n2++;
            }
        }
        return merged;
    }
}
