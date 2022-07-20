package code;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int times;
		
		for(dan=2;dan<=9;dan++)
		{
			
			for(times=1;times<=9;times++)
			{
				if(times>dan)
					{
						continue;
					}
				System.out.println(dan+"X"+times+"="+dan*times);
			}
			System.out.println();
			
		}
	}

}
