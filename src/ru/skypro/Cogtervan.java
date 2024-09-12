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

    public void compareCogtervan(Cogtervan student){
        super.compareStudents(student);
        if (this.smart > student.getSmart()) {
            System.out.println(" Ум " + this.getName() + " умнее чем у " + student.getName());
        }else  if (this.smart == student.getSmart()){
            System.out.println(" Ум " + this.getName() + " такой же как и у " + student.getName());
        }else {
            System.out.println(" Ум " + this.getName() + " глупее чем у " + student.getName());
        }

        if (this.wise > student.getWise()) {
            System.out.println(" Мудрость " + this.getName() + " выше чем у " + student.getName());
        }else if (this.wise == student.getWise()){
            System.out.println(" Мудрость " + this.getName() + " такая же как и у " + student.getName());
        }else {
            System.out.println(" Мудрость " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.wittyСreativity > student.getWittyСreativity()) {
            System.out.println(" Остроумие и творчество " + this.getName() + " лучше чем у " + student.getName());
        }else if (this.wittyСreativity == student.getWittyСreativity()){
            System.out.println(" Остроумие и творчество " + this.getName() + " такие же как и у " + student.getName());
        }else {
            System.out.println(" Остроумие и творчество " + this.getName() + " ниже чем у " + student.getName());
        }
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
