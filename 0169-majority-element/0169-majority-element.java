class Solution {
    public int majorityElement(int[] nums) {

        ///brutorce
        // int maxCount = 0;
        // int ele = nums[0];
        // for(int i = 0; i<nums.length; i++){
        //     int count = 1;
        //     for(int j = i; j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(maxCount < count){
        //         maxCount = count;
        //         ele = nums[i];
        //     }
        // }
        // return ele;


        int count = 0;
        int number = nums[0];
        for(int ele : nums){
            if(count == 0){
                number = ele;
            }
            if(ele == number){
                count++;
            }else{
                count--;
            }
        }
        return number;


        // int n = nums.length/2;
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int ele : nums){
        //     map.put(ele,map.getOrDefault(ele,0)+1);
        // }

        // for(int key : map.keySet()){
        //     if(map.get(key) > n){
        //         return key;
        //     }
        // }
        // return 0;

    }
}