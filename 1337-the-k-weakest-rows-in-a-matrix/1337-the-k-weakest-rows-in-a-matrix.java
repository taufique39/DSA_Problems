class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        //Create an array of size no. of rows present in mat
        int arr[] = new int[m];
        for(int i = 0; i < m; i++){
            int count1 = 0;
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1){
                    count1++;
                }
            }
            arr[i] = count1;
        }   
        
        int[] result = new int[k];//Create ans array of size k
        for(int i = 0; i < k; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            result[i] = minIndex;
            arr[minIndex] = Integer.MAX_VALUE;
        }
        
        return result;
    }
}