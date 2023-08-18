package offer;

/**
 * @program: jianzhioffer2
 * @description:
 * @author: Bean
 * @create: 2023-08-19 00:50
 **/
public class of56a {

    public int[] singleNumbers(int[] nums) {
        int z = 0;
        for (int i = 0; i < nums.length; i++) {
            z = z ^ nums[i];
        }

        int m = 1;
        while ((m & z) == 0) {
            m = m << 1;
        }

        int y = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & m) != 0) {
                y = y ^ nums[i];
            }
        }
        return new int[]{y ^ z, y};

    }
    public int[] singleNumbers2(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        // a 和 b是两种数
        // eor != 0
        // eor最右侧的1，提取出来
        // eor :     00110010110111000
        //   ~eor    11001101001000111
        //   ~eor +1 11001101001001000
        // rightOne :00000000000001000
        int rightOne = eor & (~eor + 1); // 提取出最右的1


        int onlyOne = 0; // eor'
        for (int i = 0 ; i < arr.length;i++) {
            //  arr[1] =  111100011110000
            // rightOne=  000000000010000
            if ((arr[i] & rightOne) != 0) {
                onlyOne ^= arr[i];
            }
        }
        return new int[]{onlyOne,eor ^ onlyOne};
    }
}
