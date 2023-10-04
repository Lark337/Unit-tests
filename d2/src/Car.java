public class Car extends Vehicle {
    public Car(String company,String model, Integer yearRelease){
        setCompany(company);
        setModel(model);
        setYearRelease(yearRelease);
        setNumWheels(4);
        setSpeed(0);
    }


    @Override
    public void testDrive(){
        setSpeed(60);
    }

    @Override
    public void park(){
        setSpeed(0);
    }
}
