package programme17_carpet_cost_calculator;

public class Carpet {
    //instance variable
    double cost;

    //constructor with parameter
    public Carpet(double cost) {
        this.cost = cost;

    }

    // instance method with return no paras
    public double getCost() {
        if (cost < 0) {

            cost = 0;
        }
        return this.cost;
    }

}



