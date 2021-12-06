package model;

public class Status extends Characters{
	
	private int health;
	private int mana;
	private int willpower;
	private String weakness;
	
	public Status(int health, int mana, int willpower, String weakness) {
		this.health = health;
		this.mana = mana;
		this.willpower = willpower;
		this.weakness = weakness;
	}
	
	public String healthStatus(int health) { return health<=0 ? "Character is Dead!" : "Character is Alive!"; }
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getWillpower() {
		return willpower;
	}
	public void setWillpower(int willpower) {
		this.willpower = willpower;
	}

	public String getWeakness() {
		return weakness;
	}
	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(" ; ");
		sb.append(health);		
		sb.append(" ; ");
		sb.append(mana);
		sb.append(" ; ");
		sb.append(willpower);
		sb.append(" ; ");
		sb.append(weakness);
		sb.append(" ; ");
		healthStatus(health);		

		return sb.toString();
	}

}
