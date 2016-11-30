import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class perdiste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class perdiste extends Actor
{
      private GifImage gifPerdiste = new GifImage("perdiste.gif");
    /**
     * Act - do whatever the perdiste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifPerdiste.getCurrentImage());
    } 
    
}
