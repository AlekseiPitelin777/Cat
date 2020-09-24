
public class Cat
{
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    private double foodWeight;
    public static int catsCount =0;
    public boolean catAlive = true;




    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.5;
        catsCount++;


      }
      //======= Урок номер 2 возвратить массу съеденной еды
    public Double getFoodWheigh() {

        return foodWeight;
    }
    //урок номер 2 сходить в туалет
    public void catDead(){
        if(weight<minWeight){
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
            if (weight > maxWeight){
                catsCount--;
                catAlive = false;
                System.out.println("I can't eat");
            }

            }
        }


    public void drink(Double amount) {
        if(catAlive){
        weight = weight + amount;
        if(weight>maxWeight){
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
            if (weight < minWeight) {
                return "Dead";
            } else if (weight > maxWeight) {
                return "Exploded";
            } else if (weight > originWeight) {
                return "Sleeping";
            } else {
                return "Playing";
            }
        }
    }