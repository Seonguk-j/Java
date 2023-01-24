package Week3_day01_new;

public class Student {

	String studentName;
	int grade;
	int money;
	boolean rideStatus;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
		rideStatus = false;
	}
	
	public boolean takeBus(Bus bus) {
		if(isRideStatus()) {
			System.out.println("교통을 이용하고 있는 상태입니다.");
			return false;
		}
		else {
			System.out.println("bus 탑승");
			bus.take(this.studentName, 1000);
			money -= 1000;
			this.rideStatus = true;
			return true;
		}
	}
	
	public void takeOffRide() {
		this.rideStatus = false;
	}
	
	public boolean takeSubway(Subway subway) {
		if(isRideStatus()) {
			System.out.println("교통을 이용하고 있는 상태입니다.");
			return false;
		}
		else {
			System.out.println("subway 탑승");
			subway.take(this.studentName, 1200);
			money -= 1200;
			this.rideStatus = true;
			return true;
		}
	}
	
	public void printInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
	
	private boolean isRideStatus() {
		return this.rideStatus ? true : false;
	}

}
