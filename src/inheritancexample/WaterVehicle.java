package inheritancexample;

public class WaterVehicle extends Vehicle{

    public void travelOnWater(){
        System.out.println("These vehicle travel on water");
        // To use Super keyword
        System.out.println("Brand Name is :"+super.brandName);
        System.out.println("Vehical colour  :"+super.colour);
    }

    @Override
    public void start() {
        System.out.println("water vehicle started");
    }

    @Override
    public void stop() {
        System.out.println("water vehicle stopped");
    }

    @Override
    public void fueling() {
        System.out.println("water vehicle fueled");
    }
}
