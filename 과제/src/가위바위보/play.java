package 가위바위보;
import java.util.Scanner;
public class play {

	public static void main(String[] args) {
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("가위바위보 중 하나를 선택해주세요.");
		
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		
		int num=(int)(Math.random()*3);
		
		String[] arr= {"가위","바위","보"};
		System.out.println(arr[num]);
		
		switch(a) {
		case "가위":
			if(arr[num]=="가위") {
				System.out.println("비겼습니다.");
			}
			else if(arr[num]=="바위") {
				System.out.println("졌습니다.");
			}
			else if(arr[num]=="보") {
				System.out.println("이겼습니다.");
			}
			break;
		case "바위":
			if(arr[num]=="가위") {
				System.out.println("이겼습니다.");
			}
			else if(arr[num]=="바위") {
				System.out.println("비겼습니다.");
			}
			else if(arr[num]=="보") {
				System.out.println("졌습니다.");
			}
			break;
		case "보":
			if(arr[num]=="가위") {
				System.out.println("졌습니다.");
			}
			else if(arr[num]=="바위") {
				System.out.println("이겼습니다.");
			}
			else if(arr[num]=="보") {
				System.out.println("비겼습니다.");
			}
			break;
		}
	}
}
