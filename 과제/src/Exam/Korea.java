package Exam;

public class Korea {
	int score;
	int total;
	int average;
	String grade;
	
	public int korAvg() {
		Random random=new Random();
		int korScore[]=new int[100];
		for(int i=0;i<korScore.length;i++) {
			korScore[i]=random.getRandomScore();
			total+=korScore[i];
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
		return "국어점수 평균은 "+korAvg()+"이고 성적은 "+grade()+"이다.";
	}
}
