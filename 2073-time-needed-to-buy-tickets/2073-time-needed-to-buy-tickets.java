class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        Queue<Integer>q = new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            q.offer(i);
        }

        int time = 0;
        while(true){
            int first = q.poll();
            arr[first]--;

            if(arr[first]!=0){
                q.offer(first);
            }
            time++;
            if(arr[k] == 0){
                break;
            }
        }

    return time;


        // int count = 0;
        // while(arr[k] != 0){
        //     int j = 0;
        //     while(j < arr.length){
        //         if(arr[j]!=0){
        //             arr[j] = arr[j]-1;
        //             count++;
        //             j++;
        //         }else{
        //             j++;
        //         }
               
        //     }
        // }
        // return count;
    }
}