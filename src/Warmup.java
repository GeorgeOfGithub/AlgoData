public class Warmup {

    public static void main(String[] args) {
        line(128,6);

        
    }

    public static void work1(int n) {
        int x = 0;
        for (int i = 0; i<n;i++) {
            for(int j=0;j<n;j++) x++;
        }
        System.out.println("loop1: "+ x);
    }

    public static void loop2(int n) {
        int x = 0;
        for (int i=0;i<n;i++) x++;
        for (int j =0;j<n;j++) x++;
        System.out.println("loop2: " +x);
    }

    public static void loop3(int n) {
        int x=0;
        for (int i=0;i<n;i++) {
            if ( i==n-1) for (int j=0;j<n;j++) x++;
        }
        System.out.println("loop3: " +x);
    }

    public static void loop4(int n) {
        int x=0;
        for (int i=0; i<n;i++) {
            for (int j=i; j<n;j++) x++;
        }
        System.out.println("loop4: " +x);
    }


    public static void line(int n,int k) {
        System.out.println(Math.log(n)/Math.log(k+1));
    }

    
}
