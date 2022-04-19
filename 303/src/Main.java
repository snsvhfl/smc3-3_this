import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=0;
		int b=0;
		int sum=0;
		System.out.print("시작 숫자: ");
		a=scan.nextInt();
		System.out.print("마지막 숫자: ");
		b=scan.nextInt();
		for(int i=a;i<=b;i++) sum+=i;	
		System.out.print("더한 값은 = "+sum+"입니다.");
	}
}