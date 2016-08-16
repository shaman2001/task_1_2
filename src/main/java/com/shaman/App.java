package com.shaman;

/**
 * Задание модуль_2 лекция_1  матрица и строки
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    	int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] resultmatrix = new int[rows][columns];
    	for (int r = 0; r < rows ; r++){
        	for (int c = 0; c < columns ; c++){
        		resultmatrix[c][rows - 1 - r] = matrix[r][c];
        	}
        }
    	for (int r = 0; r < rows; r++){
        	for (int c = 0; c < columns; c++){
        		System.out.print(matrix[r][c] + " ");
        	}
        	System.out.print("    ");
        	for (int c = 0; c < columns; c++){
        		if (c == columns - 1 ){
        			System.out.println(resultmatrix[r][c]);
        		} else {
        			System.out.print(resultmatrix[r][c] + " ");
        		}
        	}
        }
    }
}
