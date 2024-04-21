import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {

        if (arr.length == 0) {
            return new int[] {-1};
        }
        

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num : arr) {
            if (num != min) {
                resultList.add(num);
            }
        }
        

        if (resultList.isEmpty()) {
            return new int[] {-1};
        }
        

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
