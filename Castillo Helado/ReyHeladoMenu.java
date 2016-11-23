import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReyHeladoMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReyHeladoMenu extends Actor
{
    private GifImage gifReyHelado = new GifImage("kingDancing.gif");
    /**
     * Act - do whatever the ReyHeladoMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage(gifReyHelado.getCurrentImage());
        // Add your action code here.
    }    
}
