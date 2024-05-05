import java.math.BigDecimal;
import java.util.List;

public class Adder {

    public int add(int a, int b){
        return a + b;
    }

    public BigDecimal add(List<BigDecimal> decimals){
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal num : decimals) {
            sum = sum.add(num);
        }
        return sum;
    }
}
