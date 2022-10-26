package oopsconcept.inheritance;

public class IceCreamPricesWithConstructors {

}
class IceCream
{
    String flavor;
    int numberOfScoops;
    
    IceCream(String flavor, int numberOfScoops)
    {
        this.flavor = flavor;
        this.numberOfScoops = numberOfScoops;
    }
    
    double getPrice()
    {
        double pricePerScoop = 35.0;
        return numberOfScoops * pricePerScoop;
    }
}
class FruitSaladWithIceCream extends IceCream
{
    int gramsOfFruitSalad;

    FruitSaladWithIceCream(String flavor, int numberOfScoops, int gramsOfFruitSalad)
    {
        super(flavor, numberOfScoops); // LINE A
        this.gramsOfFruitSalad = gramsOfFruitSalad; // LINE B
    }

    double getPrice()
    {
        double iceCreamPrice = super.getPrice(); 
        double pricePerGram = 0.75;

        return gramsOfFruitSalad * pricePerGram + iceCreamPrice;
    }
}
class KhubaniKaMeetaWithIceCream extends IceCream
{
    int gramsOfKhubaniKaMeeta;

    KhubaniKaMeetaWithIceCream(String flavor, int numberOfScoops, int gramsOfKhubaniKaMeeta)
    {
    	super(flavor, numberOfScoops);
        this.gramsOfKhubaniKaMeeta = gramsOfKhubaniKaMeeta;
       
    }

    double getPrice()
    {
        double iceCreamPrice = super.getPrice();
        double pricePerGram = 1.25;

        return gramsOfKhubaniKaMeeta * pricePerGram + iceCreamPrice;
    }
}


