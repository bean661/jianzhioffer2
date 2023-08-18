package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 19:57
 **/
public class of48 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() <= 0) {
            return 0;
        }

        int[] dp = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        int max = 1;
        dp[0] = 1;
        map.put(s.charAt(0), 0);
        for (int i = 1; i < s.length(); i++) {

            if (!map.containsKey(s.charAt(i))){
                dp[i] = dp[i - 1] + 1;
            }else{
                int k = map.get(s.charAt(i));
                if (k >= i - dp[i - 1]) {
                    dp[i] = i - k;
                }
                else {
                    dp[i] = dp[i - 1] + 1;
                }
            }
            max = Math.max(dp[i], max);
            map.put(s.charAt(i), i);
        }

        return max;


    }
}
