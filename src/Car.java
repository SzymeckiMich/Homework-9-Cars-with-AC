public class Car extends Vehicle {
    private boolean AC;

    public Car(String name, double tankCapacity, double averageFuelOn100, boolean AC) {
        super(name, tankCapacity, averageFuelOn100);
        this.AC = AC;
    }

    public boolean isAC() {
        return AC;
    }

    @Override
    public void setAC(boolean AC) {
        this.AC = AC;
    }

    @Override
    public double totalConsumption() {
        if (isAC()) {
            return super.totalConsumption() + 0.8;
        } else {
            return super.totalConsumption();
        }
    }

    @Override
    public double range() {
        return (getTankCapacity() / totalConsumption());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Is air condition ON: " + AC);
    }
}
