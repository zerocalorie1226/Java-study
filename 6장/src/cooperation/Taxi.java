package cooperation;

public class Taxi {
	int passengerCount;
	int money;
	
public void take(int money) {
	this.money+=money;
	passengerCount++;
	}
public void showInfo() {
	System.out.println("�ý��� �°���"+passengerCount+"���̰�, ������"+money+"�Դϴ�.");
	}
}
