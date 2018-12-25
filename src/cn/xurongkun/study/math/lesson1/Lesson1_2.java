package cn.xurongkun.study.math.lesson1;

/**
 * TODO
 *
 * @author 徐荣坤
 * @version 1.0
 * @date 2018/12/16
 */
public class Lesson1_2 {
    /**
     * 将数字左移
     *
     * @param num 要移位的数字
     * @param m   移动的位数
     * @return 移位后的结果
     */
    public static int leftShift(int num, int m) {
        return num << m;
    }

    /**
     * 右移数字
     *
     * @param num 要位移的数字
     * @param m   移动的位数
     * @return 移位后的结果
     */
    public static int rightShift(int num, int m) {
        // >>>用于表示逻辑右移，会移动符号位
        return num >>> m;
    }

    public static void main(String[] args) {
        System.out.println(Lesson1_1.decimalToBinary(Integer.MAX_VALUE));
        System.out.println(Lesson1_1.decimalToBinary(Integer.MAX_VALUE).length());
        System.out.println(Lesson1_1.decimalToBinary(Integer.MIN_VALUE));
        System.out.println(Math.pow(-2, 31) == Integer.MIN_VALUE);
        System.out.println(Lesson1_1.decimalToBinary(Integer.MIN_VALUE).length());
        //


        System.out.println("int最小值:" + Integer.MIN_VALUE);
        System.out.println("int最大值：" + Integer.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);
    }
}
