class Solution {
    public String predictPartyVictory(String senate) {
        // Character ch = 'M';
        // int size = 0;
        // Queue<Character> q = new ArrayDeque<>();
        // for(int i = 0;i<senate.length();i++){
        //     q.offer(senate.charAt(i));
        // }
        // while(!q.isEmpty()){
        //     ch = q.poll();
        //     if(!q.isEmpty()){
        //         Character ch1 = q.poll();
        //         if(ch == ch1){
        //             q.offer(ch1);  
        //             size++;           
        //         }
        //          q.offer(ch);
        //          if(size == q.size()) break;
        //     }else{
        //         break;
        //     }
           
        // }
        // if(ch =='R'){
        //     return "Radiant";
        // }
        // else{
        //     return "Dire";
        // }
        int n = senate.length();
        Queue<Integer> radiant = new ArrayDeque<>();
        Queue<Integer> dire = new ArrayDeque<>();
        for(int i = 0; i< senate.length();i++){
            if(senate.charAt(i) == 'R'){
                radiant.offer(i);
            }
            else{
                dire.offer(i);
            }
        }
        while(!radiant.isEmpty() && ! dire.isEmpty()){
            int r_index = radiant.poll();
            int d_index = dire.poll();
            if( r_index < d_index){
                radiant.offer(n + r_index);
            }
            else{
                dire.offer(n + d_index);
            }
        }
        if(dire.isEmpty()){
            return "Radiant";
        }
        return "Dire";


    }
}