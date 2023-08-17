package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 18:23
 **/
public class of05 {

    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(s.charAt(i));
            }

        }

        return  stringBuilder.toString();
    }
}
