public class Bike extends Vehicle {

    private String bikeType;

    public Bike(String bikeType, String fuelTank, int speed) {
        super(fuelTank, speed);
        this.bikeType = bikeType;
    }

    
    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }
    
    public void desc(){
        System.out.println("this bike is a:- "+bikeType+"Bike.");
    }
    

    public void wheels(){
        System.out.println("This bike has two wheels");
    }


    public void displayDetails(){
        System.out.println("This bike is a "+bikeType+"bike");
    }
}
