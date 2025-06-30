
// 1. Sequential Search (Linear Search)
/*
Algorithm: Sequential Search
1. Initialize index i to 0.
2. Loop through array A while:
   - i is less than the length of A, and
   - A[i] is not equal to the target K.
3. If A[i] equals K, return i (index of K).
4. If loop completes without finding K, return -1 (not found).
*/


// 2. Find Max Element in Array
/*
Algorithm: Find Maximum Element
1. Assume the first element A[0] is the maximum and store it in maxval.
2. Loop through the rest of the array from index 1 to end:
   - If current element A[i] is greater than maxval,
     update maxval to A[i].
3. After loop ends, return maxval.
*/


// 3. Check if All Elements are Unique
/*
Algorithm: Check for Uniqueness
1. Loop through array with index i from 0 to length-2.
2. For each i, loop through j from i+1 to end of array:
   - If A[i] == A[j], return false (duplicate found).
3. If no duplicates found, return true.
*/


// 4. Matrix Multiplication
/*
Algorithm: Square Matrix Multiplication (A * B = C)
1. Create a result matrix C of size n x n (same as A and B).
2. For each row i in A:
   - For each column j in B:
     - Initialize C[i][j] to 0.
     - Loop through index k from 0 to n-1:
       - Multiply A[i][k] with B[k][j] and add to C[i][j].
3. Return the resulting matrix C.
*/


// 5. Count Binary Digits (Iterative)
/*
Algorithm: Count Binary Digits (Iteratively)
1. If n is 0, return 1 (since binary of 0 is '0').
2. Initialize count to 1.
3. While n > 1:
   - Divide n by 2 (integer division).
   - Increment count.
4. Return count (number of binary digits).
*/


// 6. Factorial (Recursive)
/*
Algorithm: Recursive Factorial
1. If n is 0, return 1 (base case: 0! = 1).
2. Otherwise, return n * factorial(n - 1).
*/


// 7. Count Binary Digits (Recursive)
/*
Algorithm: Count Binary Digits (Recursively)
1. Base case: if n == 1, return 1.
2. Recursive case: return 1 + binaryDigitsRec(n / 2).
*/


// 8. Gaussian Elimination (Simplified)
/*
Algorithm: Gaussian Elimination (No Pivoting)
1. For each pivot row i from 0 to n-2:
   - For each row j below i (from i+1 to n-1):
     - Compute factor = A[j][i] / A[i][i].
     - For each column k from i to n:
       - Subtract factor * A[i][k] from A[j][k] to eliminate the entry.
2. Matrix A is converted to upper triangular form.
*/
