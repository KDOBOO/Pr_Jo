import java.util.regex.*;
class Solution {
    public boolean solution(String s) {
        Pattern pattern = Pattern.compile("\\d+");
         Matcher matcher = pattern.matcher(s);
        if((s.length() == 4 || s.length() == 6)&&matcher.matches()){
            return true;
        }
        return false;
    }
}