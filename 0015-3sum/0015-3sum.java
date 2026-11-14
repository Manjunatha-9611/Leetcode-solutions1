class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // HashSet<List<Integer>> setList  = new HashSet<List<Integer>>();
        // for(int i = 0; i<nums.length;i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         for(int k = j+1; k < nums.length;k++){
        //             if((nums[i] + nums[j] + nums[ k]) == 0){
        //                 List<Integer> temp = new ArrayList<Integer>();
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(nums[k]);
        //                 Collections.sort(temp);
        //                 setList.add(temp);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(setList);


        //Two Pointer and one extra pointer for looping
        // HashSet<List<Integer>> innerList = new HashSet<>();
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i++){
        //     int left = i + 1;
        //     int right = nums.length-1;
        //     while(left < right){
        //         int sum = nums[i] + nums[left] + nums[right];
        //         if(sum == 0){
        //             List<Integer> temp = new ArrayList<>();
        //             temp.add(nums[i]);
        //             temp.add(nums[left]);
        //             temp.add(nums[right]);
                    
        //             innerList.add(temp);
        //             left++;
        //             right--;
        //         }
        //         else if(sum > 0){
        //             right--;
        //         }
        //         else{
        //             left++;
        //         }
                
        //     }
        // }
        // return new ArrayList<>(innerList);

        //Two Pointer and one extra pointer for looping and manual sortinh
        List<List<Integer>> innerList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int left = i + 1;
            int right = nums.length-1;
            while(i < nums.length-1 && nums[i] == nums[i+1]) i++;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    innerList.add(temp);
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                
                while(left < right && sum > 0){
                    right--;
                }
                while(left < right && sum < 0){
                    left++;
                }
                }
            
            else if(sum > 0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return innerList;
    }
}