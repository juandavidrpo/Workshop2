import java.util.ArrayList;

public class MaintenanceShip extends Ship {
    public static ArrayList<MaintenanceShip> list = new ArrayList<>();
    public int numRoboticArms;
    public String typesensors;


    public MaintenanceShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int numRoboticArms, String typesensors) {
        super(name, weight, power, typeFuel, motors, shuttleVehicle);
        this.numRoboticArms = numRoboticArms;
        this.typesensors = typesensors;
    }

    public int getNumRoboticArms() {
        return numRoboticArms;
    }

    public void setNumRoboticArms(int numRoboticArms) {
        this.numRoboticArms = numRoboticArms;
    }

    public String getTypeSensors() {
        return typesensors;
    }

    public void setTypeSensors(String typesensors) {
        this.typesensors = typesensors;
    }

    @Override
    public void move() {
    }

    @Override
    public int propel() {
        return 0;
    }

    public static MaintenanceShip createMaintenanceShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int numRoboticArms, String typesensors){
        MaintenanceShip maintenanceShip = new MaintenanceShip(name, weight, power, typeFuel, motors, shuttleVehicle, numRoboticArms,  typesensors);
        list.add(maintenanceShip);

        for (int i=0; i< list.size(); i++){
            System.out.println("name: " + list.get(i).getName());
            System.out.println("Peso: " + list.get(i).getWeight());
            System.out.println("Potencia: " + list.get(i).getPower());
            System.out.println("Combustible: " + list.get(i).getTypeFuel());
            System.out.println("Motores: " + list.get(i).getMotors());
            System.out.println("Vehiculos de lanzadera: " + list.get(i).getShuttleVehicle());
            System.out.println("Brazos roboticos: " + list.get(i).getNumRoboticArms());
            System.out.println("Sensor: " + list.get(i).getTypeSensors());
        }

        return maintenanceShip;
    }
}
