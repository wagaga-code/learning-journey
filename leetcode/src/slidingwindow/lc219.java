package slidingwindow;

import java.util.HashMap;

/**
 * @Author: 21246
 * @Date: 2026/7/24
 * @Description:存在重复元素|| 给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，
 * 满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
 */
public class lc219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /*首先思考一下，要对数据进行什么样的操作，需要判断重复的两个元素的索引差值，看与k的大小
        那该如何获得重复元素的差值呢？
        首先想到hashmap的性质，检索快，可以快速找到重复元素的位置，然后也有value可以记录重复元素的索引位置
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int difference = Math.abs(map.get(nums[i]) - i);
                if (difference <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}