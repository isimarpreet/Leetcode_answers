/*Given an integer x, return true if x is a 
palindrome and false otherwise. 
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
*/
lass Solution {
    public boolean isPalindrome(int x) {
       String s=String.valueOf(x);
        
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
               
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;

        
    }
}
