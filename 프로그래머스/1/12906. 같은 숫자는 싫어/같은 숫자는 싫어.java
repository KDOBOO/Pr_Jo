import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                sb.append(arr[i]);
            }
        }

        String str = sb.toString();
        int[] intArray = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            intArray[i] = Character.getNumericValue(str.charAt(i));
        }
        return intArray;
    }
}
