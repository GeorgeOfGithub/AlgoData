import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class week5 {

    public static void BFS(ArrayList<ArrayList<Integer>> adjecency, boolean[] visited, int[] distance, int start) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start] = true;
        distance[start] = 1;

        while(!q.isEmpty()){
            int v = q.pop();
            for(int n : adjecency.get(v)){
                if(!visited[n]){
                    q.addLast(n);
                    visited[n] = true;
                    distance[n] = distance[v] +1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int size = N * N;
		int[] distance = new int[size];
		boolean[] visited = new boolean[size];
		String maze = "";
		
		ArrayList<ArrayList<Integer>> adjacency = new ArrayList<>();

        for (int i = 0; i < size; i++){
            adjacency .add(new ArrayList<>());
        }

        for(int i = 0; i < N; i++) {
            String in = input.next();

            maze += in.strip(); // fjerner /n fra string input

            for(int j = 0; j < N; j++){
                int index = i * N + j;
                if (i > 0) {
					if (maze.charAt(index - N) != maze.charAt(index)) {
						adjacency.get(index - N).add(index);
						adjacency.get(index).add(index - N);
					}
				}
				if (j > 0) {
					if (maze.charAt(index - 1) != maze.charAt(index)) {
						adjacency.get(index - 1).add(index);
						adjacency.get(index).add(index - 1);
					}
				}
            }
        }
		

        BFS(adjacency,visited,distance,0);
		System.out.println(distance[size - 1]);
        input.close();
    }
    
}


/*
package week5;

import java.util.ArrayList;
import java.util.*;

public class LetterLabyrinth {
	
	public static void BFS(ArrayList<ArrayList<Integer>> adjacency, boolean[] visited, int[] distance, int start) {
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.add(start);
		visited[start] = true;
		distance[start] = 1;
		
		while (!q.isEmpty()) {
			int v = q.pop();
			for (int n : adjacency.get(v)) {
				if (!visited[n]) {
					q.addLast(n);
					visited[n] = true;
					distance[n] = distance[v] + 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int size = N * N;
		int[] distance = new int[size];
		boolean[] visited = new boolean[size];
		String maze = "";
		
		ArrayList<ArrayList<Integer>> adjacency = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			adjacency.add(new ArrayList<>());
		}
		
		for (int i = 0; i < N; i++) {
			String in = input.next();
			maze += in.strip();	// "AAAAA\n" strip() fjerner \n
			for (int j = 0; j < N; j++) {
				int index = i * N + j;
				if (i > 0) {
					if (maze.charAt(index - N) != maze.charAt(index)) {
						adjacency.get(index - N).add(index);
						adjacency.get(index).add(index - N);
					}
				}
				if (j > 0) {
					if (maze.charAt(index - 1) != maze.charAt(index)) {
						adjacency.get(index - 1).add(index);
						adjacency.get(index).add(index - 1);
					}
				}
			}
		}
		
//		System.out.println(maze);
		BFS(adjacency, visited, distance, 0);
//		System.out.println(Arrays.toString(distance));
		System.out.println(distance[size - 1]);
		
		input.close();
	}
	
	

}
*/