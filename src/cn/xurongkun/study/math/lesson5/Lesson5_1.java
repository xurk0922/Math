package cn.xurongkun.study.math.lesson5;

import java.util.ArrayList;

/**
 * TODO
 *
 * @author 徐荣坤
 * @version 1.0
 * @date 2018/12/25
 */
public class Lesson5_1 {
    public static final long[] rewards = {1, 2, 5, 10};
    public static int count = 0;

    /**
     *
     * @param totalRewards 奖金总额
     * @param result 当前解
     */
    public static void get(long totalRewards, ArrayList<Long> result) {
        if (totalRewards == 0) {
            System.out.println(result);
            count++;
        } else if (totalRewards < 0) {
            return;
        } else {
            for (int i = 0; i < rewards.length; i++) {
                ArrayList<Long> newResult = (ArrayList<Long>) result.clone();
                newResult.add(rewards[i]);
                get(totalRewards - rewards[i], newResult);
            }
        }
    }

    public static void main(String[] args) {
        Lesson5_1.get(10L, new ArrayList<Long>());
        System.out.println(count);
    }
}
