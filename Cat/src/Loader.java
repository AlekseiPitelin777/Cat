import java.util.concurrent.Callable;

public class Loader
{

        public static void main(String[] args) {



        Cat bublik = getKitten();
        System.out.println("Bublik-" + bublik.getWeight() + "кг");
        Cat kostya = getKitten();
        System.out.println("Kostya-" + kostya.getWeight() + "кг");
        Cat matvei = getKitten();
        System.out.println("Matvei-" + matvei.getWeight() + "кг");


        //==================================================
        Cat patrick = new Cat();
        System.out.println("Patrick - " + patrick.getWeight());
        patrick.feed(450.45);
        System.out.println("Patrick - " + patrick.getWeight());

        //================================================
        Cat john = new Cat();
        while (!john.getStatus().equals("Dead")) {
            john.meow();
        }
        System.out.println("John - " + john.getStatus());
        //======================================
        Cat wilson = new Cat();
        while (!wilson.getStatus().equals("Exploded")) {
            wilson.feed(100.4);
        }
        System.out.println("Wilson - " + wilson.getStatus());
        ///// Урок №2 Метод, параметры, return
        Cat stiv = new Cat();
        System.out.println("Stiv- " + stiv.getWeight());
        stiv.feed(150.0);
        System.out.println("Stiv - " + stiv.getWeight());
        stiv.pee();
        stiv.pee();
        System.out.println("Stiv - " + stiv.getWeight());
        System.out.println(stiv.getFoodWheigh());
        stiv.feed(150.0);
        System.out.println(stiv.getFoodWheigh());
        stiv.feed(200.0);
        System.out.println(stiv.getFoodWheigh());

        ////// Урок 3. Статические методы и переменные

        System.out.println(Cat.catsCount);
        Cat barsik = new Cat();
        Cat sony = new Cat();
        System.out.println(Cat.catsCount);
        while (!sony.getStatus().equals("Dead")) {
            sony.meow();
            System.out.println(sony.getStatus());
            System.out.println(Cat.catsCount);
        }


        //===========урок 5

        Cat mickel = new Cat(58.4);
        System.out.println(mickel.getWeight());

        ///+++++++++++++++++++++++++++++++++++++++++

      




        }

    private static Cat getKitten() {
        return new Cat(1100.0);
    }
}