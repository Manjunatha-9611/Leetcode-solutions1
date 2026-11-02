class Solution {
    public int[] finalPrices(int[] prices) {

        //bruteforce
        // for(int i = 0; i<prices.length;i++){
        //     int j = i+1;
        //     while(j<prices.length){
        //         if(prices[j]<=prices[i]){
        //             prices[i] = prices[i] - prices[j];
        //             break;
        //         }
        //         j++;
        //     }
        // }


        int[] res = new int[prices.length];
        Stack<Integer> st = new Stack<Integer>();
        for(int i = prices.length-1; i>=0;i--){
            while(!st.isEmpty() && st.peek() > prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = prices[i];
            }else{
                res[i] = prices[i]-st.peek();
                
            }
            st.push(prices[i]);
        }

        // //storing index in stack
        // Stack<Integer> st = new Stack<Integer>();
        // for(int i = 0; i< prices.length;i++){
        //     while(!st.isEmpty() && prices[i] <= prices[st.peek()]){
        //         int prevIndex = st.pop();
        //         prices[prevIndex] = prices[prevIndex] - prices[i];
        //     }
        //     st.push(i);

        // }
        // return prices;
        return res;
    }
}