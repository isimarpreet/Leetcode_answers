public class Q136_Single_element {
	
	/*Given a non-empty array of integers nums, every element appears twice except for one.
	 *  Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
	 * */
	
	public int singleNumber(int[] nums) {
        
        int ans=0; //since XOR with 0 returns same number 
       for(int i=0; i<nums.length; i++){
           ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
       }
       
   
     return ans;
   }
}