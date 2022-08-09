package Exam;

public class math {
	int score;
	int total;
	int average;
	String grade;
	
	public int MathAvg() {
		Random random=new Random();
		int MathScore[]=new int[100];
		for(int i=0;i<MathScore.length;i++) {
			MathScore[i]=random.getRandomScore();
			total+=MathScore[i];
		}
		average=total/100;
		return average;
	}
	public String grade() {
		if(average>=90) {
			grade="A";
		}
		else if(average>=80) {
			grade="B";
		}
		else if(average>=70) {
			grade="C";
		}
		else if(average>=60) {
			grade="D";
		}
		else {
			grade="F";
		}
		
		return grade;
	}
	
	public String ShowKorGrade() {
		return "수학점수 평균은 "+MathAvg()+"이고 성적은 "+grade()+"이다.";
	}
}