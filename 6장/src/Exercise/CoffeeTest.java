package Exercise;

public class CoffeeTest {

	public static void main(String[] args) {
		Person personKim =new Person("��","�Ƹ޸�ī��",4000);
		Person personLee =new Person("��","��",4500);
		
		Star starCoffee=new Star("�Ƹ޸�ī��");
		personKim.buyStar(starCoffee);
		personKim.showInfo();
		
		Been beenCoffee=new Been("�Ƹ޸�ī��");
		personLee.buyBeen(beenCoffee);
		personLee.showInfo();
		
		
	}

}
