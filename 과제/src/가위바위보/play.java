package ����������;
import java.util.Scanner;
public class play {

	public static void main(String[] args) {
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("���������� �� �ϳ��� �������ּ���.");
		
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		
		int num=(int)(Math.random()*3);
		
		String[] arr= {"����","����","��"};
		System.out.println(arr[num]);
		
		switch(a) {
		case "����":
			if(arr[num]=="����") {
				System.out.println("�����ϴ�.");
			}
			else if(arr[num]=="����") {
				System.out.println("�����ϴ�.");
			}
			else if(arr[num]=="��") {
				System.out.println("�̰���ϴ�.");
			}
			break;
		case "����":
			if(arr[num]=="����") {
				System.out.println("�̰���ϴ�.");
			}
			else if(arr[num]=="����") {
				System.out.println("�����ϴ�.");
			}
			else if(arr[num]=="��") {
				System.out.println("�����ϴ�.");
			}
			break;
		case "��":
			if(arr[num]=="����") {
				System.out.println("�����ϴ�.");
			}
			else if(arr[num]=="����") {
				System.out.println("�̰���ϴ�.");
			}
			else if(arr[num]=="��") {
				System.out.println("�����ϴ�.");
			}
			break;
		}
	}
}
