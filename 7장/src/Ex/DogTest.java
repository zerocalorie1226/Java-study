package Ex;
import java.util.ArrayList;

import array.Book;

public class DogTest {

	public static void main(String[] args) {
		ArrayList<Dog> dog= new ArrayList<Dog>();
		
		dog.add(new Dog("������","����"));
		dog.add(new Dog("��찳","����"));
		dog.add(new Dog("ġ�Ϳ�","�α�"));
		dog.add(new Dog("��Ƽ��","����"));
		dog.add(new Dog("�˰�","����"));
	
		for(int i=0;i<dog.size();i++) {
			Dog ddog=dog.get(i);
			ddog.showDogInfo();
		}
		System.out.println();
		
		
		System.out.println("===���� for�� ���===");
			for(Dog ddog:dog) {
				ddog.showDogInfo();
		}
	}

}
