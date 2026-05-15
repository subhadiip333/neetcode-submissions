class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> newMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(Character c : s.toCharArray()){
            newMap.put(c, newMap.getOrDefault(c, 0)+1);
        }

        for(Character d : t.toCharArray()){
            if(!newMap.containsKey(d)){
                return false;
            }
            newMap.put(d, newMap.get(d)-1);

            if(newMap.get(d) < 0){
                return false;
            }
        }

        return true;

    }
}
