interface PassangersAuto {
    void transportPassangers();
}
interface CargoAuto {
    void transportCargo();
}
class Truck implements CargoAuto {
    public void transportCargo() {
        System.out.println("Везу груз");
    }
}
class Sedan implements PassangersAuto {
    public void transportPassangers() {
        System.out.println("Везу пассажиров");
    }
}
class Pickup implements CargoAuto, PassangersAuto {
    public void transportCargo() {
        System.out.println("Везу груз");
    }
    public void transportPassangers() {
        System.out.println("Везу пассажиров");
    }
}
public class Interface {
    public static void main(String[] args) {
        System.out.println("truck:");
        Truck truck = new Truck();
        truck.transportCargo();
        System.out.println("sedan:");
        Sedan sedan = new Sedan();
        sedan.transportPassangers();
        System.out.println("pickup:");
        Pickup pickup = new Pickup();
        pickup.transportCargo();
        pickup.transportPassangers();
    }
}
