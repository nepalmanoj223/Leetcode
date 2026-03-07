class Solution {
    public int subtractProductAndSum(int n) {
        int dg=0;
        int sum=0;
        int mul=1;
        while(n>0){
            dg=n%10;
            n=n/10;
            sum=sum+dg;
            mul=mul*dg;
        }
        int diff=mul-sum;
        return diff;
    }
}