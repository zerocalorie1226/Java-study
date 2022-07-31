package Exercise;

public class CoffeeTest {

	public static void main(String[] args) {
		Person personKim =new Person("김","아메리카노",4000);
		Person personLee =new Person("이","라떼",4500);
		
		Star starCoffee=new Star("아메리카노");
		personKim.buyStar(starCoffee);
		personKim.showInfo();
		
		Been beenCoffee=new Been("아메리카노");
		personLee.buyBeen(beenCoffee);
		personLee.showInfo();
		
		
	}

}
