package turn_based_game;
import java.util.Random;

public class Dragon extends Interactions{
	private String name;
	private int health;
	private int damage;
	
	public Dragon(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println(getName() + " used slash");
		System.out.println();
		damage = 75;
	}

	public boolean run(String player) {
		// TODO Auto-generated method stub
		boolean succes = false;
		Random rand = new Random();
		int number = rand.nextInt(3);
		number++;
		System.out.print(number + " ");
		if(number == 1) {
			succes = true;
			System.out.println(player + " has ran away.");
		} else {
			System.out.println(player + " has failed to run away.");
		}
		return succes;
	}

	public void defend() {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
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
