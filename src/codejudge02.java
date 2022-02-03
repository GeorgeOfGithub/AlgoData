import java.util.Scanner;

public class codejudge02 {



    public static void main(String[] args) {
        int anna=0;
        int laura=0;
        int oscar=0;
        Scanner scanner= new Scanner(System.in);
        anna = scanner.nextInt();
        laura = scanner.nextInt();
        oscar = scanner.nextInt();
        boolean none = true;

        if (laura>anna && oscar>anna) {
            System.out.println("Anna");
            none = false;
        }

        if ( laura < anna) {
            System.out.println("Laura");
            none = false;
        }

        if ( oscar < laura || oscar < anna) {
            System.out.println("Oscar");
            none = false;
        }

        if ( none) {
            System.out.println("None");
        }


        scanner.close();
    }


    
}
