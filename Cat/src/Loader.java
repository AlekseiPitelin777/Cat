import java.util.concurrent.Callable;

public class Loader
{
    public static void main(String[] args) {
        // Урок №1 Понятие класса и объекта
        Cat Patrick = new Cat();
        System.out.println ( "Patrick - " + Patrick.getWeight());
        Patrick.feed(450.45);
        System.out.println("Patrick - " + Patrick.getWeight());
       //================================================
        Cat John = new Cat();
        while (John.getStatus() != "Dead") {
            John.meow();
        }
        System.out.println("John - " + John.getStatus());
        //======================================
        Cat Wilson = new Cat();
        while (Wilson.getStatus() != "Exploded") {
            Wilson.feed(100.4);
        }
        System.out.println( "Wilson - " + Wilson.getStatus());
        ///// Урок №2 Метод, параметры, return
        Cat Stiv = new Cat();
        System.out.println("Stiv- " + Stiv.getWeight());
        Stiv.feed(150.0);
        System.out.println("Stiv - " + Stiv.getWeight());
        Stiv.pee();
        Stiv.pee();
        System.out.println("Stiv - " + Stiv.getWeight());
        System.out.println(Stiv.getFoodWheigh());
        Stiv.feed(150.0);
        System.out.println(Stiv.getFoodWheigh());
        Stiv.feed(200.0);
        System.out.println(Stiv.getFoodWheigh());





    }
}
