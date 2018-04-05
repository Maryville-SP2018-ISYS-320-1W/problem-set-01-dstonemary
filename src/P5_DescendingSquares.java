/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-04-2018
*/

/* 6. Your pseudocode algorithm here

for ( start number at 10, go until it reaches 1, descending )
print out result (number * number) with a space

*/

public class P5_DescendingSquares {

	public static void main(String[] args) {
			squaresTo10();
		}
		
		public static void squaresTo10() {
			for( int i = 10; i >= 1; i-- ) {
				System.out.print( (i * i) +" ");
			}

		}

}
