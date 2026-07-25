class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd=nums[0];
        for(int n : nums){
            gcd=GCD(gcd , n);
            if(gcd == 1){
                return true;
            }
        }
        return false;
    }

    public int GCD(int a , int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
           return a;
    }
}