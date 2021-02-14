package Creatures;

import notDevices.Human;

import java.math.BigDecimal;
import java.io.File;

public class Pet extends  Animal
{
    public Pet(String name, File pic, String species, BigDecimal weight)
    {
        super(name, pic, species, weight);
    }

    public Pet(String name, File pic, String species)
    {
        super(name, pic, species);
    }

    @Override
    public void feed() {

    }

    @Override
    public void feed(BigDecimal foodWeigth) {

    }

    @Override
    public void Sell(Human seller, Human buyer, Double price) throws Exception {

    }
}