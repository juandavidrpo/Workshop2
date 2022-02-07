import java.util.ArrayList;

public class CargoShip extends Ship {
    public static ArrayList<CargoShip> list = new ArrayList<>();
    public int capacity;
    public String solarPanel;


    public CargoShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int capacity, String solarPanel) {
        super(name, weight, power, typeFuel, motors, shuttleVehicle);
        this.capacity = capacity;
        this.solarPanel = solarPanel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSolarPanel() {
        return solarPanel;
    }

    public String isSolarPanel() {
        return solarPanel;
    }

    public void setSolarPanel(String solarPanel) {
        this.solarPanel = solarPanel;
    }

    @Override
    public void move() {

    }

    @Override
    public int propel() {
        return 0;
    }

    public static CargoShip createCargoShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int capacity, String solarPanel){
        CargoShip cargoShip = new CargoShip(name, weight, power, typeFuel, motors, shuttleVehicle, capacity,  solarPanel);
        list.add(cargoShip);

        for (int i=0; i< list.size(); i++){
            System.out.println("name: " + list.get(i).getName());
            System.out.println("Peso: " + list.get(i).getWeight());
            System.out.println("Potencia: " + list.get(i).getPower());
            System.out.println("Combustible: " + list.get(i).getTypeFuel());
            System.out.println("Motores: " + list.get(i).getMotors());
            System.out.println("Vehiculos de lanzadera: " + list.get(i).getShuttleVehicle());
            System.out.println("Capacidad: " + list.get(i).getCapacity());
            System.out.println("Panel solar: " + list.get(i).getSolarPanel());
        }

        return cargoShip;
    }
}
