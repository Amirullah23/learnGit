package Car;

public class Mitsubishi extends Car {

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> accelerate()";
	}

	@Override
	public String breake() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " -> breake()";
	}
	
	

	
}
