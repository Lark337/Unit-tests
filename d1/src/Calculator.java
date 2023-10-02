public class Calculator {
    public static Double calculateDiscount(Double price,Integer discount){
        if (price >= 0 && discount > 0 && discount <= 100) {
            return price / 100 * (100 - discount);
        }
        else {
            throw new ArithmeticException();
        }
    }
}
