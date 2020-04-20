//Vinh Nguyen CS 211
//HW02 Assignment 4/19/2020
//Creating Point and TimeSpan class that implement Coomparable interface with 
//compareTo(Object other) method


public class Client{
   public static void main(String[] args){
   Point p = new Point(1,1);   //creating new points
   Point f = new Point(2,2);
   System.out.println(p.compareTo(f));   //implementing the CompareTo method on points
   
   TimeSpan a = new TimeSpan(3,15);   //creating new TimeSpan
   TimeSpan b = new TimeSpan(2,12);
   System.out.println(a.compareTo(b)); //implementing the CompareTo method on TimeSpan
   }
}