class Solution {
    public String solution(int n) {
        String answer = "";
        char a = '수';
        char b = '박';
        for(int i=0;i<n;i++){
           answer = (i % 2 == 0) ? answer + a : answer + b;

        }
        return answer;
    }
}