package task3;

import java.util.Random;

/**
 * This class created for working with matrices.
 * @author      Steven Altamirano
 */
public class MatrixWorker {
    private final int ONE_HUNDRED = 100;
    private int n;
    private int m;
    private double[][] matrix;

    /**
     * Constructor for initializing matrix.
     * @param n - amount of rows
     * @param m - amount of columns
     */
    public MatrixWorker(int n, int m) {
        this.n = n;
        this.m = m;

        matrix = new double[n][m];
    }

    /**
     * This method fills matrix with random numbers.
     */
    private void generateMatrix() {
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextDouble() * ONE_HUNDRED;
            }
        }
    }

    /**
     * This method prints matrix.
     */
    public void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" | " + matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("\n\n");
    }

    /**
     * This method finds min element in matrix.
     * @return min - minimal element in matrix
     */
    public double getMinElement() {
        double min = matrix[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
    }

    /**
     * This method finds max element in matrix.
     * @return max - max element in matrix
     */
    public double getMaxElement() {
        double max = matrix[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    /**
     * This method evaluates arithmetic mean of all elements in matrix.
     * @return arithmetic mean
     */
    public double getArithmeticMean() {
        double arithmeticMean = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arithmeticMean += matrix[i][j];
            }
        }

        arithmeticMean = arithmeticMean / (m * n);

        return arithmeticMean;
    }

    /**
     * This method evaluates geometric mean of all elements in matrix.
     * @return geometric mean
     */
    public double getGeometricMean() {
        double geometricMean = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                geometricMean *= matrix[i][j];
            }
        }

        geometricMean = Math.pow(geometricMean, 1.0d / (n * m));

        return geometricMean;
    }

    /**
     * This method finds first local minimum in matrix.
     * If local minimum doesn't exist method returns -1.
     * @return first local minimum
     */
    public double getFirstLocalMinimum() {
        double localMinimum;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 && j == 0) || (i == (n - 1) && j == (m - 1))) {

                    /*
                        Hello!
                        We don't need to check first and last element's of matrix.
                        So i wrote this if statement.
                        But then i ran into a problem:
                            I have choice:
                                1. Empty if statement
                                2. Continue as a last statement in loop
                        All of this choices are bad.

                        If you read this and can help me please do it.
                     */
                    continue;
                } else {
                    if (j == 0) {
                        if (j == m - 1) {
                            if ((matrix[i][j] < matrix[i - 1][0]) && (matrix[i][j] < matrix[i + 1][0])) {
                                localMinimum = matrix[i][j];
                                return localMinimum;
                            }
                        } else {
                            if ((matrix[i][j] < matrix[i - 1][0]) && (matrix[i][j] < matrix[i][j + 1])) {
                                localMinimum = matrix[i][j];
                                return localMinimum;
                            }
                        }
                    } else if (j == m - 1) {
                        if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i + 1][0])) {
                            localMinimum = matrix[i][j];
                            return localMinimum;
                        }
                    } else {
                        if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i][j + 1])) {
                            localMinimum = matrix[i][j];
                            return localMinimum;
                        }
                    }
                }
            }
        }

        return -1;
    }

    /**
     * This method finds first local maximum in matrix.
     * If local maximum doesn't exist method returns -1.
     * @return first local maximum
     */
    public double getFirstLocalMaximum() {
        double localMaximum;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 && j == 0) || (i == (n - 1) && j == (m - 1))) {
                    continue;
                } else {
                    if (j == 0) {
                        if (j == m - 1) {
                            if ((matrix[i][j] > matrix[i - 1][0]) && (matrix[i][j] > matrix[i + 1][0])) {
                                localMaximum = matrix[i][j];
                                return localMaximum;
                            }
                        } else {
                            if ((matrix[i][j] > matrix[i - 1][0]) && (matrix[i][j] > matrix[i][j + 1])) {
                                localMaximum = matrix[i][j];
                                return localMaximum;
                            }
                        }
                    } else if (j == m - 1) {
                        if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i + 1][0])) {
                            localMaximum = matrix[i][j];
                            return localMaximum;
                        }
                    } else {
                        if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i][j + 1])) {
                            localMaximum = matrix[i][j];
                            return localMaximum;
                        }
                    }
                }
            }
        }

        return -1;
    }

    /**
     * This method transposes matrix.
     */
    public void transposeMatrix() {
        if (n == m) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < m; j++) {
                    matrix[j][i] = matrix[i][j] + matrix[j][i];
                    matrix[i][j] = matrix[j][i] - matrix[i][j];
                    matrix[j][i] = matrix[j][i] - matrix[i][j];
                }
            }
        } else {
            double[][] transposedMatrix = new double[m][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    transposedMatrix[j][i] = matrix[i][j];
                }
            }

            matrix = transposedMatrix;
            n = transposedMatrix.length;
            m = transposedMatrix[0].length;
        }
    }
}
