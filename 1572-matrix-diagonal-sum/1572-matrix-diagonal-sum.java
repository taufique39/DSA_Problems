class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        
        int mid = n / 2; 
        
        int sum = 0;
        
        for (int i = 0; i < n; i++) { 
            sum += mat[i][i];
            
            sum += mat[n - 1 - i][i];
        }
            
        if (n % 2 == 1) { 
            sum -= mat[mid][mid];
        }
            
        return sum;
    }
}
