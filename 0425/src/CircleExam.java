import java.util.Scanner;

public class CircleExam {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("반지름 값 >>");
		 int r = scan.nextInt();
		 Circle c = new Circle(r);
		 System.out.println("반지름 "+ c.radius + "인 원의 넓이는 " + c.Area() + "이다.");
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