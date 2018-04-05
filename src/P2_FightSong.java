/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-04-2018
*/

public class P2_FightSong {
	public static void main(String[] args) {
		
		go(true);
		go(false);
		best();
		go(true);
		go(false);
		best();
		go(true);
		go(false);
	}

	public static void go(boolean isNewLine) {
		System.out.println("Go, team, go!\nYou can do it.");
		if(isNewLine)
			System.out.println();
	}
	
	public static void best() {
		System.out.println("You're the best,\nIn the West.");
	}	
	
}
