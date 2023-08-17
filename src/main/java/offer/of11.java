package offer;

/**
 * @program: coding1
 * @description:
 * @author: Bean
 * @create: 2023-08-16 20:26
 **/
public class of11 {
    public int minArray(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        int l = 0;
        int r = numbers.length - 1;
        while (l != r) {

            if (numbers[l] < numbers[r]) {
                return numbers[l];
            }

            int mid = (l + r) / 2;
            if (numbers[l] < numbers[mid]) {
                l = mid+1;
            } else if (numbers[l] > numbers[mid]) {
                r = mid;
            }else {
                l++;
            }

        }
        return numbers[l];
    }
}
