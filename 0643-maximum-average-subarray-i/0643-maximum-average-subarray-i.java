class Solution {
    public double findMaxAverage(int[] arr, int k) {
        //bruteforce
        // double sum = 0.0;
        // double maxavg = 0.0;
        // for(int i = 0; i<=arr.length-k;i++){
        //     sum = 0;
        //     for(int j = i; j<i+k;j++){
        //         sum += arr[j];
        //     }
        //     double avg = sum / k;
        //     if(avg > maxavg) maxavg = avg;

        // }
        double sum = 0;
        for(int i = 0; i < k;i++){
            sum += arr[i];
        } 
        double maxavg = sum / k;
        for(int i = k; i <arr.length;i++){
            sum += arr[i];
            sum -= arr[i-k];
            double avg = sum/k;
            if(avg > maxavg) maxavg = avg;
        }
        
        return maxavg;
    }
}