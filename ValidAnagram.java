class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) 
            return false;
        int[] arr = new int[100];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) -'a']--;
        }
        for(int c=0;c<arr.length;c++){
        if(arr [c] != 0){
            return false;
        } 
        }
        return true;
    }
}
