package code;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int k;
		
		for(i=1;i<=7;i+=2)
		{
			for(k=0;k<(7-i)/2;k++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				
				System.out.print("* ");
			
			}
			System.out.println("");
		}
	}

}
