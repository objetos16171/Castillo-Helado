import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ricardio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ricardio extends Actor
{
    private int velY=4;
    private int posicionX=3;
    /**
     * Act - do whatever the ricardio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( this.getX()+posicionX , this.getY()- velY  );
        veHaciaElContador();
        // Add your action code here.
    }
    
    public void veHaciaElContador()
    {
        World mundo=getWorld();
        
        if(this.getX() >= getWorld().getWidth()-135)
        {
            posicionX = 0 ;
        }
        
        if(this.getY()<=30)
        {
            velY=0;

        }
        
        if(( this.getX()==567 || this.getX()==565) && (this.getY()==28) )
        {
           
            mundo.removeObject(this);
            ((MyWorld)(mundo)).aumentaCorazones();
      
        }
    }
}
