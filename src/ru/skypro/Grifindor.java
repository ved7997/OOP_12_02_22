package ru.skypro;


public class Grifindor extends Hogwarts {
    private final int nobility;//благородство
    private final int honor;//честь
    private final int bravery;//храбрость

    public Grifindor(String name, int nobility, int honor, int bravery,  int conjure, int transgress){
        super(name, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    @Override
    public String toString() {
        return super.toString() +
                " Благородство студнта равно: " + nobility +
                " Честь студента равна: " + honor +
                " Храбрость студента равна: " + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
}
