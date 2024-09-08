
public class Vehicle {

    private int speed;
    private String fuelTank;

    public Vehicle(String fuelTank, int speed) {
        this.fuelTank = fuelTank;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelTank() {
        return fuelTank;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuelTank(String fuelTank) {
        this.fuelTank = fuelTank;
    }


    public void desc(){
        System.out.println("This is Normal vehical...");
    }

    public void wheels(){
        System.out.println("this vehical has four wheels");
    }

    public void displayDetails(){
        System.out.println("Maximum speed:- "+speed +"km/h, fuel tank:- "+fuelTank);
    }
    
}