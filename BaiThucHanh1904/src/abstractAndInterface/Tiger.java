package abstractAndInterface;

public class Tiger extends Animal {

	@Override
	void Eat() {
		System.out.println("nom nom");
		
	}

	@Override
	void Sleep() {
		System.out.println("Zzz Zzz");
		
	}

	@Override
	void Walk() {
		System.out.println("Walking....");
		
	}

	@Override
	void Run() {
		System.out.println("Running");
		
	}

	@Override
	void Roar() {
		System.out.println("uWu");
		
	}
	public static void main(String[] args) {
		Animal a1=new Tiger();
		a1.Eat();
	}
}
