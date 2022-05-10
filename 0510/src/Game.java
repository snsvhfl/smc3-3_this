import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a  = (int)(Math.random()*4);
		System.out.println("가위 바위 보!");
		String b = scan.next();
		switch(a) {
		case 0:
			System.out.println("가위");
			if(b.equals("바위")) System.out.println("이겼다");
			else if(b.equals("가위")) System.out.println("비겼다.");
			else System.out.println("졌다");
			break;
		case 1:
			System.out.println("바위");
			if(b.equals("보")) System.out.println("이겼다");
			else if(b.equals("바위")) System.out.println("비겼다.");
			else System.out.println("졌다");
			break;
		case 2:
			System.out.println("보");
			if(b.equals("가위")) System.out.println("이겼다");
			else if(b.equals("보")) System.out.println("비겼다.");
			else System.out.println("졌다");
			break;
		}
	}
}