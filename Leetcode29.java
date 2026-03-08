class Solution {
    public int divide(int dividend, int divisor) {
    int  div=0;
    if(dividend<0 || divisor<0){
        while(dividend>=divisor){
        dividend=dividend-divisor;
        div=div+1;
      }
      div=div*-1;
    }
      while(dividend>=divisor){
        dividend=dividend-divisor;
        div=div+1;
      }
        return div;
    }
}