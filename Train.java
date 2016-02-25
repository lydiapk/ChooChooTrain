import java.awt.*;
import java.util.*;

public class Train
{
    ArrayList<RailCar> railCars = new ArrayList<RailCar>();
    private int x;
    private int y;
    public Train(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void addCar(String h)
    {
        //railCars.add();
    }
    public void showCars(Graphics g)
    {
        for(RailCar railCar: railCars)
        {
            railCar.drawCar(g);
        }
    }
}
    