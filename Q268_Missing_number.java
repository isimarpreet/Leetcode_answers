public class Q268_Missing_number {
	
	/*Given an array nums containing n distinct numbers in the range [0, n], 
	 * return the only number in the range that is missing from the array.
	 * */
	
	public int missingNumber(int[] nums) {

        int n=nums.length;
        int ans=(n*(n+1))/2;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }

        int missingNumber=ans-sum;
        return missingNumber;
        }

}
