package ru.skypro;

public class Slizerin extends Hogwarts {
    //Всем ученикам Слизерина присущи хитрость, решительность, амбициозность,
    private final int cunning;//хитрость
    private final int determination;//решительность
    private final int ambition;//амбициозность

    public Slizerin(String name, int conjure, int transgress, int cunning, int determination, int ambition) {
        super(name, conjure, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Хитрость студента равна: " + cunning +
                " Решительность студента равна: " + determination +
                " Амбициозность студента равна: " + ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }
}
