package offer;

import java.math.BigInteger;

import static java.lang.Math.pow;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 15:26
 **/
public class of67 {
    public int strToInt(String str) {
        int i = 0;
        if (str == null || str.length() <= 0){
            return 0;
        }
        while(i< str.length() && str.charAt(i) == ' ') i++;
        int sign = 1;
        if (i == str.length() ) return 0;
        if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) == '.') {
            return 0;
        }
        if(str.charAt(i) == '-'){
            sign = -1;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        }
        //乘10之前判断是否越界
        int number = Integer.MAX_VALUE / 10;
        int res = 0;
        while ( i < str.length() && (0 <= str.charAt(i)-'0') && (str.charAt(i)-'0' <= 9)) {
            //判断是否越界问题
            if (res > number || (res == number && str.charAt(i) > '7')) {
                //根据字符串的第一位的符号来判断是返回最大值还是最小值
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            //字符获取数字需要去掉偏移值 - '0'
            res = res * 10 + (str.charAt(i) - '0');
            i++;
        }
        System.out.println(res);

        return sign * res;


    }
}
