package week11;

import java.util.ArrayList;

public class TestTv {
    public static void main(String[] args) {

        // we will create a TV object

        TV Samsung = new TV(); // new keyword invokes our constructor with no parameters
        System.out.println(Samsung.toString());

        Samsung.turnOn();
        Samsung.setChannel(5);
        Samsung.setVolume(3);

        System.out.println(Samsung);

        TV LG = new TV();

        LG.setVolume(5);
        LG.setChannel(10);
        System.out.println(LG);

        LG.turnOn();
        LG.setVolume(5);
        LG.setChannel(10);
        System.out.println(LG);

        TV Sony = new TV();

        //ArrayList

        ArrayList<TV> tvList = new ArrayList<>();
        tvList.add(Samsung);
        tvList.add(LG);
        tvList.add(Sony);

        for(TV each : tvList ){ // each : becomes object reference for our TV objects
            System.out.println("Is the TV on ? "+ each.on);
        }


    }


}
