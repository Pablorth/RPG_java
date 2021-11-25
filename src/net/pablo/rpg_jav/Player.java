package net.pablo.rpg_jav;

public class Player {
	
	private String name;

    private int health;

    private int atk;

    public Player(String name, int health, int atk) {
		
    	this.name = name;
    	this.health = health;
    	this.atk = atk;
    	
    	
	}
    
    public void damage(int damage) {
    	this.health -= damage;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
    
}
