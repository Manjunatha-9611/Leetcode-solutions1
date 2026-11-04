class Solution {

    // public void dfs(int start, List<List<Integer>> rooms, boolean[] vis){
    //     vis[start] = true;
    //     for(int neigh : rooms.get(start)){
    //         if(vis[neigh] == false){
    //             vis[neigh] = true;
    //             dfs(neigh,rooms,vis);
    //         }
    //     }
    // }

    public void bfs(int start,List<List<Integer>> rooms,boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        vis[start] = true;
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int neigh : rooms.get(curr)){
                if(vis[neigh] == false){
                    vis[neigh] = true;
                    q.add(neigh);
                }
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        //dfs(0,rooms,vis);
        bfs(0,rooms,vis);
        for(int i = 0; i<vis.length;i++){
            if(vis[i] == false){
                return false;
            }
        }
        return true;
    }
}