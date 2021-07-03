package task1;

import static java.lang.Math.*;

public class Task1 {
    public static void main(String[] args) {
        // matrix 7x10
        double[][] matrix = new double[7][10];

        // parameters
        double c = -1.49;
        double d = 23.4;

        double part1 = sin(sin(c));
        double part2 = 4*log(log(d));

        // generate and output matrix
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                matrix[i-1][j-1] = sqrt(abs(part1 - part2/pow(i, j)));
                System.out.printf("%6.2f", matrix[i-1][j-1]);
            }
            System.out.println();
        }

        // find max element of the matrix
        double maxElement = Double.MIN_VALUE;

        for (double[] rows : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows[j] > maxElement) {
                    maxElement = rows[j];
                }
            }
        }

        // print max element of the matrix
        System.out.println("Max element of the matrix: " + maxElement);


    }
}
