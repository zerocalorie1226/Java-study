package Exercise;

public class Person {
	public String name;
	public String coffeeMenu;
	public int money;
	
	public Person(String name,String coffeeMenu,int money) {
		this.coffeeMenu=coffeeMenu;
		this.name=name;
		this.money=money;
	}	
	
	public void buyStar(Star star) {
		star.buy(4000);
		this.money-=4000;
	}
	public void buyBeen(Been been) {
		been.buy(4500);
		this.money-=4500;
	}
	public void showInfo() {
		System.out.println(name+"씨의 커피는 "+coffeeMenu+"이고 남은 돈은"+money+"입니다");
	}
	
}
