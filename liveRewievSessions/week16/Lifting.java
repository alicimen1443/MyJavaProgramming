package week16;

public abstract class Lifting extends Exercise{
    public Lifting(double weight) {
        super(weight);
    }

    /*
    If an abstract class inherits from another abstract class,it does not have to implement the abstract methods

     */

    public abstract void endLift();

}
