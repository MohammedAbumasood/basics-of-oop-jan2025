package inheritancexample;

public class RoadVehicle extends Vehicle {

    public void travelOnRoad(){
        System.out.println("These vehicle travels on the roads");
    }

    @Override
    public void start() {
        System.out.println("Road vehicle started");
    }

    @Override
    public void stop() {
        System.out.println("Road vehicle stopped");
    }

    @Override
    public void fueling() {
        System.out.println("Road vehicle fueled");
    }
}
