import static org.assertj.core.api.Assertions.*;

 class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculateDiscount(100.0,90)).isEqualTo(10.0);
        assertThat(Calculator.calculateDiscount(100.0,50)).isEqualTo(50.0);
        assertThat(Calculator.calculateDiscount(100.0,10)).isEqualTo(90.0);

        assertThatThrownBy(() -> Calculator.calculateDiscount(100.0,110))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculateDiscount(100.0,-10))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculateDiscount(-100.0,50))
                .isInstanceOf(ArithmeticException.class);

    }
}
