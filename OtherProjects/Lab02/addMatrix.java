import java.util.Scanner;
import java.util.Arrays;
public class addMatrix {
	public static void main(String[] args) {
        int[][] firstMat, secondMat;
        int row, column, r, c;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the rows in the matrix");
		row = keyboard.nextInt();
		System.out.println("Please enter the columns in the matrix");
		column = keyboard.nextInt();
		firstMat = new int[row][column];
		secondMat = new int[row][column];
		for (r = 0; r < row; r++) {
			for (c = 0; c < column; c++) {
				System.out.println(String.format("Enter firstMat[%d][%d] integer", r, c));
				firstMat[r][c] = keyboard.nextInt();
			}
		}
		for (r = 0; r < row; r++) {
			for (c = 0; c < column; c++) {
				System.out.println(String.format("Enter secondMat[%d][%d] integer", r, c));
				secondMat[r][c] = keyboard.nextInt();
			}
		}
		keyboard.close();
		System.out.println("First Matrix:");
		print2dArray(firstMat);
		System.out.println("Second Matrix:");
		print2dArray(secondMat);
		sum(firstMat, secondMat);
	}
	private static void sum(int[][] firstMat, int[][] secondMat) {
		int row = firstMat.length;
		int column = firstMat[0].length;
		int[][] sum = new int[row][column];
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				sum[r][c] = firstMat[r][c] + secondMat[r][c];
			}
		}
		System.out.println("Sum of Matrices:");
		print2dArray(sum);
	}
	private static void print2dArray(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				System.out.print(matrix[r][c] + "\t");
			}
			System.out.println();
		}
	}
}