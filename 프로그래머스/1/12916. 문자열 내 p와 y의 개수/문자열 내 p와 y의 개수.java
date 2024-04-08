class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        
        // 문자열을 모두 소문자로 변환하여 대소문자를 구분하지 않고 비교
        s = s.toLowerCase();
        
        for (char c : s.toCharArray()) {
            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }
        
        // 'p'와 'y'의 개수가 같으면 true, 다르면 false 반환
        return pCount == yCount;
    }
}
