
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); // 정수 입력
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < a; i++) {
            int c = sc.nextInt(); // 리스트에 정수 추가
            list.add(c);
        }
        
        int res = sc.nextInt(); // 찾고자 하는 정수 입력
        int count = 0;
        
        for (int i = 0; i < a; i++) {
            if (list.get(i) == res) {
                count++;
            }
        }
        
        System.out.println(count); // 결과 출력
        
        sc.close(); // Scanner 객체 닫기
    }
}
