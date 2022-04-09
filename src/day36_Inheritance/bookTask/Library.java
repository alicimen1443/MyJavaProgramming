package day36_Inheritance.bookTask;

public class Library {
    public static void main(String[] args) {

        AudioBook audio = new AudioBook();
        audio.setInfo("Gülün adı","Roman","Umberto Eco",20);
        audio.setInfo(100,"Ali Cimen");
        System.out.println(audio);
        audio.listen();

        Ebook ebook = new Ebook();
        ebook.setInfo("Petrol Fırtınası","Roman","Raif Karadağ",10);
        ebook.setInfo("Large",270);
        System.out.println(ebook);

        ebook.readBook();
    }
}
