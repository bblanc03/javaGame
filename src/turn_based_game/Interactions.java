package turn_based_game;

abstract class Interactions {
	
	public abstract void attack();
	
	public boolean run(String name) {
		return false;
	}
	
	public abstract void defend();
	
	public String getName() {
		return null;
	}
	
	public int getHealth() {
		return 0;
	}

}
