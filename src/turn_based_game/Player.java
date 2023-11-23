package turn_based_game;

public class Player{
	
	private String name;
	private int health;
	private int damage;
	
	public Player(String name, int health) {
		this.name = name;
		this.health = 100;
	}
	
	public String getName() {
		
		return name;
	}

	public void attack() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println(getName() + " used ");
		System.out.println();
		damage = 45;
		
	}

	public boolean run() {
		boolean ran = true;
		
		System.out.println();
		System.out.println(getName() + " ran away.");
		// TODO Auto-generated method stub
		return ran;
	}

	public void defend() { // takes half of the damage
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println(getName() + " used ");
		System.out.println();

	}

	public int getHealth() {
		// TODO Auto-generated method stub
		return health;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int setHealth(int dmgTaken) {
		health = health - dmgTaken;
		return health;
	}

}
