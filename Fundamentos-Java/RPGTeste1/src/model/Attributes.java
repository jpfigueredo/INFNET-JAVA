package model;

import features.Mental;
import features.Phisycal;
import features.Social;

public class Attributes extends Characters{

	private Phisycal phisycal;
	private Social social;
	private Mental mental;
	
	public Attributes() {}
	
	public Attributes(Phisycal phisycal, Social social, Mental mental) {
		this.phisycal = phisycal;
		this.social = social;
		this.mental = mental;
	}

	
	public Phisycal getPhisycal() {
		return phisycal;
	}
	public void setPhisycal(Phisycal phisycal) {
		this.phisycal = phisycal;
	}

	public Social getSocial() {
		return social;
	}
	public void setSocial(Social social) {
		this.social = social;
	}

	public Mental getMental() {
		return mental;
	}
	public void setMental(Mental mental) {
		this.mental = mental;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(super.toString());
		sb.append("\n");
		sb.append("Attributes: ");
		sb.append("\n");
		sb.append(phisycal);
		sb.append("\n");
		sb.append(social);
		sb.append("\n");
		sb.append(mental);
		
		return sb.toString();
	}
	
}
