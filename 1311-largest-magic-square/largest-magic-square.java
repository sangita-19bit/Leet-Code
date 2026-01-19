class Solution {

public int largestMagicSquare(int[][] grid) {
int m = grid.length, n = grid[0].length;

int[][] row = new int[m + 1][n + 1];
int[][] col = new int[m + 1][n + 1];

for (int i = 0; i < m; i++) {
for (int j = 0; j < n; j++) {
row[i + 1][j + 1] = row[i + 1][j] + grid[i][j];
col[i + 1][j + 1] = col[i][j + 1] + grid[i][j];
}
}

for (int size = Math.min(m, n); size >= 2; size--) {
for (int i = 0; i + size <= m; i++) {
for (int j = 0; j + size <= n; j++) {
if (isMagic(grid, row, col, i, j, size))
return size;
}
}
}
return 1;
                                                                                                                                                                                                                                        }  
                                                                                                                                                                                                                                            private boolean isMagic(int[][] grid, int[][] row, int[][] col,
                                                                                                                                                                                                                                                                        int r, int c, int size) {

int sum = row[r + 1][c + size] - row[r + 1][c];

for (int i = 0; i < size; i++) {
if (row[r + i + 1][c + size] - row[r + i + 1][c] != sum)
return false;
if (col[r + size][c + i + 1] - col[r][c + i + 1] != sum)
return false;
}

int d1 = 0, d2 = 0;
for (int i = 0; i < size; i++) {
d1 += grid[r + i][c + i];
d2 += grid[r + i][c + size - 1 - i];
}

return d1 == sum && d2 == sum;
}
}

