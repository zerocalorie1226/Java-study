package Exam;

public class Average {

	public static void main(String[] args) {
		int score1[]=new int[100]; //����
		int score2[]=new int[100]; //����
		int score3[]=new int[100]; //����
		int average[]=new int[100];
		String grade[]=new String[100];
		int student=0;
		
		for(int i=0;i<score1.length;i++) {				//�������� 100�� �ޱ�
			score1[i]=(int)(Math.random()*100)+1; 
		}
		for(int i=0;i<score2.length;i++) {				//�������� 100�� �ޱ�
			score2[i]=(int)(Math.random()*100)+1;
		}
		for(int i=0;i<score3.length;i++) {				//�������� 100�� �ޱ�
			score3[i]=(int)(Math.random()*100)+1;
		}
		
		for(int i=0;i<average.length;i++) {				//��� ���ϱ�
			average[i]=(score1[i]+score2[i]+score3[i])/3;
		}
	
		while(student<100) {							//���� �й�
			if(average[student]>=90) {
				grade[student]="A";
				student++;
				continue;
			}
			else if(average[student]>=80) {
				grade[student]="B";
				student++;
				continue;
			}
			else if(average[student]>=70) {
				grade[student]="C";
				student++;
				continue;
			}
			else if(average[student]>=60) {
				grade[student]="D";
				student++;
				continue;
			}
			else {
				grade[student]="F";
				student++;
				continue;
			}
		}
		for(int i=1;i<=grade.length;i++) {
			System.out.println(i+"��° �л��� ������ "+grade[i-1]+"�Դϴ�.");
		}
	}

}
