class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // int[] res = new int[nums.length*2];
        // for(int i=0;i<res.length;i++){
        //     res[i] = nums[i%nums.length];
        // }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<res.length;j++){
        //         if(res[j]>res[i]){
        //             nums[i]= res[j];
        //             break;
        //         }
        //         else{
        //             nums[i]=-1;
        //         }
        //     }
        // }
        // return nums;

        //bruteforce-but slightly optimized ->monotanic stack
        Stack<Integer>st = new Stack<Integer>();
        // for(int i = res.length-1;i>=0;i--){
        //     while(!st.isEmpty() && st.peek() <= res[i]){
        //         st.pop();
        //     }
        //     if(st.isEmpty()){
        //         nums[i%nums.length] = -1;
        //     }else{
        //         nums[i%nums.length] = st.peek();
        //     }
        //     st.push(res[i]);
        // }

        int[] temp = new int[nums.length];
        int n = nums.length;
        for(int i=n*2; i>=0;i--){
            int index = i%n;
            while(!st.isEmpty() && st.peek() <= nums[index]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[index] = -1;
            }
            else{
                temp[index] = st.peek();
            }
            st.push(nums[index]);
        }
        return temp;
    }
}