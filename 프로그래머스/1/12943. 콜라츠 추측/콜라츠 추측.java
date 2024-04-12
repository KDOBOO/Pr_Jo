class Solution {
    public int solution(long num) {

        for(int i=1;i<=500;i++){
            if(num == 1){
                return 0;
            }
            num = (num%2==0)?num/2:num*3+1;
            if(num == 1){
                return i;
            }

        }
        return -1;
    }
}