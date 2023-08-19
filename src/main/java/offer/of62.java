package offer;

import java.util.LinkedList;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 13:45
 **/
public class of62 {

    public int lastRemaining(int n, int m) {
        if (n == 0) {
            return n;
        }
        return (lastRemaining(n-1,m)+m)%n;
    }
}
