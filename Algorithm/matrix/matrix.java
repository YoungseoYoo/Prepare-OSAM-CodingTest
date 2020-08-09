import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // set default answer arr
        int arr1row = arr1.length;
        int arr2col = arr2[0].length;
        int arr1col = arr1[0].length;
        int[][] answer = new int[arr1row][arr2col];
        for (int[] row : answer) Arrays.fill(row, 0); 
        
        // calculate
        for (int i = 0; i < arr1row; i++){
            for (int j = 0; j < arr2col; j++){
                answer[i][j] = 0;
                for (int m = 0; m < arr1col; m++){
                    answer[i][j] += (arr1[i][m]*arr2[m][j]);
                }
            }
        }
 
        return answer;
    }
}