class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        StringBuffer sb = new StringBuffer(s);
        
        s = sb.reverse().toString();
        int[] answer = new int[s.length()];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = Integer.parseInt(s.substring(i,i+1));
        }
        return answer;
    }
}