package turn_based_game;

import java.util.Scanner;

public class Intro {

	public static int beguiningScreen() {
		int intCreature = 0;
		System.out.println("Choose an apponent");
		System.out.println("1- Dragon");
		//System.out.println("2- Wolf");
		try (
		Scanner in = new Scanner(System.in)) {
			String StrCreature = in.nextLine();
			intCreature = Integer.parseInt(StrCreature);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return intCreature;
	}
	
}
