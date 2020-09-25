
public class Cat
{
    private double originWeight;
    private double weight;
    private double foodWeight;
    public static int catsCount =0;
    public boolean catAlive = true;

    public static final int COUNT_EYES = 2;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.5;




    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        catsCount++;


      }
      //======= Урок номер 2 возвратить массу съеденной еды
    public Double getFoodWheigh() {

        return foodWeight;
    }
    //урок номер 2 сходить в туалет
    public void catDead(){
        if(weight<MIN_WEIGHT){
        catsCount--;
        catAlive = false;
        System.out.println(" I dead");}

    }




    public void pee() {
        if (catAlive) {
            weight = weight - 20;
            System.out.println("Pee");
            if (weight <= originWeight) {
                System.out.println("I don't want to toilet");}
                else {catDead();
                }
        }
    }

    public int getCatsCount(){
        return catsCount;}

    public void meow() {
        if(catAlive){
        weight = weight - 1;
        System.out.println("Meow");}
        else {catDead();}
    }



    public void feed(Double amount) {
        if (catAlive){
            weight = weight + amount;
            foodWeight = foodWeight + amount;
            if (weight > MAX_WEIGHT){
                catsCount--;
                catAlive = false;
                System.out.println("I can't eat");
            }

            }
        }


    public void drink(Double amount) {
        if(catAlive){
        weight = weight + amount;
        if(weight>MAX_WEIGHT){
            catsCount--;
            catAlive = false;
            System.out.println("I can't drink");
        }
    }

    }


    public Double getWeight()
    {
        return weight;
    }
    public String getStatus ()
        {
            if (weight < MIN_WEIGHT) {
                return "Dead";
            } else if (weight > MAX_WEIGHT) {
                return "Exploded";
            } else if (weight > originWeight) {
                return "Sleeping";
            } else {
                return "Playing";
            }
        }
    }