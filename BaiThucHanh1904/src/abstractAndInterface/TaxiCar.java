package abstractAndInterface;

class TaxiCar implements Car {
	
	@Override
	public void Move() {
		System.out.println("Moving...");
		
	}

	@Override
	public void Stop() {
		System.out.println("Stoping....");
		
	}

	@Override
	public void TurnRight() {
		System.out.println("Turning right");
	}

	@Override
	public void TurnLeft() {
		System.out.println("turning left");
	}

	@Override
	public void Reverse() {
		System.out.println("reverse..");
		
	}
	public static void main(String[] args) {
		TaxiCar tc=new TaxiCar();
		tc.Move();
	}
}
