import Vehicles.Vehicle;

public class Plane extends Vehicle{
    private int category;

    public Plane(String name, int category){
        super(name, 10);
        this.category = category;
    }
    public void info(){
        super.info();
        System.out.printf(
            "Category: %s%n", this.category
        );
    }
}
