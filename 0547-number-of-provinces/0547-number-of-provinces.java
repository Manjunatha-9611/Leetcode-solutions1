class Solution {

    public void dfs(int start,List<List<Integer>> list,boolean[] vis){
        vis[start] = true;
        for(int neigh : list.get(start)){
            if(vis[neigh] == false){
                dfs(neigh,list,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> list = new ArrayList<>();
        int n = isConnected.length;
        for(int i = 0; i<n;i++){
            list.add(new ArrayList<>());
        }

        for(int rows = 0; rows<n; rows++){
            for(int cols = 0; cols < n; cols++){
                if(isConnected[rows][cols] == 1 && rows !=cols){
                    list.get(rows).add(cols);
                }
            }
        }

        boolean[] vis =  new boolean[n];
        int prov = 0;
        for(int i = 0; i<n;i++){
            if(vis[i] == false){
                dfs(i,list,vis);
                prov++;
            }
        }
        return prov;
    }
}