package Button;

import Lightbulb.Lightbulb;

public class PushButton extends Switch{
	
	private boolean state;
	private String created;
	
	public PushButton() {
		System.out.println("PushButton created");
		created = "PushButton created";
	}
	
	public PushButton(Lightbulb lightBody1) {
		super(lightBody1);
	}
	
	public String getCreated() {
		return this.created;
	}
	
	public void pushButton() {
		if (this.getSwitchTurn())
		{
			this.setSwitchTurn(true);
			System.out.println("PushButton on");
			created = "PushButton on";
		}
		else
		{
			this.setSwitchTurn(false);
			System.out.println("PushButton off");
			created = "PushButton off";
		}
	}
}
