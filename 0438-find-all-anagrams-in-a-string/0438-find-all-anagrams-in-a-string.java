class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //bruteforce
        // List<Integer> ans = new ArrayList<>();
        // char[] parr = p.toCharArray();
        // int k = p.length();
        // Arrays.sort(parr);
        // for (int i = 0; i <= s.length() - k; i++) {
        //     char[] res = new char[k];
        //     int index = 0;
        //     for (int j = i; j < i + k; j++) {
        //         res[index++] = s.charAt(j);
        //     }
        //     Arrays.sort(res);
        //     if (Arrays.equals(res, parr)) {
        //         ans.add(i);
        //     }
        // }
        // return ans;


        //Dynamic sliding window
        int[] parr = new int[26];
        int[] rarr = new int[26];
        for(int i = 0; i <p.length(); i++){
            char ch = p.charAt(i);
            parr[ch - 'a']++;
        }
        List<Integer> ans = new ArrayList<>();
        int left = 0;
        for(int right = 0; right<s.length();right++){
            char ch = s.charAt(right);
            rarr[ch - 'a']++;
            while(right - left + 1 > p.length()){
                char ch1 = s.charAt(left);
                rarr[ch1 - 'a']--;
                left++;
            }
            if(Arrays.equals(rarr,parr)){
                ans.add(left);
                
            }
        }
        return ans;

    }

}