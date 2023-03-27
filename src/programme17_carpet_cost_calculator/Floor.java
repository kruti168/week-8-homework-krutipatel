package programme17_carpet_cost_calculator;
/**1. Write a class with the name Floor. The class needs two fields (instance variables) with name width
 and length of type double.
 The class needs to have one constructor with parameters width and length of type double and it
 needs to initialize the fields.
 In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length
 parameter is less than 0 it needs to set the length field value to 0.
 Write the following methods (instance methods):
 ● Method named getArea without any parameters, it needs to return the calculated area
 (width * length).**/


public class Floor {
// instance variables
    double width;
    double length;

    //constructor with paras

   public  Floor (double width,double length){
         this.width = width;
         this.length = length;

         if ((width < 0 || length < 0)){// is statements

             this.width = 0;
             this.length = 0;
         }

     }
     //instance method with return no paras
     public double getArea(){

         return this.length * width;
     }
}
