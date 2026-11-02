class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] res = new int[deck.length];
        Arrays.sort(deck);
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i<deck.length;i++){
            q.offer(i);
        }
        int j = 0;
        while(!q.isEmpty()){
            res[q.poll()] = deck[j];
            j++;
            if(!q.isEmpty()){
                q.offer(q.remove());
            }
        }
        return res;
    }
}