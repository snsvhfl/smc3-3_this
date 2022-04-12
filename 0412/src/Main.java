import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0;
		int a = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번 입력");
			arr[i] = scan.nextInt();
			if (max < arr[i]) {
				max = arr[i];
				a = i + 1;
			}
		}
		System.out.println("가장 큰 수는 " + a + "번째 숫자인" + max);
	}
}