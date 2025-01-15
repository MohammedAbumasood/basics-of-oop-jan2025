package inheritancexample;

public class AirVehicle extends Vehicle{

    public void travelOnAir(){
        System.out.println("These vehicle travels on the Air");
    }

    @Override
    public void start() {
        System.out.println("Air vehicle started");
    }

    @Override
    public void stop() {
        System.out.println("Air vehicle stopped");
    }

    @Override
    public void fueling() {
        System.out.println("Air vehicle is fueled");
    }
}
