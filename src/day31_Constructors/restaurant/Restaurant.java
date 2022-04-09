package day31_Constructors.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner,location;
    int numbersOFStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numbersOFStars) {
        this.owner = owner;
        this.location = location;
        this.numbersOFStars = numbersOFStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }

    public void hireServer(Server[] server){
        servers.addAll(Arrays.asList(server));
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }
    public void hireChef(Chef[] chef){
        chefs.addAll(Arrays.asList(chef));
    }

    public void terminateChef(int employeeID ){
        chefs.removeIf(p-> p.employeeID==employeeID );
    }

    public void terminateServer(int employeeID){
        servers.removeIf(p->p.employeeID==employeeID);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numbersOFStars=" + numbersOFStars +
                ", servers number=" + servers.size() +
                ", chefs number=" + chefs.size() +
                '}';
    }
}
