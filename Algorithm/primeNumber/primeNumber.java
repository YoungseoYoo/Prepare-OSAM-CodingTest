class Solution {
    public int solution(int n) {
        // set data
        int[] eratos = new int[n+1];
        int answer = 0;
        
        // fill eratos
        eratos[0] = 0;
        eratos[1] = 0;
        for (int i = 2; i <= n; i++){
            eratos[i] = i;
        }
        
        // find prime number
        for (int i = 2; i <= n; i++){
            if (eratos[i] == 0) continue;
            else{
                for (int j = i * 2; j <= n; j += i){
                    eratos[j] = 0;
                }
            }
        }
        
        // count prime number
        for (int i = 0; i <= n; i++){
            if (eratos[i] != 0) answer++;
        }
        
        return answer;
    }
}