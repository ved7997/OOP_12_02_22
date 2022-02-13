package ru.skypro;

public class Main {

    public static void main(String[] args) {

       //Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
        Grifindor garriPotter = new Grifindor("Гарри Поттер", 222, 111, 333, 777, 666);
        Grifindor germionaGraynger = new Grifindor("Гермиона Грейнджер", 225, 112, 333, 775, 665);
        Grifindor ronUizli = new Grifindor("Рон Уизли", 224, 110, 333, 774, 665);

        //Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
        Slizerin dracoMalfoy = new Slizerin("Драко Малфой", 22, 11, 331, 770, 660);
        Slizerin grehamMontegu = new Slizerin("Грэхэм Монтегю", 21, 10, 330, 769, 659);
        Slizerin gregoriGoil = new Slizerin("Грегори Гойл", 20, 9, 329, 768, 658);
        //На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
        Pufenduy zahariySmit = new Pufenduy("Захария Смит", 222, 111, 111, 111, 111);
        Pufenduy sedrikDiggori = new Pufenduy("Седрик Диггори", 219, 109, 109, 109, 109);
        Pufenduy dgasninFinch = new Pufenduy("Джастин Финч-Флетчли", 220, 110, 110, 110, 110);
        //На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
        Cogtervan chgouChang = new Cogtervan("Чжоу Чанг", 100, 100, 100, 100, 100);
        Cogtervan padmaPatil = new Cogtervan("Падма Патил", 100, 100, 99, 99, 99);
        Cogtervan markusBalbi = new Cogtervan("Маркус Белби", 100, 100, 99, 99, 99);
        System.out.println("Факультет Гриффиндор!");
        System.out.println(garriPotter);
        System.out.println(germionaGraynger);
        System.out.println(ronUizli);
        System.out.println("Факультет Слизерен!");
        System.out.println(dracoMalfoy);
        System.out.println(grehamMontegu);
        System.out.println(gregoriGoil);
        System.out.println("Факльтет Пуффендуй!");
        System.out.println(zahariySmit);
        System.out.println(sedrikDiggori);
        System.out.println(dgasninFinch);
        System.out.println("Факультет Когтевран!");
        System.out.println(chgouChang);
        System.out.println(padmaPatil);
        System.out.println(markusBalbi);






    }
}
