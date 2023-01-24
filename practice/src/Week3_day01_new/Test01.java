package Week3_day01_new;

public class Test01 {

	public static void main(String[] args) {
		Student eunsu = new Student("eunsu", 5000);
		
		Bus bus101 = new Bus(101);
		Bus bus102 = new Bus(102);
//		Bus bus103 = new Bus(103);
//		Bus bus104 = new Bus(104);
//		Bus bus105 = new Bus(105);		
//		
//		System.out.println(bus101.getAllOfBusCount());
//		System.out.println(bus102.getAllOfBusCount());
//		System.out.println(bus103.getAllOfBusCount());
//		System.out.println(bus104.getAllOfBusCount());
//		System.out.println(bus105.getAllOfBusCount());

		Subway subway01 = new Subway(1);
		
		eunsu.takeBus(bus101);
		
		eunsu.takeSubway(subway01);
		eunsu.printInfo();
		System.out.println();
		
		bus101.printInfo();
		System.out.println();
		
		subway01.printInfo();
	}

}
