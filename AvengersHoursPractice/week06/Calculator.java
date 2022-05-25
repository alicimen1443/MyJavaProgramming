package week06;

public class Calculator {

    public Floor floor; // floor an instance variable for calculator class and also
    public Carpet carpet;

    public Calculator(Floor floor,Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }

    //totalCost = cost(meter square)*area(total meter square)

    public double getTotalCost(){
       double cost = carpet.getCost();
       double area = floor.getArea();

       return cost*area;
    }



}
/*
  Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor
  and carpet of type Carpet.

  The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and
  it needs to initialize the fields.

  Write the following methods (instance methods):

  * Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor
  with a carpet. //cost*area
   */