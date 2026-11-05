class Solution {

        //using list
    // public void dfs(int start,List<List<Integer>> list,boolean[] vis){
    //     vis[start] = true;

    //     for(int neigh : list.get(start)){
    //         if(vis[neigh] == false){
    //             dfs(neigh,list,vis);
    //         }
    //     }
    // }

    public void dfs(int start, int[][] isConnected, boolean[] vis){
        vis[start] = true;
        for(int i = 0; i< isConnected.length; i++){
            if(isConnected[start][i] == 1 && vis[i] == false){
                dfs(i,isConnected,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        //using list
        // List<List<Integer>> list = new ArrayList<>();
        // for(int i = 0; i<n;i++){
        //     list.add(new ArrayList<>());
        // }
        // for(int rows = 0; rows<n; rows++){
        //     for(int cols = 0; cols < n; cols++){
        //         if(isConnected[rows][cols] == 1 && rows !=cols){
        //             list.get(rows).add(cols);
        //         }
        //     }
        // }


        boolean[] vis =  new boolean[n];
        int prov = 0;
        for(int i = 0; i<n;i++){
            if(vis[i] == false){
                dfs(i,isConnected,vis);
                prov++;
            }
        }
        return prov;
    }
}