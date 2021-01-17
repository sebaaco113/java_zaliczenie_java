import devices.Car;
import devices.Phone;


public class Human {
    private String name;
    private String surname;
    private Double age;
    private Integer id;
    private Phone number;
    private Animal pet;
    private Car car;
    private Double salary = 0.0;
    static  int index = 0;

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC) {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
    }

}

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC, double salary)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
        this.salary = salary;
    }

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC, Car car)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
        this.car = car;
    }

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Phone numberC, Car car, Animal pet)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        number = numberC;
        this.car = car;
        this.pet = pet;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String nameM)
    {
        name = nameM;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surnameM)
    {
        surname = surnameM;
    }

    public Double getAge()
    {
        return age;
    }

    public void setAge(Double ageM)
    {
        age = ageM;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer idM)
    {
        id = idM;
    }


    public Phone getNumber()
    {
        return number;
    }

    public void setNumber(Phone numberM)
    {
        number = numberM;
    }
    public Car getCar()
    {
        return car;
    }

    public void setCar(Car car)
    {
        if(car.getWorth() < salary)
        {
            System.out.println("Kupiłeś tę furę.");
            this.car = car;
        }
        else if(car.getWorth() <= salary * 12)
        {
            System.out.println("Kupiłeś tę furę na raty.");
            this.car = car;
        }
        else
        {
            System.out.println("Sorry, jesteś zbyt biedny.");
        }
    }
    public  double getSalary()
    {
        if(LastSalaryInfo.firsttime == true)
        {
            System.out.println("To info o twojej pierwszej pensj.");
            LastSalaryInfo.lastSalary = salary;
            LastSalaryInfo.firsttime = false;
            return  salary;
        }
        else{
            System.out.println("Ostatnio twoja pensja wynosiła tyle: " + LastSalaryInfo.lastSalary);
            LastSalaryInfo.lastSalary = salary;
            System.out.println("Teraz wynosi tyle": " + salary);
            return  salary;
        }
    }

    public  void setSalary(double newSalary)
    {
        if(newSalary < 0)
        {
            System.out.println("Nie zarabiasz za mało?");
        }
        else
        {
            System.out.println("Kadry powiadomione.");
            System.out.println("Weź aneks od Hani z HR");
            System.out.println("Skarbówka nadciąga.");
            this.salary = newSalary;
        }
        @Override
        public String toString() {
        return "Human"{ +
                "name=" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", number=" + number +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
    }
} 