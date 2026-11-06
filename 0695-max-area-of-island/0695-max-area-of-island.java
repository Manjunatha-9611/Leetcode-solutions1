class Solution {
    public int dfs(int r,int c,int[][] grid){
        if(c < 0 || r < 0 || r >= grid.length || c >= grid[0].length){
            return 0;
        }

        if(grid[r][c] == 0){
            return 0;
        }

        grid[r][c] = 0;
        int area = 1;

        area += dfs(r-1, c, grid);
        area += dfs(r+1, c, grid);
        area += dfs(r, c-1, grid);
        area += dfs(r, c+1, grid);

        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i<grid.length; i++){

            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    int area = dfs(i, j, grid);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
}