package day31_Constructors.restaurant;

public class Chef {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name+ " is making an order");
    }

    public void washDishes(){
        System.out.println(name+ " is washing the dishes");
    }

    public String toString() {
        if(fullTime){
            return "Chef{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", work time=" + "full-time" +
                    '}';
        }else{
            return "Chef{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", work time=" + "part-time" +
                    '}';
        }
    }
}
