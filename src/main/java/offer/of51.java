package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 21:26
 **/
public class of51 {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }

        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = (right - left)/2 + left;
        int l1 = mergeSort(nums, left, mid);
        int l2 = mergeSort(nums, mid + 1, right);
        int l3 = merge(nums, left, mid, mid + 1, right);

        return l1+l2+l3;
    }

    private int merge(int[] nums, int l1, int r1, int l2, int r2) {
        int[] temp = new int[r2 - l1 + 1];
        int count = 0;
        int i = l1, j= l2,k = 0;
        while (i <= r1 && j <= r2) {
            if (nums[i] > nums[j]) {
                count = count + (l2 - i);
                temp[k++] = nums[j++];
            }else {
                temp[k++] = nums[i++];
            }
        }


        while (i<=r1) temp[k++] = nums[i++];
        while (j<=r2) temp[k++] = nums[j++];

        for (int l = 0; l < temp.length; l++) {
            nums[l1 + l] = temp[l];
        }


        return count;

    }
}
