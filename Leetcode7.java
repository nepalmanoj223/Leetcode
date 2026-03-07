class Solution {
    public int reverse(int x) {
        int rev = 0;
        int max = 2147483647;
        int min = -2147483648;

        while(x != 0){
            int nu = x % 10;

            if(rev > max/10 || rev < min/10){
                return 0;
            }

            rev = rev * 10 + nu;
            x = x / 10;
        }

        return rev;
    }
}