package claasspart;

public class student {
	int studentID;
	String studentname="È«½ÂÇö";
	int grade;
	String address="ÆÄÁÖ";
	
	public static void showStudentInfo() {
		System.out.println(studentname+","+address);
	}
	public static void main(String[] args) {
		showStudentInfo();
	}
}
