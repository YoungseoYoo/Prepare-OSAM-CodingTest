import java.util.ArrayList; // ---------------------------------- for ArrayList
import java.util.Collections; // -------------------------------- for Sort

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // change data's form
        String s = String.valueOf(n); // ------------------------- long to String
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            int ipd = Integer.parseInt(s.substring(i, i+1)); // -- String to int
            list.add(ipd);
        }
        
        // asc sort
        // Collections.sort(list); // ---------------------------- asc sort
        // desc sort
        Collections.sort(list, Collections.reverseOrder()); // --- desc sort
        
        // make String result
        String data = "";
        for (Integer re : list){
            data += Integer.toString(re); // ---------------------- int to String
        }
        
        // make Long result
        answer = Long.parseLong(data); // ------------------------- String to long       
        
        return answer;
    }
}
