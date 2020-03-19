public class AutomobileDriver {

  public static void main(String[] args) {
    CarTest();
    TruckTest();
  }

  private static void TruckTest() {
    Truck monkey = new Truck("Monster", "Monkey!", "BEEF", 4, 50,
        10, 10, 5.5);
    System.out.println(monkey.isInService());
    System.out.println(monkey.getVolumeCapacity());
    System.out.println(monkey.addToCurrentLoad(400));
    System.out.println(monkey.getCurrentLoadCubicFeet());
    System.out.println(monkey.emptyCurrentLoad());
  }

  private static void CarTest() {
    Car coco = new Car("Corolla", "Coco", "Toyota",
        23, 15,5, 2);
    coco.addPassengers(4);
    System.out.println(coco.getType() + "\n" + coco.getName() + "\n"
    + coco.getMake() + "\n" + coco.getMpg() + "\n" + coco.getFuelCapacity()
    + "\n" + coco.getCapacity() + "\n" + coco.getNumPassengers());
    System.out.println(coco.companyGreeting());
    coco.exitPassengers(1);
    System.out.println(coco.getNumPassengers());

    coco.toggleEngine();
    System.out.println(coco.isRunning());
    coco.toggleEngine();
    System.out.println(coco.isRunning());

    System.out.println(coco.isInService());
    coco.carAccident();
    System.out.println(coco.isInService());

    coco.repair();
    System.out.println(coco.isInService());
  }

}
