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
        String zpt = ", ";
        return "Имя студента Хогвардса: " + name + zpt + " Сила колдовства: " + conjure + zpt +
                " Сила трансгресировать: " + transgress;
    }

    public void compareStudents(Hogwarts student){
        if (this.conjure > student.getConjure()) {
            System.out.println("Сила магии " + this.name + " " + this.conjure + " больше чем " + student.name + " " + student.getConjure());
        }else if (this.conjure == student.getConjure()) {
            System.out.println("Сила магии " + this.name + " " + this.conjure + " равна силе " + student.name + " " +  student.getConjure());
        }else {
            System.out.println("Сила магии " + this.name + " " + this.conjure + " меньше чем " + student.name +  " " + student.getConjure());
        }

        if (this.transgress > student.getTransgress()) {
            System.out.println("Сила трансгресировать " + this.name + " " + this.transgress + " больше чем " + student.name + " " +  student.getTransgress());
        }else if (this.transgress == student.getTransgress()) {
            System.out.println("Сила трансгресировать " + this.name + " " + this.transgress +  " равна силе "+ student.name + " " +  student.getTransgress());
        }else {
            System.out.println("Сила трансгресировать " + this.name + " " + this.transgress + " меньше чем " + student.name + " " + student.getTransgress());
        }


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
