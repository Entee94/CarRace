import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        InputOutput inputOutput = new InputOutput();

        inputOutput.hostess();
        inputOutput.enterScanner();

        Callable callable = new CallableCarRace();

        FutureTask car1 = new FutureTask(callable);
        FutureTask car2 = new FutureTask(callable);
        FutureTask car3 = new FutureTask(callable);
        FutureTask car4 = new FutureTask(callable);
        FutureTask car5 = new FutureTask(callable);
        FutureTask car6 = new FutureTask(callable);
        FutureTask car7 = new FutureTask(callable);
        FutureTask car8 = new FutureTask(callable);
        FutureTask car9 = new FutureTask(callable);
        FutureTask car10 = new FutureTask(callable);

        Thread t1 = new Thread(car1);
        Thread t2 = new Thread(car2);
        Thread t3 = new Thread(car3);
        Thread t4 = new Thread(car4);
        Thread t5 = new Thread(car5);
        Thread t6 = new Thread(car6);
        Thread t7 = new Thread(car7);
        Thread t8 = new Thread(car8);
        Thread t9 = new Thread(car9);
        Thread t10 = new Thread(car10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();



        int[] positionsCar1 = new int[20];
        int[] positionsCar2 = new int[20];
        int[] positionsCar3 = new int[20];
        int[] positionsCar4 = new int[20];
        int[] positionsCar5 = new int[20];
        int[] positionsCar6 = new int[20];
        int[] positionsCar7 = new int[20];
        int[] positionsCar8 = new int[20];
        int[] positionsCar9 = new int[20];
        int[] positionsCar10 = new int[20];

        for (int i = 0; i < 20; i++) {

            Map<String, Integer> lap = new TreeMap<>();

            lap.put("car1", (int)Array.get(car1.get(), i));
            lap.put("car2", (int)Array.get(car2.get(), i));
            lap.put("car3", (int)Array.get(car3.get(), i));
            lap.put("car4", (int)Array.get(car4.get(), i));
            lap.put("car5", (int)Array.get(car5.get(), i));
            lap.put("car6", (int)Array.get(car6.get(), i));
            lap.put("car7", (int)Array.get(car7.get(), i));
            lap.put("car8", (int)Array.get(car8.get(), i));
            lap.put("car9", (int)Array.get(car9.get(), i));
            lap.put("car10", (int)Array.get(car10.get(), i));

            Integer[] lapArray = new Integer[10];

            Array.set(lapArray,0, lap.get("car1"));
            Array.set(lapArray,1, lap.get("car2"));
            Array.set(lapArray,2, lap.get("car3"));
            Array.set(lapArray,3, lap.get("car4"));
            Array.set(lapArray,4, lap.get("car5"));
            Array.set(lapArray,5, lap.get("car6"));
            Array.set(lapArray,6, lap.get("car7"));
            Array.set(lapArray,7, lap.get("car8"));
            Array.set(lapArray,8, lap.get("car9"));
            Array.set(lapArray,9, lap.get("car10"));

            Arrays.sort(lapArray, Collections.reverseOrder());

            IndexSearcher indexSearcher = new IndexSearcher();

            Array.set(positionsCar1, i, indexSearcher.findIndex(lapArray, lap.get("car1"))+1);
            Array.set(positionsCar2, i, indexSearcher.findIndex(lapArray, lap.get("car2"))+1);
            Array.set(positionsCar3, i, indexSearcher.findIndex(lapArray, lap.get("car3"))+1);
            Array.set(positionsCar4, i, indexSearcher.findIndex(lapArray, lap.get("car4"))+1);
            Array.set(positionsCar5, i, indexSearcher.findIndex(lapArray, lap.get("car5"))+1);
            Array.set(positionsCar6, i, indexSearcher.findIndex(lapArray, lap.get("car6"))+1);
            Array.set(positionsCar7, i, indexSearcher.findIndex(lapArray, lap.get("car7"))+1);
            Array.set(positionsCar8, i, indexSearcher.findIndex(lapArray, lap.get("car8"))+1);
            Array.set(positionsCar9, i, indexSearcher.findIndex(lapArray, lap.get("car9"))+1);
            Array.set(positionsCar10, i, indexSearcher.findIndex(lapArray, lap.get("car10"))+1);


        }

        int [] car1Speed = new int [20];
        for (int i=0; i<20; i++) { Array.set(car1Speed,i, Array.get(car1.get(), i)); }
        int [] car2Speed = new int [20];
        for (int i=0; i<20; i++) { Array.set(car2Speed,i, Array.get(car2.get(), i)); }
        int [] car3Speed = new int [20];
        for (int i=0; i<20; i++) { Array.set(car3Speed,i, Array.get(car3.get(), i)); }
        int [] car4Speed = new int [20];
        for (int i=0; i<20; i++) { Array.set(car4Speed,i, Array.get(car4.get(), i)); }
        int [] car5Speed = new int [20];
        for (int i=0; i<20; i++) { Array.set(car5Speed,i, Array.get(car5.get(), i)); }
        int [] car6Speed = new int [20];
        for (int i=0; i<20; i++) { Array.set(car6Speed,i, Array.get(car6.get(), i)); }
        int [] car7Speed = new int [20];
        for (int i=0; i<20; i++) { Array.set(car7Speed,i, Array.get(car7.get(), i)); }
        int [] car8Speed = new int [20];
        for (int i=0; i<20; i++) { Array.set(car8Speed,i, Array.get(car8.get(), i)); }
        int [] car9Speed = new int [20];
        for (int i=0; i<20; i++) { Array.set(car9Speed,i, Array.get(car9.get(), i)); }
        int [] car10Speed = new int [20];
        for (int i=0; i<20; i++) { Array.set(car10Speed,i, Array.get(car10.get(), i)); }

       // System.out.println(Arrays.toString(car1Speed));


        AverageSpeed averageSpeed = new AverageSpeed();

        Map<String, Integer> place = new TreeMap<>();

        place.put("Car №1", averageSpeed.getSumOfSpeeds(car1Speed));
        place.put("Car №2", averageSpeed.getSumOfSpeeds(car2Speed));
        place.put("Car №3", averageSpeed.getSumOfSpeeds(car3Speed));
        place.put("Car №4", averageSpeed.getSumOfSpeeds(car4Speed));
        place.put("Car №5", averageSpeed.getSumOfSpeeds(car5Speed));
        place.put("Car №6", averageSpeed.getSumOfSpeeds(car6Speed));
        place.put("Car №7", averageSpeed.getSumOfSpeeds(car7Speed));
        place.put("Car №8", averageSpeed.getSumOfSpeeds(car8Speed));
        place.put("Car №9", averageSpeed.getSumOfSpeeds(car9Speed));
        place.put("Car №10", averageSpeed.getSumOfSpeeds(car10Speed));

        Integer[] sortedPlaces = new Integer[10];

        Array.set(sortedPlaces,0, place.get("Car №1"));
        Array.set(sortedPlaces,1, place.get("Car №2"));
        Array.set(sortedPlaces,2, place.get("Car №3"));
        Array.set(sortedPlaces,3, place.get("Car №4"));
        Array.set(sortedPlaces,4, place.get("Car №5"));
        Array.set(sortedPlaces,5, place.get("Car №6"));
        Array.set(sortedPlaces,6, place.get("Car №7"));
        Array.set(sortedPlaces,7, place.get("Car №8"));
        Array.set(sortedPlaces,8, place.get("Car №9"));
        Array.set(sortedPlaces,9, place.get("Car №10"));

     //   System.out.println("not sorted"+Arrays.toString(sortedPlaces));

        Arrays.sort(sortedPlaces, Collections.reverseOrder());

      //  System.out.println("sorted"+Arrays.toString(sortedPlaces));

        IndexSearcher indexSearcher = new IndexSearcher();

        Map<Integer, String> winnerMap = new TreeMap<>();

        winnerMap.put(indexSearcher.findIndex(sortedPlaces, place.get("Car №1")), "Car №1");
        winnerMap.put(indexSearcher.findIndex(sortedPlaces, place.get("Car №2")), "Car №2");
        winnerMap.put(indexSearcher.findIndex(sortedPlaces, place.get("Car №3")), "Car №3");
        winnerMap.put(indexSearcher.findIndex(sortedPlaces, place.get("Car №4")), "Car №4");
        winnerMap.put(indexSearcher.findIndex(sortedPlaces, place.get("Car №5")), "Car №5");
        winnerMap.put(indexSearcher.findIndex(sortedPlaces, place.get("Car №6")), "Car №6");
        winnerMap.put(indexSearcher.findIndex(sortedPlaces, place.get("Car №7")), "Car №7");
        winnerMap.put(indexSearcher.findIndex(sortedPlaces, place.get("Car №8")), "Car №8");
        winnerMap.put(indexSearcher.findIndex(sortedPlaces, place.get("Car №9")), "Car №9");
        winnerMap.put(indexSearcher.findIndex(sortedPlaces, place.get("Car №10")), "Car №10");

       // System.out.println(winnerMap);



        System.out.print("\n" +"Race has finished!" + "\n" + "\n" +  "See the top three cars below:" + "\n" + "\n" +"First place - " + winnerMap.get(1) + "\n" + "Second place - " + winnerMap.get(2) + "\n" + "Third place - " + winnerMap.get(3)+ "\n");


       if (winnerMap.get(1).equals("Car №1")) {
           inputOutput.winnerStatisticOutput(positionsCar1, car1Speed);

       } else if (winnerMap.get(1).equals("Car №2")) {
           inputOutput.winnerStatisticOutput(positionsCar2, car2Speed);

        } else if (winnerMap.get(1).equals("Car №3")) {
           inputOutput.winnerStatisticOutput(positionsCar3, car3Speed);

       } else if (winnerMap.get(1).equals("Car №4")) {
           inputOutput.winnerStatisticOutput(positionsCar4, car4Speed);

       } else if (winnerMap.get(1).equals("Car №5")) {
           inputOutput.winnerStatisticOutput(positionsCar5, car5Speed);

       } else if (winnerMap.get(1).equals("Car №6")) {
           inputOutput.winnerStatisticOutput(positionsCar6, car6Speed);

       } else if (winnerMap.get(1).equals("Car №7")) {
           inputOutput.winnerStatisticOutput(positionsCar7, car7Speed);

       } else if (winnerMap.get(1).equals("Car №8")) {
           inputOutput.winnerStatisticOutput(positionsCar8, car8Speed);

       } else if (winnerMap.get(1).equals("Car №9")) {
           inputOutput.winnerStatisticOutput(positionsCar9, car9Speed);

       } else if (winnerMap.get(1).equals("Car №10")) {
           inputOutput.winnerStatisticOutput(positionsCar10, car10Speed);
       }


        /*
        System.out.println("positions of car 1 " + Arrays.toString(positionsCar1));
        System.out.println("positions of car 2 " + Arrays.toString(positionsCar2));
        System.out.println("positions of car 3 " + Arrays.toString(positionsCar3));
        System.out.println("positions of car 4 " + Arrays.toString(positionsCar4));
        System.out.println("positions of car 5 " + Arrays.toString(positionsCar5));
        System.out.println("positions of car 6 " + Arrays.toString(positionsCar6));
        System.out.println("positions of car 7 " + Arrays.toString(positionsCar7));
        System.out.println("positions of car 8 " + Arrays.toString(positionsCar8));
        System.out.println("positions of car 9 " + Arrays.toString(positionsCar9));
        System.out.println("positions of car 10 " + Arrays.toString(positionsCar10));

         */


    }
}
