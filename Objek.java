import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Objek here.
 * 
 * @author (Putri Syafarinda) 
 * @version (a version number or a date)
 */
public class Objek extends Actor
{
    /**
     * Act - do whatever the Objek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
        return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
        return true;
        else
        return false;
   }
    /** 
     * true bila kita dapat melihat objek 'clss' class dari object
     * false bila tidak ada objek
     */
    
   public boolean canSee(Class clss)
   {
       Actor actor = getOneObjectAtOffset(0, 0, clss);
       return actor != null;
   }
   /** method untuk memakan objek dari kelas 'clss'. metho 'eat' akan dilakukan bila
    *  objek yang dimaksud ada. selain objek tersebut, method tidak dilakukan
    */
   public void eat(Class clss)
   {
       Actor actor = getOneObjectAtOffset(0, 0, clss);
       if(actor != null){
           getWorld().removeObject(actor);
        }
    }
}

