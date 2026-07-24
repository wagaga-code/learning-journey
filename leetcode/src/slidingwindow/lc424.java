package slidingwindow;

/**
 * @Author: 21246
 * @Date: 2026/7/24
 * @Description:替换后的最长重复字符 给你一个字符串 s 和一个整数 k 。你可以选择字符串中的任一字符，并将其更改为任何其他大写英文字符。该操作最多可执行 k 次。
 * <p>
 * 在执行上述操作后，返回 包含相同字母的最长子字符串的长度。
 */
public class lc424 {
    public int characterReplacement(String s, int k) {
        /*难度的话为中等
        还是滑动窗口的思想。题目要求改写k个字符让其连续相同
        那们的话要求就是记录相等的字符的数量+k就是滑窗的大小了
         */
        int[] count = new int[26];
        int maxNumber = 0;
        int length = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            //右节点不断的进来
            char c = s.charAt(right);
            count[c - 'A']++;
            maxNumber = Math.max(maxNumber, count[c - 'A']);

            //收缩窗口
            if ((right - left + 1)-maxNumber > k) {
                count[c - 'A'] --;
                left++;
            }
            length=Math.max(length, right - left + 1);

        }
        return length;
    }
}