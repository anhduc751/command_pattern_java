public class CarStop implements Command {
    Car car;
    public CarStop(Car car){
        this.car = car;
    }
    @Override
    public void execute() {
        car.stop();
    }
}
