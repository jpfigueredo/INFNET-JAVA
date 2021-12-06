package features;

import exception.InvalidInputException;
import exception.InvalidNameException;
import model.Attributes;

public class Phisycal extends Attributes{
	
	private int strength;
	private int dexterity;
	private int stamina;
			
	public Phisycal(int strength, int dexterity, int stamina) throws InvalidInputException, InvalidNameException {
		this.strength = strength;
		this.dexterity = dexterity;
		this.stamina = stamina;
	}

	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Phisycal [strength=");
		builder.append(strength);
		builder.append(", dexterity=");
		builder.append(dexterity);
		builder.append(", stamina=");
		builder.append(stamina);
		builder.append("]");
		return builder.toString();
	}
	
}
