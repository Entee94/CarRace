public class SimpleCar  {

   int[] speedArray = new int[20];

    public SimpleCar() {

    }

    public int[] getSpeedArray() {
        return speedArray;
    }

   public synchronized void setSpeedArray(int index, int speed)
   {
       this.speedArray[index] = speed;
   }

}