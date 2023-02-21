package easy;

import java.util.function.UnaryOperator;

 class FactorialOneLine {
    final UnaryOperator<Integer> calculate = i -> i == 0 ? 1 : i * this.calculate.apply(i - 1);
}
