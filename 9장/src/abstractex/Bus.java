package abstractex;

public class Bus extends Car{
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	@Override
	public void refue() {
		System.out.println("õ�� ������ �����մϴ�.");
	}
	public void takePassenger(){
		System.out.println("�°��� ������ �¿�ϴ�.");
	}
}
