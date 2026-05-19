class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]", "");
        String lc = c.toLowerCase();
        StringBuilder sb = new StringBuilder(lc);
        sb.reverse();

        if(sb.toString().equals(lc)){
            return true;
        }
        return false;
    }
}
