package inheritancexample;
public class MainClass {
    public static void main(String[] args) {

        System.out.println("-----------------vehicle parent class-----------------");
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.fueling();

        System.out.println("-----------------Air vehicle child class-----------------");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.travelOnAir();
        airVehicle.start();
        airVehicle.stop();
        airVehicle.fueling();

        System.out.println("-----------------Water vehicle child class-----------------");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.travelOnWater();
        waterVehicle.start();
        waterVehicle.stop();
        waterVehicle.fueling();

        System.out.println("-----------------Road vehilce child class-----------------");
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.travelOnRoad();
        roadVehicle.start();
        roadVehicle.stop();
        roadVehicle.fueling();
    }
}
