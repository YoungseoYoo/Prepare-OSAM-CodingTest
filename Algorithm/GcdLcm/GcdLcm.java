class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big, small;
        
        // find big and small
        if (n > m){
            big = n; small = m;
        }else{
            big = m; small = n;
        }
        answer[0] = gcd(big, small); // ---------- Greatest Common Divisor
        answer[1] = big * small / gcd(big, small); // -- Least Common Multiple
        
        return answer;
    }
    
    public int gcd(int a, int b){ // -------------- GCD Algorithm
        if (a % b == 0) return b;
        return gcd(b, a%b);
    }
}
