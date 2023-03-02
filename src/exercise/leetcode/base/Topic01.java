package exercise.leetcode.base;

public class Topic01 {
    //暴力枚举法
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] a = answer(nums, 6);
        System.out.println("===数组下标为===");
        for (int i : a) {
            System.out.print(i+"\t");
        }
    }

    public static int[] answer(int[] nums, int target) {
        int[] res = new int[2];
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
