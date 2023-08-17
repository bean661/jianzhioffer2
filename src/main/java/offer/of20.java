package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 13:23
 **/
public class of20 {

    public boolean isNumber(String s) {
        if (s == null || s.length() <= 0) {
            return false;
        }
        // 过滤空格
        char[] res = s.trim().toCharArray();
        if(res.length <= 0 ) return false;

        boolean is_num = false;
        boolean is_dot = false;
        boolean is_e_or_E = false;

        for (int i = 0; i < res.length; i++) {
            if (res[i] >= '0' && res[i] <= '9') {
                is_num = true;
            } else if (res[i] == '.') {
                // 前面不能出现有小数点 或者E
                if (is_dot || is_e_or_E) {
                    return false;
                }
                is_dot = true;
            }else if (res[i] == 'e' || res[i] == 'E'){
                //前面没出现过e E  必须要出现数字
                if (is_e_or_E || !is_num) {
                    return false;
                }
                is_e_or_E = true;
                is_num = false;
            } else if (res[i] == '-' || res[i] == '+') {
                if (i != 0 && res[i - 1] != 'e' && res[i - 1] != 'E') {
                    return false;
                }
            }else {
                return false;
            }


        }
        return false;

    }
}
