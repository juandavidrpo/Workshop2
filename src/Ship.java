/**
 * se crea la clase abstracta de ship
 */
public abstract class Ship {
    public String name;
    public int weight;
    public int power;
    public String typeFuel;
    public int motors;
    public int shuttleVehicle;

    //constructor
    public Ship(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle) {
        this.name = name;
        this.weight = weight;
        this.power = power;
        this.typeFuel = typeFuel;
        this.motors = motors;
        this.shuttleVehicle = shuttleVehicle;
    }
    //metodos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public int getMotors() {
        return motors;
    }

    public void setMotors(int motors) {
        this.motors = motors;
    }

    public int getShuttleVehicle() {
        return shuttleVehicle;
    }

    public void setShuttleVehicle(int shuttleVehicle) {
        this.shuttleVehicle = shuttleVehicle;
    }

    public abstract void move();
    public abstract int propel();

}
