
public class Cat
{
    private double originWeight;

    private double foodWeight;
    public static int catsCount =0;
    public boolean catAlive = true;

    public static final int COUNT_EYES = 2;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.5;
    public double setWeight;
    private double weight;
    private CatColor color;


    //************урок 6





    public Cat() {
        this (1500.0 + 3000.0 * Math.random());

    }

    public Cat (double weight){
        this.originWeight = weight;
        this.weight=weight;
        if(weight>=MIN_WEIGHT && weight<=MAX_WEIGHT){
           catsCount++;
        }
    }


    public Cat(Cat clone){
        this.weight = clone.getWeight();
        this.originWeight = clone.getOriginWeight();
        this.color = clone.getColor();
        this.foodWeight = clone.getFoodWeight();
    }

    public Cat cloneCat(){
        return new Cat(this);
    }

    public double getOriginWeight() {
        return originWeight;
    }
    public double getFoodWeight() {
        return foodWeight;
    }




    public void setColor(CatColor color) {
        this.color = color;
    }
    public CatColor getColor() {
        return color;
    }


      //======= Урок номер 2 возвратить массу съеденной еды
    public Double getFoodWheigh() {

        return foodWeight;
    }

    public double getSetWeight(){
        return setWeight;
    }
    //урок номер 2 сходить в туалет
    public void catDead(){
        if(weight<MIN_WEIGHT||weight>MAX_WEIGHT){
        catsCount--;
        catAlive = false;
        System.out.println(" I dead");}

    }




    public void pee() {
        if (catAlive) {
            weight = weight - 20;
            System.out.println("Pee");
            if (catAlive && weight <= originWeight) {
                System.out.println("I don't want to toilet");}
                else {catDead();
                }
        }
    }

    public int getCatsCount(){
        return catsCount;}

    public void meow() {
        if (catAlive){
            weight = weight-1;
            System.out.println("Meow");
            catDead();
        }
    }




    public void feed(Double amount) {
        if (catAlive){
            weight = weight + amount;
            foodWeight = foodWeight + amount;
            System.out.println("I'm eating");
            catDead();

            }
        }


    public void drink(Double amount) {
        if(catAlive){
        weight = weight + amount;
        System.out.println("I'm drinking");
        catDead();
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