public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "iPhone " + getVersionNumber() + " says " + getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
        System.out.println("Your iPhone Information:");
		System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier());
		System.out.println("Current Battery Charge: " + getBatteryPercentage() + "%");           
    }
}