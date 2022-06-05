package week20;

import java.util.*;

public class MapExampleWithClassObject {
    public static void main(String[] args) {

        Map<String,Employee> cydeo = new LinkedHashMap<>();

        Employee empOne = new Employee();
        empOne.setInfo("Steven","King","AD_PRES",24000,90);

        cydeo.put("empOne",empOne);

        Employee empTwo = new Employee();
        empTwo.setInfo("Neena","Kochar","AD_VP",17000,90);

        cydeo.put("empTwo",empTwo);

        Employee empThree = new Employee();
        empThree.setInfo("Lex","De Haan","AD_VP",17000,90);

        cydeo.put("empThree",empThree);

        //find Neena's Salary : verify that it is equal to 170000
        //Iterate through Map with kesSet method
        //Find the person
        //retrieve the salary

        double expectedSalary=0;
        for (String eachEmp : cydeo.keySet()) {
            Employee temp = cydeo.get(eachEmp);
            if(temp.getFirstName().equals("Neena")){
                expectedSalary=temp.getSalary();
            }
        }
        System.out.println("expectedSalary = " + expectedSalary);

        if(expectedSalary==17000.0){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        /*
        Task:
        Change Steven's Salary to 40.000
         */
        for (Map.Entry<String, Employee> eachEmpEntry : cydeo.entrySet()) {
            Employee temp = (Employee) eachEmpEntry.getValue();// this brings an Object, I need to cast it to Employee class object
            if(temp.getFirstName().equals("Steven")){
                temp.setSalary(40000);
            }
        }
        System.out.println("cydeo = " + cydeo);
















    }
}
