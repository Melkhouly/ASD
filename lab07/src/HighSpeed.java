
public class HighSpeed implements State {

	
	
	CeilingFan ceilingFan;
	
	public HighSpeed(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}

	
	
	@Override
	public void pullgreen() {
		ceilingFan.setState(ceilingFan.getTurnOff());
		System.out.println("turn Off");


	}

	@Override
	public void pullred() {
		ceilingFan.setState(ceilingFan.getMediumSpeed());
		System.out.println("Medium Speed");

	}

}
