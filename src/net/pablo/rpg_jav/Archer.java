package net.pablo.rpg_jav;

public class Archer extends Champion {
	
	private int health;
	private int cat = 3;

	public Archer(String name, int maxHealth, int atk) {
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
		this.setHealth(this.getHealth() - (damage/2));
	}

	
	@Override
	public void heal(int heal) {
		System.out.println("Je ne sais pas me soigner!");
		
	}

	@Override
	public void damage(int damage) {
		this.setHealth(this.getHealth() - (damage*2));
	}


	


	
	
}
