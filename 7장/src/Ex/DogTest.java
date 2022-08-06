package Ex;
import java.util.ArrayList;

import array.Book;

public class DogTest {

	public static void main(String[] args) {
		ArrayList<Dog> dog= new ArrayList<Dog>();
		
		dog.add(new Dog("진돗개","성찬"));
		dog.add(new Dog("삽살개","승현"));
		dog.add(new Dog("치와와","민규"));
		dog.add(new Dog("말티즈","현석"));
		dog.add(new Dog("똥개","제현"));
	
		for(int i=0;i<dog.size();i++) {
			Dog ddog=dog.get(i);
			ddog.showDogInfo();
		}
		System.out.println();
		
		
		System.out.println("===향상된 for문 사용===");
			for(Dog ddog:dog) {
				ddog.showDogInfo();
		}
	}

}
