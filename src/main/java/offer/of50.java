package offer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 21:06
 **/
public class of50 {

    public char firstUniqChar(String s) {
        if (s == null || s.length() <= 0) {
            return ' ';
        }
        Map<Character, Boolean> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.get(s.charAt(i)) == null ? true : false);
        }
        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
            if (entry.getValue()){
                return entry.getKey();
            }
        }


        return ' ';
    }
}
