class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if (length % 2 == 0) {
            int midIndex = length / 2;
            answer = s.substring(midIndex - 1, midIndex + 1);
        } else {
            int midIndex = length / 2;
            answer = s.substring(midIndex, midIndex + 1);
        }
        return answer;
    }
}
