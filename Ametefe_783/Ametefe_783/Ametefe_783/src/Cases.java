/*
==================================================
1. SEQUENTIAL SEARCH (Linear Search)
==================================================
Best Case:    O(1)
- Element K is found at the first index (A[0]).

Worst Case:   O(n)
- Element K is not in the array or is at the last index.

Average Case: O(n)
- On average, K is found halfway through the array (~n/2 checks).
*/


/*
==================================================
2. MAX ELEMENT IN ARRAY
==================================================
Best Case:    O(n)
- Max is at the first index, but loop still checks all elements.

Worst Case:   O(n)
- Max is at the last index; all elements must be checked.

Average Case: O(n)
- Every element must be checked regardless of order.
*/


/*
==================================================
3. UNIQUE ELEMENTS CHECK
==================================================
Best Case:    O(1)
- Duplicate found early (e.g., A[0] == A[1]).

Worst Case:   O(n²)
- All elements are unique → full nested loop comparisons.

Average Case: O(n²)
- Comparisons grow quadratically due to double loop.

Note: Can be optimized to O(n) using a HashSet.
*/


/*
==================================================
4. MATRIX MULTIPLICATION (Square Matrices)
==================================================
Best Case:    O(n³)
- All elements must be computed, no shortcuts.

Worst Case:   O(n³)
- Fixed triple loop structure; same for all inputs.

Average Case: O(n³)
- Performance is consistent regardless of matrix values.
*/


/*
==================================================
5. COUNT BINARY DIGITS (Iterative)
==================================================
Best Case:    O(1)
- If n = 0 or n = 1, loop runs zero times.

Worst Case:   O(log n)
- Binary digit count equals floor(log₂(n)) + 1.

Average Case: O(log n)
- Grows logarithmically based on n’s binary size.
*/


/*
==================================================
6. FACTORIAL (Recursive)
==================================================
Best Case:    O(n)
- Even if n is small, recursion proceeds down to 0.

Worst Case:   O(n)
- n recursive calls needed before hitting base case.

Average Case: O(n)
- Recursion depth always depends linearly on n.

Note: Stack space also grows with n due to recursion.
*/


/*
==================================================
7. COUNT BINARY DIGITS (Recursive)
==================================================
Best Case:    O(1)
- If n = 1, immediate return.

Worst Case:   O(log n)
- Recursively halves n until base case (n = 1).

Average Case: O(log n)
- Number of calls ≈ log₂(n).
*/

/*
==================================================
8. GAUSSIAN ELIMINATION (Simplified, No Pivoting)
==================================================
Best Case:    O(n³)
- Even with favorable numbers, the structure remains cubic.

Worst Case:   O(n³)
- No shortcuts, fixed set of row/column operations.

Average Case: O(n³)
- Algorithm always performs in cubic time for size n.

Note: Pivoting improves stability, not time complexity.
*/
