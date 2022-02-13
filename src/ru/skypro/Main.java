package ru.skypro;

public class Main {

    public static void main(String[] args) {

       //Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
        Grifindor garriPotter = new Grifindor("Гарри Поттер", 222, 111, 333, 777, 666);
        Grifindor germionaGraynger = new Grifindor("Гермиона Грейнджер", 225, 112, 333, 775, 665);
        Grifindor ronUizli = new Grifindor("Рон Уизли", 224, 110, 333, 774, 665);
//
//        garriPotter.getHonor();
//        garriPotter.getBravery();
        System.out.println(garriPotter);


    }
}
