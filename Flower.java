/*Необходимо реализовать иерархию цветов (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 Создать несколько объектов-цветов. Собрать 3 букета (используем массив) с определением их стоимости. В букет может входить несколько цветов одного типа.
 Класс "Flower" должен содержать метод определяющий стоимость цветка, этот метод переопределить в классах наследниках. Также подсчитать количество проданных цветов
 (используем статический метод).*/
public class Flower {
    public static void main(String[] args) {

        // Создание нескольких объектов-цветов.
        // Создание 1-го букета (3 розы)
        Flower firstbouquet[] = new Flower[3];
        firstbouquet[0] = new Rose();
        firstbouquet[1] = new Rose();
        firstbouquet[2] = new Rose();

        // Определение стоимости первого букета
        int allcost = 0;
        for (Flower flowers : firstbouquet) {
            allcost = allcost + flowers.getCost();
        }
        System.out.println("Стоимость первого букета = " + allcost);

        // Создание нескольких объектов-цветов.
        // Создание 2-го букета (2 разных цветка)
        Flower secondbouquet[] = new Flower[2];
        secondbouquet[0] = new Tulip();
        secondbouquet[1] = new Daisy();

        // Определение стоимости второго букета
        allcost = 0;
        for (Flower flowers : secondbouquet) {
            allcost = allcost + flowers.getCost();
        }
        System.out.println("Стоимость второго букета = " + allcost);

        // Создание нескольких объектов-цветов.
        // Создание 3-го букета (4 разных цветка)
        Flower thirdbouquet[] = new Flower[4];
        thirdbouquet[0] = new Tulip();
        thirdbouquet[1] = new Daisy();
        thirdbouquet[2] = new Rose();
        thirdbouquet[3] = new Carnation();

        // Определение стоимости третьего букета
        allcost = 0;
        for (Flower flowers : thirdbouquet) {
            allcost = allcost + flowers.getCost();
        }
        System.out.println("Стоимость третьего букета = " + allcost);

        // Количество проданных цветов

        System.out.println("Количество проданных роз " + Rose.count);
        System.out.println("Количество проданных гвоздик " + Carnation.count);
        System.out.println("Количество проданных тюльпанов " + Tulip.count);
        System.out.println("Количество проданных маргариток " + Daisy.count);


    }


    // метод определяющий стоимость цветка
    public int getCost() {
        int cost = 100;
        return cost;
    }

    // Класс роза
    static class Rose extends Flower {
        static int count;

        // переопределенный метод стоимости для класса роза
        @Override
        public int getCost() {
            int cost = 100;
            return cost + 20;
        }

        // Подсчет кол-ва цветов
        Rose() {
            count++;
        }
    }


    // Класс гвоздика
    static class Carnation extends Flower {
        static int count;

        // переопределенный метод стоимости для класса гвоздика
        @Override
        public int getCost() {
            int cost = 100;
            return cost + 30;
        }

        // Подсчет кол-ва цветов
        Carnation() {
            count++;
        }
    }

    // Класс тюльпан
    static class Tulip extends Flower {
        static int count;

        // переопределенный метод стоимости для класса тюльпан
        @Override
        public int getCost() {
            int cost = 100;
            return cost - 10;
        }

        // Подсчет кол-ва цветов
        Tulip() {
            count++;
        }
    }

    // Класс маргаритка
    static class Daisy extends Flower {
        static int count;

        // переопределенный метод стоимости для класса маргаритка
        @Override
        public int getCost() {
            int cost = 100;
            return cost + 10;
        }

        // Подсчет кол-ва цветов
        Daisy() {
            count++;
        }
    }

}
