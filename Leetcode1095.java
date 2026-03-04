/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int st = 0;
        int en = mountainArr.length() - 1;
        int ans = 0;
        int ls = st;
        int le = 0;
        int rs = 0;
        int re = en;

    
        while (st < en) {
            int m = st + (en - st) / 2;
            int midVal = mountainArr.get(m);
            int midNext = mountainArr.get(m + 1);
            if (midVal > midNext) {
                en = m;
            } else {
                st = m + 1;
            }
        }

        ans = st;

        if (mountainArr.get(ans) == target) {
            return ans;
        } else {

            le = ans;

           
            while (ls <= le) {
                int lm = ls + (le - ls) / 2;
                int val = mountainArr.get(lm);

                if (val == target) {
                    return lm;
                } else if (val < target) {
                    ls = lm + 1;
                } else {
                    le = lm - 1;
                }
            }

            rs = ans + 1; 

            
            while (rs <= re) {
                int rm = rs + (re - rs) / 2;
                int val = mountainArr.get(rm); 

                if (val == target) {
                    return rm;
                } else if (val < target) {
                    re = rm - 1; 
                } else {
                    rs = rm + 1;
                }
            }
        }

        return -1;
    }
}