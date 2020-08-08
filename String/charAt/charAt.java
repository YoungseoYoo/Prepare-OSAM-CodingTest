class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0, yCount = 0;
        String a = s.toLowerCase();
        
	// ------------------------------------
        // count p and y
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == 'p') pCount++;
            if (a.charAt(i) == 'y') yCount++;
        }
	// ------------------------------------
        
        // display answer
        if (pCount == yCount) answer = true;
        else answer = false;

        return answer;
    }
}
