import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plataforma2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plataforma2 extends Actor
{
    /** the amount of change in x during each act */
    private int velX=2;
    
    /** the amount of change in y during each act */
    private int velY;
    
    private int ydireccion=185;
    private int xdireccion=558;
    /**
     * Act - do whatever the plataforma2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        xdireccion= xdireccion + velX*1;
        setLocation(xdireccion,ydireccion); 
        muevePlataforma();
    }    
    
    public void muevePlataforma(){
       if(xdireccion>700){
            velX=-2;
           
        }
       if(xdireccion<2){
            velX=2;
            
        }
          
       }
    }

