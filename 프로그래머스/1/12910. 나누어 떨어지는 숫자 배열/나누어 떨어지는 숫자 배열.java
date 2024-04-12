import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }

      
        if (answer.isEmpty()) {
            return new int[] {-1};
        }

        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
