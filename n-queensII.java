class Solution {
    private int count = 0;

    public int totalNQueens(int n) {
        boolean[] usedCols = new boolean[n];
        boolean[] usedDiag1 = new boolean[2 * n];
        boolean[] usedDiag2 = new boolean[2 * n];
        
        backtrack(0, usedCols, usedDiag1, usedDiag2, n);
        return count;
    }

    private void backtrack(int row, boolean[] cols, boolean[] d1, boolean[] d2, int n) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            int diag1Idx = row - col + n;
            int diag2Idx = row + col;

            if (cols[col] || d1[diag1Idx] || d2[diag2Idx]) {
                continue;
            }

            cols[col] = true;
            d1[diag1Idx] = true;
            d2[diag2Idx] = true;

            backtrack(row + 1, cols, d1, d2, n);

            cols[col] = false;
            d1[diag1Idx] = false;
            d2[diag2Idx] = false;
        }
    }
}
