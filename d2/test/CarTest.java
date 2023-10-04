
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void carIsInstanceOf(){
        Car car = new Car("Company","Model",2005);
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    void carCheckWheels(){
        Car car = new Car("Company","Model",2005);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void carCheckTestDriveSpeed(){
        Car car = new Car("Company","Model",2005);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void carCheckParkSpeed(){
        Car car = new Car("Company","Model",2005);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
}
