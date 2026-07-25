class Solution {
    public int findgcd(int x,int y){
        while(y != 0){
            int temp = y;
            y = x%y;
            x=temp;
        }
        return x;
    }
    public boolean canMeasureWater(int x, int y, int target) {
        if(target > (x+y)) return false;
        int gcd = findgcd(x,y);
        return ((target % gcd) == 0);
    }
}