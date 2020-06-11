import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (Putri Syafarinda) 
 * @version (a version number or a date)
 */
public class bear extends Objek
{
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() // method act
    {
        moveBear(); //lakukan method movebear
        objectDisappear(); // lakukan method objeectDisappear
    }
    public void objectDisappear() // method objectDisappear
    {
        if (canSee(strawberry.class)) // jika melihat objek strawberry
        {
            eat(strawberry.class); // eat objek Strawberry
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10); // kelas counter ditambah 10 poin
            Greenfoot.playSound("score.wav"); // mainkan sound score.wav
        }
    }
    public void moveBear() // method moveBear
    {
        if (Greenfoot.isKeyDown("left")) // jika arah panah kiri ditekan 
        {
            move(-7); // bergerak ke -7
        }
        if (Greenfoot.isKeyDown("right")) // jika arah panah kanan ditekan
        {
            move(7); // bergerak ke 7
        }
       
    }    
}
