
package CodePracSet5;

import java.util.Arrays;


public class Main {
		
	 //1. WAP to Print a 2D Array
		public static void main(String[] args) {
	      int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	      for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 3; j++) {
	            System.out.print(arr[i][j] + " ");
	         }
	         System.out.println();
	      }
	   }
	
	//2. WAP to Add Two Matrices
		public static void main(String[] args) {
	      int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	      int[][] arr2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
	      int[][] sum = new int[3][3];

	      for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 3; j++) {
	            sum[i][j] = arr1[i][j] + arr2[i][j];
	         }
	      }

	      // Printing the sum matrix
	      for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 3; j++) {
	            System.out.print(sum[i][j] + " ");
	         }
	         System.out.println();
	      }
	   }

	//3. WAP to Sort the 2D Array Across Columns
		public static void main(String[] args) {
	      int[][] arr = {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};

	      for (int i = 0; i < 3; i++) {
	         Arrays.sort(arr[i]);
	      }

	      // Printing the sorted array
	      for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 3; j++) {
	            System.out.print(arr[i][j] + " ");
	         }
	         System.out.println();
	      }
	   }

 	 //4. WAP to Check Whether Two Matrices Are Equal or Not
		public static void main(String[] args) {
	      int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	      int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	      boolean isEqual = true;
	      for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 3; j++) {
	            if (arr1[i][j] != arr2[i][j]) {
	               isEqual = false;
	               break;
	            }
	         }
	      }

	      if (isEqual) {
	         System.out.println("Matrices are equal");
	      } else {
	         System.out.println("Matrices are not equal");
	      }
	   }

	//5. WAP to Find the Transpose
		public static void main(String[] args) {
		      int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		      int[][] transpose = new int[3][3];

		      for (int i = 0; i < 3; i++) {
		         for (int j = 0; j < 3; j++) {
		            transpose[j][i] = arr[i][j];
		         }
		      }

		      // Printing the transpose matrix
		      for (int i = 0; i < 3; i++) {
		         for (int j = 0; j < 3; j++) {
		            System.out.print(transpose[i][j] + " ");
		         }
		         System.out.println();
		      }
		 }
		
	//6. WAP to Find the Determinant
		public static void main(String[] args) {
	        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Example matrix
	        int n = matrix.length;
	        int determinant = findDeterminant(matrix, n);
	        System.out.println("Determinant: " + determinant);
	    }

	    public static int findDeterminant(int[][] matrix, int n) {
	        int determinant = 0;

	        // Base case: matrix of size 1
	        if (n == 1) {
	            return matrix[0][0];
	        }

	        // Recursive case: matrix of size greater than 1
	        for (int i = 0; i < n; i++) {
	            int[][] subMatrix = new int[n-1][n-1];
	            for (int j = 1; j < n; j++) {
	                for (int k = 0; k < n; k++) {
	                    if (k < i) {
	                        subMatrix[j-1][k] = matrix[j][k];
	                    } else if (k > i) {
	                        subMatrix[j-1][k-1] = matrix[j][k];
	                    }
	                }
	            }
	            determinant += matrix[0][i] * Math.pow(-1, i) * findDeterminant(subMatrix, n-1);
	        }
	        return determinant;
	    }
	
	//7. WAP to Find the Normal and Trace 
	    public static void main(String[] args) {
	        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Example matrix
	        int n = matrix.length;
	        int normal = findNormal(matrix, n);
	        int trace = findTrace(matrix, n);
	        System.out.println("Normal: " + normal);
	        System.out.println("Trace: " + trace);
	    }

	    public static int findNormal(int[][] matrix, int n) {
	        int normal = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                normal += Math.pow(matrix[i][j], 2);
	            }
	        }
	        normal = (int) Math.sqrt(normal);
	        return normal;
	    }

	    public static int findTrace(int[][] matrix, int n) {
	        int trace = 0;
	        for (int i = 0; i < n; i++) {
	            trace += matrix[i][i];
	        }
	        return trace;
	    }
	//8. WAP to Print Boundary Elements of a Matrix 
	    public static void main(String[] args) {
	        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}; // Example matrix
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        // Print top row
	        for (int j = 0; j < cols; j++) {
	            System.out.print(matrix[0][j] + " ");
	        }

	        // Print right column
	        for (int i = 1; i < rows; i++) {
	            System.out.print(matrix[i][cols-1] + " ");
	        }

	        // Print bottom row
	        for (int j = cols-2; j >= 0; j--) {
	            System.out.print(matrix[rows-1][j] + " ");
	        }

	        // Print left column
	        for (int i = rows-2; i > 0; i--) {
	            System.out.print(matrix[i][0] + " ");
	        }
	    }

	//9. WAP to Rotate Matrix Elements
	    public static void main(String[] args) {
	        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int row = matrix.length;
	        int col = matrix[0].length;

	        int[][] result = new int[row][col];
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                if (j == col - 1) {
	                    result[(i + 1) % row][0] = matrix[i][j];
	                } else {
	                    result[i][j + 1] = matrix[i][j];
	                }
	            }
	        }
	        System.out.println("Original matrix:");
	        printMatrix(matrix);
	        System.out.println("Rotated matrix:");
	        printMatrix(result);
	    }

	    private static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }

	//10. Compute the Sum of Diagonals of a Matrix
	    public static void main(String[] args) {
	        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int sum = 0;
	        int n = matrix.length;
	        for (int i = 0; i < n; i++) {
	            sum += matrix[i][i];
	            sum += matrix[i][n - i - 1];
	        }
	        if (n % 2 != 0) {
	            sum -= matrix[n / 2][n / 2];
	        }
	        System.out.println("Sum of diagonals: " + sum);
	    }

	//11. Interchange Elements of First and Last in a Matrix Across Rows
	    public static void main(String[] args) {
	        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int row = matrix.length;
	        int col = matrix[0].length;
	        for (int i = 0; i < row; i++) {
	            int temp = matrix[i][0];
	            matrix[i][0] = matrix[i][col - 1];
	            matrix[i][col - 1] = temp;
	        }
	        System.out.println("Modified matrix:");
	        printMatrix(matrix);
	    }

	    private static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }

	//12. Interchange Elements of First and Last in a Matrix Across Columns
	    public static void main(String[] args) {
	        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int row = matrix.length;
	        int col = matrix[0].length;
	        for (int i = 0; i < col; i++) {
	            int temp = matrix[0][i];
	            matrix[0][i] = matrix[row - 1][i];
	            matrix[row - 1][i] = temp;
	        }
	        System.out.println("Modified matrix:");
	        printMatrix(matrix);
	    }

	    private static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }
}





