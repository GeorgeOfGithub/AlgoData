import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.management.Query;

public class week6 {


    public static void main(String[] args) {



        Scanner scanner= new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[N];
        int[] semester = new int[N];
        int[] indegree = new int[N];
        


        for (int i=0; i<N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i=0;i<M;i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            adj[y-1].add(x-1);
            indegree[x-1]++;
        }
        scanner.close();

        Queue<Integer> q = new LinkedList<Integer>();
        for(int i =0; i<N;i++) {
            if(indegree[i] ==0) {
                semester[i] =1;
                q.add(i);
            }
        } 
        

        while(!q.isEmpty()) {
            int a = q.remove();
            System.out.println(a);

            for(int b = 0; b <= adj[a].size(); b++) {
                indegree[b] --;

                if(indegree[b] == 0){
                    semester[b] = semester[a]+1;
                    q.add(b);
                }

            }
        }
        System.out.println(maxValue(semester));


        


    }

    public static int maxValue(int array[]){
        int max = Arrays.stream(array).max().getAsInt();
        return max;
      }

    public static void print(int array[]) {
        for(int a : array) {
            System.out.println(array[a]);
        }
    }

    
}
