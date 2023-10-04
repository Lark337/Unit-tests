public class Motorcycle extends Vehicle {
    public Motorcycle(String company,String model, Integer yearRelease){
        setCompany(company);
        setModel(model);
        setYearRelease(yearRelease);
        setNumWheels(2);
        setSpeed(0);
    }


    @Override
    public void testDrive(){
        setSpeed(75);
    }

    @Override
    public void park(){
        setSpeed(0);
    }
}
