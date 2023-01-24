package Weeks3_day01;

public class Test {

	public static void main(String[] args) {
		Student studentEunsu = new Student();
		studentEunsu.setStudentName("최은수");
		studentEunsu.setAddress("창원시 봉곡동");
		
//		studentEunsu.showStudentInfo();
		System.out.println(studentEunsu.getStudentName());
		System.out.println(studentEunsu.getGrade());
		System.out.println(studentEunsu.getAddress());
		
	}

}
