package ru.skypro;

public class Hogwarts {
    private final String name;
    private final int conjure;//колдовать
    private final int transgress;//трансгресировать

    public Hogwarts(String name, int conjure, int transgress) {
        this.name = name;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return "Имя студента Ховардса " + name + "Сила колдовства " + conjure +
                "Сила трансгресировать " + transgress ;
    }

    public String getName() {
        return name;
    }

    public int getConjure() {
        return conjure;
    }

    public int getTransgress() {
        return transgress;
    }
}
