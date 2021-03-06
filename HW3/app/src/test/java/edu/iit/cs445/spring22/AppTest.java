/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.iit.cs445.spring22;

import org.junit.jupiter.api.Test;

import Button.Button;
import Button.PushButton;
import Lightbulb.Lightbulb;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    
	@Test
	void testCreateButton() {
		Button button = new Button();
		assertEquals(button.getCreated(), "Button created");
	}
	
	@Test
	void testCreateButtonObject() {
		Lightbulb l = new Lightbulb();
		Button button = new Button(l);
		assertEquals(button.getLightBulb(), l);
	}
	
	@Test
	void testSwitchOn() {
		Lightbulb l = new Lightbulb();
		Button button = new Button(l);
		button.switchOn();
		assertEquals(button.getCreated(), "Button switched ON");
	}
	
	@Test
	void testSwitchOff() {
		Lightbulb l = new Lightbulb();
		Button button = new Button(l);
		button.switchOff();
		assertEquals(button.getCreated(), "Button switched OFF");
	}

	
	@Test
	void testCreatePushButton() {
		PushButton button = new PushButton();
		assertEquals(button.getCreated(), "PushButton created");
	}
	
	@Test
	void testPushPushButtonTrue() {
		PushButton button = new PushButton();
		button.setSwitchTurn(true);
		button.pushButton();
		assertEquals(button.getCreated(), "PushButton on");
	}
	
	@Test
	void testPushPushButtonFalse() {
		PushButton button = new PushButton();
		button.setSwitchTurn(false);
		button.pushButton();
		assertEquals(button.getCreated(), "PushButton off");
	}
	
	@Test
	void testLightbulb() {
		Lightbulb l = new Lightbulb();
		assertEquals(l.getCreated(), "Lightbulb created");
	}
	
	@Test
	void testLightbulbOn() {
		Lightbulb l = new Lightbulb();
		l.on();
		assertEquals(l.getCreated(), "Lightbulb on");
	}
	
	@Test
	void testLightbulbOff() {
		Lightbulb l = new Lightbulb();
		l.off();
		assertEquals(l.getCreated(), "Lightbulb off");
	}
}
