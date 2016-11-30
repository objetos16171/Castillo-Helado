import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tituloMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tituloMenu extends Actor
{
    private GifImage gifTitulo = new GifImage("titulo.gif");
    /**
     * Act - do whatever the ReyHeladoMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage(gifTitulo.getCurrentImage());
        // Add your action code here.
    }        
}
