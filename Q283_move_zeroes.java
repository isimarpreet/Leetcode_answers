public class Q283_move_zeroes {
	/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
	 * */
	
	public void moveZeroes(int[] nums) {
        // declare left pointer
      int left = 0;
      // iterate over nums array with right pointer
      for(int right = 0; right < nums.length; right++) {
         
          if(nums[right] != 0) {
          
              int tmp = nums[right];
         
              nums[right] = nums[left];
          
              nums[left] = tmp;
         
              left++;
      }
}
  }

}
