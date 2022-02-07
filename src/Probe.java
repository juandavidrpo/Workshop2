import java.util.ArrayList;

public class Probe extends Ship implements IShip{
    public static ArrayList<Probe> list = new ArrayList<>();
    public int orbitTime;
    public String explore;


    public Probe(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int orbitTime, String explore) {
        super(name, weight, power, typeFuel, motors, shuttleVehicle);
        this.orbitTime = orbitTime;
        this.explore = explore;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public String getExplore() {
        return explore;
    }

    public void setExplore(String explore) {
        this.explore = explore;
    }

    @Override
    public void move() {
    }

    @Override
    public int propel() {
        return 0;
    }

    @Override
    public float calculateVelocity() {
        float velocity = (float) (weight*9.8);
        return velocity;
    }

    public static Probe createProbe(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int orbitTime, String explore){
        Probe probe = new Probe(name, weight, power, typeFuel, motors, shuttleVehicle, orbitTime,  explore);
        list.add(probe);

        for (int i=0; i< list.size(); i++){
            System.out.println("name: " + list.get(i).getName());
            System.out.println("Peso: " + list.get(i).getWeight());
            System.out.println("Potencia: " + list.get(i).getPower());
            System.out.println("Combustible: " + list.get(i).getTypeFuel());
            System.out.println("Motores: " + list.get(i).getMotors());
            System.out.println("Vehiculos de lanzadera: " + list.get(i).getShuttleVehicle());
            System.out.println("Tiempo en orbita: " + list.get(i).getOrbitTime());
            System.out.println("Exploracion: " + list.get(i).getExplore());
        }

        return probe;
    }

}
