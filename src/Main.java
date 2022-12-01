public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }
    public static void task1(){
        System.out.println("Задача1");
        int weightSun = 1989100000;
        System.out.println("Значение переменной int с типом weightSun равно " + weightSun);
        byte myWeight = 73;
        System.out.println("Значение переменной byte с типом myWeight равно " + myWeight);
        short millennium = 2022;
        System.out.println("Значение переменной short с типом millennium равно " + millennium);
        long people = 80000000000000L;
        System.out.println("Значение переменной long с типом people равно " + people);
        float pressure = 3.3927f;
        System.out.println("Значение переменной float с типом pressure равно " + pressure);
        double temperature = -1.438;
        System.out.println("Значение переменной double с типом temperature равно " + temperature);



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
        int workTime = 43200;
        int minutes = bottle * 20;
        System.out.println("За 20 минут машина произвела " + minutes + " штук бутылок");
        short day = (short) (bottle * 720);
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

}