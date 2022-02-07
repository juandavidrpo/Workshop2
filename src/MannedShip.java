import java.util.ArrayList;

public class MannedShip extends Ship implements IShip {
    public static ArrayList<MannedShip> list = new ArrayList<>();
    public int numberPassengers;
    public String category;


    public MannedShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int numberPassengers, String category) {
        super(name, weight, power, typeFuel, motors, shuttleVehicle);
        this.numberPassengers = numberPassengers;
        this.category = category;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void up(){
    }

    public boolean quota(int numberPassengers){
        if(numberPassengers <= 50){
            return true;
        }
        return false;
    }

    @Override
    public void move() {

    }

    @Override
    public int propel() {
        return 0;
    }
    //caso impootetico para calcular la velocidad de la sonda
    @Override
    public float calculateVelocity() {
        float velocity = (float) (motors * weight * 9.8);
        return velocity;
    }

    public static MannedShip createMannedShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int numberPassengers, String category){
        MannedShip mannedShip = new MannedShip(name, weight, power, typeFuel, motors, shuttleVehicle, numberPassengers,  category);
        list.add(mannedShip);

        for (int i=0; i< list.size(); i++){
            System.out.println("name: " + list.get(i).getName());
            System.out.println("Peso: " + list.get(i).getWeight());
            System.out.println("Potencia: " + list.get(i).getPower());
            System.out.println("Combustible: " + list.get(i).getTypeFuel());
            System.out.println("Motores: " + list.get(i).getMotors());
            System.out.println("Vehiculos de lanzadera: " + list.get(i).getShuttleVehicle());
            System.out.println("Pasajeros: " + list.get(i).getNumberPassengers());
            System.out.println("Categoria: " + list.get(i).getCategory());
        }

        return mannedShip;
    }
}
