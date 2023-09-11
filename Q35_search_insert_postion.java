public class Q35_search_insert_position {
	/*
	 * Given a sorted array of distinct integers and a target value, 
	 * return the index if the target is found. 
	 * If not, return the index where it would be if it were inserted in order.
      You must write an algorithm with O(log n) runtime complexity.
	 * */
	
	public int searchInsert(int[] nums, int target) {
        int beg=0;
        int end=nums.length-1;
        while(beg<=end){
            int mid=(beg+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                beg=mid+1;
            }
           
        }

	}
}
