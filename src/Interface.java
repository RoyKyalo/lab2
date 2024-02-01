// Interface for the Amphibious vehicle's unique behavior
interface Amphibious
{
    void dock();
    void launch();
}

// Interface for the AirVehicle's unique behavior
interface AirVehicle
{
    void fly();
}

// implementation of both interfaces
class AmphibiousPlane implements Amphibious, AirVehicle
{
    @Override
    public void dock()
    {
        System.out.println("The Amphibious Plane is docking on the shore of lake...");
    }

    @Override
    public void launch() {
        System.out.println("The Amphibious Plane is launching from the shore of the lake...");
    }

    @Override
    public void fly() {
        System.out.println("The Amphibious Plane is flying in the air...");
    }
}

abstract class ElectricVehicle {
    abstract void batteryType();
}

// ElectricCar extending ElectricVehicle
class ElectricCar extends ElectricVehicle {
    @Override
    void batteryType() {
        System.out.println("This electric car uses a unique set of Li-ion battery packs...");
    }
}

// ElectricBike class extending ElectricVehicle
class ElectricBike extends ElectricVehicle {
    @Override
    void batteryType() {
        System.out.println("This electric bike uses a different set of battery packs from the Electric Car...");
    }
}

