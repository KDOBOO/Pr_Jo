class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int[] arr = new int[10];
        int i = 0;
        int sum = 0;
        int a = x;
    
        while (x > 0) {
            arr[i] = x % 10;
            x = x / 10;
            i++;
        }

     
        for (int j = 0; j < i; j++) {
            sum += arr[j];
        }

      
        if (a % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
