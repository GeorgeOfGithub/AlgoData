import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class week6Hans {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int M = input.nextInt();
        int N = input.nextInt();

        ArrayDeque<Integer> q = new ArrayDeque<>();

        for(int i = 0; i <= N; i++) {
            adjacency.add(new ArrayList<>());
        }


        for(int i = 0; i < M; i++) {
            int X = input.nextInt();
            int Y = input.nextInt();
            adjacency.get(Y).add(X);
            indegree[X]++;
        }

        int coursesTaken = 0;
        int semesters = 0;

        while(coursesTaken < N) {
            semesters++;
            int next = q.size();

            for(int i = 0; i < next; i++){
                int course = q.pop();
                for(int edge : adjacency.get(course)){
                    indegree[edge]--;
                    if(indegree[edge] == 0) {
                        q.addLast(edge);
                    }
                }
            }

            coursesTaken = next;
        }


        System.out.println(semesters);
        input.close();

    }

    
}
