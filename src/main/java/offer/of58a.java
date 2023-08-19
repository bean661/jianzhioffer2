package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 09:52
 **/
public class of58a {

    public String reverseWords(String s) {

        if (s.length() <= 0) {
            return "";
        }

        int i = s.length() - 1;
        int j = i;
        StringBuilder builder = new StringBuilder();
        while (i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--;
            builder.append(s.substring(i + 1, j + 1) + " ");
            while (i>=0 && s.charAt(i) == ' ') i--;
            j= i;
        }
        return builder.toString().trim();

    }
    public String reverseWords2(String s) {
        if (s.length() <=0){
            return "";
        }
        //输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
        // 为简单起见，标点符号和普通字母一样处理。
        // 例如输入字符串"I am a student. "，则输出"student. a am I"。
        s.replace("  ", " ");
        String[] s1 = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = s1.length - 1 ; i >= 0; i--) {
            if (!s1[i].equals("")){
                builder.append(s1[i] + " ");
            }

        }

        return builder.toString().trim();

    }
}
