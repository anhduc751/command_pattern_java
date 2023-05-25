public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Command runCommand = new CarRun(car);
        Command stopCommand = new CarStop(car);
        Owner owner = new Owner();
        owner.setCommand(runCommand);
        owner.action();
        owner.setCommand(stopCommand);
        owner.action();
    }
}