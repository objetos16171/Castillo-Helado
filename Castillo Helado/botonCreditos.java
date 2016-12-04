import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class botonCreditos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class botonCreditos extends Actor
{
    private GifImage gifCreditos = new GifImage("creditosBoton.gif");
    /**
     * Act - do whatever the botonCreditos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage(gifCreditos.getCurrentImage());
    }    
}
