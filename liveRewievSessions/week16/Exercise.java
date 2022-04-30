package week16;

public abstract class Exercise {

    double weight;

    public Exercise(double weight) {
        this.weight = weight;
    }

    // You don't have to have abstract method at all, and you can still declare your class as abstract

    public void start(){
        System.out.println("warming up and starting the exercise");
    }

     abstract void perform();

     abstract int getCaloriesCount(int minutes);



}
