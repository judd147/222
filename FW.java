package com.company;

public class FW {
    //members of Graph class
    private int dist[][];

    //constructor
    FW(int n){
        dist = new int[n][n];
    }

    public void FloydWarshall(int graph[][], int INF){                                                                //Floyd-Warshall implementation
        int i,j,k;
        dist = graph;
        for (k = 0; k < graph.length; k++){
            for (j = 0; j < graph.length; j++){
                for (i = 0; i < graph.length; i++){
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
        for (int a = 0; a < dist.length; a++){                                                                        //print the matrix
            for (int b = 0; b < dist.length; b++){
                if (dist[a][b] == INF)
                    System.out.print(INF+" ");
                else
                    System.out.print(dist[a][b]+" ");
            }
            System.out.println();
        }
    }
}