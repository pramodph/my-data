package slidingwindow;

public class BinarySubArrayWithSum {

	public static void main(String[] args) {
		int[] nums= {0,0,0,0,0};
		int k=0;
		System.out.println(numSubArrayWithSum(nums,k));
	}
	public  static int numSubArrayWithSum(int[] nums,int k) {
		int n=nums.length;
		int count=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				//System.out.println(nums[j]);
				sum+=nums[j];
				if(sum==k) {
					count++;
					//System.out.println(count);
				}else if(sum>k) break;
			}
		}
		return count;
		
	}
	//TC-O(n2) and SC-O(n)

}
