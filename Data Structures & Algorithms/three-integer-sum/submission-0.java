class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int m = i + 1;
            int right = nums.length - 1;

            while (m < right) {

                int sum = nums[i] + nums[m] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(
                            nums[i],
                            nums[m],
                            nums[right]
                    ));

                    while (m < right &&
                           nums[m] == nums[m + 1]) {
                        m++;
                    }

                    while (m < right &&
                           nums[right] == nums[right - 1]) {
                        right--;
                    }

                    m++;
                    right--;

                } else if (sum > 0) {

                    right--;

                } else {

                    m++;
                }
            }
        }

        return result;
    }
}