import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MarcelineMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MarcelineMenu extends Actor
{
    private GifImage gifMarcelineMenu = new GifImage("marcelineBajo.gif");
     private int direccion=3;

     /**
     * Act - do whatever the MarcelineMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifMarcelineMenu.getCurrentImage());
        
        World mundo=getWorld();
        
        setLocation(getX()+direccion , getY() );
        
        if(getX()>=getWorld().getWidth()-50){
        direccion=direccion*-1;
        }
        
        if(getX()<=20){
        direccion=direccion*-1;
        }


        // Add your action code here.
    }    
}
