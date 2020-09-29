
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

    //************урок 6
    private String color;





    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        catsCount++;
    }

    public Cat(double weight){
        this();
        this.originWeight = weight;
        this.weight=weight;
        if(weight<MIN_WEIGHT || weight>MAX_WEIGHT){
           catDead();
        }
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
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