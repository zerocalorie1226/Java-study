package Bank;

public class bankbook {
	public int money;
	
	public void saving(int money) {
		this.money+=money;
		System.out.println("���ݾ�");
			
	}
	
	public void withdraw(int money) {
		this.money-=money;
		System.out.println("��ݾ�");
		
		
	}
	public void showInfo() {
		System.out.println("�ܾ���"+money+"�Դϴ�.");
	}
}
