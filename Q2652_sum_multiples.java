public class Q2652_sum_multiples {
	/*
	 * Given a positive integer n, find the sum of all integers in the range [1, n]
	 *  inclusive that are divisible by 3, 5, or 7.
Return an integer denoting the sum of all numbers in the given range satisfying the constraint.
	 * */
	
	 public int sumOfMultiples(int n) {
	        int sum=0;
	        for(int num=1;num<=n;num++){
	            if(num%3==0 || num%5==0 || num%7==0)
	                sum=sum+num;        
	        }
	        return sum;
	        
	    }

}
