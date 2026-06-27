 // AI generated 
class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums)
            map.put(x,map.getOrDefault(x,0)+1);

        int response=1;
        for(int x:nums){
            if(x==1){
                if(map.get(x)%2!=0)
                    response=Math.max(response,map.get(x));
                else
                    response=Math.max(response,map.get(x)-1);
            }
            else{
                int len=0;
                if(map.get(x)>=2){
                    long current=x;
                    while(current <= Integer.MAX_VALUE && map.containsKey((int)current)){
                        if(map.get((int)current)==1){
                            len++;
                            break;
                        }
                        len++;
                        if(current > (Long.MAX_VALUE / current))
                            break;
                        current *= current;
                    }
                }
                response=Math.max(response,len*2-1);
            }
        }
        return response;
    }
}