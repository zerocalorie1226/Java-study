package staticex;

public class Student {
	public static int serialNum=1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student() {
		serialNum++;
		studentId=serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}
	
	
}
