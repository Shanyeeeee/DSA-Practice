class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> map = new HashMap<>();
        for(String word : strs){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        List<String> list = map.getOrDefault(key, new ArrayList<>());
        list.add(word);
        map.put(key,list);
            
    }
        return new ArrayList<>(map.values());
    }
}
