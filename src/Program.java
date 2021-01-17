import java.io.File;
import java.math.BigDecimal;

public class Program
{
    public static void main(String[] args)
    {
        Animal dog = new Animal("Brutus", new File("somedog.jpg"), "Pupper");
        var kowalskyPhone = new Phone(1234567890, "someNet", 9999888);
        var Human = new Human("Analiza","Kowalski", new Double(42), 000000001, kowalskyPhone, dog);

        dog.feed();
        dog.goForWalk(5.0);
        dog.goForWalk(15.0);
    }
}