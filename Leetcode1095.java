public class Leetcode1095 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,3,1};
        int target=5;
        int ans=peak(nums,target);
        System.out.println(ans);

    }
    static int peak(int []nums, int target){
        int st=0;
        int en=nums.length-1;
        int ans=0;
        int ls=st;
        int le=0;
        int rs=0;
        int re=en;
    
        while(st<en){
            int m=st+(en-st)/2;
            if(nums[m]>nums[m+1]){
                en=m;
            }
            else{
                st=m+1;
            }
             
        }
        ans=st;
        if(nums[ans]==target){
            return ans;
        }
        else {
            le=ans;
            while(ls<=le){
                int lm=ls+(le-ls)/2;
                if(nums[lm]==target){
                    return lm;
                }
                else if(nums[lm]<target){
                    ls=lm+1;
                }
                else{
                    le=lm-1;
                }
            }rs=ans;
            while(rs<=re){
                int rm=rs+(re-rs)/2;
                if(nums[rm]==target){
                    return rm;
                }
                else if(nums[rm]<target){
                    rs=rm+1;
                }
                else{
                    re=rm-1;
                }
            }
        }
       
        return-1;
        
    }
    // static int elm(int []nums, int target){
    //     int ans=peak(nums);
    //     if(target==ans){
    //         return ans;
    //     }
    //     else if(target<ans){
    //         int rights=
    //     }
    // }
    }
