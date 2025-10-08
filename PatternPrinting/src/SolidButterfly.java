
public class SolidButterfly {
//	*	   *
//	**    **
//	***  ***
//	********
//	********
//	***  ***   
//	**    **
//	*      *

	public static void main(String[] args) {
		int n = 5;
		//upper part
		for (int i = 1; i <= n; i++) {
			//Star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//Space
			for (int j = 1; j <= 2 * n - i * 2; j++) {
				System.out.print(" ");
			}
			//Star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Lower part
		for (int i = n; i >= 1; i--) {
			//Star
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			//Space
			for (int j = 1; j <= 2 * n - i * 2; j++) {
				System.out.print(" ");
			}
			//Star
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
