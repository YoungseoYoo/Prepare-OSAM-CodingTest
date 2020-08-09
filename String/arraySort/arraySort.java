import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // change data's form
        String s = String.valueOf(n);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            int ipd = Integer.parseInt(s.substring(i, i+1));
            list.add(ipd);
        }
        
        // asc sort
        // Collections.sort(list);
        // desc sort
        Collections.sort(list, Collections.reverseOrder());
        
        // make String result
        String data = "";
        for (Integer re : list){
            data += Integer.toString(re);
        }
        
        // make Long result
        answer = Long.parseLong(data);
        
        // for test
        // System.out.println(data);

        
        
        return answer;
    }
}