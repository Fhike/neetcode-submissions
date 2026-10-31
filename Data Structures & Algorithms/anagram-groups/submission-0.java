class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            
            int[] freq = new int[26];

            for(char c : word.toCharArray()){
                freq[c - 'a']++;
            }

            String key = Arrays.toString(freq);
            if(map.containsKey(key)){
                map.get(key).add(word);
            }else{
                map.put(key, new ArrayList<>(List.of(word)));
            }
        }
        return new ArrayList<>(map.values());
    }
}
