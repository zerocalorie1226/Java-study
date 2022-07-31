package Exercise;

public class Star {
	String name;
	String coffeeMenu;
	int money;
	
	public Star(String coffeeMenu) {
		this.coffeeMenu=coffeeMenu;
	}
	public void buy(int money) {
		this.money-=money;
		
	}
	
}
