package Examples;

public class FabanociSeries {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int n=10;
		
		for(int i=1;i<n;i++) {
			System.out.print(first+", ");
			int next=first+second;
			first=second;
			second=next;
		}
	}

}
