package yong.calendar;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b;
		
		String s1,s2;
		System.out.println("�μ��� �Է�:");
		s1=scanner.next();
		s2=scanner.next();
		a=Integer.parseInt(s1);
		b=Integer.parseInt(s2);
		
		System.out.printf("%d�� %d�� ���� %�Դϴ�",a,b,a+b);
		scanner.close();
	}

}
