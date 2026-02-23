package Leetcode;
class Solution{
public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length;i++){
           int dgcount=digits(nums[i]);
           if(dgcount%2==0){
            count ++;
           }
            }
        
        return count;
    }
    static int digits(int num){
        int digits=0;
        while(num>0){
            
            num=num/10;
            digits ++;
        }
       return digits;
    }
}
