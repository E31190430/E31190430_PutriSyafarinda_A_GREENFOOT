import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paper here.
 * 
 * @author (Putri Syafarinda) 
 * @version (a version number or a date)
 */
public class paper extends World
{

    /**
     * Constructor for objects of class paper.
     * 
     */
    public paper()
    {    
        // Create a new world with 720x480 cells with a cell size of 1x1 pixels.
        super(720, 480, 1); 
        strawberryAppear(); // method strawberryAppear
        prepare(); // method prepare
        BombAppear(); // method BombAppear
    }
    public void act() //method act
    {
        if (getObjects(strawberry.class).isEmpty()) strawberryAppear();
        if (getObjects(Bomb.class).isEmpty()) BombAppear();
    }
    private void prepare() // method prepare untuk menentukan posisi dari kelas objek masing-masing
    {
        bear bear = new bear();
        addObject(bear, 648,403);
        Counter counter = new Counter();
        addObject(counter, 57, 69);
        Score score = new Score();
        addObject(score, 64, 44);
        score.setLocation(59, 44);
        bear.setLocation(373, 403);
    }
    public void strawberryAppear() // method strawberryAppear
    {
        if (Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new strawberry(), Greenfoot.getRandomNumber(519),20);
        }
    }
    public void BombAppear() // method BombAppear
    {
        if (Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Bomb(), Greenfoot.getRandomNumber(519), 21);
        }
    }
}


