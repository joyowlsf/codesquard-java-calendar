package yong.calendar;
import java.util.Scanner;
public class Calendar {
	
	public static void Monthprint28() {
		System.out.println("일 월 화 수 목 금 토 일");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void Monthprint30()
	{
		System.out.println("일 월 화 수 목 금 토 일");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 ");
	}
	
	public static void Monthprint31()
	{
		System.out.println("일 월 화 수 목 금 토 일");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 31 ");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
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
			else if(month==2)
			{
				Monthprint28();
			}
			else if(month==4||month==6||month==9||month==11)
			{
				Monthprint30();
			}
			else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			{
				Monthprint31();
			}
			else if(month==-1)
			{
				break;
			}
		}
		scanner.close();
	}
} 
