import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pear here.
 * 
 * @author (Putri Syafarinda) 
 * @version (a version number or a date)
 */
public class strawberry extends Objek
{
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() // method act
    {
        setLocation(getX(), getY()+6); // posisi objek strawberry, kecepatan objek strawberry = +6
        strawberryFall(); // lakukan method strawberryFall
    }
    public void strawberryFall() // method strawberryFall
    {
        if (atWorldEdge()) // jika objek strawberry di bawah world
        {
            getWorld().removeObject(this); // remove objek strawberry
            Greenfoot.playSound("strawberryfall.wav"); // mainkan sound strawberryfall
        }
    }    
}
