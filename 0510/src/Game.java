import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a  = (int)(Math.random()*4);
		System.out.println("���� ���� ��!");
		String b = scan.next();
		switch(a) {
		case 0:
			System.out.println("����");
			if(b.equals("����")) System.out.println("�̰��");
			else if(b.equals("����")) System.out.println("����.");
			else System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			if(b.equals("��")) System.out.println("�̰��");
			else if(b.equals("����")) System.out.println("����.");
			else System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			if(b.equals("����")) System.out.println("�̰��");
			else if(b.equals("��")) System.out.println("����.");
			else System.out.println("����");
			break;
		}
	}
}