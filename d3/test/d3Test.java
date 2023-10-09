import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class d3Test {

    @Test
    void testEvenOddNumber(){
        assertThat(d3.evenOddNumber(10)).isEqualTo(true);
        assertThat(d3.evenOddNumber(9)).isEqualTo(false);
    }

    @Test
    void  testNumberInInterval(){
        assertThat(d3.numberInInterval(100)).isEqualTo(false);
        assertThat(d3.numberInInterval(25)).isEqualTo(false);
        assertThat(d3.numberInInterval(150)).isEqualTo(false);
        assertThat(d3.numberInInterval(10)).isEqualTo(false);
        assertThat(d3.numberInInterval(99)).isEqualTo(true);
        assertThat(d3.numberInInterval(26)).isEqualTo(true);
        assertThat(d3.numberInInterval(50)).isEqualTo(true);
    }

}
