// 2022-03-09 18:27:27
// 1
package editor.en;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main (String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,4};
        int target = 6;
        int[] res = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
// TIME:

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int another = target - nums[i];
                if (map.containsKey(another)) {
                    return new int[]{i, map.get(another)};
                } else {
                    map.put(nums[i], i);
                }
            }
            return new int[2];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
    
