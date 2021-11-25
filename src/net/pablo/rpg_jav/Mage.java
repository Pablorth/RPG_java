package net.pablo.rpg_jav;

public class Mage extends Champion {
	
	private int health;
	private int cat = 2;
	
	
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
	
	
	public int getCat() {
		return cat;
	}


	public void setCat(int cat) {
		this.cat = cat;
	}


	@Override
	public void protect(int damage) {
		this.setMaxHealth(this.getMaxHealth() - (damage/2));
	}

	@Override
	public void heal(int heal) {
		this.setMaxHealth(this.getHealth() + heal);

	}

	@Override
	public void damage(int damage) {
		this.setMaxHealth(this.getMaxHealth() - damage);

	}


}
