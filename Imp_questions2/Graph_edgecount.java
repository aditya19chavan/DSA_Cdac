package Imp_questions2;

import java.util.Scanner;

public class Graph_edgecount {
	int v, visited[], g[][];
	// v number of nodes
	// g is Adjacency matrix of v x v
	// visited[i] is 1:visited 0:unvisited

	void createGraph(int nodes) {
		v = nodes;
		Scanner in = new Scanner(System.in);
		g = new int[v][v];// adj mat
		visited = new int[v];// visited array
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				System.out.println("Enter value for v" + i + " to v" + j + " (999 for infinity):");
				g[i][j] = in.nextInt();

			}
		}
	}

	void printG() {
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {

				System.out.print(g[i][j] + "\t");
			}
			System.out.println();
		}
	}

	void Count_Edges() {
		int count = 0;
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < v; j++) {
				if (g[i][j] != 0 && g[i][j] != 999) {
					count++;
				}

			}

		}
		System.out.println("edge count is: " + count);

	}

	public static void main(String args[]) {
		Graph_edgecount obj = new Graph_edgecount();
		obj.createGraph(4);
		obj.printG();

		obj.Count_Edges();
	}

}
