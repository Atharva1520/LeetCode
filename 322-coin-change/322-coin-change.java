class Solution {
    public int coinChange(int[] coins, int amount) {
         int n = coins.length;
        int[] prev = new int[amount+1];
        int[] curr = new int[amount+1];
        for(int i = 0 ; i <= amount ; i++)
        {
            if(i%coins[0] == 0)
                prev[i] = i/coins[0];
            else
                prev[i] = (int)1e9;
        }
        
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j <= amount ; j++){
                int notTake = prev[j];
                int take = (int)1e9;
                if(j >= coins[i])
                    take = 1 + curr[j-coins[i]];
        
                curr[j] = Math.min(take , notTake);
            }
            prev = curr;
        }
        
       if(prev[amount] >= (int)1e9)
           return -1;
        else
            return prev[amount];
    }
}