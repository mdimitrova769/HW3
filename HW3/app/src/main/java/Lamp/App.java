/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Lamp;

import Button.Button;
import Button.PushButton;
import Button.Switch;
import Lightbulb.Lightbulb;

public class App {
	
	public static void main(String[] args) {
		Button button = new Button();
		button.switchOn();
		button.switchOff();
		
		Lightbulb l = new Lightbulb();
		Button button1 = new Button(l);
		
		l.setBulb(true);
		l.off();
		l.on();
	
		PushButton pushButton = new PushButton();
		pushButton.setSwitchTurn(true);
		pushButton.pushButton();
		pushButton.setSwitchTurn(false);
		pushButton.pushButton();
	
		Switch switchObj = new Switch();

		
	}

}
