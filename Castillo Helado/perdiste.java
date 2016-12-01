import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * imagen que aparece cuando el jugador pierde
 * @author Carolina Soto Avila, Jose Emmanuel Escobar Chávez
 * @version 4 de noviembre del 2016
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
