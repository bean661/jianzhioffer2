package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 19:11
 **/
public class of46 {

    public int translateNum(int num) {
        if (num <= 0) {
            return 1;
        }
        char[] s = String.valueOf(num).toCharArray();
        //int[] dp = new int[s.length+1];

        int a = 1;
        int b = 1;
        int c = 1;

        for (int i = 2; i < s.length + 1; i++) {
            int temp = 10 * (s[i - 2] - '0') + (s[i - 1] - '0');
            if (temp >= 10 && temp <= 25) {
                c = a + b;
            }else {
                c = b;
            }
            a = b;
            b = c;

        }
        return c;
    }
}
