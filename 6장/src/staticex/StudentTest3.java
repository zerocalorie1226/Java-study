package staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		Student studentLee=new Student();
		studentLee.setStudentName("������");
		System.out.println(Student.serialNum);
		System.out.println(studentLee.studentName+"�й�:"+studentLee.studentId);
		

		Student studentSon=new Student();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student.serialNum);
		System.out.println(studentSon.studentName+"�й�:"+studentSon.studentId);
	}
	

}
