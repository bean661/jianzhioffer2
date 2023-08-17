package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-17 19:10
 **/
public class of26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {

        if (A == null || B == null) {
            return false;
        }

        if (isSubTree(A, B)) {
            return true;
        }

        return isSubStructure(A.left, B) || isSubStructure(A.right, B);

    }

    boolean isSubTree(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }

        if (A.val != B.val) {
            return false;
        }
        return isSubTree(A.left, B.left) && isSubTree(A.right, B.right);

    }
}
