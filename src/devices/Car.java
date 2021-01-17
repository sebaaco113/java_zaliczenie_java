package devices;

public class Car
{
    public final String model;
    public final String producer;
    private double horsePower;
    private String suspenion;
    private double worth;

    public  Car(String model, String producer, double power, String suspenion, Integer yearOfProduction)
    {
        super (model, producer, yearOfProduction)
        horsePower = power;
        this.suspenion = suspenion;
    }
    public  Car(String model, String producer, double power, String suspenion, double worth, Integer yearOfProduction)
    {
        super(model, producer, yearOfProduction);
        horsePower = power;
        this.suspenion = suspenion;
        this.worth = worth;
    }


    public double getHorsePower()
    {
        return  horsePower;
    }

    public  void setHorsePower(double newPower)
    {
        horsePower = newPower;
    }

    public String getSuspenion()
    {
        return  suspenion;
    }

    public void setSuspensionHeight(String suspenion)
    {
        this.suspenion = suspenion;
    }

    public  double getWorth()
    {
        return  worth;
    }
    @Override
    public String toString()
    {
        return "devices.Car{" ++
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", horsePower=" + horsePower +
                ", suspenion='" + suspenion + '\'' +
                ", worth=" + worth +
                        ", turned on = " + turnedOn + '\'' +
                '}';
        @Override
        public void turnOn()
        {
            turnedOn = true;
        }
    }
}