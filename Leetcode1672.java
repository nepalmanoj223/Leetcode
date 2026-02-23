package Leetcode;

public class Leetcode1672 {
    class Solution {
    public int maximumWealth(int[][] accounts) {
       int ans=max(accounts);
       return ans;
    }
    static int max(int[][] accounts){
        int maxw=0;
        for(int i=0; i<accounts.length; i++){ 
             int sum=0;
            for(int j=0; j<accounts[i].length; j++){
                sum=accounts[i][j]+sum;
            }
        
        if(maxw<sum){
            maxw=sum;
        }}
        return maxw;
    }
}
}
