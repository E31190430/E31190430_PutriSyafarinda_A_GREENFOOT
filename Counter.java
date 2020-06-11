import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 // untuk mengatur warna

/**
 * Write a description of class Counter here.
 * 
 * @author (Putri Syafarinda) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int totalCount = 0;
    public void act() // method act
    {
        gameOver(); // lakukan method game over
    }
    public Counter() // kelas Counter
    {
        setImage(new GreenfootImage("0", 30, Color.WHITE, Color.PINK)); //membuat tampilan Counter dengan ukuran awal 30, tulisan berwarna putih, background berwarna pink
    }
    public void Counting (int hitung) // method Counting
    {
        totalCount += hitung;
        setImage(new GreenfootImage("" + totalCount, 30, Color.WHITE, Color.PINK)); // membuat tampilan perubahan Counter dengan ukuran awal 30, tulisan berwarna putih, background berwarna pink
    }
    public void gameOver() // method gameOver
    {
        if (totalCount >= 70) // jika totalCount >=70
        {
            Greenfoot.stop(); //greenfoot/game berhenti
            Greenfoot.playSound("tada.wav"); // mainkan sound tada.wav
            System.out.println("KAMU BERHASIL! Click RESET to play again"); //menampilkan output/tulisan seperti ini
        }
    }    
}

