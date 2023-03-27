package point;

/**. Point
 You have to represent a point in 2D space. Write a class with the name Point. The class needs two  fields (instance variables) with name x and y of type int.
 The class needs to have two constructors. The first constructor does not have any parameters (no-arg  constructor). The second constructor has parameters x and y of type int and it needs to initialize the  fields.
 Write the following methods (instance methods):
 * Method named getX without any parameters, it needs to return the value of x field.  * Method named getY without any parameters, it needs to return the value of y field.  * Method named setX with one parameter of type int, it needs to set the value of the x field.  * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * Method named distance without any parameters, it needs to return the distance between this  Point and Point 0,0 as double.
 * Method named distance with two parameters x, y both of type int, it needs to return the distance  between this Point and Point x,y as double.
 * Method named distance with parameter another of type Point, it needs to return the distance  between this Point and another Point as double.
 How to find the distance between two points?
 To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 Where √ represents square root.  **/


 public class Programme16Point {

     int x;
     int y;


     public Programme16Point(){   //first  constructor does not have any args



     }
     public Programme16Point(int x,int y){ //second constructor with two paras
         this.y = y;
         this.x = x;

     }//instance method without any parameter with return
     public int  getX(){

         return x;

     }//instance method without  any parameter with return
     public int getY(){
         return y;
     }
     //instance method no return with paras
     public void setX(int x){

         this.x = x;

     }//instance method no return with paras
     public void setY(int y){

         this.y = y;

     }//instance method with return no paras
     public double distance(){

         return distance(0,0);
     }
     //instance method with return with paras
     public double distance(int x,int y){

         double result;
        return Math.sqrt((x - this.x)* (x - this.x) + (y -this.y )*(y - this.y));


     }
     public double distance (Programme16Point second){

         return distance(second.x,second.y);
     }
     public static void main (String[]args ){
         Programme16Point first = new Programme16Point(6, 5);//call first constructor
         Programme16Point second = new Programme16Point(3, 1);// call second constructor
         System.out.println("distance(0,0)= " + first.distance());//distance method no paras
         System.out.println("distance(second)= " + first.distance(second));//distance with paras
         System.out.println("distance(2,2)= " + first.distance(2, 2));
         Programme16Point point = new Programme16Point();//creating object
         System.out.println("distance()= " + point.distance());


     }

}
