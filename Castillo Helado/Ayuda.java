import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends World
{
    private GreenfootSound musicaDeFondo = new GreenfootSound ("Everybody Wants To Rule The World Instrumental Version.mp3");
    /**
     * Constructor for objects of class Ayuda.
     * 
     */
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }
    public void prepare()
    {
        botonVolverAyuda botonayuda = new botonVolverAyuda();
        addObject(botonayuda,130, 450);
    }
    
}
