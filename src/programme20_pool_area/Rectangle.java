package programme20_pool_area;

public class Rectangle {
    //instance variable
    double width;
    double length;
    public Rectangle(double width,double length) {//constructor with paras

        this.width = width;  //initialize filed
        this.length = length;

        //if else statement
        if ((width < 0) && (length < 0)) {
            this.width = 0;
            this.length = 0;
        } else if((width <0) && (length >0)){
            this.width = 0;
            this.length = length;
        } else if ((width >0) && (length < 0)) {
            this.width = width;
            this.length = 0;
        }
    }//instance method with parameter
    public double getWidth(){

        return width;
    }
    public double getLength(){

        return length;
    }
    public double getArea(){
        return width * length;
    }





}
