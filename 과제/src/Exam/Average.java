package Exam;

public class Average {

	public static void main(String[] args) {
		int score1[]=new int[100]; //국어
		int score2[]=new int[100]; //수학
		int score3[]=new int[100]; //영어
		int average[]=new int[100];
		String grade[]=new String[100];
		int student=0;
		
		for(int i=0;i<score1.length;i++) {				//국어점수 100개 받기
			score1[i]=(int)(Math.random()*100)+1; 
		}
		for(int i=0;i<score2.length;i++) {				//수학점수 100개 받기
			score2[i]=(int)(Math.random()*100)+1;
		}
		for(int i=0;i<score3.length;i++) {				//영어점수 100개 받기
			score3[i]=(int)(Math.random()*100)+1;
		}
		
		for(int i=0;i<average.length;i++) {				//평균 구하기
			average[i]=(score1[i]+score2[i]+score3[i])/3;
		}
	
		while(student<100) {							//성적 분배
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
			System.out.println(i+"번째 학생의 성적은 "+grade[i-1]+"입니다.");
		}
	}

}
