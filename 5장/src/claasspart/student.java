package claasspart;

public class student {
	int studentID;
	static String studentname="ȫ����";
	int grade;
	static String address="����";
	
	public static void showStudentInfo() {
		System.out.println(studentname+","+address);
	}
	public static void main(String[] args) {
		showStudentInfo();
	}
}
