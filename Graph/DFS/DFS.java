class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] chk = new boolean[n];
        
        for (int i = 0; i < n; i++){
            if (!chk[i]){
                doDFS(computers, i, chk);
                answer++;
            }
        }       
        return answer;
    }
    
    boolean[] doDFS(int[][] com, int s, boolean[] c){
        c[s] = true;
        
        for (int i = 0; i < com.length; i++){
            if (s != i && com[s][i] == 1 && c[i] == false){
                c = doDFS(com, i, c);
            }
        }
        return c;
    }
}