package Exam;

public class English {
	int score;
	int total;
	int average;
	String grade;
	
	public int EngAvg() {
		Random random=new Random();
		int EngScore[]=new int[100];
		for(int i=0;i<EngScore.length;i++) {
			EngScore[i]=random.getRandomScore();
			total+=EngScore[i];
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
		return "영어점수 평균은 "+EngAvg()+"이고 성적은 "+grade()+"이다.";
	}
}
