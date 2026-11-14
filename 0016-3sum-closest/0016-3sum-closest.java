class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min_value = Integer.MAX_VALUE;
        int final_total = 0;
        for(int i = 0; i < nums.length;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);
                if(diff < min_value){
                    final_total = sum;
                    min_value = diff;
                }
                else if(sum > target){
                    right--;
                }
                else{
                    left++;
                }
            }
            
        }
        return final_total;
    }
}