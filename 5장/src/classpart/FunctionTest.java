package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20;
		int num2=10;
		
		int sum1= add(num1,num2);
		System.out.println(num1+"+"+num2+"="+sum1+"입니다.");
		int sum2= sub(num1,num2);
		System.out.println(num1+"-"+num2+"="+sum2+"입니다.");
		int sum3= mul(num1,num2);
		System.out.println(num1+"*"+num2+"="+sum3+"입니다.");
		int sum4= div(num1,num2);
		System.out.println(num1+"/"+num2+"="+sum4+"입니다.");
	}

	public static int add(int num1,int num2) {
		int result=num1+num2;
		return result;
	}
	public static int sub(int num1,int num2) {
		int result=num1-num2;
		return result;
	}
	public static int mul(int num1,int num2) {
		int result=num1*num2;
		return result;
	}
	public static int div(int num1,int num2) {
		int result=num1/num2;
		return result;
	}
	
	
	
	
}
