package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 22:12
 **/
public class of53a {
    public int search(int[] nums, int target) {
    //常见题型：
        // 1.寻找第一个大于等于 target 的数   2.寻找第一个等于 target 的数
        // 3.寻找最后一个大于等于 target 的数 4.寻找最后一个等于 target 的数
        //PS：其实这里是不需要写两个查找函数的，可以把代码优化放在同一个方法里滴
        if (nums == null || nums.length <= 0) {
            return 0;
        }

        int left = search2(nums, target);
        int right = search4(nums, target);

        if (left < 0 || right < 0) {
            return 0;
        }
        return right - left + 1;

    }

    private int search4(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (right - left + 1) /2 + left;
            if (nums[mid] <= target) {
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        if (nums[left] != target) {
            return -1;
        }
        return left;
    }
    //2.寻找第一个等于 target 的数
    private int search2(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid  = (right - left ) /2 +left;
            if (nums[mid] >= target) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }

        if (nums[left] != target) {
            return -1;
        }
        return left;
    }
}
