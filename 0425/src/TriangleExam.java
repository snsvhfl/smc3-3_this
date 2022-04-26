import java.util.*;
public class TriangleExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Triangle t1 = new Triangle(10.2,17.3);
		System.out.println("»ï°¢Çü1 ³ÐÀÌ´Â : "+ t1.Area());
		t1.size(7.5, 9.5);
		System.out.print("»ï°¢Çü2 ³ÐÀÌ´Â : "+ t1.Area());
	}
}

class Triangle{
	double w;
	double h;
	public Triangle(double w, double h){
		this.w = w;
		this.h = h;
	}
	public void size(double w, double h) {
		this.w = w;
		this.h = h;
	}
	
	public double Area() {
		return (this.w*this.h)/2;
	}
}
