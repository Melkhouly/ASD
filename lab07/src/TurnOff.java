
public class TurnOff implements State {

	
	
	CeilingFan ceilingFan;
	
	public TurnOff(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}

	
	@Override
	public void pullgreen() {
		ceilingFan.setState(ceilingFan.getLowSpeed());
		System.out.println("Low Speed");

	}

	@Override
	public void pullred() {
		ceilingFan.setState(ceilingFan.getHighSpeed());
		System.out.println("High Speed");

	}

}
