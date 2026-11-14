class Solution {
    public void moveZeroes(int[] nums) {
        // int res[]= new int[nums.length];
        // int i = 0;
        // for(int ele : nums){
        //     if(ele != 0){
        //         res[i] = ele;
        //         i++;
        //     }
        // }
        // for(i = 0; i < nums.length ; i++){
        //     nums[i] = res[i];
        // }

        int k = 0;
        for(int i = 0; i <  nums.length;i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
        for(int i = k; i< nums.length;i++){
            nums[i] = 0;
        }

        // int k = 0;
        // for(int i = 0; i< nums.length;i++){
        //     if(nums[i] != 0){
        //         int temp = nums[k];
        //         nums[k] = nums[i];
        //         nums[i] = temp;
        //         k++;
        //     }
        // }
    }
}