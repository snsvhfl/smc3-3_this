import java.util.Scanner;

public class GradeExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 입력>>");
		Grade ga = new Grade();
		ga.math = scanner.nextInt();
		ga.science = scanner.nextInt();
		ga.english = scanner.nextInt();
		
		System.out.println(ga.average());
	}
}
class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
	}
}