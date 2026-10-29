class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int ele : nums){
        //     map.put(ele,map.getOrDefault(ele,0)+1);
        // }
        // for(int key : map.keySet()){
        //     if(map.get(key) == 1){
        //         return key;
        //     }
        // }
        // return 0;


        int XOR = 0;
        for(int i = 0;i<nums.length;i++){
            XOR = XOR ^ nums[i];
        }
        return XOR;

    }
    
}