package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
            throws IOException {
        InputStream txt = new FileInputStream("D:\\Liyao\\2019 Fall\\CSC 222\\FW\\test1.txt");             //Create the inputstream to access the file
        Scanner snjr = new Scanner(txt);
        int n = snjr.nextInt();                                                                                         //number of vertices
        FW path = new FW(n);
        int graph[][] = new int[n][n];
        final int INF = snjr.nextInt();                                                                                //distance of infinity

        for (int i = 0; i < graph.length; i++){                                                                       //Read in the matrix
            for (int j = 0; j < graph.length; j++){
                graph[i][j] = snjr.nextInt();
            }
        }
        path.FloydWarshall(graph,INF);
    }
}