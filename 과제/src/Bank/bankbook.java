package Bank;

public class bankbook {
	public int money;
	
	public void saving(int money) {
		this.money+=money;
		System.out.println("예금액");
			
	}
	
	public void withdraw(int money) {
		this.money-=money;
		System.out.println("출금액");
		
		
	}
	public void showInfo() {
		System.out.println("잔액은"+money+"입니다.");
	}
}
