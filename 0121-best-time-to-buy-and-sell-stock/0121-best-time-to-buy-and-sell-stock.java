class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        // int maxProfit = 0;
        // int profit = 0;
        // for (int i = 0; i < n; i++) {
        //     int buy = arr[i];
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[j] > arr[i]) {
        //             int sell = arr[j];
        //             profit = sell - buy;
        //             if (profit > maxProfit) {
        //                 maxProfit = profit;
        //             }
        //         }

        //     }

        // }
        // return maxProfit;

        int maxP = 0;
        int minCost = arr[0];
        for(int i = 1;i<n;i++){
            maxP = Math.max(maxP, arr[i] - minCost);
            minCost = Math.min(minCost,arr[i]);
        }
        return maxP;
    }
}