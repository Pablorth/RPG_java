package net.pablo.rpg_jav;

public class Mage extends Champion {
	
	private int health;
	
	public Mage(String name, int maxHealth, int atk) {
		super(name, maxHealth, atk);
		this.setHealth(health);
	}

	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	

	@Override
	public void protect(int damage) {
		this.setHealth(this.getHealth() - (damage/2));
	}

	@Override
	public void heal(int heal) {
		this.setHealth(this.getHealth() + heal);

	}

	@Override
	public void damage(int damage) {
		this.setHealth(this.getHealth() - damage);

	}







	

}
