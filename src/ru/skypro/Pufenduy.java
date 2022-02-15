package ru.skypro;

public class Pufenduy extends Hogwarts {
    //Студенты Пуффендуя трудолюбивы, верны, честны.
    private final int hardworking; //трудолюбивы
    private final int loyal;//верны
    private final int honest;//честны

    public Pufenduy(String name, int conjure, int transgress, int hardworking, int loyal, int honest) {
        super(name, conjure, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        String zpt = ", ";
        return super.toString() + zpt +
                " Трудолюбие студента равно: " + hardworking + zpt +
                " Верность студента равна: " + loyal + zpt +
                " Честность студента равна: " + honest;
    }

    public void comparePufenduy(Pufenduy student){
        super.compareStudents(student);
        if (this.hardworking > student.getHardworking()) {
            System.out.println(" Трудолюбие " + this.getName() + " выше чем у " + student.getName());
        }else  if (this.hardworking == student.getHardworking()){
            System.out.println(" Трудолюбие " + this.getName() + " такое же как и у " + student.getName());
        }else {
            System.out.println(" Трудолюбие " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.loyal > student.getLoyal()) {
            System.out.println(" Верность " + this.getName() + " выше чем у " + student.getName());
        }else if (this.loyal == student.getLoyal()){
            System.out.println(" Верность " + this.getName() + " такая же как и у " + student.getName());
        }else {
            System.out.println(" Верность " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.honest > student.getHonest()) {
            System.out.println(" Честность " + this.getName() + " выше чем у " + student.getName());
        }else if (this.honest == student.getHonest()){
            System.out.println(" Честность " + this.getName() + " такая же как и у " + student.getName());
        }else {
            System.out.println(" Честность " + this.getName() + " ниже чем у " + student.getName());
        }
    }


    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
}
