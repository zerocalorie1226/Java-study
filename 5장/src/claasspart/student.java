package claasspart;

public class student {
	int studentID;
	String studentname="ȫ����";
	int grade;
	String address="����";
	
	public static void showStudentInfo() {
		System.out.println(studentname+","+address);
	}
	public static void main(String[] args) {
		showStudentInfo();
	}
}
