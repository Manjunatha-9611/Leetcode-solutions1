class Solution {
    public int removeDuplicates(int[] nums) {
        // int i = 0;
        // for(int j = 1; j<nums.length;j++){
        //     if(nums[i] != nums[j]){
        //         nums[i+1] = nums[j];
        //         i++;
        //     }
        // }

        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
        // return i+1;
    }
}