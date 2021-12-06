package features;

import model.Attributes;

public class Mental extends Attributes{
	
	private int perception;
	private int intelligence;
	private int wits;
	
	public Mental(int perception, int intelligence, int wits) {
		super();
		this.perception = perception;
		this.intelligence = intelligence;
		this.wits = wits;
	}
	
	public int getPerception() {
		return perception;
	}
	public void setPerception(int perception) {
		this.perception = perception;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getWits() {
		return wits;
	}
	public void setWits(int wits) {
		this.wits = wits;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mental [perception=");
		builder.append(perception);
		builder.append(", intelligence=");
		builder.append(intelligence);
		builder.append(", wits=");
		builder.append(wits);
		builder.append("]");
		return builder.toString();
	}	
	
}
