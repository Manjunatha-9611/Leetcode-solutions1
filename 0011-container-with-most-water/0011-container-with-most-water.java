class Solution {
    
    public static int maxArea(int[] height) {

        //bruteforce
        //int max = 0;
        // for(int left = 0;left < height.length-1; left++){
        //     for(int right = left + 1; right < height.length; right++){
        //         int area = (right - left) * Math.min(height[left] , height[right]);
        //         if(area > max) max = area;
        //     }
        // }
        // return max;   //TLE becoz the input is too lengthy and T.C is more


        //Optimized converging two pointers approach

        int left = 0;
        int right = height.length - 1;
        int maxl = 0;
        while(left < right){
            maxl = Math.max(maxl,(right - left) * Math.min(height[left],height[right]));
            if(height[left] < height[right]) 
            left++;
            else right--;
        }
        return maxl;
    }
}