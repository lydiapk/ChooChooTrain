import java.awt.*;
import java.util.*;

public class Train
{
    ArrayList<RailCar> railCars = new ArrayList<RailCar>();
    private int startX;
    private int startY;
    public Train(int x, int y)
    {
        setStartX(x);
        setStartY(y);
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
    public int getStartX()      {return startX;}
    public int getStartY()      {return startY;}
    public void setStartX(int startX)   {this.startX = startX;}
    public void setStartY(int startY)   {this.startY = startY;}
}
    