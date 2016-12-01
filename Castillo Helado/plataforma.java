import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plataforma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plataforma extends Actor
{
    /** the amount of change in x during each act */
    private int velX=2;
    
    /** the amount of change in y during each act */
     private int xdireccion=120;
    
    
   
    /**
     * Act - do whatever the plataforma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+velX, getY()); 
        muevePlataforma();
    }    
    
    /**
     * mueve la plataforma de derecha a izquierda 
     * 
     */
    public void muevePlataforma(){
       World mundo=getWorld();
        
       if(this.getX()>=getWorld().getWidth()-getImage().getWidth()/2){
            velX=velX*-1;
        }
       if(this.getX()<=getImage().getWidth()/2){
           velX=velX*-1;
        }
       }
    }

