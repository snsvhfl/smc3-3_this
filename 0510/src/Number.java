import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
        System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int []arr=new int[10];
        for(int i=0;i<10;i++) {
        	arr[i] = (int)(Math.random()*50+1);
        }
     
        for(int i=0;i<10;i++) {
        	if(arr[i]==num) {
        		num=0;
        		break;
        	}
        }
        
        for(int i=0;i<10;i++) {
        	System.out.print(arr[i]+" ");
        }System.out.println();
        
        if(num!=0)System.out.println("꽝!");
        else System.out.println("당첨!");
        
	}
}


