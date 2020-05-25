import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        InputOutput inputOutput = new InputOutput();

        inputOutput.hostess();
        inputOutput.enterScanner();

        CarRace carRace = new CarRace();

        carRace.startRace();
        carRace.raceCalculations();

    }
}
