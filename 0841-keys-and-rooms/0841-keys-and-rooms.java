class Solution {

    public void dfs(int start, List<List<Integer>> rooms, boolean[] vis){
        vis[start] = true;
        for(int neigh : rooms.get(start)){
            if(vis[neigh] == false){
                vis[neigh] = true;
                dfs(neigh,rooms,vis);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        dfs(0,rooms,vis);
        for(int i = 0; i<vis.length;i++){
            if(vis[i] == false){
                return false;
            }
        }
        return true;
    }
}