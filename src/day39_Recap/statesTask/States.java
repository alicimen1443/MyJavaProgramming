package day39_Recap.statesTask;

public class States {
    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private double population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public String getSenator() {
        return senator;
    }

    public double getPopulation() {
        return population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty==null||politicalParty.isEmpty()||politicalParty.isBlank()){
            System.err.println("Invalid data");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public void setGovernor(String governor) {
        if(governor==null||governor.isEmpty()||governor.isBlank()){
            System.err.println("Invalid data");
            System.exit(1);
        }
        this.governor = governor;
    }

    public void setSenator(String senator) {
        if(senator==null||senator.isEmpty()||senator.isBlank()){
            System.err.println("Invalid data");
            System.exit(1);
        }
        this.senator = senator;
    }

    public void setPopulation(double population) {
        if(population<=0){
            System.err.println("Population cannot be negative or zero");
            System.exit(1);
        }

        this.population = population;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.err.println("State tax cannot be negative");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public void setName(String name) {
        if(name==null||name.isEmpty()||name.isBlank()){
            System.err.println("Invalid data");
            System.exit(1);
        }
        this.name = name;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation==null||abbreviation.isEmpty()||abbreviation.isBlank()){
            System.err.println("Invalid data");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
