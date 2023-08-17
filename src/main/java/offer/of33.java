package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 23:27
 **/
public class of33 {

    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null) {
            return true;
        }

        return f(postorder, 0, postorder.length - 1);
    }

    boolean f(int[] postorder, int i, int j) {
        if (i >= j) {
            return true;
        }
        int temp = i;

        //while(postorder[temp] < postorder[j]) temp++;
        // 最后一个元素是根节点  找到第一个大于根节点的值  判断后面有没有比根节点小的值
        for (int k = i; k <= j; k++) {
            if (postorder[k] >= postorder[j]) {
                temp = k;
                break;
            }
        }
        System.out.println(temp);
        for (int k = temp; k < j; k++) {
            if (postorder[k] < postorder[j]) {
                return false;
            }
        }

        return f(postorder, i, temp - 1) && f(postorder, temp, j-1);
    }
}
