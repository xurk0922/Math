package cn.xurongkun.study.math.lesson5;

import java.util.ArrayList;

/**
 * TODO
 *
 * @author 徐荣坤
 * @version 1.0
 * @date 2018/12/25
 */
public class ThingQuestion {
    /**
     * @param target     要分解的值
     * @param expression 保存表达式
     */
    public static void get(int target, ArrayList<Integer> expression) {
        if (1 == target) {
            expression.add(0, 1);
            System.out.println(expression);
        } else {
            for (int i = 2; i <= target; i++) {
                if (target % i == 0) {
                    ArrayList<Integer> newExpression = (ArrayList<Integer>) expression.clone();
                    newExpression.add(i);

                    get(target / i, newExpression);
                }
            }
        }
    }

    public static void main(String[] args) {
        get(8, new ArrayList<>());
    }
}
