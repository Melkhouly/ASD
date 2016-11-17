
public class MediumSpeed implements State {

	
	
	CeilingFan ceilingFan;
	
	public MediumSpeed(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}

	
	@Override
	public void pullgreen() {
		ceilingFan.setState(ceilingFan.getHighSpeed());
		System.out.println("High Speed");

	}

	@Override
	public void pullred() {
		ceilingFan.setState(ceilingFan.getLowSpeed());
		System.out.println("Low Speed");

	}

}
