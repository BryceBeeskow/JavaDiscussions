/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrix;

/**
 *
 * @author bryce
 */
import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       //getting matrix from user
        System.out.print("Enter the array size n: ");
        int matrixNum = input.nextInt();

        int[][] matrix = new int[matrixNum][matrixNum];
        Random rand = new Random();

       //filling the matrix with 0s and 1s
        for (int i = 0; i < matrixNum; i++) {
            for (int j = 0; j < matrixNum; j++) {
                matrix[i][j] = rand.nextInt(2);
            }
        }

       //randomize 0s and 1s
        System.out.println("\nThe random array is");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        //counting 1s in the row
        int maxRowCount = 0;
        List<Integer> maxRows = new ArrayList<>();
        for (int i = 0; i < matrixNum; i++) {
            int count = 0;
            for (int j = 0; j < matrixNum; j++) {
                count += matrix[i][j];
            }
            if (count > maxRowCount) {
                maxRowCount = count;
                maxRows.clear();
                maxRows.add(i);
            } else if (count == maxRowCount) {
                maxRows.add(i);
            }
        }

        // Count 1s in columns
        int maxColCount = 0;
        List<Integer> maxCol = new ArrayList<>();
        for (int j = 0; j < matrixNum; j++) {
            int count = 0;
            for (int i = 0; i < matrixNum; i++) {
                count += matrix[i][j];
            }
            if (count > maxColCount) {
                maxColCount = count;
                maxCol.clear();
                maxCol.add(j);
            } else if (count == maxColCount) {
                maxCol.add(j);
            }
        }

        // Print result
        System.out.println("The largest row index: " + maxRows);
        System.out.println("The largest column index: " + maxCol);
    }
}


