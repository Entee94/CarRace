import java.lang.reflect.Array;
import java.util.Scanner;

public class InputOutput {
    public void hostess() {
        System.out.print("Welcome to the race simulation!" + "\n" + "Here we have 10 cars that compete in their speed for 20 laps." + "\n" +  "Each lap takes 1 second." + "\n");
    }

    public void enterScanner() {
        Scanner readInput = new Scanner(System.in);

        String enterKey = "To start a race, push Enter, please.";
        System.out.print(enterKey);


        enterKey = readInput.nextLine();
        System.out.println("Race started!");
        if (enterKey.equals("")) {

            System.out.println(" ");
        }
    }
    int[] place;
    int[] speed;
    String carName;

    public void winnerStatisticOutput(String carName, int[] place, int [] speed) {
        this.carName= carName;
        this.place = place;
        this.speed = speed;
        int count = 1;
        System.out.println("\n" + "Position and speed of the "+carName+" on each lap: " + "\n");
        for (int i=0; i<20;i++) {
            System.out.println("Lap №" + count + ": Position: " +Array.get(place,i) + " Speed: " + Array.get(speed,i));
            count++;
        }

    }
}
