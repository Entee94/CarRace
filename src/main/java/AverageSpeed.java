public class AverageSpeed {


    int[] speedArray;

    public AverageSpeed() {

        this.speedArray = new int[] {};

    }

    public int getSumOfSpeeds(int[] speedArray) {
        this.speedArray = speedArray;
        int sum1=0;
        for (int num: speedArray){
            sum1=sum1+num;
        }
        return sum1;
    }


}
