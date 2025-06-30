public class AlgorithmImplementations {

    // 1. Sequential Search
    public static int sequentialSearch(int[] A, int K) {
        if (A == null || A.length == 0) throw new IllegalArgumentException("Input array cannot be null or empty.");
        for (int i = 0; i < A.length; i++) {
            if (A[i] == K) return i;
        }
        return -1;
    }

    // 2. Max Element
    public static double maxElement(double[] A) {
        if (A == null || A.length == 0) throw new IllegalArgumentException("Input array cannot be null or empty.");
        double maxval = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > maxval) {
                maxval = A[i];
            }
        }
        return maxval;
    }

    // 3. Unique Elements
    public static boolean uniqueElements(int[] A) {
        if (A == null) throw new IllegalArgumentException("Input array cannot be null.");
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) return false;
            }
        }
        return true;
    }

    // 4. Matrix Multiplication
    public static double[][] matrixMultiplication(double[][] A, double[][] B) {
        if (A == null || B == null) throw new IllegalArgumentException("Matrices cannot be null.");
        int n = A.length;
        if (n == 0 || B.length != n || A[0].length != n || B[0].length != n) {
            throw new IllegalArgumentException("Only square matrices of same size are supported.");
        }

        double[][] C = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    C[i][j] += A[i][k] * B[k][j];

        return C;
    }

    // 5. Count Binary Digits (Iterative)
    public static int binaryDigits(int n) {
        if (n < 0) throw new IllegalArgumentException("Input must be non-negative.");
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 2;
        }
        return count;
    }

    // 6. Factorial (Recursive)
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        if (n > 12) throw new ArithmeticException("Result too large for int. Use long or BigInteger.");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    // 7. Count Binary Digits (Recursive)
    public static int binaryDigitsRec(int n) {
        if (n < 0) throw new IllegalArgumentException("Input must be non-negative.");
        if (n == 0) return 1;
        if (n == 1) return 1;
        return binaryDigitsRec(n / 2) + 1;
    }

    // 8. Gaussian Elimination
    public static void gaussianElimination(double[][] A) {
        if (A == null || A.length == 0 || A[0].length != A.length + 1)
            throw new IllegalArgumentException("Matrix must be augmented (n x n+1).");

        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i][i] == 0) throw new ArithmeticException("Division by zero during pivoting.");
            for (int j = i + 1; j < n; j++) {
                double factor = A[j][i] / A[i][i];
                for (int k = i; k <= n; k++) {
                    A[j][k] -= factor * A[i][k];
                }
            }
        }
    }
}
