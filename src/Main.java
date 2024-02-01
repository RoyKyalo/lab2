// MainClass for testing the implementations
public class Main
{
    public static void main(String[] args)
    {
        // Test AmphibiousPlane
        AmphibiousPlane amphibiousPlane = new AmphibiousPlane();
        System.out.println("What is the Amphibious Plane doing?");
        amphibiousPlane.launch();
        amphibiousPlane.fly();
        amphibiousPlane.dock();

        System.out.println("********************");

        // Test ElectricCar
        ElectricCar electricCar = new ElectricCar();
        System.out.println("What type of battery packs does the electric car use?");
        electricCar.batteryType();

        System.out.println("********************");

        // Test ElectricBike
        ElectricBike electricBike = new ElectricBike();
        System.out.println("Does the electric bike use the same battery packs as the electric vehicle?");
        electricBike.batteryType();
    }
}

