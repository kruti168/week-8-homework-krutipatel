package programme20_pool_area;

public class Cuboid extends Rectangle{
    double height;


    public Cuboid(double width,double length,double height) {
        //super keyword
        super(width, length);

        //if else
        if (height < 0) {
            this.height = 0;
        }else {
            this.height = height;
        }

    }//get method
    public double getHeight(){
        return height;

     //get method
    }
    public double getVolume(){

        return getArea()*height;
    }





}
