import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{
    private ReyHelado reyHelado;
    
    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    public MyWorld2()
    {
        this(new ReyHelado());
    }
    
    public MyWorld2(ReyHelado rey)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }
    
    private void prepare()
    {
        reyHelado = new ReyHelado();
        addObject(reyHelado, getWidth()/2 , getHeight()/2 );
        
    }
   
}
