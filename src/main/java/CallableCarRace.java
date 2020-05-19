import java.util.Random;
import java.util.concurrent.Callable;

public class CallableCarRace implements Callable {


    @Override
    public Object call() {

        Random random = new Random();
        SimpleCar car = new SimpleCar();

        for (int i = 0; i < 20; i++) {
            car.setSpeedArray(i, random.nextInt(100));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        return car.getSpeedArray();
    }
}
