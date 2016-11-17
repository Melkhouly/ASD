
public class CeilingFan {
	State lowSpeed;
	State highSpeed;
	State mediumSpeed;
	State turnOff;
	
	State state;
	
	CeilingFan(){
		
		lowSpeed = new LowSpeed(this);
		highSpeed = new HighSpeed(this);
		mediumSpeed = new MediumSpeed(this);
		turnOff = new TurnOff(this);		
		state = turnOff;
		
	}
	
	
	public void pullgreen() {
		state.pullgreen();

	}

	public void pullred() {
		state.pullred();

	}
	

	public State getLowSpeed() {
		return lowSpeed;
	}

	public void setLowSpeed(State lowSpeed) {
		this.lowSpeed = lowSpeed;
	}

	public State getHighSpeed() {
		return highSpeed;
	}

	public void setHighSpeed(State highSpeed) {
		this.highSpeed = highSpeed;
	}

	public State getMediumSpeed() {
		return mediumSpeed;
	}

	public void setMediumSpeed(State mediumSpeed) {
		this.mediumSpeed = mediumSpeed;
	}

	public State getTurnOff() {
		return turnOff;
	}

	public void setTurnOff(State turnOff) {
		this.turnOff = turnOff;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	
	
}
