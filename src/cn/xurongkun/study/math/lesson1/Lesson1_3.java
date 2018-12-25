package cn.xurongkun.study.math.lesson1;

/**
 * TODO
 *
 * @author 徐荣坤
 * @version 1.0
 * @date 2018/12/16
 */
public class Lesson1_3 {
    /**
     * 或
     * @param num1
     * @param num2
     * @return
     */
    public static int or(int num1, int num2) {
        return num1 | num2;
    }

    /**
     * 与
     * @param num1
     * @param num2
     * @return
     */
    public static int and(int num1, int num2) {
        return num1 & num2;
    }

    /**
     * 异或
     * @param num1
     * @param num2
     * @return
     */
    public static int xor(int num1, int num2) {
        return num1 ^ num2;
    }

    public static void main(String[] args) {
        int a = 53;
        int b = 35;

        System.out.println(Lesson1_1.decimalToBinary(a));
        System.out.println(Lesson1_1.decimalToBinary(b));

        System.out.println("------------------");
        System.out.println(Lesson1_1.decimalToBinary(or(a, b)));
        System.out.println(Lesson1_1.decimalToBinary(and(a, b)));
        System.out.println(Lesson1_1.decimalToBinary(xor(a, b)));
    }
}
