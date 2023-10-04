import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MotorcycleTest {
    @Test
    void motorcycleIsInstanceOf(){
        Motorcycle motorcycle = new Motorcycle("Company","Model",2005);
        assertThat(motorcycle).isInstanceOf(Vehicle.class);
    }

    @Test
    void carCheckWheels(){
        Motorcycle motorcycle = new Motorcycle("Company","Model",2005);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carCheckTestDriveSpeed(){
        Motorcycle motorcycle = new Motorcycle("Company","Model",2005);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void carCheckParkSpeed(){
        Motorcycle motorcycle = new Motorcycle("Company","Model",2005);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
