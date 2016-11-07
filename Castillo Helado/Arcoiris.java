import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arcoiris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arcoiris extends Actor
{
    private GifImage gifArcoiris = new GifImage ("ArcoirisAnimado.gif");
    /**
     * Act - do whatever the Arcoiris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifArcoiris.getCurrentImage());
        
        ataca();
        // Add your action code here.
    }
    
    /**
     * Metodo que se encargara de quitarle puntos de vida al rey helado 
     */
    public void ataca()
    {
        move(-10);
    }
}
