package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {

        Movie cydeo = new Movie("USA", "Journey to SDET", "Thriller", "10/25/2021", "Kuzzat Altay");

        String[] cast = {"Ali", "Zeynep", "Zehra", "Mina", "Busra", "Esra", "Selma"};

        cydeo.addCasts(cast);
        cydeo.casts.addAll(Arrays.asList("Yasin","Ekrem","Mevlut","Erol"));
        cydeo.addCast("Kemal Salim");



        System.out.println(cydeo);



    }
}
