package companyProgramms.agoda;

/**
 * https://leetcode.com/problems/maximal-square/
 * <p>
 * Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 * Input: matrix = [
 * ["1","0","1","0","0"],
 * ["1","0","1","1","1"],
 * ["1","1","1","1","1"],
 * ["1","0","0","1","0"]
 * ]
 * Output: 4
 */
public class LargestSquareInArrayOfNumbers {

    public static void main(String[] args) {
        int M[][] = {{0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};

        printMaxSubSquare(M);
    }

    // method for Maximum size square sub-matrix with all 1s
    static void printMaxSubSquare(int M[][]) {
        int i, j;
        int R = M.length;         //no of rows in M[][]
        int C = M[0].length;     //no of columns in M[][]
        int S[][] = new int[R][C];

        int max_of_s, max_i, max_j;

        /* Set first column of S[][]*/
        for (i = 0; i < R; i++)
            S[i][0] = M[i][0];

        /* Set first row of S[][]*/
        for (j = 0; j < C; j++)
            S[0][j] = M[0][j];

        /* Construct other entries of S[][]*/
        for (i = 1; i < R; i++) {
            for (j = 1; j < C; j++) {
                if (M[i][j] == 1)
                    S[i][j] = Math.min(S[i][j - 1], Math.min(S[i - 1][j], S[i - 1][j - 1])) + 1;
                else
                    S[i][j] = 0;
            }
        }

		/* Find the maximum entry, and indexes of maximum entry
			in S[][] */
        max_of_s = S[0][0];
        max_i = 0;
        max_j = 0;
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (max_of_s < S[i][j]) {
                    max_of_s = S[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        System.out.println("Maximum size sub-matrix is: ");
        for (i = max_i; i > max_i - max_of_s; i--) {
            for (j = max_j; j > max_j - max_of_s; j--) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    // JAVA Code for Maximum size square
// sub-matrix with all 1s

    // Optimised solution
    static void printMaxSubSquare1(int M[][]) {
        int R = 6;
        int C = 5;
        int S[][] = new int[2][C], Max = 0;

        // set all elements of S to 0 first
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < C; j++) {
                S[i][j] = 0;
            }
        }

        // Construct the entries
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {

                // Compute the entrie at the current position
                int Entrie = M[i][j];
                if (Entrie != 0) {
                    if (j != 0) {
                        Entrie = 1 + Math.min(S[1][j - 1], Math.min(S[0][j - 1], S[1][j]));
                    }
                }

                // Save the last entrie and add the new one
                S[0][j] = S[1][j];
                S[1][j] = Entrie;

                // Keep track of the max square length
                Max = Math.max(Max, Entrie);
            }
        }

        // Print the square
        System.out.print("Maximum size sub-matrix is: \n");
        for (int i = 0; i < Max; i++) {
            for (int j = 0; j < Max; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }

    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int result = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            dp[i][0] = matrix[i][0] - '0';
            result = Math.max(result, dp[i][0]);
        }

        for (int j = 0; j < matrix[0].length; j++) {
            dp[0][j] = matrix[0][j] - '0';
            result = Math.max(result, dp[0][j]);
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    int min = Math.min(dp[i - 1][j], dp[i][j - 1]);
                    min = Math.min(min, dp[i - 1][j - 1]);
                    dp[i][j] = min + 1;

                    result = Math.max(result, min + 1);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return result * result;
    }
}
