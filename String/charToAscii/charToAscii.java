class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        // check
        int strLen = s.length();
        if ((strLen == 4) || (strLen == 6)){
            for (int i = 0; i < strLen; i++){
                char a = s.charAt(i); // ----------- String to char
                int asc = (int)a; // --------------- char to ascii
                if ((65 <= a) && (a <= 90)){
                    answer = false;
                    break;
                }
                if ((97 <= a) && (a <= 122)){
                    answer = false;
                    break;
                }
            }
        }
        else answer = false;
        
        return answer;
    }
}
