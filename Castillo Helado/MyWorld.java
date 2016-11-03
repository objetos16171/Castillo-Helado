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
        super(700, 500, 1); 
        prepare();
    }

    public void LluviaPinguino()
    {
        int y=5;
        int ypos=0;
        pinguino = new Pinguino();
        for(int cont=0;cont<5;cont++){
            addObject(pinguino,Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(50) );
            pinguino.setLocation(Greenfoot.getRandomNumber(800),ypos=ypos+y);
        }
    }

    public void act()
    {
        int x;
        pinguino = new Pinguino();
        if (Greenfoot.getRandomNumber(500) < 10) {
            x=Greenfoot.getRandomNumber(500);
            this.addObject(pinguino,x,30);
                    }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ReyHelado reyhelado = new ReyHelado();
        addObject(reyhelado,352,460);
    }
}
