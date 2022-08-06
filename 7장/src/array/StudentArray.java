package array;

public class StudentArray {

	public static void main(String[] args) {
		Student stu[]=new Student[3];
		
		int num=1001;
		
		stu[0] =new Student(num,"James");num++;
		stu[1] =new Student(num,"Tomas");num++;
		stu[2] =new Student(num,"Edward");num++;
		
		for(int i=0;i<stu.length;i++) {
			stu[i].showStudentInfo();
		}

		
		
	}

}
