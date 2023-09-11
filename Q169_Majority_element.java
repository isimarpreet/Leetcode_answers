public class Q169_Majority_element {
	/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
	 * */
	
public int majorityElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }    
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
	
	
	

}
