/*
Pseudocode: Sequential Search (Linear Search)
---------------------------------------------
SEQUENTIAL_SEARCH(A, K)
  SET i ← 0
  SET n ← length of A

  WHILE i < n AND A[i] ≠ K
    i ← i + 1

  IF i < n THEN
    RETURN i
  ELSE
    RETURN -1
*/


/*
Pseudocode: Find Maximum Element in Array
-----------------------------------------
MAX_ELEMENT(A)
  SET maxval ← A[0]

  FOR i FROM 1 TO length of A - 1
    IF A[i] > maxval THEN
      SET maxval ← A[i]

  RETURN maxval
*/


/*
Pseudocode: Check if All Elements Are Unique
--------------------------------------------
UNIQUE_ELEMENTS(A)
  FOR i FROM 0 TO length of A - 2
    FOR j FROM i + 1 TO length of A - 1
      IF A[i] = A[j] THEN
        RETURN false

  RETURN true
*/


/*
Pseudocode: Matrix Multiplication (Square Matrices)
----------------------------------------------------
MATRIX_MULTIPLICATION(A, B)
  SET n ← number of rows in A
  INITIALIZE matrix C of size n × n with zeros

  FOR i FROM 0 TO n - 1
    FOR j FROM 0 TO n - 1
      FOR k FROM 0 TO n - 1
        C[i][j] ← C[i][j] + A[i][k] × B[k][j]

  RETURN C
*/


/*
Pseudocode: Count Binary Digits (Iterative)
-------------------------------------------
BINARY_DIGITS(n)
  IF n = 0 THEN
    RETURN 1

  SET count ← 1

  WHILE n > 1
    n ← n DIV 2
    count ← count + 1

  RETURN count
*/


/*
Pseudocode: Factorial (Recursive)
---------------------------------
FACTORIAL(n)
  IF n = 0 THEN
    RETURN 1
  ELSE
    RETURN n × FACTORIAL(n - 1)
*/


/*
Pseudocode: Count Binary Digits (Recursive)
-------------------------------------------
BINARY_DIGITS_REC(n)
  IF n = 1 THEN
    RETURN 1
  ELSE
    RETURN 1 + BINARY_DIGITS_REC(n DIV 2)
*/


/*
Pseudocode: Gaussian Elimination (Simplified, No Pivoting)
-----------------------------------------------------------
GAUSSIAN_ELIMINATION(A)
  SET n ← number of rows in A

  FOR i FROM 0 TO n - 2
    FOR j FROM i + 1 TO n - 1
      SET factor ← A[j][i] / A[i][i]

      FOR k FROM i TO n
        A[j][k] ← A[j][k] - factor × A[i][k]
*/
