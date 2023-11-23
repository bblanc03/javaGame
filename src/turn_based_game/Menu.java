package turn_based_game;

import java.util.Scanner;


// TO DO LIST
/*
 * Create file to hold player progress
 * Create file for creature names
 * Create an end for when player HP  or creature HP hit zero
 * 
 */

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean end = false;
		boolean gameEnd = false;
		System.out.println("What is your name?");
		Scanner in = new Scanner(System.in);
		String playerName = in.nextLine();
		Player player = new Player(playerName, 100);

		
		while(gameEnd != true) {
			System.out.println("Choose an option.");
			System.out.println("1- Dragon \n2- Quit");
			//System.out.println("2- Wolf");
			
			String StrCreature = in.nextLine();
			int intCreature = Integer.parseInt(StrCreature);
			
			
			if(intCreature == 1) {
				
				Dragon dragon = new Dragon("TempName", 200);
				System.out.println(dragon.getName() + " a Dragon has appered!");
				end = false;
				
					
				while(end != true) {
					
					System.out.println("1- attack \n2- deffend \n3- run");
					String choice = in.nextLine();
					int intchoice = Integer.parseInt(choice);
					
					if(intchoice == 1) {
						player.attack();
						System.out.println("the dragon was hit with an attack that did " + player.getDamage() + " damage.");
						dragon.setHealth(player.getDamage());
						System.out.println();
						if(dragon.getHealth() <= 0) {
							System.out.println("You have defeated the dragon.");
							System.out.println();
							System.out.println("do you want to continue? \n y or n");
							choice = in.nextLine();
							if(choice.equals("N") || choice.equals("n")) {
								end = player.run();  // has to end the run
								gameEnd = true;
							}
							else {
								end = true;
							}
						}
						else {
							System.out.println("The dragon has " + dragon.getHealth() + " health left.");
							dragon.attack();
							System.out.println(player.getName() + " was hit with an attack that did " + dragon.getDamage() + " damage.");
							player.setHealth(dragon.getDamage());
							System.out.println();
							if(player.getHealth() <= 0) {
								System.out.println(player.getName() + " has taken too much damage and has perrisehd during their adventure.");
								end = player.run();  // has to end the run
								gameEnd = true;
							} else {
								System.out.println(player.getName() + " has " + player.getHealth() + " HP left.");
							}
						}				
					} else if(intchoice == 2) {
						player.defend();
					} else if(intchoice == 3){
						end = dragon.run(player.getName());
						if(end = false) {
							dragon.attack();
							System.out.println(player.getName() + " was hit with an attack that did " + dragon.getDamage() + " damage.");
							player.setHealth(dragon.getDamage());
							System.out.println();
							if(player.getHealth() <= 0) {
								System.out.println(player.getName() + " has taken too much damage and has perrisehd during their adventure.");
								end = player.run();  // has to end the run
								gameEnd = true;
							} else {
								System.out.println(player.getName() + " has " + player.getHealth() + " HP left.");
							}
						}
					}
					
				}	
				
			}
			else if(intCreature == 2){
				end = player.run();
				gameEnd = true;
			}
			else {
				System.out.println("A Wolf has appered!");
				player.attack();
			}
		}
		
		
		
		

	}

}
