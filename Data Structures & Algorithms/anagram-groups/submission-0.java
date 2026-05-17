class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = String.valueOf(c);
            if(map.containsKey(str)){
                map.get(str).add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(str, list);
            }
        }
        return new ArrayList <>(map.values());
    }
}
