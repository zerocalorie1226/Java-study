package Bank;

import java.util.Scanner;

public class bankTest {

	public static void main(String[] args) {
		int bankBook=0;
		
		while (true){
			System.out.println("----------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("----------------------");
			System.out.println("����>");
			Scanner scanner = new Scanner(System.in);
			int choose=scanner.nextInt();
			
			switch(choose) {
				case 1:
					System.out.println("���ݾ�");
					int moneySaving=scanner.nextInt();
					bankBook+=moneySaving;
					break;
				case 2:
					System.out.println("��ݾ�");
					int moneyWithDraw=scanner.nextInt();
					bankBook-=moneyWithDraw;
					break;
				case 3:
					System.out.println("�ܾ���"+bankBook+"�Դϴ�.");
					break;
				case 4:
					System.out.println("���α׷� ����");
					break;
			}
			if(choose==4)
				break;
			
		}
	}

}
