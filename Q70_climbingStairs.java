public class Q70_climbingStairs {
	/*You are climbing a staircase. It takes n steps to reach the top.
     Each time you can either climb 1 or 2 steps.
      In how many distinct ways can you climb to the top?
	 * */
	public int climbStairs(int n) {
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        int arr[]=new int[n];
        arr[0]=1;
        arr[1]=2;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }

}
