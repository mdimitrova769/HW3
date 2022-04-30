package Button;

import Lightbulb.Lightbulb;

public class Switch {
	
	private boolean switchTurn = false;
	Lightbulb lightBody;
	
	public Switch() {
		System.out.println("Switch created");
	}
	
	public Switch(Lightbulb lightBody) {
		super();
		this.lightBody = lightBody;
	}
	
	public void setSwitchTurn(boolean turn) {
		switchTurn = turn;
	}
	
	public boolean getSwitchTurn() {
		return this.switchTurn;
	}
	
	public Lightbulb getLightBulb() {
		return lightBody;
	}
	
	public void pushButton() {
		if (lightBody.equals(null)) {
			lightBody.off();
		}
		else {
			lightBody.on();
		}
	}
	
	public void switchTurnOn() {
		setSwitchTurn(true);
	}
	
	public void switchTurnOff() {
		setSwitchTurn(false);
	}
	

}
