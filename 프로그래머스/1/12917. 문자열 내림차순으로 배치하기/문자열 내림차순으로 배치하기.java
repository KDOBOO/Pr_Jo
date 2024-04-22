import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }
        Collections.sort(list, Collections.reverseOrder());
        
        for(Character c : list) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}
