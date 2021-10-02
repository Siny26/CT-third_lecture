/*Создать абстрактный класс класс Car, и класс EngineКласс Engine содержит поля - мощность, производитель.
Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, мотор типа Engine. Абстрактные методы start(), stop(),
и реализованные методы turnRight(), turnLeft()Методы turnRight() и turnLeft() выводят на экран: "Поворот направо" или "Поворот налево".
Абстрактный метод printInfo(), который выводит полную информацию об автомобиле, и моторе.Создать производный от Car класс - Lorry (грузовик),
 характеризуемый также грузоподъемностью кузов, реализовать методы start(), stop(). Метод start – выводит на экран «Грузовик поехал», метод stop -«грузовик остановился».
 Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью start(), stop().
 Метод start – выводит на экран «SportCar поехал», метод stop - «SportCar остановился».
 */
// Абстрактный класс Car
public abstract class Car {

    public static void main(String[] args) {


    }

    //Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, мотор типа Engine.
    String marka;
    String klass;
    double weight;
    Engine engine;


    public String getMarka() {
        return marka;
    }

    public String getKlass() {
        return klass;
    }

    public double getWeigh() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    // Класс Engine
    class Engine {
        //Класс Engine содержит поля - мощность, производитель.
        int power;
        String fabricator;

        public int getPower() {
            return power;
        }

        public String getFabricator() {
            return fabricator;
        }
    }

    // Класс Car содержит абстрактные методы start(), stop()
    public abstract void start();

    public abstract void stop();

    // Класс Car реализованные методы turnRight(), turnLeft()
    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    //Абстрактный метод printInfo(), который выводит полную информацию об автомобиле, и моторе
    public abstract void printInfo();


    //Производный от Car класс - Lorry (грузовик)
    static class Lorry extends Car {

        //грузоподъемность кузова
        double load_capacity;

        public double getLoad_capacity() {
            return load_capacity;
        }
//Метод start – выводит на экран «Грузовик поехал»
        @Override
        public void start() {
            System.out.println("Грузовик поехал");
        }
//метод stop -«грузовик остановился»
        @Override
        public void stop() {
            System.out.println("Грузовик остановился");

        }
//Метод printInfo(), который выводит полную информацию об автомобиле, и моторе
        @Override
        public void printInfo() {
            System.out.println("Марка автомобиля = " + getMarka() +
                    ", Класс автомобиля = " + getKlass() +
                    ", Вес = " + getWeigh()+
                    ", Мотор = " + getEngine() +
                    ", Грузоподъемность = " + getLoad_capacity());

        }

        }
    //Производный от Car класс - SportCar
    static class Sportcar extends Car{
       // предельная скорость
        int speed_limit;
        public int getSpeed_limit() {
            return speed_limit;
        }

        //Метод start – выводит на экран «SportCar поехал»
        @Override
        public void start() {
            System.out.println("SportCar поехал");
        }
        //метод stop -«SportCar остановился»»
        @Override
        public void stop() {
            System.out.println("SportCar остановился»");

        }
        //Метод printInfo(), который выводит полную информацию об автомобиле и моторе
        @Override
        public void printInfo() {
            System.out.println("Марка автомобиля = " + getMarka() +
                    ", Класс автомобиля = " + getKlass() +
                    ", Вес = " + getWeigh()+
                    ", Мотор = " + getEngine() +
                    ", Грузоподъемность = " + getSpeed_limit());

        }

    }

    }







