import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        // sort A and B as ASC
        Arrays.sort(A);
        Arrays.sort(B);
        
        // set basic data
        int answer = 0; // B team's winning point
        int adx = 0; // a index
        int bdx = 0; // b index
        
        // do compare process
        while (adx < A.length && bdx < B.length){
            // if B is win
            if (B[bdx] > A[adx]){
                answer++;
                adx++;
                bdx++;
            }
            // if draw or A is win
            else{
                bdx++;
            }
        }
        
        return answer;
    }
}