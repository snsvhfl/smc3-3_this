import java.util.*;
public class can {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1000������ �ڿ��� �Է�");
		int a = scan.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			if(i%4==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("4�� ��� ��: "+sum);
	}

}
