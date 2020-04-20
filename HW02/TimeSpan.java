public class TimeSpan implements Comparable<TimeSpan> {
   private int hour;
   private int min;
   
   public TimeSpan(int hour, int min){  //TimeSpan class constructor
      this.hour = hour;
      this.min = min;
   }
   
   public int getHr(){
      return this.hour;
   }
   public int getMin(){
      return this.min;
   }
   
   public int compareTo(TimeSpan other){  //compare method
      if (this.min != other.min)
      { return this.min - other.min; }
      else
      { return this.hour - other.hour; }
   }
}