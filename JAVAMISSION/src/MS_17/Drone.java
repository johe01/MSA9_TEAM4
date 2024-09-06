package MS_17;

public class Drone implements RemoteControl{

	double battery;
	double speed;
	
	@Override
	public void on() {
		System.out.println("Drone 전원을 켰습니다.");
	}

	@Override
	public void off() {
		System.out.println("Drone 전원을 껐습니다.");
	}

	@Override
	public void setSpeed(int speed) {
		// 최대 속력을 초과하지 못하게 지정
			if( speed > RemoteControl.MAX_SPEED) {
				this.speed = RemoteControl.MAX_SPEED;
				System.err.println("이 속력("+speed+")은 최대 속력(200)을 넘어섰습니다.");
			}
			// 최저 속력 미만이 되지 않도록 지정
			else if(speed < RemoteControl.MIN_SPEED) {
				this.speed = RemoteControl.MIN_SPEED;
				System.err.println("이 속력("+speed+")은 최저 속력(0)을 넘어섰습니다.");
			}
			else {
				this.speed = speed;
			}
			System.out.println("Drone 현재 속도 : " + this.speed);
	}

	@Override
	public void changeBattery() {
		System.out.println("Drone의 배터리를 교체하였습니다.");
	}

}
