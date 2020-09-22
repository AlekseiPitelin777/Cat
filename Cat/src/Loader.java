import java.util.concurrent.Callable;

public class Loader
{
    public static void main(String[] args) {
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


    }
}
