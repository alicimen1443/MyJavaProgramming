package week16;

public class Running extends Exercise{
    public Running(double weight) {
        super(weight);
    }

    //public abstract void run(); you cannot declare your methods as abstract in regular classes


    @Override
    public void perform() {
        System.out.println("Performing Running Exercise on the Track");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return (int) (minutes*13*(weight/100));
    }
}
