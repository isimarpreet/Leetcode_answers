public class Q26_remove_duplicates_from_sortedArray {
	/*Given an integer array nums sorted in non-decreasing order, 
	*remove the duplicates in-place such that each unique element appears only once.
	*The relative order of the elements should be kept the same. 
	*Then return the number of unique elements in nums.
*Consider the number of unique elements of nums to be k,
*to get accepted, you need to do the following things:
*Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
*The remaining elements of nums are not important as well as the size of nums.
*Return k.*/
	public int removeDuplicates(int[] nums) {

        int j = 1; // Start with index 1 because the first element is      already in place

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i+1]) { // If the current element is less than the next element
            
                nums[j] = nums[i+1]; // Move the next element to the new index
                j++; // Increment the new index
            }
        }
    return j; // Return the length of the new subarray
    }
}
