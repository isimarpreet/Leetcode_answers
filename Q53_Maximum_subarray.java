public class Q53_Maximum_subarray {
	/*
	 * Given an integer array nums, find the 
        subarray
       with the largest sum, and return its sum.
 	 * */
	
	public int maxSubArray(int[] nums) {
        //Kadence algo.  no need to repeat the sub array if the sum is negative.
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            ans=Math.max(sum,ans);
            if(sum<0)
                sum=0;   
        }
        return ans;
        
    }
	

}
