class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<students.length;i++){
            q.offer(students[i]);
        }
        int i = 0;
        int count = 0;
        while(!q.isEmpty()){
            int first = q.poll();
            if(first == sandwiches[i]){
                i++;
                count = 0;
            }
            else{
                q.offer(first);
                count++;
            }
            if(q.size() == count){
                break;
            }
        }
        return q.size();
    }
}