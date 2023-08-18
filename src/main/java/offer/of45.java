package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-18 18:34
 **/
public class of45 {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        quickSort(strs, 0, strs.length - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);
        }

        return sb.toString();
    }

    private void quickSort(String[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int i = partition(arr, left, right);
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);

    }

    private int partition(String[] arr, int left, int right) {
        String pivot = arr[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i <= j && (arr[i] + pivot).compareTo(pivot + arr[i]) <= 0) {
                i++;
            }
            while (i <= j && (arr[j] + pivot).compareTo(pivot + arr[j]) >= 0) {
                j--;
            }
            if (i >= j) {
                break;
            }
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;



        }

        arr[left] = arr[j];
        arr[j] = pivot;


        return j;
    }
}
