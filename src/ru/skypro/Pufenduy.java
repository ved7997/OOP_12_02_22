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
