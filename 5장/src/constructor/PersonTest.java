package constructor;

public class PersonTest {

	public static void main(String[] args) {
	Person person1= new Person();
	person1.name="������1";
	person1.height=191;
	person1.weight=87;
							
	
		
	Person person2= new Person("������2",190,86);
	
	System.out.println(person1.name);
	System.out.println(person1.height);
	System.out.println(person1.weight);
	
	System.out.println(person2.name);
	System.out.println(person2.height);
	System.out.println(person2.weight);

	}

}
