class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int ans = right;
        while(left<=right){
            int mid = left + (right-left)/2;
            int totalHours = calculateTotalHours(piles, mid);
            if(totalHours<=h){
                ans = mid;

                right = mid - 1;
            }else{
                left=mid+1;
            }
        }
        return ans;  
    }

    public static int calculateTotalHours(int[] piles, int mid){
        int totalH = 0;
        for (int bananas : piles) {
            totalH += (int)Math.ceil((double)bananas / mid);
        }
        return totalH;
    }
}
