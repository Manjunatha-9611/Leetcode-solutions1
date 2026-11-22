class Solution {
    public int totalFruit(int[] fruits) {

        int max = 0;
        // for (int i = 0; i < fruits.length; i++) {
        //     Set<Integer> set = new HashSet<>();
        //     for (int j = i; j < fruits.length; j++) {

        //         for (int k = i; k <= j; k++) {
        //             set.add(fruits[k]);
        //         }
        //         if(set.size() <= 2){
        //                 if(j-i+1 > max){
        //                     max = j-i+1;
        //                 }
        //             }
        //     }

        // for (int i = 0; i < fruits.length; i++) {
        //     Set<Integer> set = new HashSet<>();
        //     for (int j = i; j < fruits.length; j++) {
        //         set.add(fruits[j]);
        //         if (set.size() <= 2) {
        //             if (j - i + 1 > max) {
        //                 max = j - i + 1;
        //             }
        //         }
        //     }

        // }

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < fruits.length; right++) {
            int key = fruits[right];
            map.put(key, map.getOrDefault(key, 0) + 1);
            while (map.size() > 2) {
                int lkey = fruits[left];
                map.put(lkey, map.get(lkey) - 1);
                if (map.get(lkey) == 0) {
                    map.remove(lkey);
                }
                left++;
            }
            max = Math.max(right - left + 1, max);
        }

        return max;
    }
}