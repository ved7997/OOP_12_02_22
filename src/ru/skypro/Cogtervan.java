package ru.skypro;

public class Cogtervan extends Hogwarts {
    //Когтевранцы умны, мудры, остроумны и полны творчества.
    private final int smart;//ум
    private final int wise;//мудрость
    private final int wittyСreativity;//остроумие и творчество

    public Cogtervan(String name, int conjure, int transgress, int smart, int wise, int wittyСreativity) {
        super(name, conjure, transgress);
        this.smart = smart;
        this.wise = wise;
        this.wittyСreativity = wittyСreativity;
    }

    @Override
    public String toString() {
        String zpt = ", ";
        return super.toString() + zpt +
                " Ум студента равен: " + smart + zpt +
                " Мудрость студента равна: " + wise + zpt +
                " Остроумие и творчество студента равна: " + wittyСreativity;
    }



    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWittyСreativity() {
        return wittyСreativity;
    }
}
