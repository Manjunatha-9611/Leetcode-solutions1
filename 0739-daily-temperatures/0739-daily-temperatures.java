class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //bruteforce
        int res[] = new int[temperatures.length];
        // for(int i=0;i<temperatures.length;i++){
        //     for(int j = i+1;j<temperatures.length;j++){
        //         if(temperatures[j]>temperatures[i]){
        //             res[i] = j-i;
        //             break;
        //         }
        //         res[i] = 0;
        //     }
        // }


        //optimizing
        Stack<Integer> st = new Stack<Integer>();
        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=0;
            }
            else{
                res[i] = st.peek() - i;
            }
            st.push(i);
        }

        //using hashmap
        // Stack<Integer> st = new Stack<Integer>();
        // Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        // for(int i = temperatures.length-1;i>=0;i--){
        //     while(!st.isEmpty() && st.peek() <= temperatures[i]){
        //         st.pop();
        //     }
        //     // if(st.isEmpty()){
        //     //     res[i] = 0;
        //     // }
        //     // else{
        //     //     res[i] = map.get(st.peek())-i;
        //     // }
        //     if(!st.isEmpty()) 
        //         res[i] = map.get(st.peek())-i;

        //     map.put(temperatures[i],i);
        //     st.push(temperatures[i]);
        // }
        return res;
    }
}