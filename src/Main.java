public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }
    public static void task1(){
        System.out.println("Задача1");
        int weightSun = 1989100000;
        System.out.println("Значение переменной weightSun с типом int равно " + weightSun);
        byte myWeight = 73;
        System.out.println("Значение переменной myWeight с типом byte равно " + myWeight);
        short millennium = 2022;
        System.out.println("Значение переменной millennium с типом short равно " + millennium);
        long people = 80000000000000L;
        System.out.println("Значение переменной people с типом long равно " + people);
        float pressure = 3.3927f;
        System.out.println("Значение переменной pressure с типом float равно " + pressure);
        double temperature = -1.438;
        System.out.println("Значение переменной temperature с типом double равно " + temperature);



    }
    public static void task2() {
        System.out.println("Задача2");
        float flourWeight = 27.12f;
        long distance = 987678965549L;
        double length = 2.786;
        short numberMatches = 569;
        short degrees = -159;
        int mileage = 27897;
        byte age = 67;


    }
    public static void task3(){
        System.out.println("Задача3");
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short piecePaper = 480;
        int paperStudent = piecePaper / (firstClass + secondClass + thirdClass);
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");


    }
    public static void task4(){
        System.out.println("Задача4");
        byte bottle = 16;
        int minutes = 2;
        int bottlePerMinutes = bottle / minutes;
        int workTime = 43200;
        System.out.println("Общее время работы машины " + workTime + " часов");
        int minutesBottle = bottlePerMinutes * 20;
        int hour = minutesBottle*3;
        System.out.println("За 20 минут машина произвела " + minutesBottle + " штук бутылок");
        int day = hour * 24;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int threeDays = bottle * 2160;
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок" );
        int month = bottle * 21600;
        System.out.println("За месяц машина произвела " + month + " штук бутылок" );

    }
    public static void task5() {
        System.out.println("Задача5");
        short allPot = 120;
        short oneClass = 6;
        short classSchool = (short) (allPot / oneClass);
        System.out.println("В школе " + classSchool + " классов");
        int whitePaint = classSchool * 2;
        int brown = classSchool * 4;
        System.out.println("В школе, где " + classSchool + " классов,нужно " + whitePaint + " банок белой краски и " + brown + " банок коричневой краски" );




    }
    public static void task6() {
        System.out.println("Задача6");
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short egg = 4 * 70;
        short breakfast = (short) (bananas + milk + iceCream + egg);
        System.out.println("Вес завтрака в граммах равен " + breakfast);
        float breakfastKilogram = breakfast / 1000f;
        System.out.println("Вес в килограммах равен " + breakfastKilogram);


    }
    public static void task7() {
        System.out.println("Задача7");
        short weight = 7 * 1000;
        short lossWeight = 250;
        short highWeight = 500;
        short gramOne = (short) (weight / 250);
        System.out.println("Если худеть по 250 грам в сутки потребуется " + gramOne);
        short gramTwo = (short) (weight / 500);
        System.out.println("Если худеть по 500 грам в сутки потребуется " + gramTwo);
        double average = (lossWeight+ highWeight) / 2D;
        double averageDay = weight / average;
        System.out.println("В среднем потребуется " + averageDay + " день");

    }
    public static void task8() {
        System.out.println("Задача8");
        int masha = 67760;
        int den = 83690;
        int chris = 76230;
        int mashaReceive = (masha * 10) / 100 + masha;
        System.out.println(mashaReceive);
        int denReceive = (den * 10) / 100 + den;
        System.out.println(denReceive);
        int chrisReceive = (chris * 10) / 100 +chris;
        System.out.println(chrisReceive);
        int mashaDifference = mashaReceive - masha;
        System.out.println("Маша  теперь получает " + mashaReceive + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        int denDifference = denReceive - den;
        System.out.println("Денис  теперь получает " + denReceive + " рублей. Годовой доход вырос на " + denDifference + " рублей");
        int chrisDifference = chrisReceive - chris;
        System.out.println("Кристина  теперь получает " + chrisReceive + " рублей. Годовой доход вырос на " + chrisDifference + " рублей");
    }

}