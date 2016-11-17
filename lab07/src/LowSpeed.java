
public class LowSpeed implements State {

	
	CeilingFan ceilingFan;
	
	public LowSpeed(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void pullgreen() {
		ceilingFan.setState(ceilingFan.getMediumSpeed());
		System.out.println("Medium Speed");


	}

	@Override
	public void pullred() {
		ceilingFan.setState(ceilingFan.getTurnOff());
		System.out.println("Turn Off");

	}

}
