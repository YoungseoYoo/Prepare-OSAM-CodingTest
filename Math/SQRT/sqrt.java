class Solution {
    public long solution(long n) {
        long answer = 0;
        double dResult = 0.0;
        int iResult = 0;
        dResult = Math.sqrt(n); // ---------- dResult * dResult = n
        iResult = (int)dResult;
        
         check
        if (dResult - (double)iResult != 0.0){
            answer = -1;
        }else{
            answer = (long) Math.pow(iResult + 1, 2);
        }
        
        return answer;
    }
}
