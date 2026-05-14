class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int n : nums){
            freqMap.put(n, freqMap.getOrDefault(n, 0)+1);
        }

        for(int c : freqMap.values()){
            if(c>1){
                return true;
            }
        }
        return false;
    }
}