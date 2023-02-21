package easy;

 class RemoveDuplicates {
     static int removeDuplicates(int[] nums) {
        int k = 0;
        int i = 0;
        while (i < nums.length - 1 && nums[i] != -101) {
            while (nums[i] == nums[i + 1] && nums[i] != -101) {
                remove(nums, i);
                nums[nums.length - 1 - k] = -101;
                k++;
            }
            i++;
        }


        return nums.length - k;
    }

    private static void remove(int[] nums, int i) {
        for (int j = i; j < nums.length - 1; j++) {
            nums[j] = nums[j + 1];
        }

    }
}
