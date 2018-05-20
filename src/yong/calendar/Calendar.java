package yong.calendar;
import java.util.Scanner;
public class Calendar {

	public static void main(String[] args) {
		System.out.println("일 월 화 수 목 금 토 일");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
	
		int maxDays[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		//반복 입력 가능하도록 프로그램 변경하기
	
		while(true)
		{
			System.out.println("월을 입력하세요.");
			System.out.print(">");
			int month=scanner.nextInt();
			if(month==-1)
			{
				System.out.println("Have a nice day!");
				break;
			}
			System.out.println(month+"월은"+maxDays[month-1]+"있습니다.");
		}
		scanner.close();
	}
} 
