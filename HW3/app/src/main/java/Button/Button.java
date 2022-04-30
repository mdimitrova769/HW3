package Button;

import Lightbulb.Lightbulb;

public class Button extends Switch{
	String created;
	public Button() {
		System.out.println("Button created");
		created = "Button created";
	}
	public Button(Lightbulb lightBody) {
		super(lightBody);
	}
	
	public String getCreated() {
		return created; 
	}
	
	public void switchOn() {
		super.switchTurnOn();
		System.out.println("Button switched ON");
		created = "Button switched ON";
	}
	public void switchOff() {
		super.switchTurnOff();
		System.out.println("Button switched OFF");
		created = "Button switched OFF";
	}
}