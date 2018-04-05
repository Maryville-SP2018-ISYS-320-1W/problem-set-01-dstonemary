/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-04-2018
*/

/* 4. Your pseudocode algorithm here

	for(start at 1 to 6 lines ){
		for(start at 1 to 6 stars per line){
			print("*")
		}
		print new line
	}

*/
public class P7_NestedLoopBox {

	
	public static void main(String[] args) {
		for(int lines = 1; lines <= 6; lines++) {
			for(int stars = 1; stars <= 6; stars++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
