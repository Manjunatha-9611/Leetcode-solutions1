class Solution {
    public void dfs(int[][] image, int sr, int sc, int color,int or_pixel){
        int rows = image.length;
        int cols= image[0].length;
        if(sr < 0 || sr >= rows || sc < 0 || sc >= cols){
            return;
        }
        if(image[sr][sc] != or_pixel){
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr, sc+1, color,or_pixel);
        dfs(image, sr, sc-1, color,or_pixel);
        dfs(image, sr+1, sc, color,or_pixel);
        dfs(image, sr-1, sc, color,or_pixel);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int or_pixel = image[sr][sc];
        if(image[sr][sc] == color){
            return image;
        }

        dfs(image,sr,sc,color,or_pixel);
        return image;
    }
}