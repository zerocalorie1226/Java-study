package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		Student3 studentLee=new Student3();
		studentLee.setStudentName("������");
		System.out.println(Student3.serialNum);
		System.out.println(studentLee.studentName+"�й�:"+studentLee.studentId);
		

		Student3 studentSon=new Student3();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student3.serialNum);
		System.out.println(studentSon.studentName+"�й�:"+studentSon.studentId);
	}

}
