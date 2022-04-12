package day39_Recap.animalTask;

public class FriendlyAnimal {



    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayable;

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        if( !(wild==true||wild==false )){
            System.err.println("Invalid data");
            System.exit(1);
        }
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }
}
