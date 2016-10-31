import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Pinguino pinguino;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    
    public void LluviaPinguino()
    {
        pinguino = new Pinguino();
        for(int cont=0;cont<5;cont++){
        addObject(pinguino,Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(50) );
        }
    }
    
    public void act()
    {
        LluviaPinguino();
    }
}
