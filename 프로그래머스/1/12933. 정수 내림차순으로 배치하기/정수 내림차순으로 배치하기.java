import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add((int)(n % 10)); 
            n /= 10; 
        }
        
        Collections.sort(digits, Collections.reverseOrder());
        
        long result = 0;
        for (int digit : digits) {
            result = result * 10 + digit; 
        }
        
        answer = result; // 결과값을 answer에 대입
        
        return answer;
    }
}
