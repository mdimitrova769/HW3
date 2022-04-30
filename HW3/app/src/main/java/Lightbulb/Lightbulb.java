package Lightbulb;

import Button.Button;

public class Lightbulb extends Button{
	private boolean bulbOn = false;
	String created;
	
	public Lightbulb() {
		System.out.println("Lightbulb created");
		created = "Lightbulb created";
	}
	
	public boolean getBulbOn() {
		return this.bulbOn;
	}
	
	public String getCreated() {
		return this.created;
	}
	
	public void setBulb(boolean turn) {
		this.bulbOn = turn;
	}
	public void on() {
		System.out.println("Lightbulb on");
		this.setBulb(true);
		created = "Lightbulb on";
	}
	public void off() {
		System.out.println("Lightbulb off");
		this.setBulb(false);
		created = "Lightbulb off";
	}
}
