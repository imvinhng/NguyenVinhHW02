public class Point implements Comparable<Point> {
   private int x;
   private int y;
   
   public Point(int x, int y){  //Point class constructor
      this.x = x;
      this.y = y;
   }
   
   public int getX(){
      return this.x;
   }
   public int getY(){
      return this.y;
   }
   
   public int compareTo(Point other){  //compare method
      if (this.y != other.y)
      { return this.y - other.y; }
      else
      { return this.x - other.x; }
   }
}