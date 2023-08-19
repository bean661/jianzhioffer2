package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 10:22
 **/
public class of58b {
    public String reverseLeftWords(String s, int n) {
        //输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
        StringBuilder builder = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            builder.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}
