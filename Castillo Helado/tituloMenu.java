import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class here.
 * Este objeto tiene una animación de tipo gif con
 * el nombre del proyecto 
 * @author Carolina Soto Avila, Jose Emmanuel Escobar Chávez
 * @version 4 de noviembre del 2016
 */
public class tituloMenu extends Actor
{
    private GifImage gifTitulo = new GifImage("titulo.gif");
    /**
     * Se ejecuta una animación de la iamgen tipo gif
     */
    public void act() 
    {
         setImage(gifTitulo.getCurrentImage());
        // Add your action code here.
    }        
}
