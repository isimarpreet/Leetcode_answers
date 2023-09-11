public class Q189_rotate_array {
	
	/*Given an integer array nums, rotate the array to the right by k steps, 
	 * where k is non-negative.


	 * */
	
	public void rotate(int[] nums, int k) {

	       k=k%nums.length;
	       int n=nums.length;
	       reverse(nums,0,n-k-1);
	       reverse(nums,n-k,n-1);
	       reverse(nums,0,n-1);

	        
	    }
	        public  void reverse(int[]nums,int start,int end){
	            while(start<=end){
	                int temp=nums[start];
	                nums[start]=nums[end];
	                nums[end]=temp;
	                start++;
	                end--;
	            }

	        }

}
