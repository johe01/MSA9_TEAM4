package MS_17;

public class Driver {

	public static void main(String[] args) {
		RemoteControl rc;
		RemoteControl dr;
		
		rc = new RcCar();
		dr = new Drone();
		
		rc.on();
		rc.setSpeed(45);
		rc.changeBattery();
		rc.off();
		
		dr.on();
		dr.setSpeed(70);
		dr.changeBattery();
		dr.off();
		rc.on();
		dr.setSpeed(230);
	}
}
