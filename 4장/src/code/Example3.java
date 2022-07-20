package code;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int times;
		
		for(dan=2;dan<=9;dan++)
		{
			if(dan%2==0)
			{
				for(times=1;times<=9;times++)
				{
					System.out.println(dan+"X"+times+"="+dan*times);
				}
				System.out.println();
			}
		}
	}

}
