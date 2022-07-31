package staticex;

public class Student3 {
	static int serialNum=1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student3() {
		serialNum+=100;
		studentId=serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}
	
	public static int getSerialNum() {
		int i=10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum=serialNum;
	}
}
