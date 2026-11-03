class Solution {

    public boolean dfs(int start,int end,List<List<Integer>> adj,boolean[] vis){
        if(start == end){
            return true;
        }
        vis[start] = true;
        for(int neighbour : adj.get(start)){
            if(vis[neighbour] == false){
                vis[neighbour] = true;
                if(dfs(neighbour,end,adj,vis) == true){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] arr : edges){
            int u = arr[0];
            int v = arr[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[n];
        return dfs(source,destination,adj,vis);
    }
}