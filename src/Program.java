package notDevices;

import devices.Car;
import devices.Phone;
import notDevices.Animal;
import notDevices.Human;

import java.io.File;

public class Program
{
    public static void main(String[] args)
    {
        Animal dog = new Animal("Brutus", new File("somedog.jpg"), "Pupper");
        var NowakPhone = new Phone("1234567890", "someNet", 9999888);
        var Human = new Human("Analiza","Kowalski", new Double(42), 000000001, NowakPhone, dog);

        dog.feed();
        dog.goForWalk(5.0);
        dog.goForWalk(15.0);
        //doggo.goForWalk(15.0);

        var someNiceCar = new Car("458 Italia", "Ferrari", 730.0, "double wishbone rear suspension", 2011);

        Human.setCar(someNiceCar);

        System.out.println("notDevices.Human's car horsepower: " + Human.getCar().getHorsePower() + "\nnotDevices.Human's car model: " + Human.getCar().model);

        Human.getSalary();

        Human.setSalary(-5000);

        Human.setSalary(5000);
        Human.getSalary();
        var expensiveCar = new Car("Enzo", "Ferrari", 730.0, "double wishbone rear suspension", 250000.0);

        var richHooman = new Human("Bill", "Gates", 115.0, 999999, new Phone(95136, "5G"));

        richHooman.setSalary(1000000);

        richHooman.setCar(expensiveCar);

        var otherExpensiveCar = new Car("911", "Porsche", 520.0, "double wishbone rear suspension", 250000.0);

        if(otherExpensiveCar == expensiveCar)
        {
            System.out.println("To to samo auto.");
        }
        else
        {
            System.out.println("To chyba różne auta.");
        }

        System.out.println(expensiveCar);

        if(otherExpensiveCar.toString() == expensiveCar.toString())
        {
            System.out.println("To to samo auto.");
        }
        else
        {
            System.out.println("To chyba różne fury.");
        }

        System.out.println(otherExpensiveCar.toString());

        expensiveCar.turnOn();
        System.out.println(expensiveCar.toString());
        var merchant = new Human("Merchant", otherExpensiveCar, 1000000000.0);
        var peasant = new Human("Happy Peasant", null, 30000.0);

        System.out.println("Peasant before shopping: " + peasant.toString() + "\nMerchant before selling: " + merchant.toString());
        otherExpensiveCar.Sell(merchant, peasant, 29000.0);
        System.out.println("Peasant after shopping: " + peasant.toString() + "\nMerchant after selling: " + merchant.toString());
    }
}

