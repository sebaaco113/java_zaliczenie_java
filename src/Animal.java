import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Animal
{
    private String name;
    private File pic;

    Animal( String nameC,  File pictureC)
    {
        name = nameC;
        pic = pictureC;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String nameM)
    {
        name = nameM;
    }

    public File getPic()
    {
        return pic;
    }

    public void setPic(File pic2)
    {
        pic = pic2;
    }
} 