class Solution {
        public int climbStairs(int n) {
                if(n==1)
                    return 1;
                int[] dp=new int[n+1];
                dp[1]=1;
                dp[2]=2;
                for(int x=3;x<=n;x++)
                {
                    dp[x]=dp[x-1]+dp[x-2];
                }
            return dp[n];
        }
    }
    
    
    
    public class climbingsteps {
    
        public static void main(String[] args) {
            Solution obj=new Solution();
            int n=5;
            int k= obj.climbStairs(n);
            System.out.println(k);
        
    }
    
}
