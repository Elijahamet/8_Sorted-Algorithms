import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Algorithm Menu ===");
            System.out.println("1. Sequential Search");
            System.out.println("2. Find Max Element");
            System.out.println("3. Check Unique Elements");
            System.out.println("4. Matrix Multiplication");
            System.out.println("5. Binary Digits (Iterative)");
            System.out.println("6. Factorial");
            System.out.println("7. Binary Digits (Recursive)");
            System.out.println("8. Gaussian Elimination");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                
                switch (choice) {
                    case 0:
                        System.out.println("Exiting program...");
                        scanner.close();
                        return;
                        
                    case 1:
                        testSequentialSearch();
                        break;
                        
                    case 2:
                        testMaxElement();
                        break;
                        
                    case 3:
                        testUniqueElements();
                        break;
                        
                    case 4:
                        testMatrixMultiplication();
                        break;
                        
                    case 5:
                        testBinaryDigits();
                        break;
                        
                    case 6:
                        testFactorial();
                        break;
                        
                    case 7:
                        testBinaryDigitsRec();
                        break;
                        
                    case 8:
                        testGaussianElimination();
                        break;
                        
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static File getFileWithRetry(String fileType) {
        while (true) {
            System.out.print("Enter path to " + fileType + " file (or 'manual' for manual input): ");
            String path = scanner.nextLine().trim();
            
            if (path.equalsIgnoreCase("manual")) {
                return null;
            }
            
            File file = new File(path);
            if (file.exists() && !file.isDirectory()) {
                return file;
            }
            System.out.println("File not found or invalid. Please try again.");
        }
    }

    private static int[] getIntArray() {
        System.out.print("Enter 1 for manual input, 2 for file: ");
        int option = getValidOption();

        switch (option) {
            case 1:
                return getManualIntArray();
                
            case 2:
                File file = getFileWithRetry("integer array");
                if (file == null) {
                    return getManualIntArray();
                }
                try (Scanner fileScanner = new Scanner(file)) {
                    if (!fileScanner.hasNextInt()) {
                        throw new IllegalArgumentException("Invalid file format - missing size");
                    }
                    int size = fileScanner.nextInt();
                    int[] arr = new int[size];
                    for (int i = 0; i < size; i++) {
                        if (!fileScanner.hasNextInt()) {
                            throw new IllegalArgumentException("Not enough elements in file");
                        }
                        arr[i] = fileScanner.nextInt();
                    }
                    return arr;
                } catch (FileNotFoundException e) {
                    System.out.println("Error: File not found");
                } catch (Exception e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
                return new int[0];
                
            default:
                return new int[0];
        }
    }

    private static double[] getDoubleArray() {
        System.out.print("Enter 1 for manual input, 2 for file: ");
        int option = getValidOption();

        switch (option) {
            case 1:
                return getManualDoubleArray();
                
            case 2:
                File file = getFileWithRetry("double array");
                if (file == null) {
                    return getManualDoubleArray();
                }
                try (Scanner fileScanner = new Scanner(file)) {
                    if (!fileScanner.hasNextInt()) {
                        throw new IllegalArgumentException("Invalid file format - missing size");
                    }
                    int size = fileScanner.nextInt();
                    double[] arr = new double[size];
                    for (int i = 0; i < size; i++) {
                        if (!fileScanner.hasNextDouble()) {
                            throw new IllegalArgumentException("Not enough elements in file");
                        }
                        arr[i] = fileScanner.nextDouble();
                    }
                    return arr;
                } catch (FileNotFoundException e) {
                    System.out.println("Error: File not found");
                } catch (Exception e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
                return new double[0];
                
            default:
                return new double[0];
        }
    }

    private static double[][] getMatrix(int rows, int cols) {
        System.out.print("Enter 1 for manual input, 2 for file: ");
        int option = getValidOption();

        switch (option) {
            case 1:
                return getManualMatrix(rows, cols);
                
            case 2:
                File file = getFileWithRetry("matrix");
                if (file == null) {
                    return getManualMatrix(rows, cols);
                }
                try (Scanner fileScanner = new Scanner(file)) {
                    double[][] matrix = new double[rows][cols];
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            if (!fileScanner.hasNextDouble()) {
                                throw new IllegalArgumentException("Not enough elements in file");
                            }
                            matrix[i][j] = fileScanner.nextDouble();
                        }
                    }
                    return matrix;
                } catch (FileNotFoundException e) {
                    System.out.println("Error: File not found");
                } catch (Exception e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
                return new double[rows][cols];
                
            default:
                return new double[rows][cols];
        }
    }

    private static int getValidOption() {
        while (true) {
            try {
                int option = Integer.parseInt(scanner.nextLine());
                if (option == 1 || option == 2) {
                    return option;
                }
                System.out.print("Invalid option. Enter 1 or 2: ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter 1 or 2: ");
            }
        }
    }

    private static int[] getManualIntArray() {
        System.out.print("Enter array size: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return arr;
    }

    private static double[] getManualDoubleArray() {
        System.out.print("Enter array size: ");
        int size = Integer.parseInt(scanner.nextLine());
        double[] arr = new double[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = Double.parseDouble(scanner.nextLine());
        }
        return arr;
    }

    private static double[][] getManualMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        return matrix;
    }

    private static void testSequentialSearch() {
        int[] array = getIntArray();
        if (array.length == 0) return;

        System.out.print("Enter value to search: ");
        int key = Integer.parseInt(scanner.nextLine());
        int result = AlgorithmImplementations.sequentialSearch(array, key);

        System.out.println(result != -1 ? "Found at index: " + result : "Not found");
        printComplexity("Sequential Search", "O(1)", "O(n)", "O(n)");
    }

    private static void testMaxElement() {
        double[] array = getDoubleArray();
        if (array.length == 0) return;

        double max = AlgorithmImplementations.maxElement(array);
        System.out.println("Maximum element: " + max);
        printComplexity("Find Max", "O(n)", "O(n)", "O(n)");
    }

    private static void testUniqueElements() {
        int[] array = getIntArray();
        if (array.length == 0) return;

        HashSet<Integer> uniqueSet = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();
        
        for (int num : array) {
            if (!uniqueSet.add(num)) {
                duplicateSet.add(num);
            }
        }
        
        uniqueSet.removeAll(duplicateSet);
        
        int[] uniqueArray = uniqueSet.stream().mapToInt(i -> i).toArray();
        int[] duplicateArray = duplicateSet.stream().mapToInt(i -> i).toArray();
        Arrays.sort(uniqueArray);
        Arrays.sort(duplicateArray);

        System.out.println("\n=== Unique Elements ===");
        System.out.println(uniqueArray.length == 0 ? "None" : Arrays.toString(uniqueArray));

        System.out.println("\n=== Duplicate Elements ===");
        System.out.println(duplicateArray.length == 0 ? "None" : Arrays.toString(duplicateArray));

        System.out.println("\nAll elements unique? " + duplicateSet.isEmpty());
        printComplexity("Unique Check", "O(n)", "O(n)", "O(n)");
    }

    private static void testMatrixMultiplication() {
        System.out.print("Enter matrix size n: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("For Matrix A:");
        double[][] A = getMatrix(n, n);
        System.out.println("For Matrix B:");
        double[][] B = getMatrix(n, n);

        double[][] C = AlgorithmImplementations.matrixMultiplication(A, B);
        System.out.println("Result Matrix C:");
        printMatrix(C);

        printComplexity("Matrix Multiplication", "O(n³)", "O(n³)", "O(n³)");
    }

    private static void testBinaryDigits() {
        System.out.print("Enter non-negative integer: ");
        int n = Integer.parseInt(scanner.nextLine());
        int result = AlgorithmImplementations.binaryDigits(n);
        System.out.println("Binary digits: " + result);

        printComplexity("Binary Digits", "O(1)", "O(log n)", "O(log n)");
    }

    private static void testFactorial() {
        System.out.print("Enter non-negative integer (≤12): ");
        int n = Integer.parseInt(scanner.nextLine());
        int result = AlgorithmImplementations.factorial(n);
        System.out.println(n + "! = " + result);

        printComplexity("Factorial", "O(1)", "O(n)", "O(n)");
    }

    private static void testBinaryDigitsRec() {
        System.out.print("Enter non-negative integer: ");
        int n = Integer.parseInt(scanner.nextLine());
        int result = AlgorithmImplementations.binaryDigitsRec(n);
        System.out.println("Binary digits (recursive): " + result);

        printComplexity("Binary Digits Recursive", "O(1)", "O(log n)", "O(log n)");
    }

    private static void testGaussianElimination() {
        System.out.print("Enter matrix size n: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter augmented matrix (" + n + " rows, " + (n + 1) + " columns):");
        double[][] A = getMatrix(n, n + 1);
        AlgorithmImplementations.gaussianElimination(A);
        System.out.println("After Gaussian Elimination:");
        printMatrix(A);

        printComplexity("Gaussian Elimination", "O(n³)", "O(n³)", "O(n³)");
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f ", val);
            }
            System.out.println();
        }
    }

    private static void printComplexity(String algorithm, String best, String worst, String average) {
        System.out.println("\nComplexity Analysis for " + algorithm + ":");
        System.out.println("Best Case: " + best);
        System.out.println("Worst Case: " + worst);
        System.out.println("Average Case: " + average);
    }
}