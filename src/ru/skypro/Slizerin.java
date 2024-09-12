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

    public void compareSlizerin(Slizerin student){
        super.compareStudents(student);
        if (this.cunning > student.getCunning()) {
            System.out.println(" Хитрость " + this.getName() + " хитрее чем у " + student.getName());
        }else  if (this.cunning == student.getCunning()){
            System.out.println(" Хитрость " + this.getName() + " такая же как и у " + student.getName());
        }else {
            System.out.println(" Хитрость " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.determination > student.getDetermination()) {
            System.out.println(" Решительность " + this.getName() + " выше чем у " + student.getName());
        }else if (this.determination == student.getDetermination()){
            System.out.println(" Решительность " + this.getName() + " такая же как и у " + student.getName());
        }else {
            System.out.println(" Решительность " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.ambition > student.getAmbition()) {
            System.out.println(" Амбициозность " + this.getName() + " лучше чем у " + student.getName());
        }else if (this.ambition == student.getAmbition()){
            System.out.println(" Амбициозность " + this.getName() + " такие же как и у " + student.getName());
        }else {
            System.out.println(" Амбициозность " + this.getName() + " ниже чем у " + student.getName());
        }
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
