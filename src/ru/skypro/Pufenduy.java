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
        return super.toString() +
                " Трудолюбие студента равно: " + hardworking +
                " Верность студента равна: " + loyal +
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
