public class CarRun implements Command{
    Car car;
    public CarRun(Car car){
        this.car = car;
    }
    @Override
    public void execute() {
        car.run();
    }
}
