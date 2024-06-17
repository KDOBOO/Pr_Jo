
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int a = Integer.parseInt(br.readLine());
			int result = 0;
			
			if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
				  result = 1;
				}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			br.close();
		}
	}
}