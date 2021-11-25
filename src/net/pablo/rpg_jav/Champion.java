package net.pablo.rpg_jav;

public abstract class Champion implements Fight {
	
	private String name;

    private int maxHealth;

    private int atk;

    public Champion(String name, int maxHealth, int atk) {
		
    	this.name = name;
    	this.maxHealth = maxHealth;
    	this.atk = atk;	
    	
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	
}
