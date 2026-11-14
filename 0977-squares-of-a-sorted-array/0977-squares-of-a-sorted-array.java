class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] res = new int[nums.length];
       int i = 0;
       int j = nums.length - 1;
       int k = nums.length - 1;
       while(i<=j){
            if(nums[j]*nums[j] > nums[i]*nums[i]){
                res[k] = nums[j]*nums[j];
                j--;
                k--;
            }else {
                res[k] = nums[i]*nums[i];
                i++;
                k--;
            }
       }     
       return res;
    }
}