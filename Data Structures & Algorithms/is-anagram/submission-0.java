class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> newMap = new HashMap<>();
        Map<Character,Integer> oldMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(Character c : s.toCharArray()){
            newMap.put(c, newMap.getOrDefault(c, 0)+1);
        }

        for(Character d : t.toCharArray()){
            oldMap.put(d, oldMap.getOrDefault(d, 0)+1);
        }

        return newMap.equals(oldMap);

    }
}
