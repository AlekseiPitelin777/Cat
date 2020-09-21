import java.util.concurrent.Callable;

public class Loader
{
    public static void main(String[] args)
    {
        Cat John = new Cat();
        John.meow();
        System.out.println("John weight:" + John.getWeight());
        //==========================================================
        Cat Patrick = new Cat();
        System.out.println("Patrick weight:" + Patrick.getWeight());
        Patrick.feed(56.6);
        System.out.println("Patrick weight:" + Patrick.getWeight());
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        Cat Wilson = new Cat();
        Wilson.drink(105.65);
        System.out.println("Wilson weight:" + Wilson.getWeight());
        //----------------------------------------------------------
        Cat Stiv = new Cat();
        System.out.println("Stiv weight:" + Stiv.getWeight());
        Stiv.feed(98.5);
        System.out.println("Stiv weight:" + Stiv.getWeight());
        //***********************************************************
        Cat Kevin = new Cat();
        System.out.println("Kevin weight:" + Kevin.getWeight());
        while (Kevin.getStatus() =  {
            Kevin.feed(500.5);
        }





    }
}