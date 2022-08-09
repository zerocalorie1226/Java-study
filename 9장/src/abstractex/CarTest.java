package abstractex;

public class CarTest {

	public static void main(String[] args) {
		Bus bus=new Bus();
		AutoCar autoCar=new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refue();
		autoCar.refue();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
	}

}
