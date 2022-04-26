import java.util.Scanner;

public class CircleExam {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("������ �� >>");
		 int r = scan.nextInt();
		 Circle c = new Circle(r);
		 System.out.println("������ "+ c.radius + "�� ���� ���̴� " + c.Area() + "�̴�.");
	}
}

class Circle{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double Area() {
		return this.radius * this.radius*3.14;
	}
}