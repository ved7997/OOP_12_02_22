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
        String zpt = ", ";
        return super.toString() + zpt +
                " Благородство студнта равно: " + nobility + zpt +
                " Честь студента равна: " + honor + zpt +
                " Храбрость студента равна: " + bravery;
    }
    public void compareGrifindor(Grifindor student){
        super.compareStudents(student);
        if (this.nobility > student.getNobility()) {
            System.out.println(" Благородство " + this.getName() + " выше чем у " + student.getName());
        }else  if (this.nobility == student.getNobility()){
            System.out.println(" Благородство " + this.getName() + " такое же как и у " + student.getName());
        }else {
            System.out.println(" Благородство " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.honor > student.getHonor()) {
            System.out.println(" Честь " + this.getName() + " выше чем у " + student.getName());
        }else if (this.honor == student.getHonor()){
            System.out.println(" Честь " + this.getName() + " такая же как и у " + student.getName());
        }else {
            System.out.println(" честь " + this.getName() + " ниже чем у " + student.getName());
        }

        if (this.bravery > student.getBravery()) {
            System.out.println(" Храбрость " + this.getName() + " выше чем у " + student.getName());
        }else if (this.bravery == student.getBravery()){
            System.out.println(" Храбрость " + this.getName() + " такая же как и у " + student.getName());
        }else {
            System.out.println(" Храбрость " + this.getName() + " ниже чем у " + student.getName());
        }
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
