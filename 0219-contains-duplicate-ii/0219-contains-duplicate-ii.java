class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //bruteforce
        // for(int i =0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i] == nums[j] && Math.abs(i-j) <= k){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // int i = 0;
        // for(int j = i+1;j<nums.length;j++){
        //     if(nums[i] == nums[j] && Math.abs(i-j) <= k){
        //         return true;
        //     }
        //     i = j;
        // }
        // return false;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int key = nums[i];
            if(map.containsKey(key)){
                int j = map.get(key);
                if(Math.abs(i - j) <= k){
                    return true;
                }
            }
            map.put(key,i);
        }
        return false;
    }
}