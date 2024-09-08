class Car extends Vehicle {
    
    private String model;
    private String color;

    public Car(String color, String model, String fuelTank, int speed) {
        super(fuelTank, speed);
        this.color = color;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

public void desc(){
    System.out.println("this car model is vintage:- "+model+"and color is "+color);
}

public void wheels(){
    System.out.println("total four wheels");
}

public void displayDetails(){
    System.out.println("Vintage model:- "+model+" and Color is :-"+color);
}

}
