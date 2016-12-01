import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase forma parte de menu principal del juego.
 * 
 * @author Soto Avila Carolina, Jose Emmanuel Escobar Cjhávez  
 * @version 3 de noviembre del 2016
 */
public class botonJugar extends Actor
{
    private GifImage gifAyuda = new GifImage("jugarBoton.gif");
    /**
     * Act - do whatever the botonJugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage(gifAyuda.getCurrentImage());
         
    }    
}
