import java.util.*;
public class TestExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
		int a = scan.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			if(i%3==0&&i%7==0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("1~"+a+"���� 3�� ����̸鼭 7�� ����� ���� ���� "+sum+"�Դϴ�.");
	}
}