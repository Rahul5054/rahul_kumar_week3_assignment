public class Main {
    
    public static void main(String[] args) {
        Vehicle myveh=new Vehicle("petrol",120);

        myveh.desc();
        myveh.wheels();
        myveh.displayDetails();
System.out.println("==============================");

Vehicle myCar=new Car("White", "Ford", "Diesel", 185);

myCar.desc();
myCar.wheels();
myCar.displayDetails();

System.out.println("====================================");
    

Vehicle myBike=new Bike("sports", "petrol", 210);


myBike.desc();      
myBike.wheels();
myBike.displayDetails();

}
}