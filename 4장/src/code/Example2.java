package code;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=10;
		char operator='+';
		
		switch(operator) 
		{
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		default:
			System.out.println(num1/num2);
		}
	}

}
