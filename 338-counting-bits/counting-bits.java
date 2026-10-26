class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i =0; i<arr.length;i++){
            int count1 = 0;
            int j = i;
            while(j!=0){
                if(j%2 != 0){
                    count1++;
                }
                j /= 2;
            }
            arr[i] = count1;
        }
        return arr;
    }
}