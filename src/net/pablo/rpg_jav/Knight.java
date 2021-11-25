package net.pablo.rpg_jav;

public class Knight extends Champion {

	private int health;

	public Knight(String name, int health, int atk) {
		super(name, health, atk);
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
		this.setHealth(this.getHealth() - 0);
	}

	@Override
	public void heal(int heal) {
		System.out.println("Je ne sais pas me soigner!");
	}
	
	@Override
	public void damage( int damage) {
		 this.setHealth(this.getHealth() - damage);
	}

}
