class Solution {

    static boolean isVowel(int asci){
        if(asci == 97 || asci == 101 || asci == 105 || asci == 111 || asci == 117){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {

        
        // int maxVowel = 0;
        // for(int i = 0; i <=s.length()-k;i++){
        //     int count = 0;
        //     for(int j = i; j <i+k; j++){
        //         int asci = s.charAt(j);
        //         if(isVowel(asci)) count++;
        //     }
        //     if(count > maxVowel) maxVowel = count;
        // }
        // return maxVowel;


        int maxVowel = 0;
        int count = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))) count++;
        }
        maxVowel = count;
        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(i-k))) count--;
            if(count > maxVowel) maxVowel = count;
            }
        return maxVowel;
    }
}