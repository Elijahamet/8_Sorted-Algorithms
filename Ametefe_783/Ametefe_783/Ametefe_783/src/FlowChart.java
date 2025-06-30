/* SEQUENTIAL_SEARCH(A, K)
START
  │
  ↓
Set i = 0
  │
  ↓
┌────────────────────────────┐
│ While i < n AND A[i] ≠ K: │
└────────────┬───────────────┘
             │
             ↓
         i = i + 1
             │
             ↓
┌────────────────────┐
│ If i < n:          │
│   return i         │
│ Else:              │
│   return -1        │
└────────┬───────────┘
         │
         ↓
        END
*/


/* MAX_ELEMENT(A)
START
  │
  ↓
Set maxval = A[0]
  │
  ↓
┌──────────────────────────┐
│ For i from 1 to A.length │
└────────────┬─────────────┘
             │
             ↓
┌────────────────────────────┐
│ If A[i] > maxval:          │
│   maxval = A[i]            │
└────────────┬───────────────┘
             │
             ↓
(loop until end of array)
             │
             ↓
Return maxval
  │
  ↓
END
*/


/* UNIQUE_ELEMENTS(A)
START
  │
  ↓
┌────────────────────────────┐
│ For i from 0 to A.length-2 │
└────────────┬───────────────┘
             │
             ↓
┌────────────────────────────┐
│ For j from i+1 to A.length │
└────────────┬───────────────┘
             │
             ↓
┌────────────────────┐
│ If A[i] == A[j]:   │
│   return false     │
└────────┬───────────┘
         │
         ↓
(continue checking pairs)
         │
         ↓
Return true
  │
  ↓
END
*/


/* MATRIX_MULTIPLICATION(A, B)
START
  │
  ↓
Initialize matrix C[n][n] = 0
  │
  ↓
┌───────────────────────┐
│ For i from 0 to n - 1 │
└────────────┬──────────┘
             │
             ↓
┌───────────────────────┐
│ For j from 0 to n - 1 │
└────────────┬──────────┘
             │
             ↓
┌───────────────────────┐
│ For k from 0 to n - 1 │
└────────────┬──────────┘
             │
             ↓
C[i][j] += A[i][k] * B[k][j]
             │
             ↓
(loop ends)
             │
             ↓
Return matrix C
  │
  ↓
END
*/


/* BINARY_DIGITS(n)
START
  │
  ↓
┌─────────────┐
│ If n == 0:  │
│   return 1  │
└────┬────────┘
     │
     ↓
Set count = 1
  │
  ↓
┌────────────────────┐
│ While n > 1:       │
│   n = n / 2        │
│   count = count+1  │
└────────┬───────────┘
         │
         ↓
Return count
  │
  ↓
END
*/


/* FACTORIAL(n)
START
  │
  ↓
┌──────────────┐
│ If n == 0:   │
│   return 1   │
└────┬─────────┘
     │
     ↓
Return n * factorial(n - 1)
  │
  ↓
END
*/


/* BINARY_DIGITS_REC(n)
START
  │
  ↓
┌──────────────┐
│ If n == 1:   │
│   return 1   │
└────┬─────────┘
     │
     ↓
Return 1 + binaryDigitsRec(n / 2)
  │
  ↓
END
*/


/* GAUSSIAN_ELIMINATION(A)
START
  │
  ↓
Set n = number of rows
  │
  ↓
┌─────────────────────────┐
│ For i from 0 to n - 2   │
└────────────┬────────────┘
             │
             ↓
┌─────────────────────────┐
│ For j from i+1 to n - 1 │
└────────────┬────────────┘
             │
             ↓
Set factor = A[j][i] / A[i][i]
             │
             ↓
┌─────────────────────────┐
│ For k from i to n       │
└────────────┬────────────┘
             │
             ↓
A[j][k] = A[j][k] - factor * A[i][k]
             │
             ↓
(loop ends)
             │
             ↓
END
*/
