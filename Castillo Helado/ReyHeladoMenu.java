import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class here.
 * Solamente aparece en el menu de inicio
 * @author Carolina Soto Avila, Jose Emmanuel Escobar Chávez
 * @version 4 de noviembre del 2016
 */
 
public class ReyHeladoMenu extends Actor
{
    private GifImage gifReyHelado = new GifImage("kingDancing.gif");
    /**
     * Se establece un gif
     */
    public void act() 
    {
         setImage(gifReyHelado.getCurrentImage());
        // Add your action code here.
    }    
}
