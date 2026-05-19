class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]", "");
        String lc = c.toLowerCase();
        StringBuilder sb = new StringBuilder();
        char[] arr = lc.toCharArray();
        for(int i=lc.length()-1; i>=0; i--){
            sb.append(arr[i]);
        }

        if(sb.toString().equals(lc)){
            return true;
        }
        return false;
    }
}
