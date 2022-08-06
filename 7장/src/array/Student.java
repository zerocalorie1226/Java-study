package array;

public class Student {
	private int studentId;
	private String name;
	
	public Student() {}
	
	public Student(int studentId,String name) {
		this.studentId=studentId;
		this.name=name;
	}
	
	public int getStudentId(){
		return studentId;
	}
	
	public void setStudentId() {
		this.studentId=studentId;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName() {
		this.name=name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentId+","+name);
	}
}
