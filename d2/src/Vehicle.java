public abstract class Vehicle {
    // содержит абстрактные методы "testDrive()" и "park()", а также поля "company",
    //"model", "yearRelease", "numWheels" и "speed".

    private String company;
    private String model;
    private Integer yearRelease;
    private Integer numWheels;
    private Integer speed;

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearRelease(Integer yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearRelease() {
        return yearRelease;
    }

    public Integer getNumWheels() {
        return numWheels;
    }

    public Integer getSpeed() {
        return speed;
    }

    void testDrive(){

    }
    void park(){

    }
}
