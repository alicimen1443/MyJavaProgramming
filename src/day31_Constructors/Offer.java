package day31_Constructors;

public class Offer {

    public String location; // we create 'location' variable as instance variable in order to have separate copies of the variable for the objects,in this way we can store different datas in every different objects
    // each object will have separate copy.That means each offer they can have their own location in it.
    public String companyName;// Instance means each object can have separate copy
    public String jobTitle;
    public double salary;// I want to be able to store the different data into this field salary in each of the object which means i do need multiple copies of this instance variable salary when the multiple objects from this custom class offer are being created
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean isWFH;
    public boolean isFullTime;

    // this method, It helps you to generate all the attributes of this class
    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;



    }

    //By this method, it is going to convert the custom class object to the string object and you will be able to print it.Without toString method, we will get hashcodes. Everytime when we pass anything into print statement first, compiler checks for the toString method
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*
Offer Task:
		1. Create a custom class named Offer
				Attributes:
						location, companyName, jobTitle, salary, hasBenefit, hasPTO(paid time off), isWFH(work from home), isFullTime

				Actions:
					setInfo(): sets all the instance variables
					toString(): returns the full info of the Offer Object
 */