package cn.xurongkun.study.math.lesson1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author 徐荣坤
 * @version 1.0
 * @date 2018/12/16
 */
public class Lesson1_1 {

    /**
     * 十进制转换成二进制
     *
     * @param decimalSource 源数字
     * @return 二进制结果
     */
    public static String decimalToBinary(int decimalSource) {
        BigInteger bi = new BigInteger(String.valueOf(decimalSource));

        return bi.toString(2);
    }

    /**
     * 将十进制转成二进制
     * @param deciamlSource
     * @return
     */
    public static String myDecimalToBinary(int deciamlSource) {
        StringBuilder result = new StringBuilder();
        while (deciamlSource != 0) {
            result.append(deciamlSource & 1);
            deciamlSource = deciamlSource >> 1;
        }

        return result.reverse().toString();
    }

    /**
     * 将二进制转成十进制
     *
     * @param binarySource 二进制数字字符串
     * @return 十进制结果
     */
    public static int binaryToDeciaml(String binarySource) {
        BigInteger bi = new BigInteger(binarySource, 2);

        return Integer.parseInt(bi.toString());
    }

    public static void main(String[] args) {
        int a = 1234;

        System.out.println(Lesson1_1.decimalToBinary(a));
        System.out.println(Lesson1_1.myDecimalToBinary(a));
        System.out.println("int最大值二进制：" + Lesson1_1.decimalToBinary(Integer.MAX_VALUE));
        System.out.println("int最小值二进制：" + Lesson1_1.decimalToBinary(Integer.MIN_VALUE));
    }
}