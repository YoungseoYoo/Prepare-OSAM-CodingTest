    // if String is palindrome, return length of parlindrome
    // if String is not palindrome, return 0
    public int doPalindrome(String s){
        int len = 0;
        Stack<String> stack = new Stack<>();
        int sLen = s.length();
        
        // if string length is even
        if (sLen % 2 == 0){
            // push first half
            for (int i = 0; i < sLen/2; i++){
                stack.push(s.substring(i,i+1));
            }
            // compare with second half
            for (int i = sLen/2; i < sLen; i++){
                if (!stack.pop().equals(s.substring(i,i+1))) break;
                else{
                    len += 2;
                }
            }
        }
        // if string length is odd
        else{
            // push first half
            for (int i = 0; i < sLen/2; i++){
                stack.push(s.substring(i,i+1));
            }
            // compare with second half
            for (int i = sLen/2 + 1; i < sLen; i++){
                if (!stack.pop().equals(s.substring(i,i+1))) break;
                else{
                    len += 2;
                }
            }
            len++;
        }
        
        return len;
    }