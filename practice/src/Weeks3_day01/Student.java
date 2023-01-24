package Weeks3_day01;

//클래스 생성
public class Student {

	private int studentId; //학번
	private String studentName; // 학생 이름
	private int grade; // 학년
	private String address; // 사는 곳
	
	public Student() {
		this.studentId = 0;
		this.studentName = "";
		this.grade = 1;
		this.address = "창원시";
	}
	
	public Student(int studentId, String studentName, int grade, String address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}
	
	public void showStudentInfo(){
		System.out.println(studentName + ", " + address);
	}

	/*
	 * 마우스 우클릭 -> Source -> Generate Getter and Setter -> all check
	 */
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
