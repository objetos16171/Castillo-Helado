import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class  here.
 * Este objeto aparecerá en el menú de inicio sirve 
 * para acceder a mundo Ayuda.
 * @author Carolina Soto Avila, Jose Emmanuel Escobar Chávez
 * @version 4 de noviembre del 2016
 */
public class botonAyuda extends Actor
{
    private GifImage gifAyuda = new GifImage("ayudaBoton.gif");
    /**
     * Se establece un gif 
     */
    public void act() 
    {
         setImage(gifAyuda.getCurrentImage());
         
         
         
      
        // Add your action code here.
    }    
}
