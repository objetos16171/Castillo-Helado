import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class copoElegante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class copoElegante extends Actor
{
    private int posX=0;
    /**
     * Act - do whatever the copoElegante wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( this.getX()<= 300 ) {
            move(+2);
        }
        
        
        if( this.getX()>= 350 ) {
            move(-2);
        }
    }    
}
