import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paredDeHielo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paredDeHielo extends Actor
{
    /**
     * Act - do whatever the paredDeHielo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World mundo = getWorld();
        getWorld().setPaintOrder(Pinguino.class,Princesa.class,ReyHelado.class,Counter.class,paredDeHielo.class);
        // Add your action code here.
    }    
}
