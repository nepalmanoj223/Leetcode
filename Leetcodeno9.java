class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int nw=0;
        while(x>0){
            nw=nw*10 +x%10;
            x=x/10;
        }
        if(nw==n){
            return true;
        }
        else{
            return false;
        }
    }
}