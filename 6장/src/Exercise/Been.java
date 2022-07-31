package Exercise;

public class Been {
	String name;
	String coffeeMenu;
	int money;
	
	public Been(String coffeeMenu) {
		this.coffeeMenu=coffeeMenu;
	}
	public void buy(int money) {
		this.money-=money;
		
	}
	
}
