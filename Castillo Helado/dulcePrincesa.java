import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dulcePrincesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dulcePrincesa extends Actor
{
    private int velX=1;
    private int velY=2;
    private int cont=0;
    private GifImage dulcePrincesaGif = new GifImage("dulcePrincesa.gif");
    /**
     * Act - do whatever the dulcePrincesa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World mundo=getWorld();
        ricardio Ricardio= new ricardio();
        
        setImage(dulcePrincesaGif.getCurrentImage());
        setLocation( getX()+velX , getY() + velY );
        
        if(getY() >= 350)
       {
          velY = velY*-1;
          
          
       }
       
       if(this.getY()== 460 && ( ( this.getX() == 192 ) ||    
                                 ( this.getX() == 316 ) ||
                                 ( this.getX() == 378 ) ||
                                 ( this.getX() == 502 ) 
                                 ) )
       {    
       mundo.addObject(Ricardio, this.getX() ,this. getY());
       }
       
       if(getY()<=getWorld().getHeight()-30)
       {
          velY = velY*-1;
       }
       
       if(getX()>10)
       {
          velX = velX*-1;
       }
       
       if(getX()<=getWorld().getWidth()-50)
       {
          velX = velX*-1;
       }
       
    }    
}
