class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left =0, maxFreq=0, maxLen=0;
        for(int right=0;right<s.length();right++){
            map.merge(s.charAt(right), 1, Integer::sum);
            maxFreq = Math.max(maxFreq,map.get(s.charAt(right)));
            while((right-left+1)-maxFreq>k){
                map.merge(s.charAt(left), -1, Integer::sum);
                left++;
            }
            int size = right-left+1;
            maxLen=Math.max(maxLen,size);
        }
        return maxLen;
    }
}
