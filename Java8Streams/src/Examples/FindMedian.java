package Examples;

public class FindMedian {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
		System.out.println("Median: " + findMedian(arr));
	}

	private static String findMedian(int[] arr) {
		int n = arr.length;
		if(n%2==0) {
			return String.valueOf((arr[n-1]/2 + arr[n/2])/2);
		}else {
			return String.valueOf(arr[n/2]);
		}
	}

}
