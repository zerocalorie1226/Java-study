package Bank;

import java.util.Scanner;

public class bankTest {

	public static void main(String[] args) {
		int bankBook=0;
		
		while (true){
			System.out.println("----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------");
			System.out.println("선택>");
			Scanner scanner = new Scanner(System.in);
			int choose=scanner.nextInt();
			
			switch(choose) {
				case 1:
					System.out.println("예금액");
					int moneySaving=scanner.nextInt();
					bankBook+=moneySaving;
					break;
				case 2:
					System.out.println("출금액");
					int moneyWithDraw=scanner.nextInt();
					bankBook-=moneyWithDraw;
					break;
				case 3:
					System.out.println("잔액은"+bankBook+"입니다.");
					break;
				case 4:
					System.out.println("프로그램 종료");
					break;
			}
			if(choose==4)
				break;
			
		}
	}

}
