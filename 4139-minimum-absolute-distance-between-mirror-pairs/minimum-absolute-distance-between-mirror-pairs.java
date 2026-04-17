import java.util.*;

class Solution {

    public int reverse(int n){
        int r = 0;
        while(n > 0){
            int digit = n % 10;
            r = r * 10 + digit;
            n = n / 10;
        }
        return r;
    }

    public int minMirrorPairDistance(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(nums[i])){
                min = Math.min(min, i - map.get(nums[i]));
            }

            int r = reverse(nums[i]);
            map.put(r, i);
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}