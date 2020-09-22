
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double foodWeight;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.5;


      }
      //======= Урок номер 2 возвратить массу съеденной еды
    public Double getFoodWheigh() {

        return foodWeight;
    }
    //урок номер 2 сходить в туалет
    public void pee()
    {
        if (weight <= originWeight) {
            System.out.println("I don't want to toilet");
        } else
        weight = weight -20;
        System.out.println("Pee");
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        foodWeight = foodWeight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
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