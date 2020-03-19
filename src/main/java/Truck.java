public class Truck extends Automobile {
  private double bedLengthFeet;
  private double bedWidthFeet;
  private double containerHeightFeet;
  private float currentLoadCubicFeet;
  private double volumeCapacity;

  public Truck(String type, String name, String make, int mpg, int fuelCapacity,
      double bedLengthFeet, double bedWidthFeet) {
    super(type, name, make, mpg, fuelCapacity);
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.containerHeightFeet = 3;
    setInService(false);
  }

  public Truck(String type, String name, String make, int mpg, int fuelCapacity,
      double bedLengthFeet, double bedWidthFeet, double containerHeightFeet) {
    this(type, name, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
    this.containerHeightFeet = containerHeightFeet;
  }

  public Truck(String type, String name, String make, int mpg, int fuelCapacity,
      double bedLengthFeet, double bedWidthFeet, float currentLoadCubicFeet) {
    this(type, name, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
    this.currentLoadCubicFeet = currentLoadCubicFeet;
    this.containerHeightFeet = 3;
  }

  public Truck(String type, String name, String make, int mpg, int fuelCapacity,
      double bedLengthFeet, double bedWidthFeet, double containerHeightFeet, float currentLoadCubicFeet) {
    this(type, name, make, mpg, fuelCapacity, bedLengthFeet, bedWidthFeet);
    this.currentLoadCubicFeet = currentLoadCubicFeet;
    this.containerHeightFeet = containerHeightFeet;
  }

  public double getVolumeCapacity(){
    volumeCapacity = bedLengthFeet * bedWidthFeet * containerHeightFeet;
    return volumeCapacity;
  }

  public boolean addToCurrentLoad(double newCargo){
    if((currentLoadCubicFeet + newCargo) <= volumeCapacity){
      currentLoadCubicFeet += newCargo;
      return true;
    } else {
      return false;
    }
  }

  public double emptyCurrentLoad(){
    currentLoadCubicFeet = 0;
    return currentLoadCubicFeet;
  }

  @Override
  public String companyGreeting(){
    return "Thank you for shipping with gÜber.";
  }

  public double getBedLengthFeet() {
    return bedLengthFeet;
  }

  public double getBedWidthFeet() {
    return bedWidthFeet;
  }

  public double getContainerHeightFeet() {
    return containerHeightFeet;
  }

  public float getCurrentLoadCubicFeet() {
    return currentLoadCubicFeet;
  }
}
