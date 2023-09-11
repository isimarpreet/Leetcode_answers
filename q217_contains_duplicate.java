import java.util.Arrays;

public class Q217_Contains_duplicate {
	
	/*Given an integer array nums, return true if any value appears at least twice in the array, 
	 * and return false if every element is distinct.
	 * */
	
	public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean flag=true;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
        }
        if(count>=2){
            flag=true;
        }
        else{
            flag=false;
        }
        return flag;
    }

}
